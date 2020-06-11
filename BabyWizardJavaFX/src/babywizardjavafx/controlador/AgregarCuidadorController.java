/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx.controlador;

import babywizardjavafx.modelo.CuidadorModelo;
import com.mysql.cj.util.StringUtils;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import jfxtras.styles.jmetro.JMetro;
import jfxtras.styles.jmetro.Style;

/**
 * FXML Controller class
 *
 * @author victo
 */
public class AgregarCuidadorController implements Initializable {

    int idbebe;
    @FXML
    private Label titulo;
    @FXML
    private TextField nombres;
    @FXML
    private TextField apellidop;
    @FXML
    private TextField apellidom;
    @FXML
    private TextField correo;
    @FXML
    private ChoiceBox<String> relacion;
    @FXML
    private TextField edad;
    @FXML
    private TextField ocupacion;
    @FXML
    private TextField telefono1;
    @FXML
    private TextField telefono2;
    @FXML
    private TextField aniosestudio;
    @FXML
    private Button agregar;
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

    }    

    @FXML
    private void agregar(ActionEvent event) throws SQLException, IOException {
        
        if (!(isEmpty(edad) || isEmpty(correo) || isEmpty(nombres) || isEmpty(apellidop) || isEmpty(apellidom) || isEmpty(ocupacion) || isEmpty(telefono1) || isEmpty(aniosestudio))) {
            CuidadorModelo cm = new CuidadorModelo(correo.getText(), Integer.parseInt(edad.getText()), nombres.getText(),apellidop.getText(), apellidom.getText(), ocupacion.getText(), telefono1.getText(), telefono2.getText(), Integer.parseInt(aniosestudio.getText()), relacion.getValue(),idbebe);
            cm.createCuidador();
            
            Stage actualWindow = (Stage) apellidop.getScene().getWindow();
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
        } else{
          label.setVisible(true);
          return;
        }  
          
    }    
    
}

