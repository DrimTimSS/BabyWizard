/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx.controlador;

import babywizardjavafx.modelo.UsuarioModelo;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.LinkedList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Vicaris
 */
public class RegistroController implements Initializable {
    
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
    @FXML
    private Button registrar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       registrar.setOnKeyPressed(new EventHandler<KeyEvent>()
    {
        @Override
        public void handle(KeyEvent ke)
        {
            if (ke.getCode().equals(KeyCode.ENTER))
            {
                try {
                    registrar(null);
                } catch (IOException ex) {
                    Logger.getLogger(InicioSesionController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(InicioSesionController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    });
    }
    
    @FXML
    public void registrar(ActionEvent event) throws SQLException, IOException{
        boolean permisocrear = false;
        UsuarioModelo usm = new UsuarioModelo();
        LinkedList<UsuarioModelo> usuarioregistro = new LinkedList<>();
        if(!usuarioadm.getText().equals("")){
            usuarioregistro = usm.readUsuario(usuarioadm.getText(), "", "", "", -1);
        }
        String contrareal="";
        if(usuarioregistro.size()>0){
            contrareal = usuarioregistro.get(0).getContrasenia();
            if(usuarioregistro.size()>0 && contrareal.equals(contraseniaadm.getText()) && usuarioregistro.getFirst().getAdministrador()==1){
                permisocrear = true;
                datosincorrectos.setText("Permiso para crear usuario.");
            } else {
                datosincorrectos.setText("Contraseña incorrecta.");
            }
        } else {
            datosincorrectos.setText("Usuario no reconocido.");
        }
        
        if(!permisocrear){
            contrasenia.clear();
            contraseniaadm.clear();
            repetircon.clear();
        } else {
            if(!(usuario.getText().equals("")) && !(nombre.getText().equals("")) && !(apellidop.getText().equals("")) && !(apellidom.getText().equals("")) && !(contrasenia.getText().equals(""))){
                if(contrasenia.getText().equals(repetircon.getText())) {
                UsuarioModelo um = new UsuarioModelo(usuario.getText(),nombre.getText(),apellidop.getText(),apellidom.getText(),contrasenia.getText(),0);
                try{
                    um.createUsuario();
                    alertInformation("Éxito","","Usuario creado de forma exitosa.");
                    Stage actualWindow = (Stage) usuario.getScene().getWindow();
                    actualWindow.close();
                } catch (SQLIntegrityConstraintViolationException e) {
                    errorusuario.setText("¡Nombre usuario ya existente!");
                    usuario.setText("");
                }
                } else {
                    errorusuario.setText("Las contraseñas no son iguales.");
                    contrasenia.clear();
                    repetircon.clear();
                }
            } else {errorusuario.setText("¡No se pudo crear nuevo usuario!");}
        }
    }
    
    private void alertInformation(String titulo, String header, String contenido) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.initOwner(usuario.getParent().getScene().getWindow());
        alert.getDialogPane().getStylesheets().add("/babywizardjavafx/vista/EstiloGeneral.css");
        alert.setTitle(titulo);
        if(header.equals("")) {
            alert.setHeaderText(null);
        } else {alert.setHeaderText(header);}
        alert.setContentText(contenido);
        alert.showAndWait();
    }
}
