/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx.controlador;

import babywizardjavafx.modelo.ExperimentoCabinaModelo;
import com.mysql.cj.util.StringUtils;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import jfxtras.styles.jmetro.JMetro;
import jfxtras.styles.jmetro.Style;

/**
 * FXML Controller class
 *
 * @author Vicaris
 */
public class ExperimentoCabinaController implements Initializable {
    
    int idbebe;
    @FXML
    private TextField inputtipoExp;
    @FXML
    private Label label;
    @FXML
    private Button agregaredc;
    @FXML
    private TextField enlace;
    
    /**
     * Initializes the controller class.
     */
    
    private boolean isEmpty(TextField textfield){
      return StringUtils.isEmptyOrWhitespaceOnly(textfield.getText());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
    public void inicializarBebe(int idbebe){
        this.idbebe = idbebe;
    }
    
    @FXML
    private void agregar(ActionEvent event) throws IOException, SQLException {
        
        String tExp = (isEmpty(inputtipoExp))?"":inputtipoExp.getText();
        String enl = (isEmpty(enlace))?"":enlace.getText();
        
        if(!(isEmpty(enlace) || isEmpty(inputtipoExp))){       
        enl = enl.replaceAll("/", "//");
        enl = enl.replaceAll("\\\\", "\\\\\\\\");
        ExperimentoCabinaModelo ecm = new ExperimentoCabinaModelo(tExp, enl, idbebe);
        ecm.createExperimentoCabina();

        } else{
          boolean c = confirmation();
          if (c) {
            ExperimentoCabinaModelo ecm = new ExperimentoCabinaModelo(tExp, enl, idbebe);
            ecm.createExperimentoCabina();
          }
          return;
      }
        
        
        alertInformation("Éxito","","Prueba de laboratorio creada de forma exitosa.");
        Stage actualWindow = (Stage) label.getScene().getWindow();
        actualWindow.close();
    }

    private void alertInformation(String titulo, String header, String contenido) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.initOwner(label.getParent().getScene().getWindow());
        alert.getDialogPane().getStylesheets().add("/babywizardjavafx/vista/EstiloGeneral.css");
        alert.setTitle(titulo);
        if(header.equals("")) {
            alert.setHeaderText(null);
        } else {alert.setHeaderText(header);}
        alert.setContentText(contenido);
        alert.showAndWait();
    }
    
    private boolean confirmation() {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.getDialogPane().getStylesheets().add("/babywizardjavafx/vista/EstiloGeneral.css");
        alert.setTitle("Confirmar");
        alert.setHeaderText("Campos vacíos");
        alert.setContentText("Algunos campos están vacíos, ¿desea registrar de esta manera?");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK) {
            return true;
        } else {
            return false;
        }
    }

    @FXML
    private String buscarEnlace(ActionEvent event) {
        String direccion = "";
        FileChooser chooser = new FileChooser();
        File file = chooser.showOpenDialog(label.getParent().getScene().getWindow());
        if (file!=null) {
            direccion = file.toString();
        }
        enlace.setText(direccion);
        return direccion;
    }
}
