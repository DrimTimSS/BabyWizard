/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx.controlador;

import babywizardjavafx.modelo.BebeModelo;
import babywizardjavafx.modelo.CuidadorModelo;
import babywizardjavafx.modelo.SociodemograficoModelo;
import babywizardjavafx.modelo.SocioeconomicoModelo;
import com.mysql.cj.util.StringUtils;
import java.net.URL;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Vicaris
 */
public class RegistroCController implements Initializable {

    @FXML
    private TextField nombres;
    @FXML
    private TextField apellidop;
    @FXML
    private TextField apellidom;
    @FXML
    private TextField correo;
    @FXML
    private Button atras;
    @FXML
    private TextField ocupacion;
    @FXML
    private TextField telefono1;
    @FXML
    private DatePicker fechanacimiento;
    @FXML
    private TextField telefono2;
    @FXML
    private TextField aniosestudio;
    @FXML
    private Button yaregistrado;
    @FXML
    private Button finalizar;
    @FXML
    private TextField nse;
    @FXML
    private TextField puntajecrudo;
    @FXML
    private Label titulo;
    
    public String querybebe;
    public String querysociodem;

    BebeModelo bm;
    SociodemograficoModelo sm;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        aniosestudio.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, 
            String newValue) {
                if (!newValue.matches("\\d\\d")) {
                    aniosestudio.setText(newValue.replaceAll("[^\\d]", ""));
                    if(!(aniosestudio.getText().length()<2)) aniosestudio.setText(aniosestudio.getText().substring(0,2));
                }
            }
        });
    }    

    @FXML
    private void atras(ActionEvent event) {
    }

    @FXML
    private void yaRegistrado(ActionEvent event) {
    }

    @FXML
    private void finalizar(ActionEvent event) {
        
        
    }
    
    public boolean isEmpty(TextField textfield){
        return StringUtils.isEmptyOrWhitespaceOnly(textfield.getText());
    }
    
    public void getBebeySD(BebeModelo bm, SociodemograficoModelo sm){
        this.bm = bm;
        this.sm = sm;
    }
    
    public CuidadorModelo crearCuidadador(){
        if(!(isEmpty(correo)||isEmpty(nombres)||isEmpty(apellidop)||isEmpty(apellidom)||isEmpty(ocupacion)||isEmpty(telefono1)||isEmpty(aniosestudio))){
            try{
                String fechan = fechanacimiento.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                return new CuidadorModelo(correo.getText(), fechan, nombres.getText(),apellidop.getText(), apellidom.getText(), ocupacion.getText(), telefono1.getText(), telefono2.getText(), Integer.parseInt(aniosestudio.getText()));
            } catch(Exception e){
                System.out.println("No se llenaron todos los campos.");
            }           
        } else{
            System.out.println("No se llenaron todos los campos.");
        }
        return null;
    }
    
    public SocioeconomicoModelo crearSocioeconomico(){
        if(!(isEmpty(nse)||isEmpty(puntajecrudo))){
            try{
                return new SocioeconomicoModelo(Integer.parseInt(puntajecrudo.getText()), nse.getText(), 0);
            } catch(Exception e){
                System.out.println("No se llenaron todos los campos.");
            }   
            
        } else {
            System.out.println("No se llenaron todos los campos.");
        }
        return null;
    }
}
