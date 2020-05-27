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
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import jfxtras.styles.jmetro.JMetro;
import jfxtras.styles.jmetro.Style;

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
        Label label = new Label("Registrar Infante");
        label.setStyle("-fx-text-fill: black");
        registrarinfante.setGraphic(label);
        Label label1 = new Label("Búsqueda");
        label1.setStyle("-fx-text-fill: black");
        busqueda.setGraphic(label1);
        Label label2 = new Label("Editar Datos");
        label2.setStyle("-fx-text-fill: black");
        editar.setGraphic(label2);
        Label label3 = new Label("Borrar Infante");
        label3.setStyle("-fx-text-fill: black");
        borrar.setGraphic(label3);
        Label label4 = new Label("Registrar Prueba");
        label4.setStyle("-fx-text-fill: black");
        registrarprueba.setGraphic(label4);
    }    
    
    @FXML
    public void nuevoinfante(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/babywizardjavafx/vista/RegistroBB.fxml"));
        Parent loadMenuPrincipal = (Parent) loader.load();
        JMetro jmetro = new JMetro(Style.LIGHT);
        jmetro.setParent(loadMenuPrincipal);
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
    public void borrarinfante(ActionEvent event) throws IOException, SQLException{
        //System.out.println(usuariois);
        UsuarioModelo um = new UsuarioModelo();
        int permiso = um.readUsuario(usuariois, "", "", "", -1).getFirst().getAdministrador();
        System.out.println(permiso);
        if (permiso == 0) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.initOwner(menu.getParent().getScene().getWindow());
            alert.setTitle("Error");
            alert.setHeaderText("No tiene los permisos necesarios");
            alert.setContentText("El usuario con el que intenta acceder a esta opcion no tiene los permisos necesarios para "
                    + "llevar a cabo la acción.");
            alert.getDialogPane().getStylesheets().add("/babywizardjavafx/vista/EstiloGeneral.css");
            alert.showAndWait();
            return;
        }
        Parent loadMenuPrincipal = FXMLLoader.load(getClass().getResource("/babywizardjavafx/vista/Borrar.fxml"));
        JMetro jmetro = new JMetro(Style.LIGHT);
        jmetro.setParent(loadMenuPrincipal);
                Scene menuPrincipalScene = new Scene(loadMenuPrincipal);       
                Stage mainWindow = new Stage();
                Image image = new Image("/babywizardjavafx/vista/imagenes/bwlogo.jpg");
                mainWindow.getIcons().add(image);
                mainWindow.setTitle("Borrar");
                mainWindow.setScene(menuPrincipalScene);
                mainWindow.show();
    }
    
    @FXML
    public void busqueda(ActionEvent event) throws IOException{
        Parent loadMenuPrincipal = FXMLLoader.load(getClass().getResource("/babywizardjavafx/vista/Busqueda.fxml"));
        JMetro jmetro = new JMetro(Style.LIGHT);
        jmetro.setParent(loadMenuPrincipal);
                Scene menuPrincipalScene = new Scene(loadMenuPrincipal);     
                Stage mainWindow = new Stage();
                Image image = new Image("/babywizardjavafx/vista/imagenes/bwlogo.jpg");
                mainWindow.getIcons().add(image);
                mainWindow.setTitle("Búsqueda");
                mainWindow.setScene(menuPrincipalScene);
                mainWindow.show();
    }
    
    public void configusuario(ActionEvent event){
    
    }
    
    @FXML
    public void cerrarsesion(ActionEvent event) throws IOException{
        Parent loadMenuPrincipal = FXMLLoader.load(getClass().getResource("/babywizardjavafx/vista/InicioSesion.fxml"));
        JMetro jmetro = new JMetro(Style.LIGHT);
        jmetro.setParent(loadMenuPrincipal);
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
        JMetro jmetro = new JMetro(Style.LIGHT);
        jmetro.setParent(loadMenuPrincipal);
                Scene menuPrincipalScene = new Scene(loadMenuPrincipal);     
                Stage mainWindow = new Stage();
                Image image = new Image("/babywizardjavafx/vista/imagenes/bwlogo.jpg");
                mainWindow.getIcons().add(image);
                mainWindow.setScene(menuPrincipalScene);
                mainWindow.setTitle("Agregar Prueba");
                mainWindow.show();
    }

    @FXML
    private void editar(ActionEvent event) throws IOException {
        Parent loadMenuPrincipal = FXMLLoader.load(getClass().getResource("/babywizardjavafx/vista/Editar.fxml"));
        JMetro jmetro = new JMetro(Style.LIGHT);
        jmetro.setParent(loadMenuPrincipal);
                Scene menuPrincipalScene = new Scene(loadMenuPrincipal);     
                Stage mainWindow = new Stage();
                Image image = new Image("/babywizardjavafx/vista/imagenes/bwlogo.jpg");
                mainWindow.getIcons().add(image);
                mainWindow.setScene(menuPrincipalScene);
                mainWindow.setTitle("Editar");
                mainWindow.show();
    }
}
