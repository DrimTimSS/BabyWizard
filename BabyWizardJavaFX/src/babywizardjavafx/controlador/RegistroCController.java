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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import jfxtras.styles.jmetro.JMetro;
import jfxtras.styles.jmetro.Style;

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
    @FXML
    private TextField edad;
    @FXML
    private DatePicker fechaaplicacionnse;
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        nse.getItems().add("A\\B");
        nse.getItems().add("C+");
        nse.getItems().add("C");
        nse.getItems().add("C-");
        nse.getItems().add("D+");
        nse.getItems().add("D");
        nse.getItems().add("E");
                
        
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
        
        atras.setOnKeyPressed(new EventHandler<KeyEvent>()
    {
        @Override
        public void handle(KeyEvent ke)
        {
            if (ke.getCode().equals(KeyCode.ENTER))
            {
                try {
                    atras(null);
                } catch (IOException ex) {
                    Logger.getLogger(InicioSesionController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    });
        finalizar.setOnKeyPressed(new EventHandler<KeyEvent>()
    {
        @Override
        public void handle(KeyEvent ke)
        {
            if (ke.getCode().equals(KeyCode.ENTER))
            {
                try {
                    finalizar(null);
                } catch (IOException ex) {
                    Logger.getLogger(InicioSesionController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(InicioSesionController.class.getName()).log(Level.SEVERE, null, ex);
                }
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
        JMetro jmetro = new JMetro(Style.LIGHT);
        jmetro.setParent(root);
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
            //try {
                bm.createBebe();
                int idBebe = bm.getIdBebe();
                sm.setFkBebeSociodemografico(idBebe);
                sm.createSociodemografico();
                cm.setFkBebe(idBebe);
                cm.createCuidador();
                sem.setFkBebe(idBebe);
                sem.createSocioeconomico();
                
                alertInformation("Éxito","","Infante con datos sociodemográficos registrado de forma exitosa.");
                Stage actualWindow = (Stage) nombres.getScene().getWindow();
                actualWindow.close();
                
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
            //} catch (Exception e) {
            //    System.out.println("No se pudo registrar al infante.");
            //}
        }
    }
    
    public boolean isEmpty(TextField textfield){
        return StringUtils.isEmptyOrWhitespaceOnly(textfield.getText());
    }
    
    public void getBebeySD(BebeModelo bm, SociodemograficoModelo sm){
        this.bm = bm;
        this.sm = sm;
        fechaaplicacionnse.setValue(LocalDate.parse(sm.getFechaDeCita(), DateTimeFormatter.ofPattern("yyyy-MM-dd")));
    }
    
    public CuidadorModelo crearCuidador(){
        if(!(isEmpty(edad)||isEmpty(correo)||isEmpty(nombres)||isEmpty(apellidop)||isEmpty(apellidom)||isEmpty(ocupacion)||isEmpty(telefono1)||isEmpty(aniosestudio))){
            try {
                return new CuidadorModelo(correo.getText(), Integer.parseInt(edad.getText()), nombres.getText(),apellidop.getText(), apellidom.getText(), ocupacion.getText(), telefono1.getText(), telefono2.getText(), Integer.parseInt(aniosestudio.getText()), relacion.getValue(),0);
            } catch (Exception e) {
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
                return new SocioeconomicoModelo(Integer.parseInt(puntajecrudo.getText()), nse.getValue(), fechaaplicacionnse.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")), 0);
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
    
    private void alertInformation(String titulo, String header, String contenido) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.initOwner(nombres.getParent().getScene().getWindow());
        alert.getDialogPane().getStylesheets().add("/babywizardjavafx/vista/EstiloGeneral.css");
        alert.setTitle(titulo);
        if(header.equals("")) {
            alert.setHeaderText(null);
        } else {alert.setHeaderText(header);}
        alert.setContentText(contenido);
        alert.showAndWait();
    }
}
