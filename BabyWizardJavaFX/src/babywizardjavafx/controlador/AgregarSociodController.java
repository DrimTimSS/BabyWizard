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
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
    private CheckBox probaudicion;
    @FXML
    private CheckBox probvision;
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
        
        int gest = (prematuro.isSelected()) ? 1 : 0;
        int probnac = probnacer.isSelected() ? 1 : 0;
        int probsal = probsalud.isSelected() ? 1 : 0;
        int probaud = probaudicion.isSelected() ? 1 : 0;
        int probvis = probvision.isSelected() ? 1 : 0;
        int otroidi = otroidioma.isSelected() ? 1 : 0;
        int pta2 = isEmpty(pa2) ? 0 : Integer.parseInt(pa2.getText());
        
        int g = guarderia.isSelected() ? 1 : 0;
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
                
                SociodemograficoModelo sdm = new SociodemograficoModelo(fechacita,gest,semnacimiento,pta1,pta2,pesoalnac,probnac,probsal,probaud,probvis,otroidi,herm,locu,adultos,ninios,cpr,g,tag,tqag,p,tap,tqap,obs,idbebe);
                sdm.createSociodemografico();
            } catch (Exception e) {
                label.setVisible(true);
            }
        } else {label.setVisible(true);}


            
            Stage actualWindow = (Stage) semanasnacio.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/babywizardjavafx/vista/CreadoExitosamente.fxml"));
            Parent root = (Parent) loader.load();
            JMetro jmetro = new JMetro(Style.LIGHT);
            jmetro.setParent(root);
            CreadoExitosamenteController cec = loader.getController();
            cec.queEsCreado("Cuidador agregado exitosamente.");
            Scene exito = new Scene(root);
            actualWindow.setScene(exito);
            Image image = new Image("/babywizardjavafx/vista/imagenes/bwlogo.jpg");
            actualWindow.getIcons().add(image);
            actualWindow.setTitle("Exito");
            actualWindow.show();
            actualWindow.centerOnScreen();
        }
}