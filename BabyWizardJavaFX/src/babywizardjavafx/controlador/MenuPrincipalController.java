/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx.controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Vicaris
 */
public class MenuPrincipalController implements Initializable {

    @FXML
    private MenuBar menu;
    @FXML
    private MenuItem nuevoinfante;
    @FXML
    private MenuItem configusuario;
    @FXML
    private MenuItem ayudareg;
    @FXML
    private MenuItem ayudabus;
    @FXML
    private MenuItem ayudaedi;
    @FXML
    private MenuItem ayudabor;
    @FXML
    private Button registrarinfante;
    @FXML
    private Button busqueda;
    @FXML
    private Button editar;
    @FXML
    private Button borrar;
    @FXML
    private MenuItem cerrarsesion;
    @FXML
    private MenuItem salir;
    @FXML
    private Button registrarprueba;
    
    String usuariois;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    
    @FXML
    public void nuevoinfante(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/babywizardjavafx/vista/RegistroBB.fxml"));
        Parent loadMenuPrincipal = (Parent) loader.load();
        RegistroBBController rbc = loader.getController();
        rbc.inicializarUsuario(usuariois);
                Scene menuPrincipalScene = new Scene(loadMenuPrincipal);       
                Stage mainWindow = new Stage();
                Image image = new Image("/babywizardjavafx/vista/imagenes/bwlogo.jpg");
                mainWindow.getIcons().add(image);
                mainWindow.setTitle("Registrar");
                mainWindow.setScene(menuPrincipalScene);
                mainWindow.show();
    }
    
    @FXML
    public void borrarinfante(ActionEvent event) throws IOException{
        Parent loadMenuPrincipal = FXMLLoader.load(getClass().getResource("/babywizardjavafx/vista/Borrar.fxml"));
                Scene menuPrincipalScene = new Scene(loadMenuPrincipal);       
                Stage mainWindow = new Stage();
                Image image = new Image("/babywizardjavafx/vista/imagenes/bwlogo.jpg");
                mainWindow.getIcons().add(image);
                mainWindow.setScene(menuPrincipalScene);
                mainWindow.show();
    }
    
    @FXML
    public void busqueda(ActionEvent event) throws IOException{
        Parent loadMenuPrincipal = FXMLLoader.load(getClass().getResource("/babywizardjavafx/vista/Busqueda.fxml"));
                Scene menuPrincipalScene = new Scene(loadMenuPrincipal,880,640);     
                Stage mainWindow = new Stage();
                Image image = new Image("/babywizardjavafx/vista/imagenes/bwlogo.jpg");
                mainWindow.getIcons().add(image);
                mainWindow.setMinWidth(880);
                mainWindow.setMinHeight(640);
                mainWindow.setScene(menuPrincipalScene);
                mainWindow.show();
    }
    
    public void configusuario(ActionEvent event){
    
    }
    
    @FXML
    public void cerrarsesion(ActionEvent event) throws IOException{
        Parent loadMenuPrincipal = FXMLLoader.load(getClass().getResource("/babywizardjavafx/vista/InicioSesion.fxml"));
                Scene menuPrincipalScene = new Scene(loadMenuPrincipal);
        
                Stage mainWindow = (Stage) menu.getScene().getWindow();
                mainWindow.setScene(menuPrincipalScene);
                mainWindow.show();
    }
    
    @FXML
    public void salir(ActionEvent event){
        Platform.exit();
        System.exit(0);
    }
    
    public void iniciarUsuario(String usuariois){
        this.usuariois = usuariois;
    }

    @FXML
    private void registrarmenu(ActionEvent event) throws IOException {
        Parent loadMenuPrincipal = FXMLLoader.load(getClass().getResource("/babywizardjavafx/vista/AgregarPrueba.fxml"));
                Scene menuPrincipalScene = new Scene(loadMenuPrincipal);     
                Stage mainWindow = new Stage();
                Image image = new Image("/babywizardjavafx/vista/imagenes/bwlogo.jpg");
                mainWindow.getIcons().add(image);
                mainWindow.setScene(menuPrincipalScene);
                mainWindow.show();
    }
}
