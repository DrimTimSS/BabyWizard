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
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
    private TextField nse;
    @FXML
    private Label titulo;
    @FXML
    private Label label;

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
        
    }    

    public void inicializarBebe(int idbebe) {
        this.idbebe = idbebe;
    }
    
    @FXML
    private void agregar(ActionEvent event) throws SQLException, IOException {
        String puntaje = puntajecrudo.getText();
        String n = nse.getText();
        
        if(!(puntaje.equals("") || n.equals(""))){
            SocioeconomicoModelo sem = new SocioeconomicoModelo(Integer.parseInt(puntaje), n, idbebe);
            sem.createSocioeconomico();
        } else{
            label.setVisible(true);
            return;            
        }
        
        Stage actualWindow = (Stage) puntajecrudo.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/babywizardjavafx/vista/CreadoExitosamente.fxml"));
        Parent root = (Parent) loader.load();
        JMetro jmetro = new JMetro(Style.LIGHT);
        jmetro.setParent(root);
        CreadoExitosamenteController cec = loader.getController();
        cec.queEsCreado("Información socioeconómica agregada exitosamente.");
        Scene exito = new Scene(root);
        actualWindow.setScene(exito);
        Image image = new Image("/babywizardjavafx/vista/imagenes/bwlogo.jpg");
        actualWindow.getIcons().add(image);
        actualWindow.setTitle("Exito");
        actualWindow.show();
        actualWindow.centerOnScreen();        
    }
    
}
