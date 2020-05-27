/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx.vista;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Valdovinos
 */
public class ConfUsuarioController implements Initializable {

    @FXML
    private Label datosincorrectos;
    @FXML
    private TextField usuarioadm;
    @FXML
    private PasswordField contraseniaadm;
    @FXML
    private TextField usuario;
    @FXML
    private Button registrar;
    @FXML
    private Label errorusuario;
    @FXML
    private PasswordField nuevacontra;
    @FXML
    private PasswordField confnuevacontra;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void registrar(ActionEvent event) {
    }
    
}
