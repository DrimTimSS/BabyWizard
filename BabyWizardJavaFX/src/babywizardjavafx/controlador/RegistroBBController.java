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
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import jfxtras.styles.jmetro.JMetro;
import jfxtras.styles.jmetro.Style;

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
    
    public boolean editar;
    public int idBebeActualizar;
    
    public Alertas alerta;
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
        cuidadorprinc.getItems().add("Abuela P.");
        cuidadorprinc.getItems().add("Abuela M.");
        cuidadorprinc.getItems().add("Abuelo P.");
        cuidadorprinc.getItems().add("Abuelo M.");
        cuidadorprinc.getItems().add("Tía P.");
        cuidadorprinc.getItems().add("Tía M.");
        cuidadorprinc.getItems().add("Tío P.");
        cuidadorprinc.getItems().add("Tío M.");
        cuidadorprinc.getItems().add("Hermana");
        cuidadorprinc.getItems().add("Hermano");
        cuidadorprinc.getItems().add("Otro");
        
        continuar.setOnKeyPressed(new EventHandler<KeyEvent>()
    {
        @Override
        public void handle(KeyEvent ke)
        {
            if (ke.getCode().equals(KeyCode.ENTER))
            {
                try {
                    continuarACuidador(null);
                } catch (IOException ex) {
                    Logger.getLogger(InicioSesionController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(RegistroBBController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    });
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
    private void continuarACuidador(ActionEvent event) throws IOException, SQLException{
            BebeModelo bm = crearbebe();
            if (bm == null) return;
            SociodemograficoModelo sm = crearSociodemografico();
            if (!(sm == null)) {
                if(editar==true){
                    bm.updateBebe(idBebeActualizar, -1, bm.getNombre(), bm.getApellidoMaterno(), bm.getApellidoPaterno(), bm.getSexo().equals("M") ? 0 : 1, bm.getFechaNacimiento(), "");
                    return;
                }
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/babywizardjavafx/vista/RegistroC.fxml"));
                Parent loadCuidador = (Parent) loader.load();
                JMetro jmetro = new JMetro(Style.LIGHT);
                jmetro.setParent(loadCuidador);
                Scene CuidadorScene = new Scene(loadCuidador);
                RegistroCController rcc = loader.getController();
                rcc.getBebeySD(bm, sm);
                Scene current = nombres.getScene();
                rcc.escenaInfante(current);
                Stage mainWindow = (Stage) continuar.getScene().getWindow();
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
        
        if(!(nombre.equals("")||apellidopaterno.equals("")||apellidomaterno.equals("")||sexo==-1||fechanacimiento.getValue()==null)){
            String fechan = fechanacimiento.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            return new BebeModelo(nombre,apellidomaterno,apellidopaterno,sexo,fechan,usuariois);
        } else {
            alerta = new Alertas(titulo.getParent().getScene().getWindow());
            alerta.alertInformation("Información datos", "Datos inválidos", "Los campos obligatorios para registrar infante no han sido llenados.");
        }
        
        return null;
    }

    private SociodemograficoModelo crearSociodemografico() {

        int gest = (prematuro.isSelected())?1:0;
        int probnac = probnacer.isSelected()?1:0;
        int probsal = probsalud.isSelected()?1:0;
        int probaud = probaudicion.isSelected()?1:0;
        int probvis = probvision.isSelected()?1:0;
        int otroidi = otroidioma.isSelected()?1:0;
        int pta2 = isEmpty(pa2) ? -1 : Integer.parseInt(pa2.getText());
        
        int g = guarderia.isSelected()?1:0;
        int tag = isEmpty(tiempoasistiendog) ? -1 : Integer.parseInt(tiempoasistiendog.getText());
        int tqag = isEmpty(tiempoqueasisteg) ? -1 : Integer.parseInt(tiempoqueasisteg.getText());
        int p = preescolar.isSelected()?1:0;
        int tap = isEmpty(tiempoasistiendop) ? -1 : Integer.parseInt(tiempoasistiendop.getText());
        int tqap = isEmpty(tiempoqueasistep) ? -1 : Integer.parseInt(tiempoqueasistep.getText());
        
        String obs = observaciones.getText();
        boolean confirmation = true;
        if(isEmpty(semanasnacio)||isEmpty(pesonacer)||isEmpty(numhermanos)||isEmpty(lugarocupa)||isEmpty(adultosvive)||isEmpty(niniosvive)||isEmpty(pa1)||cuidadorprinc.getValue()==null||fechadecita.getValue() == null){
            alerta = new Alertas(titulo.getParent().getScene().getWindow());
            confirmation = alerta.confirmation();
        }
        
        if (confirmation) {
            int pta1 = (isEmpty(pa1)) ? -1 : Integer.parseInt(pa1.getText());
            int semnacimiento = (isEmpty(semanasnacio)) ? -1 : Integer.parseInt(semanasnacio.getText());
            double pesoalnac = (isEmpty(pesonacer)) ? -1 : Double.parseDouble(pesonacer.getText());
            int herm = (isEmpty(numhermanos)) ? -1 : Integer.parseInt(numhermanos.getText());
            int locu = (isEmpty(lugarocupa)) ? -1 : Integer.parseInt(lugarocupa.getText());
            int adultos = (isEmpty(adultosvive)) ? -1 : Integer.parseInt(adultosvive.getText());
            int ninios = (isEmpty(niniosvive)) ? -1 : Integer.parseInt(niniosvive.getText());
            String cuidprinc = (cuidadorprinc.getValue()==null) ? "No indicado" : cuidadorprinc.getValue();
            try {
                String fechacita = (fechadecita.getValue() == null) ? "1111-11-11" : fechadecita.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                return new SociodemograficoModelo(fechacita, gest, semnacimiento, pta1, pta2, pesoalnac, probnac, probsal, probaud, probvis, otroidi, herm, locu, adultos, ninios, cuidprinc, g, tag, tqag, p, tap, tqap, obs, 0);
            } catch (Exception e) {
                alerta = new Alertas(titulo.getParent().getScene().getWindow());
                alerta.alertInformation("Datos", "Datos inválidos.", "No se pudo realizar el registro porque se proporcionaron datos inválidos.");
            }
        }
        return null;
    }
    
    public boolean isEmpty(TextField textfield){
        return StringUtils.isEmptyOrWhitespaceOnly(textfield.getText());
    }
    
    
}
