/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx.controlador;

import babywizardjavafx.modelo.BebeModelo;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import jfxtras.styles.jmetro.JMetro;
import jfxtras.styles.jmetro.Style;

/**
 * FXML Controller class
 *
 * @author valdo
 */
public class EditarController implements Initializable {

    @FXML
    private TextField idbebebusqueda;
    @FXML
    private TextField nombrebusqueda;
    @FXML
    private TextField apellidopbusqueda;
    @FXML
    private TextField apellidombusqueda;
    @FXML
    private TextField edadbusquedamin;
    @FXML
    private TextField edadbusquedamax;
    @FXML
    private RadioButton mbusqueda;
    @FXML
    private ToggleGroup sexotoggle;
    @FXML
    private RadioButton fbusqueda;
    @FXML
    private Button buscarbebes;
    @FXML
    private TableView<?> tablabebes;
    @FXML
    private TableColumn<?, ?> idBebe;
    @FXML
    private TableColumn<?, ?> nombre;
    @FXML
    private TableColumn<?, ?> apellidoPaterno;
    @FXML
    private TableColumn<?, ?> apellidoMaterno;
    @FXML
    private TableColumn<?, ?> meses;
    @FXML
    private TableColumn<?, ?> fechaNacimiento;
    @FXML
    private TableColumn<?, ?> sexo;
    @FXML
    private TableColumn<?, ?> fkUsuario;
    @FXML
    private RadioButton w303642;
    @FXML
    private RadioButton w48;
    @FXML
    private RadioButton expcab;
    @FXML
    private RadioButton lectconj;
    @FXML
    private RadioButton cuidador;
    @FXML
    private RadioButton sociodem;
    @FXML
    private RadioButton socioeco;
    @FXML
    private RadioButton infante;
    @FXML
    private Label idbebeprueba;
    
    ObservableList<BebeModelo> listaBebes = FXCollections.observableArrayList();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void irAPrueba(ActionEvent event) throws IOException {
        String direccion = "";
        String prueba = "";
        if(infante.isSelected()){
            direccion = "/babywizardjavafx/vista/Wppsi303642.fxml";
            prueba = "WPPSI 30 36 42";
            FXMLLoader loader = showWindow(direccion,prueba);
            Wppsi303642Controller wcont = loader.getController();
            
            wcont.inicializarBebe(Integer.valueOf(idbebeprueba.getText()));
        }
        
        if(infante.isSelected()){
            direccion = "/babywizardjavafx/vista/RegistroBB.fxml";
            prueba = "Editar Infante";
            FXMLLoader loader = showWindow(direccion, prueba);
            Wppsi303642Controller wcont = loader.getController();

            wcont.inicializarBebe(Integer.valueOf(idbebeprueba.getText()));
            
        }
        if(sociodem.isSelected()){
            
        }
        if(w303642.isSelected()){
            direccion = "/babywizardjavafx/vista/Wppsi303642.fxml";
            prueba = "WPPSI 30 36 42";
            FXMLLoader loader = showWindow(direccion,prueba);
            Wppsi303642Controller wcont = loader.getController();
            
            wcont.inicializarBebe(Integer.valueOf(idbebeprueba.getText()));
        }
        if(w48.isSelected()){
            direccion = "/babywizardjavafx/vista/Wppsi48.fxml";
            prueba = "WPPSI 48";
            FXMLLoader loader = showWindow(direccion,prueba);
            
            Wppsi48Controller wcont = loader.getController();
            wcont.inicializarBebe(Integer.valueOf(idbebeprueba.getText()));
        }
        if(lectconj.isSelected()){
            direccion = "/babywizardjavafx/vista/LecturaConjunta.fxml";
            prueba = "Tarea de Lectura Conjunta";
            FXMLLoader loader = showWindow(direccion,prueba);
            LecturaConjuntaController wcont = loader.getController();
            wcont.inicializarBebe(Integer.valueOf(idbebeprueba.getText()));
        } 
            
    }
    
    public FXMLLoader showWindow(String direccion, String prueba) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource(direccion));
        Parent loadMenuPrincipal = (Parent) loader.load();
        JMetro jmetro = new JMetro(Style.LIGHT);
        jmetro.setParent(loadMenuPrincipal);
                Scene menuPrincipalScene = new Scene(loadMenuPrincipal);       
                Stage mainWindow =(Stage) idbebebusqueda.getScene().getWindow();
                Image image = new Image("/babywizardjavafx/vista/imagenes/bwlogo.jpg");
                mainWindow.getIcons().add(image);
                mainWindow.setTitle(prueba);
                mainWindow.setScene(menuPrincipalScene);
                mainWindow.show();
                mainWindow.centerOnScreen();
        return loader;
    }

    @FXML
    private void buscarbebes(ActionEvent event) {
        return;
    }
}
