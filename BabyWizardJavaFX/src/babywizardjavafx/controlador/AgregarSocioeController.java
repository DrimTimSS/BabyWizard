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
import java.sql.SQLException;

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
        // TODO
    }    

    public void inicializarBebe(int idbebe) {
        this.idbebe = idbebe;
    }
    
    @FXML
    private void agregar(ActionEvent event) throws SQLException {
        String puntaje = puntajecrudo.getText();
        String n = nse.getText();
        
        if(!(puntaje.equals("") || n.equals(""))){
            SocioeconomicoModelo sem = new SocioeconomicoModelo(Integer.parseInt(puntaje), n, idbebe);
            sem.createSocioeconomico();
        } else{
            label.setVisible(true);
            return;            
        }
        
        
    }
    
}
