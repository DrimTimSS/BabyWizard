/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx.controlador;

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
import javafx.scene.control.Hyperlink;
import javafx.stage.Popup;
import javafx.stage.Stage;

/**
 *
 * @author victo
 */
public class InicioSesionController implements Initializable {
    
    @FXML
    private Hyperlink registroUsuario;
    private Button botonRegistro;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        Stage popup = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/babywizardjavafx/vista/Registro.fxml"));
        Scene popupscene = new Scene(root);
        popup.setScene(popupscene);
        popup.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
