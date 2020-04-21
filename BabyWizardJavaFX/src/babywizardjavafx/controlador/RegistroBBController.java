/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx.controlador;

import babywizardjavafx.modelo.BebeModelo;
import babywizardjavafx.modelo.SociodemograficoModelo;
import com.mysql.cj.util.StringUtils;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
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
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author valdo
 */
public class RegistroBBController implements Initializable {

    @FXML
    private TextField nombres;
    @FXML
    private TextField apellidop;
    @FXML
    private TextField apellidom;
    @FXML
    private DatePicker fechanacimiento;
    @FXML
    private TextField semanasnacio;
    @FXML
    private TextField pa1;
    @FXML
    private TextField pa2;
    @FXML
    private RadioButton sexom;
    @FXML
    private ToggleGroup sexotoggle;
    @FXML
    private RadioButton sexof;
    @FXML
    private CheckBox prematuro;
    @FXML
    private CheckBox probnacer;
    @FXML
    private TextField pesonacer;
    @FXML
    private TextField numhermanos;
    @FXML
    private TextField lugarocupa;
    @FXML
    private CheckBox probsalud;
    @FXML
    private CheckBox probaudicion;
    @FXML
    private CheckBox probvision;
    @FXML
    private CheckBox otroidioma;
    @FXML
    private TextField tiempoasistiendog;
    @FXML
    private TextField tiempoqueasisteg;
    @FXML
    private TextField tiempoasistiendop;
    @FXML
    private TextField tiempoqueasistep;
    @FXML
    private DatePicker fechadecita;
    @FXML
    private CheckBox guarderia;
    @FXML
    private CheckBox preescolar;
    @FXML
    private ChoiceBox<String> cuidadorprinc;
    @FXML
    private Button continuar;
    @FXML
    private Label titulo;
    @FXML
    private TextField adultosvive;
    @FXML
    private TextField niniosvive;
    
