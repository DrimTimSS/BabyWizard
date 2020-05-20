/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx.controlador;

import babywizardjavafx.modelo.LecturaConjuntaModelo;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import jfxtras.styles.jmetro.JMetro;
import jfxtras.styles.jmetro.Style;

/**
 * FXML Controller class
 *
 * @author Vicaris
 */
public class LecturaConjuntaController implements Initializable {

    int idbebe;
    @FXML
    private Button agregar;
    @FXML
    private TextField inputprep;
    @FXML
    private TextField inputsust;
    @FXML
    private TextField inputart;
    @FXML
    private TextField inputverb;
    @FXML
    private TextField inputinint;
    @FXML
    private TextField inputadj;
    @FXML
    private TextField inputpron;
    @FXML
    private TextField inputadver;
    @FXML
    private TextField inputconj;
    @FXML
    private TextField inputinter;
    @FXML
    private RadioButton istype;
    @FXML
    private RadioButton isToken;
    @FXML
    private ToggleGroup tipoOToken;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void inicializarBebe(int idbebe){
        this.idbebe = idbebe;
    }

    @FXML
    private void agregar(ActionEvent event) throws IOException {
        
        int tOt = -1;
        if(istype.isSelected()){
            tOt = 0;
        } else if(isToken.isSelected()){
            tOt = 1;
        }
        String prep = inputprep.getText();
        String sust = inputsust.getText();
        String art = inputart.getText();
        String verb = inputverb.getText();
        String inint = inputinint.getText();
        String adj = inputadj.getText();
        String pron = inputpron.getText();
        String adver = inputadver.getText();
        String conj = inputconj.getText();
        String inter = inputinter.getText();
        
       /* if(!(tOt==-1 || prep.equals("") || sust.equals("") || art.equals("") || verb.equals("") || inint.equals("") || adj.equals("") || pron.equals("") || adver.equals("") || conj.equals("") || inter.equals(""))){
           LecturaConjuntaModelo lcm = new LecturaConjuntaModelo(tOt, prep, sust, art, verb, inint, adj, pron, adver, conj, inter);
        else ()
    */
       
       
        Stage actualWindow = (Stage) inputprep.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/babywizardjavafx/vista/CreadoExitosamente.fxml"));
        Parent root = (Parent) loader.load();
        JMetro jmetro = new JMetro(Style.LIGHT);
        jmetro.setParent(root);
        CreadoExitosamenteController cec = loader.getController();
        cec.queEsCreado("Lectura Conjunta agregada exitosamente.");
        Scene exito = new Scene(root);
        actualWindow.setScene(exito);
        Image image = new Image("/babywizardjavafx/vista/imagenes/bwlogo.jpg");
        actualWindow.getIcons().add(image);
        actualWindow.setTitle("Exito");
        actualWindow.show();
        actualWindow.centerOnScreen();

    }
    
}
