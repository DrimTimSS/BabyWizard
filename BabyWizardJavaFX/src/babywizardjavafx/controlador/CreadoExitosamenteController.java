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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Vicaris
 */
public class CreadoExitosamenteController implements Initializable {

    @FXML
    private Label creado;
    @FXML
    private Button continuar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    @FXML
    public void continuar(ActionEvent event){
        Stage actualWindow = (Stage) continuar.getScene().getWindow();
        actualWindow.close();
    }
    
    public void queEsCreado(String creado) {
        this.creado.setText(creado);
    }
    
}