    String usuariois;
    @FXML
    private TextField observaciones;
    @FXML
    private Label nollenado;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        fechadecita.setValue(LocalDate.now());
        semanasnacio.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, 
            String newValue) {
                if (!newValue.matches("\\d*")) {
                    semanasnacio.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
        pa1.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, 
            String newValue) {
                if (!newValue.matches("\\d\\d")) {
                    pa1.setText(newValue.replaceAll("[^\\d]", ""));
                    if(!(pa1.getText().length()<2)) pa1.setText(pa1.getText().substring(0,2));
                }
            }
        });
        pa2.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, 
            String newValue) {
                if (!newValue.matches("\\d\\d")) {
                    pa2.setText(newValue.replaceAll("[^\\d]", ""));
                    if(!(pa2.getText().length()<2)) pa2.setText(pa2.getText().substring(0,2));
                }
            }
        });
        pesonacer.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, 
            String newValue) {
                if (!newValue.matches("[0-9]?(\\.[0-9]{0,2})?")) {
                    pesonacer.setText(oldValue);
                }
            }
        });
        numhermanos.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, 
            String newValue) {
                if (!newValue.matches("\\d*")) {
                    numhermanos.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
        lugarocupa.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, 
            String newValue) {
                if (!newValue.matches("\\d*")) {
                    lugarocupa.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
        niniosvive.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, 
            String newValue) {
                if (!newValue.matches("\\d*")) {
                    niniosvive.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
        adultosvive.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, 
            String newValue) {
                if (!newValue.matches("\\d*")) {
                    adultosvive.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
        cuidadorprinc.getItems().add("Madre");
        cuidadorprinc.getItems().add("Padre");
        cuidadorprinc.getItems().add("Abuela");
        cuidadorprinc.getItems().add("Abuelo");
        cuidadorprinc.getItems().add("Tía");
        cuidadorprinc.getItems().add("Tío");
        cuidadorprinc.getItems().add("Hermana");
        cuidadorprinc.getItems().add("Hermano");
        cuidadorprinc.getItems().add("Otro");
    }
    
    @FXML
    private void preescolarChecked(ActionEvent event){
        boolean checked = preescolar.isSelected();
        if(checked==true){
            tiempoasistiendop.setDisable(false);
            tiempoqueasistep.setDisable(false);
        } else {
            tiempoasistiendop.setDisable(true);
            tiempoqueasistep.setDisable(true);
        }
    }

    @FXML
    private void guarderiaChecked(ActionEvent event) {
        boolean checked = guarderia.isSelected();
        if(checked==true){
            tiempoasistiendog.setDisable(false);
            tiempoqueasisteg.setDisable(false);
        } else {
            tiempoasistiendog.setDisable(true);
            tiempoqueasisteg.setDisable(true);
        }
    }
    
    @FXML
    private void continuarACuidador(ActionEvent event) throws IOException{
        BebeModelo bm = crearbebe();
        SociodemograficoModelo sm = crearSociodemografico();
        
        if(!(bm == null||sm==null)){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/babywizardjavafx/vista/RegistroC.fxml"));
        Parent loadCuidador = (Parent) loader.load(); 
        Scene CuidadorScene = new Scene(loadCuidador);
        RegistroCController rcc = loader.getController();
        rcc.getBebeySD(bm,sm);
        Stage mainWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
        mainWindow.setScene(CuidadorScene);
        mainWindow.show();  
        }
    }
    
    public void inicializarUsuario(String usuariois){
        this.usuariois=usuariois;
    }
    
    private BebeModelo crearbebe(){
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
                return new BebeModelo(nombre,apellidopaterno,apellidomaterno,sexo,fechan,usuariois);
            } catch (Exception e) {
                nollenado.setText("No se han llenado todos los campos obligatorios.");
            }
        } else {nollenado.setText("No se han llenado todos los campos obligatorios.");}
        
        return null;
    }

    private SociodemograficoModelo crearSociodemografico() {

        int gest = (prematuro.isSelected()) ? 1 : 0;
        int probnac = probnacer.isSelected()?1:0;
        int probsal = probsalud.isSelected()?1:0;
        int probaud = probaudicion.isSelected()?1:0;
        int probvis = probvision.isSelected()?1:0;
        int otroidi = otroidioma.isSelected()?1:0;
        int pta2 = isEmpty(pa2) ? 0 : Integer.parseInt(pa2.getText());
        
        int g = guarderia.isSelected()?1:0;
        int tag = isEmpty(tiempoasistiendog) ? 0 : Integer.parseInt(tiempoasistiendog.getText());
        int tqag = isEmpty(tiempoqueasisteg) ? 0 : Integer.parseInt(tiempoqueasisteg.getText());
        int p = preescolar.isSelected()?1:0;
        int tap = isEmpty(tiempoasistiendop) ? 0 : Integer.parseInt(tiempoasistiendop.getText());
        int tqap = isEmpty(tiempoqueasistep) ? 0 : Integer.parseInt(tiempoqueasistep.getText());
        
        String obs = observaciones.getText();
        
        if(!(isEmpty(semanasnacio)||isEmpty(pesonacer)||isEmpty(numhermanos)||isEmpty(lugarocupa)||isEmpty(adultosvive)||isEmpty(niniosvive)||isEmpty(pa1))){
            int pta1 = Integer.parseInt(pa1.getText());
            int semnacimiento = Integer.parseInt(semanasnacio.getText());
            double pesoalnac = Double.parseDouble(pesonacer.getText());
            int herm = Integer.parseInt(numhermanos.getText());
            int locu = Integer.parseInt(lugarocupa.getText());
            int adultos = Integer.parseInt(adultosvive.getText());
            int ninios = Integer.parseInt(niniosvive.getText());
            try {
                String cuidprinc = cuidadorprinc.getValue();
                String fechacita = fechadecita.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                String cpr = cuidadorprinc.getValue();
                return new SociodemograficoModelo(fechacita,gest,semnacimiento,pta1,pta2,pesoalnac,probnac,probsal,probaud,probvis,otroidi,herm,locu,adultos,ninios,cpr,g,tag,tqag,p,tap,tqap,obs,0);
            } catch (Exception e) {
                nollenado.setText("No se han llenado todos los campos obligatorios.");
            }
        } else {nollenado.setText("No se han llenado todos los campos obligatorios.");}
        
        return null;
    }
    
    public boolean isEmpty(TextField textfield){
        return StringUtils.isEmptyOrWhitespaceOnly(textfield.getText());
    }
    
    
}
