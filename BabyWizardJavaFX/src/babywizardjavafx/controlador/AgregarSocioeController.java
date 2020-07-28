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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import babywizardjavafx.modelo.SocioeconomicoModelo;
import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import jfxtras.styles.jmetro.JMetro;
import jfxtras.styles.jmetro.Style;

/**
 * FXML Controller class
 *
 * @author Valdovinos
 */
public class AgregarSocioeController implements Initializable {

    int idbebe;
    @FXML
    private TextField puntajecrudo;
    @FXML
    private ComboBox<String> nse;
    @FXML
    private Label titulo;
    @FXML
    private Label label;
    @FXML
    private Button agregar;
    @FXML
    private DatePicker fechaaplicacion;
    private boolean editable;
    private SocioeconomicoModelo sem;
    
    Alertas alerta;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        puntajecrudo.textProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
            if (!newValue.matches("\\d*")) {
                puntajecrudo.setText(newValue.replaceAll("[^\\d]", ""));
            }
        });
        
        nse.getItems().add("A\\B");
        nse.getItems().add("C+");
        nse.getItems().add("C");
        nse.getItems().add("C-");
        nse.getItems().add("D+");
        nse.getItems().add("D");
        nse.getItems().add("E");
    }    

    public void inicializarBebe(int idbebe) {
        this.idbebe = idbebe;
    }
    
    @FXML
    private void agregar(ActionEvent event) throws SQLException, IOException {
        alerta = new Alertas(label.getParent().getScene().getWindow());
        int puntaje = (puntajecrudo.getText().equals("")) ? -1 :  Integer.parseInt(puntajecrudo.getText());
        String n = (nse.getValue() == null) ? "X" : nse.getValue();
        String fechan = (fechaaplicacion.getValue()==null) ? "1111-11-11" : fechaaplicacion.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        
        boolean conf = true;
        if(puntajecrudo.getText().equals("") || nse.getValue() == null || fechaaplicacion.getValue()==null){
            conf = alerta.confirmation();
        } 
        
        if (!conf) {
            return;
        }
        if(!editable) {
            SocioeconomicoModelo sem = new SocioeconomicoModelo(puntaje, n, fechan, idbebe);
            sem.createSocioeconomico();
            alerta.alertInformation("Éxito","","Socioeconómico agregado de forma exitosa.");
            } else {
            sem.updateSocioeconomico(sem.getIdSocioeconomico(), -1, puntaje, n, fechan, -1);
            alerta.alertInformation("Éxito","","Socioeconómico editado de forma exitosa.");
            }
        
        Stage actualWindow = (Stage) label.getScene().getWindow();
        actualWindow.close();       
    }

    void setEditable(boolean b) {
        this.editable = b;
    }

    void setSocioeAEditar(SocioeconomicoModelo sem) {
        this.sem = sem;
    }

    void setCampos() {
        puntajecrudo.setText(sem.getPuntajeCrudo()+"");
        nse.setValue(sem.getNse());
        fechaaplicacion.setValue(LocalDate.parse(sem.getFechaAplicacion(), DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        label.setText("No se pudo editar socioeconómico.");
    }
    
    
}
