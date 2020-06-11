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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
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
    private ChoiceBox<String> apgar1;
    @FXML
    private ChoiceBox<String> apgar2;
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
    private ChoiceBox<String> cuidador;
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

        cuidador.getItems().add("Madre");
        cuidador.getItems().add("Padre");
        cuidador.getItems().add("Abuela P.");
        cuidador.getItems().add("Abuela M.");
        cuidador.getItems().add("Abuelo P.");
        cuidador.getItems().add("Abuelo M.");
        cuidador.getItems().add("Tía P.");
        cuidador.getItems().add("Tía M.");
        cuidador.getItems().add("Tío P.");
        cuidador.getItems().add("Tío M.");
        cuidador.getItems().add("Hermana");
        cuidador.getItems().add("Hermano");
        cuidador.getItems().add("Otro");
        
        apgar1.getItems().add("1");
        apgar1.getItems().add("2");
        apgar1.getItems().add("3");
        apgar1.getItems().add("4");
        apgar1.getItems().add("5");
        apgar1.getItems().add("6");
        apgar1.getItems().add("7");
        apgar1.getItems().add("8");
        apgar1.getItems().add("9");
        apgar1.getItems().add("10");
        
        apgar2.getItems().add("1");
        apgar2.getItems().add("2");
        apgar2.getItems().add("3");
        apgar2.getItems().add("4");
        apgar2.getItems().add("5");
        apgar2.getItems().add("6");
        apgar2.getItems().add("7");
        apgar2.getItems().add("8");
        apgar2.getItems().add("9");
        apgar2.getItems().add("10");
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
    private void agregar(ActionEvent event) throws SQLException, IOException {
        //prematuro o a termino
        int pOt = -1;
        if (prematuro.isSelected()) {
            pOt = 0;
        } else if (atermino.isSelected()) {
            pOt = 1;
        }
        //problemas al nacer
        int pAn = -1;
        if (pnacersi.isSelected()) {
            pAn = 0;
        } else if (pnacerno.isSelected()) {
            pAn = 1;
        } 
        //problemas de salud
        int pDs = -1;
        if (psaludsi.isSelected()) {
            pDs = 0;
        } else if (psaludno.isSelected()) {
            pDs = 1;
        }
        //problemas de audicion
        int pDa = -1;
        if (paudicionsi.isSelected()) {
            pDa = 0;
        } else if (paudicionno.isSelected()) {
            pDa = 1;
        }
        //problemas de vision
        int pDv = -1;
        if (pvisionsi.isSelected()) {
            pDv = 0;
        } else if (pvisionno.isSelected()) {
            pDv = 1;
        }
        //otro idioma
        int oId = -1;
        if (otroidiomasi.isSelected()) {
            oId = 0;
        } else if (otroidiomano.isSelected()) {
            oId = 1;
        }
        //guarderia
        int guard = -1;
        if (guarderiasi.isSelected()) {
            guard = 0;
        } else if (guarderiano.isSelected()) {
            guard = 1;
        }
        //preescolar
        int pree = -1;
        if (preescolarsi.isSelected()) {
            pree = 0;
        } else if (preescolarno.isSelected()) {
            pree = 1;
        }
        
        String cui = cuidador.getValue();
        String apg1 = apgar1.getValue();
        String apg2 = apgar2.getValue();
        
        if(!(isEmpty(semnacim) || isEmpty(peso) || cui.equals("") || apg1.equals("") || isEmpty(hermanos) || isEmpty(lugarocupa) || isEmpty(adultos) || isEmpty(ninios))){
            int semanasnacimiento = Integer.parseInt(semnacim.getText());
            int apgarcito1 = Integer.parseInt(apg1);
            int apgarcito2 = Integer.parseInt(apg2);
            int pesoalnacer = Integer.parseInt(peso.getText());
            int herm = Integer.parseInt(hermanos.getText());
            int lugar = Integer.parseInt(lugarocupa.getText());
            int ad = Integer.parseInt(adultos.getText());
            int nin = Integer.parseInt(ninios.getText());
            int guardt = Integer.parseInt(gtiempo.getText());
            int guarda = Integer.parseInt(gasistencia.getText());
            int preesct = Integer.parseInt(ptiempo.getText());
            int preesca = Integer.parseInt(pasistencia.getText());
            String obser = observaciones.getText();
            String fecha = fechacita.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            
            SociodemograficoModelo sdm = new SociodemograficoModelo(fecha, pOt, semanasnacimiento, apgarcito1, apgarcito2, pesoalnacer, pAn, pDs, pDa, pDv, oId, herm, lugar, ad, nin, cui, guard, guardt, guarda, pree, preesct, preesca, obser, idbebe);
            sdm.createSociodemografico();
            
            Stage actualWindow = (Stage) semnacim.getScene().getWindow();
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
        
        else{
            label.setVisible(true);
            return;
        }
        
    }
    
}



