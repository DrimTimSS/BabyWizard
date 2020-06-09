/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx.controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author Valdovinos
 */
public class AgregarSociodController implements Initializable {

    @FXML
    private DatePicker fechacita;
    @FXML
    private RadioButton prematuro;
    @FXML
    private ToggleGroup gestacion;
    @FXML
    private RadioButton atermino;
    @FXML
    private TextField semnacim;
    @FXML
    private TextField peso;
    @FXML
    private ComboBox<?> apgar1;
    @FXML
    private ComboBox<?> apgar2;
    @FXML
    private RadioButton pnacersi;
    @FXML
    private RadioButton pnacerno;
    @FXML
    private ToggleGroup gestacion1;
    @FXML
    private RadioButton psaludsi;
    @FXML
    private ToggleGroup gestacion2;
    @FXML
    private RadioButton psaludno;
    @FXML
    private RadioButton paudicionsi;
    @FXML
    private ToggleGroup gestacion3;
    @FXML
    private RadioButton paudicionno;
    @FXML
    private RadioButton pvisionsi;
    @FXML
    private ToggleGroup gestacion4;
    @FXML
    private RadioButton pvisionno;
    @FXML
    private RadioButton otroidiomasi;
    @FXML
    private RadioButton otroidiomano;
    @FXML
    private ToggleGroup gestacion41;
    @FXML
    private ComboBox<?> cuidador;
    @FXML
    private RadioButton guarderiasi;
    @FXML
    private ToggleGroup gestacion4111;
    @FXML
    private RadioButton guarderiano;
    @FXML
    private ToggleGroup gestacion41111;
    @FXML
    private TextField gtiempo;
    @FXML
    private TextField gasistencia;
    @FXML
    private RadioButton preescolarsi;
    @FXML
    private RadioButton preescolarno;
    @FXML
    private TextField ptiempo;
    @FXML
    private TextField pasistencia;
    @FXML
    private TextField hermanos;
    @FXML
    private TextField lugarocupa;
    @FXML
    private TextField adultos;
    @FXML
    private TextField ninios;
    @FXML
    private Label titulo;
    @FXML
    private TextArea observaciones;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void guarderiaChecked(ActionEvent event) {
        boolean checked = guarderiasi.isSelected();
        if(checked==true){
            gtiempo.setDisable(false);
            gasistencia.setDisable(false);
        } else {
            gtiempo.setDisable(true);
            gasistencia.setDisable(true);
        }
    }

    @FXML
    private void preescolarChecked(ActionEvent event) {
        boolean checked = preescolarsi.isSelected();
        if (checked == true) {
            ptiempo.setDisable(false);
            pasistencia.setDisable(false);
        } else {
            ptiempo.setDisable(true);
            pasistencia.setDisable(true);
        }
    }

    @FXML
    private void agregar(ActionEvent event) {
    }
    
}



