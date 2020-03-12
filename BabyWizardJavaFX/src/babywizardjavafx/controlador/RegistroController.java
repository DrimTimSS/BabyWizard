/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx.controlador;

import babywizardjavafx.modelo.UsuarioModelo;
import java.net.URL;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Vicaris
 */
public class RegistroController implements Initializable {

    @FXML
    private Button registrar;
    @FXML
    private TextField usuario;
    @FXML
    private TextField nombre;
    @FXML
    private TextField apellidop;
    @FXML
    private TextField apellidom;
    @FXML
    private PasswordField repetircon;
    @FXML
    private PasswordField contrasenia;
    @FXML
    private TextField usuarioadm;
    @FXML
    private PasswordField contraseniaadm;
    @FXML
    private Label datosincorrectos;
    @FXML
    private Label errorusuario;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML
    public void registrar(ActionEvent event) throws SQLException{
        boolean permisocrear = false;
        UsuarioController uc = new UsuarioController();
        LinkedList<UsuarioModelo> usuarioregistro = new LinkedList<>();
        if(!usuarioadm.getText().equals("")){
            usuarioregistro = uc.selectUsuario(usuarioadm.getText(), "", "", "", -1);
        }
        String contrareal="";
        if(usuarioregistro.size()>0){
            contrareal = usuarioregistro.get(0).getContrasenia();
        } else {
            datosincorrectos.setText("Usuario no reconocido.");
        }
        if(contrareal.equals(contraseniaadm.getText())){
            permisocrear = true;
        } else {
            datosincorrectos.setText("Contraseña incorrecta.");
        }
        if(!permisocrear){
            contrasenia.clear();
        } else {
            if(!(usuario.getText().equals("")) && !(nombre.getText().equals("")) && !(apellidop.getText().equals("")) && !(apellidom.getText().equals("")) && !(contrasenia.getText().equals(""))){
                if(contrasenia.getText().equals(repetircon.getText())) {
                UsuarioModelo um = new UsuarioModelo(usuario.getText(),nombre.getText(),apellidop.getText(),apellidom.getText(),contrasenia.getText(),0);
                try{
                    uc.createUsuario(um);
                    Stage actualWindow = (Stage) errorusuario.getScene().getWindow();
                    actualWindow.close();
                } catch (SQLIntegrityConstraintViolationException e) {
                    errorusuario.setText("¡No se pudo crear nuevo usuario!");
                }
                }
            }
        }
    }
    
}
