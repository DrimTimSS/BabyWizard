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
    
    boolean editable;
    
    Alertas alerta;
    private ExperimentoCabinaModelo expcab;
    
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
        alerta = new Alertas(label.getParent().getScene().getWindow());
        
        String tExp = (isEmpty(inputtipoExp))?"":inputtipoExp.getText();
        String enl = (isEmpty(enlace))?"":enlace.getText();
        boolean c = true;
        if(isEmpty(enlace) || isEmpty(inputtipoExp)){
            c = alerta.confirmation();

        }
        if (c) {
            enl = enl.replaceAll("/", "//");
            enl = enl.replaceAll("\\\\", "\\\\\\\\");
            ExperimentoCabinaModelo ecm = new ExperimentoCabinaModelo(tExp, enl, idbebe);
            if (editable) {
                ecm.updateExperimentoCabina(expcab.getIdExperimentoCabina(), -1, tExp, enl, idbebe);
                alerta.alertInformation("Éxito","","Prueba de laboratorio editada de forma exitosa.");
                Stage actualWindow = (Stage) label.getScene().getWindow();
                actualWindow.close();
                return;
            }
            
            ecm.createExperimentoCabina();
            alerta.alertInformation("Éxito","","Prueba de laboratorio creada de forma exitosa.");
            Stage actualWindow = (Stage) label.getScene().getWindow();
        actualWindow.close();
        } else {return;}
  
          
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

    void setEditable(boolean b) {
        this.editable = b;
    }

    void setCampos() {
        this.inputtipoExp.setText(expcab.getTipoExperimento());
        this.enlace.setText(expcab.getEnlace());
    }

    void setExperimentoCabinaAEditar(ExperimentoCabinaModelo expcab) {
        this.expcab = expcab;
    }
}
