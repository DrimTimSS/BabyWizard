/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx.controlador;

import babywizardjavafx.modelo.Cdi182430Modelo;
import babywizardjavafx.modelo.IcplimModelo;
import com.mysql.cj.util.StringUtils;
import java.net.URL;
import java.sql.SQLException;
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Valdovinos
 */
public class AgregarCdi182430Controller implements Initializable {

    @FXML
    private TextField prod;
    @FXML
    private TextField propprod;
    @FXML
    private TextField percprod;
    @FXML
    private TextField p3lpal;
    @FXML
    private TextField percp3l;
    @FXML
    private TextField complej;
    @FXML
    private TextField propcomplej;
    @FXML
    private TextField perccomplej;
    @FXML
    private Button agregar;
    @FXML
    private Label label;
    @FXML
    private DatePicker fechaAplicacion;
    @FXML
    private Label titulo1;
    
    private int idbebe;
    private boolean editable;
    private int idBebeActualizar;
    private Cdi182430Modelo cdimactualizar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        editable = false;
    }    

    @FXML
    private void agregar(ActionEvent event) throws SQLException{
        String fechan = "";
        if(!(isEmpty(prod) || isEmpty(propprod) || isEmpty(percprod) || isEmpty(p3lpal) || isEmpty(percp3l) || isEmpty(complej) || isEmpty(propcomplej) ||  isEmpty(perccomplej) || fechaAplicacion.getValue()==null)){
            try{
                fechan = fechaAplicacion.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                if(!editable){
                    Cdi182430Modelo cdim = new Cdi182430Modelo(Integer.parseInt(prod.getText()), Float.parseFloat(propprod.getText()), Integer.parseInt(percprod.getText()), Float.parseFloat(p3lpal.getText()), Integer.parseInt(percp3l.getText()), Integer.parseInt(complej.getText()), Float.parseFloat(propcomplej.getText()), Integer.parseInt(perccomplej.getText()), fechan, idbebe);
                    cdim.createCdi182430Modelo();
                    alertInformation("Éxito","","CDI 182430 creado de forma exitosa.");
                } else{
                    cdimactualizar.updateCdi182430(cdimactualizar.getIdCdi182430(), -1, Integer.parseInt(prod.getText()), Float.parseFloat(propprod.getText()), Integer.parseInt(percprod.getText()), Float.parseFloat(p3lpal.getText()), Integer.parseInt(percp3l.getText()), Integer.parseInt(complej.getText()), Float.parseFloat(propcomplej.getText()), Integer.parseInt(perccomplej.getText()), fechan, -1);
                    alertInformation("Éxito","","CDI 182430 editado de forma exitosa.");
                }
            } catch(NumberFormatException | SQLException e){
                System.out.println("Caiste en una excepción jejeje");
                return;
            }
        }
        Stage actualWindow = (Stage) label.getScene().getWindow();
        actualWindow.close();
    }

    void setCampos() {
        try {
            fechaAplicacion.setValue(LocalDate.parse(cdimactualizar.getFechaAplicacion(), DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        } catch (Exception e) {

        }
        prod.setText(cdimactualizar.getProduccion() + "");
        propprod.setText(cdimactualizar.getPropProduccion() + "");
        percprod.setText(cdimactualizar.getPercProduccion() + "");

        p3lpal.setText(cdimactualizar.getP3lPalabras()+ "");
        percp3l.setText(cdimactualizar.getPercP3lPalabras()+ "");
        
        complej.setText(cdimactualizar.getComplejidadFrases()+ "");
        propcomplej.setText(cdimactualizar.getPropComplejidadFrases() + "");
        perccomplej.setText(cdimactualizar.getPercComplejidadFrases() + "");
    }
    public boolean isEmpty(TextField textfield) {
        return StringUtils.isEmptyOrWhitespaceOnly(textfield.getText());
    }
    
    public void inicializarBebe(int idbebe){
        this.idbebe = idbebe;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    public void setIdBebeActualizar(int idBebeActualizar) {
        this.idBebeActualizar = idBebeActualizar;
    }
    
    void setCdi182430AEditar(Cdi182430Modelo cdim) {
        this.cdimactualizar = cdim;
    }
    
    private void alertInformation(String titulo, String header, String contenido) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.initOwner(this.prod.getParent().getScene().getWindow());
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
}
