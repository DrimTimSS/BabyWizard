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
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import jfxtras.styles.jmetro.JMetro;
import jfxtras.styles.jmetro.Style;

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
        JMetro jmetro = new JMetro(Style.LIGHT);
        jmetro.setParent(root);
        Scene popupscene = new Scene(root);
        popup.setScene(popupscene);
        Image image = new Image("/babywizardjavafx/vista/imagenes/bwlogo.jpg");
        popup.getIcons().add(image);
        popup.setTitle("Registrar Usuario");
        popup.show();
    }
    
    @FXML
    private void iniciarSesion(ActionEvent event) throws IOException, SQLException {
        UsuarioModelo um = new UsuarioModelo();
        LinkedList<UsuarioModelo> usuarioregistro = new LinkedList<>();
        if(!usuario.getText().equals("")){
            usuarioregistro = um.readUsuario(usuario.getText(), "", "", "", -1);
        }
        String contrareal="";
        if(usuarioregistro.size()>0){
            contrareal = usuarioregistro.get(0).getContrasenia();
            if((contrareal == null || contrasenia.getText().equals("")) ? contrasenia.getText() == null : contrareal.equals(contrasenia.getText())){
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/babywizardjavafx/vista/MenuPrincipal.fxml"));
                Parent loadMenuPrincipal = (Parent) loader.load();
                JMetro jmetro = new JMetro(Style.LIGHT);
                //unfocus pathField
                Platform.runLater( () -> loadMenuPrincipal.requestFocus() );
                jmetro.setParent(loadMenuPrincipal);
                Scene menuPrincipalScene = new Scene(loadMenuPrincipal);
                MenuPrincipalController mPrincipalController = loader.getController();
                mPrincipalController.iniciarUsuario(usuario.getText());
        
                Stage mainWindow = (Stage) botonRegistro.getScene().getWindow();
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
        
        
        //Botones presionando enter
        botonRegistro.setOnKeyPressed(new EventHandler<KeyEvent>()
    {
        @Override
        public void handle(KeyEvent ke)
        {
            if (ke.getCode().equals(KeyCode.ENTER))
            {
                try {
                    iniciarSesion(null);
                } catch (IOException ex) {
                    Logger.getLogger(InicioSesionController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(InicioSesionController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    });
        registroUsuario.setOnKeyPressed(new EventHandler<KeyEvent>()
    {
        @Override
        public void handle(KeyEvent ke)
        {
            if (ke.getCode().equals(KeyCode.ENTER))
            {
                try {
                    registrarUsuario(null);
                } catch (IOException ex) {
                    Logger.getLogger(InicioSesionController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    });
    }       
}
