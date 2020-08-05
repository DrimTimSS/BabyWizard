/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx.controlador;

import babywizardjavafx.modelo.CuidadorModelo;
import com.mysql.cj.util.StringUtils;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import jfxtras.styles.jmetro.JMetro;
import jfxtras.styles.jmetro.Style;

/**
 * FXML Controller class
 *
 * @author victo
 */
public class AgregarCuidadorController implements Initializable {

    int idbebe;
    @FXML
    private Label titulo;
    @FXML
    private TextField nombres;
    @FXML
    private TextField apellidop;
    @FXML
    private TextField apellidom;
    @FXML
    private TextField correo;
    @FXML
    private ChoiceBox<String> relacion;
    @FXML
    private TextField edad;
    @FXML
    private TextField ocupacion;
    @FXML
    private TextField telefono1;
    @FXML
    private TextField telefono2;
    @FXML
    private TextField aniosestudio;
    @FXML
    private Button agregar;
    @FXML
    private Label label;
    private boolean editable;
    private CuidadorModelo cm;
    private int idCuidadorActualizar;

    Alertas alerta;

    public boolean isEmpty(TextField textfield) {
        return StringUtils.isEmptyOrWhitespaceOnly(textfield.getText());
    }

    public void inicializarBebe(int idbebe) {
        this.idbebe = idbebe;
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        relacion.getItems().add("Madre");
        relacion.getItems().add("Padre");
        relacion.getItems().add("Abuela P.");
        relacion.getItems().add("Abuela M.");
        relacion.getItems().add("Abuelo P.");
        relacion.getItems().add("Abuelo M.");
        relacion.getItems().add("Tía P.");
        relacion.getItems().add("Tía M.");
        relacion.getItems().add("Tío P.");
        relacion.getItems().add("Tío M.");
        relacion.getItems().add("Hermana");
        relacion.getItems().add("Hermano");
        relacion.getItems().add("Otro");

    }

    @FXML
    private void agregar(ActionEvent event) throws SQLException, IOException {
        boolean c = true;
        alerta = new Alertas(titulo.getParent().getScene().getWindow());
        if (isEmpty(edad) || isEmpty(correo) || isEmpty(nombres) || isEmpty(apellidop) || isEmpty(apellidom) || isEmpty(ocupacion) || isEmpty(telefono1) || isEmpty(aniosestudio)) {
            c = alerta.confirmation();
        }
        if (!c) {
            return;
        }
        String cor = (isEmpty(correo)) ? "" : correo.getText();
        int ed = (isEmpty(edad)) ? -1 : Integer.parseInt(edad.getText());
        String n = (isEmpty(nombres)) ? "" : nombres.getText();
        String app = (isEmpty(apellidop)) ? "" : apellidop.getText();
        String apm = (isEmpty(apellidom)) ? "" : apellidom.getText();
        String oc = (isEmpty(ocupacion)) ? "" : ocupacion.getText();
        String tel1 = (isEmpty(telefono1)) ? "" : telefono1.getText();
        String tel2 = (isEmpty(telefono2)) ? "" : telefono2.getText();
        int anest = (isEmpty(aniosestudio)) ? -1 : Integer.parseInt(aniosestudio.getText());
        String rel = (relacion.getValue() == null) ? "No indicado" : relacion.getValue();
       
        try {
            if (!editable) {
                CuidadorModelo cm = new CuidadorModelo(cor, ed, n, app, apm, oc, tel1, tel2, anest, rel, idbebe);
                cm.createCuidador();
                alertInformation("Éxito", "", "Cuidador agregado de forma exitosa");
                Stage actualWindow = (Stage) titulo.getScene().getWindow();
                actualWindow.close();
            } else {
                cm.updateCuidador(idCuidadorActualizar, -1, cor, ed, n, app, apm, oc, tel1, tel2, anest, rel, idbebe);
                alertInformation("Éxito", "", "Cuidador editado de forma exitosa.");
                Stage actualWindow = (Stage) titulo.getScene().getWindow();
                actualWindow.close();
            }
        } catch (Exception e) {
            alerta.alertInformation("Error en los datos", "Datos inválidos.", "Los datos proporcionados no permiten ingresar en la base.");
            return;
        }

        Stage actualWindow = (Stage) apellidop.getScene().getWindow();
        actualWindow.close();
    }

    void setEditable(boolean b) {
        this.editable = b;
    }

    void setCuidadorAEditar(CuidadorModelo cm) {
        this.cm = cm;
    }

    void setCampos() {
        nombres.setText(cm.getNombreC());
        apellidop.setText(cm.getPrimerApellidoC());
        apellidom.setText(cm.getSegundoApellidoC());
        correo.setText(cm.getCorreoElectronico());
        relacion.setValue(cm.getRelacion());
        telefono1.setText(cm.getPrimerTelefono());
        telefono2.setText(cm.getSegundoTelefono());
        edad.setText(cm.getEdad() + "");
        aniosestudio.setText(cm.getAniosEstudio() + "");
        ocupacion.setText(cm.getOcupacion());
    }

    private void alertInformation(String titulo, String header, String contenido) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.initOwner(nombres.getParent().getScene().getWindow());
        alert.getDialogPane().getStylesheets().add("/babywizardjavafx/vista/EstiloGeneral.css");
        alert.setTitle(titulo);
        if (header.equals("")) {
            alert.setHeaderText(null);
        } else {
            alert.setHeaderText(header);
        }
        alert.setContentText(contenido);
        alert.showAndWait();
    }

    void setCuidadorActualizar(int id) {
        this.idCuidadorActualizar = id;
    }
}
