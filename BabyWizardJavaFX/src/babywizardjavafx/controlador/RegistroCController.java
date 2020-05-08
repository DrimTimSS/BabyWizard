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
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

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
    private ChoiceBox<String> nse;
    @FXML
    private TextField puntajecrudo;
    @FXML
    private Label titulo;
    
    public String querybebe;
    public String querysociodem;

    BebeModelo bm;
    SociodemograficoModelo sm;
    @FXML
    private ChoiceBox<String> relacion;
    @FXML
    private Label llenadodatos;
    
    Scene escenaAnterior;
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        relacion.getItems().add("Madre");
        relacion.getItems().add("Padre");
        relacion.getItems().add("Abuela");
        relacion.getItems().add("Abuelo");
        relacion.getItems().add("Tía");
        relacion.getItems().add("Tío");
        relacion.getItems().add("Hermana");
        relacion.getItems().add("Hermano");
        relacion.getItems().add("Otro");
        
        nse.getItems().add("A\\B");
        nse.getItems().add("C+");
        nse.getItems().add("C");
        nse.getItems().add("C-");
        nse.getItems().add("D+");
        nse.getItems().add("D");
        nse.getItems().add("E");
        
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
        
        telefono1.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, 
            String newValue) {
                if (!newValue.matches("\\d*")) {
                    telefono1.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
        
        telefono2.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, 
            String newValue) {
                if (!newValue.matches("\\d*")) {
                    telefono2.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
        
        puntajecrudo.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, 
            String newValue) {
                if (!newValue.matches("\\d*")) {
                    puntajecrudo.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
    }    

    @FXML
    private void atras(ActionEvent event) throws IOException {
        Stage actualWindow = (Stage) titulo.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/babywizardjavafx/vista/RegistroBB.fxml"));
        Parent root = (Parent) loader.load();
        Scene exito = escenaAnterior;
        actualWindow.setScene(exito);
    }

    @FXML
    private void yaRegistrado(ActionEvent event) {
    }

    @FXML
    private void finalizar(ActionEvent event) throws IOException, SQLException {
        CuidadorModelo cm = crearCuidador();
        SocioeconomicoModelo sem = crearSocioeconomico();
        
        if(!(bm == null||sm==null||cm==null||sem==null)) {
            try {
                bm.createBebe();
                sm.setFkBebeSociodemografico(bm.getIdBebe());
                sm.createSociodemografico();
                cm.setFkBebe(bm.getIdBebe());
                cm.createCuidador();
                sem.setFkSociodemografico(sm.getIdSociodemografico());
                sem.createSocioeconomico();
                
                Stage actualWindow = (Stage) titulo.getScene().getWindow();
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/babywizardjavafx/vista/CreadoExitosamente.fxml"));
                    Parent root = (Parent) loader.load();
                    CreadoExitosamenteController cec = loader.getController();
                    cec.queEsCreado("Infante Registrado Exitosamente.");
                    Scene exito = new Scene(root);
                    actualWindow.setScene(exito);
                    Image image = new Image("/babywizardjavafx/vista/imagenes/bwlogo.jpg");
                    actualWindow.getIcons().add(image);
                    actualWindow.setTitle("Exito");
                    actualWindow.show();
                    actualWindow.centerOnScreen();
                
                /**
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/babywizardjavafx/vista/RegistroC.fxml"));
                Parent loadCuidador = (Parent) loader.load(); 
                Scene CuidadorScene = new Scene(loadCuidador);
                RegistroCController rcc = loader.getController();
                rcc.getBebeySD(bm,sm);
                Stage mainWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
                mainWindow.setScene(CuidadorScene);
                mainWindow.show();
                **/
            } catch (Exception e) {
                System.out.println("No se llenaron los campos.");
            }
        }
    }
    
    public boolean isEmpty(TextField textfield){
        return StringUtils.isEmptyOrWhitespaceOnly(textfield.getText());
    }
    
    public void getBebeySD(BebeModelo bm, SociodemograficoModelo sm){
        this.bm = bm;
        this.sm = sm;
    }
    
    public CuidadorModelo crearCuidador(){
        if(!(isEmpty(correo)||isEmpty(nombres)||isEmpty(apellidop)||isEmpty(apellidom)||isEmpty(ocupacion)||isEmpty(telefono1)||isEmpty(aniosestudio))){
            try{
                String fechan = fechanacimiento.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                return new CuidadorModelo(correo.getText(), fechan, nombres.getText(),apellidop.getText(), apellidom.getText(), ocupacion.getText(), telefono1.getText(), telefono2.getText(), Integer.parseInt(aniosestudio.getText()),0);
            } catch(Exception e){
                llenadodatos.setText("No se han llenado todos los campos obligatorios.");
            }           
        } else{
            llenadodatos.setText("No se han llenado todos los campos obligatorios.");
        }
        return null;
    }
    
    public SocioeconomicoModelo crearSocioeconomico(){
        if(!(isEmpty(puntajecrudo))){
            try{
                return new SocioeconomicoModelo(Integer.parseInt(puntajecrudo.getText()), nse.getValue(), 0);
            } catch(Exception e){
                llenadodatos.setText("No se han llenado todos los campos obligatorios.");
            }   
            
        } else {
            llenadodatos.setText("No se han llenado todos los campos obligatorios.");
        }
        return null;
    }
    
    public void escenaInfante(Scene anterior){
        escenaAnterior = anterior;
    }
}
