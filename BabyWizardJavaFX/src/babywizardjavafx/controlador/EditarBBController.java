/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx.controlador;

import babywizardjavafx.modelo.BebeModelo;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author victo
 */
public class EditarBBController implements Initializable {

    @FXML
    private Label titulo;
    @FXML
    private TextField nombres;
    @FXML
    private TextField apellidop;
    @FXML
    private TextField apellidom;
    @FXML
    private RadioButton sexom;
    @FXML
    private ToggleGroup sexotoggle;
    @FXML
    private RadioButton sexof;
    @FXML
    private DatePicker fechanacimiento;
    @FXML
    private Button continuar;
    @FXML
    private Label nollenado;
    private int idBebeActualizar;
    private BebeModelo bm;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void editarBebe(ActionEvent event) {
        int sexo = -1;
        if(sexom.isSelected()){
            sexo = 0;
        } else if(sexof.isSelected()){
            sexo = 1;
        }
        String nombre = nombres.getText();
        String apellidopaterno = apellidop.getText();
        String apellidomaterno = apellidom.getText();
        
        if(!(nombre.equals("")||apellidopaterno.equals("")||apellidomaterno.equals("")||sexo==-1)){
            try {
                String fechan = fechanacimiento.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                BebeModelo bm = new BebeModelo();
                bm.updateBebe(idBebeActualizar, -1, nombre, apellidomaterno, apellidopaterno, sexo, fechan, "");
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.initOwner(titulo.getParent().getScene().getWindow());
                alert.getDialogPane().getStylesheets().add("/babywizardjavafx/vista/EstiloGeneral.css");
                alert.setTitle("Edición");
                alert.setHeaderText("Editado exitosamente");
                alert.setContentText("Infante editado de forma exitosa.");

                alert.showAndWait();
                Stage actualWindow = (Stage) titulo.getScene().getWindow();
                actualWindow.close();
            } catch (Exception e) {
                nollenado.setText("No se han llenado todos los campos obligatorios.");
            }
        } else {nollenado.setText("No se han llenado todos los campos obligatorios.");}
    }

    void setIdBebeActualizar(int id) {
        this.idBebeActualizar = id;
    }

    void setBBAEditar(BebeModelo bm) {
        this.bm = bm;
    }

    void setCampos() {
        nombres.setText(bm.getNombre());
        apellidop.setText(bm.getApellidoMaterno());
        apellidom.setText(bm.getApellidoMaterno());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(bm.getFechaNacimiento(), formatter);
        fechanacimiento.setValue(localDate);
        String s = bm.getSexo();
        if (s.equals("M")) sexom.setSelected(true);
        else sexof.setSelected(true);
    }
    
}
