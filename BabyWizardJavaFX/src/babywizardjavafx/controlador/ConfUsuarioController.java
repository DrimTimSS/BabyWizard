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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

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
    @FXML
    private CheckBox isAdmin;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void registrar(ActionEvent event) throws SQLException, IOException {
        //Checar que el usuario exista y sea administrador
        boolean permisomodificar = false;
        UsuarioModelo usm = new UsuarioModelo();
        LinkedList<UsuarioModelo> usuarioregistro = new LinkedList<>();
        if(!usuarioadm.getText().equals("")){
            usuarioregistro = usm.readUsuario(usuarioadm.getText(), "", "", "", -1);
        }
        String contrareal="";
        if(usuarioregistro.size()>0){
            contrareal = usuarioregistro.get(0).getContrasenia();
            if(usuarioregistro.size()>0 && contrareal.equals(contraseniaadm.getText()) && usuarioregistro.getFirst().getAdministrador()==1){
                permisomodificar = true;
                datosincorrectos.setText("Permiso para modificar usuario.");
            } else {
                datosincorrectos.setText("Contraseña incorrecta.");
            }
        } else {
            datosincorrectos.setText("Usuario no reconocido.");
        }
        
        
        if(!permisomodificar){
            nuevacontra.clear();
            contraseniaadm.clear();
            confnuevacontra.clear();
        } else {
            if(!usuario.getText().equals("")){
                if(nuevacontra.getText().equals(confnuevacontra.getText())) {
                    int admin = (isAdmin.isSelected())?1:0;
                try{
                    usm.updateUsuario(usuario.getText(), "", "", "", "", admin, nuevacontra.getText());
                    alertInformation("Éxito","","Usuario configurado de forma exitosa.");
                    Stage actualWindow = (Stage) datosincorrectos.getScene().getWindow();
                    actualWindow.close();   
                } catch (SQLIntegrityConstraintViolationException e) {
                    errorusuario.setText("¡Nombre usuario ya existente!");
                    usuario.setText("");
                }
                } else {
                    errorusuario.setText("Las contraseñas no son iguales.");
                    nuevacontra.clear();
                    confnuevacontra.clear();
                }
            } else {errorusuario.setText("¡No se pudo modificar usuario!");}
        }
    }
    
    private void alertInformation(String titulo, String header, String contenido) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.initOwner(datosincorrectos.getParent().getScene().getWindow());
        alert.getDialogPane().getStylesheets().add("/babywizardjavafx/vista/EstiloGeneral.css");
        alert.setTitle(titulo);
        if(header.equals("")) {
            alert.setHeaderText(null);
        } else {alert.setHeaderText(header);}
        alert.setContentText(contenido);
        alert.showAndWait();
    }
}
