/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx.controlador;

import babywizardjavafx.modelo.Cdi12Modelo;
import com.mysql.cj.util.StringUtils;
import java.net.URL;
import java.sql.SQLException;
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
 * @author victo
 */
public class AgregarCdi12Controller implements Initializable {

    @FXML
    private TextField cmp;
    @FXML
    private TextField propcmp;
    @FXML
    private TextField perccmp;
    @FXML
    private TextField prod;
    @FXML
    private TextField propprod;
    @FXML
    private TextField percprod;
    @FXML
    private TextField gt;
    @FXML
    private TextField propgt;
    @FXML
    private TextField percgt;
    @FXML
    private TextField pf;
    @FXML
    private TextField proppf;
    @FXML
    private TextField percpf;
    @FXML
    private TextField gta;
    @FXML
    private TextField propgta;
    @FXML
    private TextField percgta;
    @FXML
    private TextField gtot;
    @FXML
    private TextField propgtot;
    @FXML
    private TextField percgtot;
    @FXML
    private Button agregar;
    @FXML
    private Label titulo;
    @FXML
    private Label label;
    @FXML
    private DatePicker fechaAplicacion;
    
    private int idbebe;
    private boolean editable;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        editable = false;
    }    

    @FXML
    private void agregar(ActionEvent event) throws SQLException {
        String fechan = "";
        if (!(isEmpty(cmp)||isEmpty(propcmp)||isEmpty(perccmp)||isEmpty(prod)||isEmpty(propprod)||isEmpty(percprod)||isEmpty(gt)||isEmpty(propgt)||isEmpty(percgt)||isEmpty(pf)||isEmpty(proppf)||isEmpty(percpf)||isEmpty(gta)||isEmpty(propgta)||isEmpty(percgta)||isEmpty(gtot)||isEmpty(propgtot)||isEmpty(percgtot)||fechaAplicacion.getValue()==null)) {
            if (!editable) {
                //try {
                    fechan = fechaAplicacion.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                    Cdi12Modelo cdim = new Cdi12Modelo(Integer.parseInt(pf.getText()),Float.parseFloat(proppf.getText()),Integer.parseInt(percpf.getText()),Integer.parseInt(cmp.getText()),Float.parseFloat(propcmp.getText()),Integer.parseInt(perccmp.getText()),Integer.parseInt(prod.getText()),Float.parseFloat(propprod.getText()),Integer.parseInt(percprod.getText()),Integer.parseInt(gtot.getText()),Float.parseFloat(propgtot.getText()),Integer.parseInt(percgtot.getText()),Integer.parseInt(gt.getText()),Float.parseFloat(propgt.getText()),Integer.parseInt(percgt.getText()),Integer.parseInt(gta.getText()),Float.parseFloat(propgta.getText()),Integer.parseInt(percgta.getText()),fechan,idbebe);
                    cdim.createCdi12();
                    alertInformation("Éxito","","CDI 12 agregado de forma exitosa.");
                //} catch (Exception e) {
                    
                //}
            }
        } else {
            return;
        }
        
        Stage actualWindow = (Stage) label.getScene().getWindow();
        actualWindow.close();      
    }
    
    public boolean isEmpty(TextField textfield) {
        return StringUtils.isEmptyOrWhitespaceOnly(textfield.getText());
    }
    
    public void inicializarBebe(int idbebe){
        this.idbebe = idbebe;
    }
    
    private void alertInformation(String titulo, String header, String contenido) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.initOwner(this.titulo.getParent().getScene().getWindow());
        alert.getDialogPane().getStylesheets().add("/babywizardjavafx/vista/EstiloGeneral.css");
        alert.setTitle(titulo);
        if(header.equals("")) {
            alert.setHeaderText(null);
        } else {alert.setHeaderText(header);}
        alert.setContentText(contenido);
        alert.showAndWait();
    }
}
