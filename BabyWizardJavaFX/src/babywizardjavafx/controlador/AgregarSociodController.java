/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx.controlador;

import babywizardjavafx.modelo.SociodemograficoModelo;
import com.mysql.cj.util.StringUtils;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import jfxtras.styles.jmetro.JMetro;
import jfxtras.styles.jmetro.Style;

/**
 * FXML Controller class
 *
 * @author Valdovinos
 */
public class AgregarSociodController implements Initializable {
    
    int idbebe;
    @FXML
    private DatePicker fechadecita;
    @FXML
    private TextField semanasnacio;
    @FXML
    private TextField pa1;
    @FXML
    private TextField pa2;
    @FXML
    private CheckBox prematuro;
    @FXML
    private TextField pesonacer;
    @FXML
    private CheckBox probsalud;
    @FXML
    private CheckBox otroidioma;
    @FXML
    private CheckBox probnacer;
    @FXML
    private ChoiceBox<String> cuidadorprinc;
    @FXML
    private CheckBox guarderia;
    @FXML
    private TextField tiempoasistiendog;
    @FXML
    private TextField tiempoqueasisteg;
    @FXML
    private CheckBox preescolar;
    @FXML
    private TextField tiempoasistiendop;
    @FXML
    private TextField tiempoqueasistep;
    @FXML
    private TextField numhermanos;
    @FXML
    private TextField lugarocupa;
    @FXML
    private TextField adultosvive;
    @FXML
    private TextField niniosvive;
    @FXML
    private Label titulo;
    @FXML
    private TextArea observaciones;
    @FXML
    private Label label;
    @FXML
    private CheckBox probaudicion;
    @FXML
    private CheckBox probvision;
    private boolean editable;
    private SociodemograficoModelo sdm;
    
    Alertas alerta;

    public boolean isEmpty(TextField textfield) {
        return StringUtils.isEmptyOrWhitespaceOnly(textfield.getText());
    }
    public void inicializarBebe(int idbebe){
        this.idbebe = idbebe;
    } 
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
    private void agregar(ActionEvent event) throws SQLException, IOException {
        boolean conf = true;
        if(isEmpty(semanasnacio)||isEmpty(pesonacer)||isEmpty(numhermanos)||isEmpty(lugarocupa)||isEmpty(adultosvive)||isEmpty(niniosvive)||isEmpty(pa1)||cuidadorprinc.getValue() == null||fechadecita.getValue() == null){
            alerta = new Alertas(titulo.getParent().getScene().getWindow());
            conf = alerta.confirmation();
        }
        int gest = (prematuro.isSelected()) ? 1 : 0;
        int probnac = probnacer.isSelected() ? 1 : 0;
        int probsal = probsalud.isSelected() ? 1 : 0;
        int probaud = probaudicion.isSelected() ? 1 : 0;
        int probvis = probvision.isSelected() ? 1 : 0;
        int otroidi = otroidioma.isSelected() ? 1 : 0;
        int pta2 = isEmpty(pa2) ? 0 : Integer.parseInt(pa2.getText());
        int g = guarderia.isSelected() ? 1 : 0;
        int tag = isEmpty(tiempoasistiendog) ? -1 : Integer.parseInt(tiempoasistiendog.getText());
        int tqag = isEmpty(tiempoqueasisteg) ? -1 : Integer.parseInt(tiempoqueasisteg.getText());
        int p = preescolar.isSelected() ? 1 : 0;
        int tap = isEmpty(tiempoasistiendop) ? -1 : Integer.parseInt(tiempoasistiendop.getText());
        int tqap = isEmpty(tiempoqueasistep) ? -1 : Integer.parseInt(tiempoqueasistep.getText());
        int pta1 = (isEmpty(pa1)) ? -1 : Integer.parseInt(pa1.getText());
        int semnacimiento = (isEmpty(semanasnacio)) ? -1 : Integer.parseInt(semanasnacio.getText());
        double pesoalnac = (isEmpty(pesonacer)) ? -1 : Double.parseDouble(pesonacer.getText());
        int herm = (isEmpty(numhermanos)) ? -1 : Integer.parseInt(numhermanos.getText());
        int locu = (isEmpty(lugarocupa)) ? -1 : Integer.parseInt(lugarocupa.getText());
        int adultos = (isEmpty(adultosvive)) ? -1 : Integer.parseInt(adultosvive.getText());
        int ninios = (isEmpty(niniosvive)) ? -1 : Integer.parseInt(niniosvive.getText());
        String fechacita = (fechadecita.getValue() == null) ? "1111-11-11" : fechadecita.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        String cpr = (cuidadorprinc.getValue() == null) ? "No indicado" : cuidadorprinc.getValue();
        String obs = observaciones.getText();
        
        if (!conf) return;
        
        if (!editable) {
            SociodemograficoModelo sm = new SociodemograficoModelo(fechacita, gest, semnacimiento, pta1, pta2, pesoalnac, probnac, probsal, probaud, probvis, otroidi, herm, locu, adultos, ninios, cpr, g, tag, tqag, p, tap, tqap, obs, idbebe);
            sm.createSociodemografico();
            alertInformation("Éxito", "", "Sociodemográfico agregado exitosamente.");
        } else {
            SociodemograficoModelo sm = new SociodemograficoModelo();
            sm.updateSociodemografico(sdm.getIdSociodemografico(), -1, fechacita, gest, semnacimiento, pta1, pta2, pesoalnac, probnac, probsal, probaud, probvis, otroidi, herm, locu, adultos, ninios, cpr, g, tag, tqag, p, tap, tqap, obs, idbebe);
            alertInformation("Éxito", "", "Sociodemográfico editado exitosamente.");
        }
        //} else {
        //    label.setVisible(true);
        //    return;
        //}
            Stage actualWindow = (Stage) label.getScene().getWindow();
           
            actualWindow.close();
        }

