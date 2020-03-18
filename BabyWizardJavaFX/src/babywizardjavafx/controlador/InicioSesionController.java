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
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author Vicaris
 */
public class InicioSesionController implements Initializable {
    
    @FXML
    private Hyperlink registroUsuario;
    @FXML
    private Button botonRegistro;
    @FXML
    private TextField usuario;
    @FXML
    private PasswordField contrasenia;
    @FXML
    private Label datosincorrectos;
    
    @FXML
    private void registrarUsuario(ActionEvent event) throws IOException {
        Stage popup = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/babywizardjavafx/vista/Registro.fxml"));
        Scene popupscene = new Scene(root);
        popup.setScene(popupscene);
        Image image = new Image("/babywizardjavafx/vista/imagenes/bwlogo.jpg");
        popup.getIcons().add(image);
        popup.setTitle("Registrar Usuario");
        popup.show();
    }
    
    @FXML
    private void iniciarSesion(ActionEvent event) throws IOException, SQLException {
        UsuarioController uc = new UsuarioController();
        LinkedList<UsuarioModelo> usuarioregistro = new LinkedList<>();
        if(!usuario.getText().equals("")){
            usuarioregistro = uc.selectUsuario(usuario.getText(), "", "", "", -1);
        }
        String contrareal="";
        if(usuarioregistro.size()>0){
            contrareal = usuarioregistro.get(0).getContrasenia();
            if((contrareal == null || contrasenia.getText().equals("")) ? contrasenia.getText() == null : contrareal.equals(contrasenia.getText())){
                Parent loadMenuPrincipal = FXMLLoader.load(getClass().getResource("/babywizardjavafx/vista/MenuPrincipal.fxml"));
                Scene menuPrincipalScene = new Scene(loadMenuPrincipal);
        
                Stage mainWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
                mainWindow.setScene(menuPrincipalScene);
                mainWindow.show();
            } else {
                datosincorrectos.setText("¡Contraseña incorrecta!");
            }
        } else {
            datosincorrectos.setText("¡Usuario no reconocido!");
        }
        contrasenia.clear();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }       
}
