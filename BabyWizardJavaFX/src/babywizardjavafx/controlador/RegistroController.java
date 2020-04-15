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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Vicaris
 */
public class RegistroController implements Initializable {

    private TextField usuario;
    private TextField nombre;
    private TextField apellidop;
    private TextField apellidom;
    private PasswordField repetircon;
    private PasswordField contrasenia;
    private TextField usuarioadm;
    private PasswordField contraseniaadm;
    private Label datosincorrectos;
    private Label errorusuario;
    @FXML
    private Button continuar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML
    public void continuar(ActionEvent event){
        Stage actualWindow = (Stage) continuar.getScene().getWindow();
        actualWindow.close();
    }
    
    public void registrar(ActionEvent event) throws SQLException, IOException{
        boolean permisocrear = false;
        UsuarioController uc = new UsuarioController();
        LinkedList<UsuarioModelo> usuarioregistro = new LinkedList<>();
        if(!usuarioadm.getText().equals("")){
            usuarioregistro = uc.selectUsuario(usuarioadm.getText(), "", "", "", -1);
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
                    uc.createUsuario(um);
                    Stage actualWindow = (Stage) errorusuario.getScene().getWindow();
                    Parent root = FXMLLoader.load(getClass().getResource("/babywizardjavafx/vista/UCreadoExitosamente.fxml"));
                    Scene exito = new Scene(root);
                    actualWindow.setScene(exito);
                    Image image = new Image("/babywizardjavafx/vista/imagenes/bwlogo.jpg");
                    actualWindow.getIcons().add(image);
                    actualWindow.setTitle("Registrar Usuario");
                    actualWindow.show();
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
    
}