    void setEditable(boolean b) {
        this.editable = b;
    }

    void setSociodAEditar(SociodemograficoModelo sdm) {
        this.sdm = sdm;
    }

    void setCampos() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(sdm.getFechaDeCita(), formatter);
        fechadecita.setValue(localDate);
        semanasnacio.setText(sdm.getSemanasDeNacimiento()+"");
        pa1.setText(sdm.getPtApgar1()+"");
        pa2.setText(sdm.getPtApgar2()+"");
        prematuro.setSelected(sdm.getGestacion()==1);
        pesonacer.setText(sdm.getPesoAlNacer()+"");
        probsalud.setSelected(sdm.getProblemasDeSalud()==1);
        otroidioma.setSelected(sdm.getOtroIdioma()==1);
        probnacer.setSelected(sdm.getProblemasAlNacer()==1);
        cuidadorprinc.setValue(sdm.getCuidadorPrincipal());
        guarderia.setSelected(sdm.getGuarderia()==1);
        guarderiaChecked(null);
        tiempoasistiendog.setText(sdm.getTiempoAsistiendoMesesG()+"");
        tiempoqueasisteg.setText(sdm.getTiempoQueAsisteG()+"");
        preescolar.setSelected(sdm.getPreescolar()==1);
        preescolarChecked(null);
        tiempoasistiendop.setText(sdm.getTiempoAsistiendoMesesP()+"");
        tiempoqueasistep.setText(sdm.getTiempoQueAsisteP()+"");
        numhermanos.setText(sdm.getHermanos()+"");
        lugarocupa.setText(sdm.getLugarOcupa()+"");
        adultosvive.setText(sdm.getAdultos()+"");
        niniosvive.setText(sdm.getNinios()+"");
        observaciones.setText(sdm.getObservaciones());
        label.setText("No se pudieron editar los datos.");
        probaudicion.setSelected(sdm.getProblemasDeAudicion()==1);
        probvision.setSelected(sdm.getProblemasDeVision()==1);
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
}