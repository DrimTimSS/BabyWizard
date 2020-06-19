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
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
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
 * @author Vicaris
 */
public class AgregarPruebaController implements Initializable {

    @FXML
    private TextField idbebebusqueda;
    @FXML
    private TextField nombrebusqueda;
    @FXML
    private TextField apellidopbusqueda;
    @FXML
    private TextField apellidombusqueda;
    @FXML
    private RadioButton mbusqueda;
    @FXML
    private ToggleGroup sexotoggle;
    @FXML
    private RadioButton fbusqueda;
    @FXML
    private Button buscarbebes;
    @FXML
    private TextField edadbusquedamin;
    @FXML
    private TextField edadbusquedamax;
    @FXML
    private TableView<BebeModelo> tablabebes;
    @FXML
    private TableColumn<BebeModelo, Integer> idBebe;
    @FXML
    private TableColumn<BebeModelo, String> nombre;
    @FXML
    private TableColumn<BebeModelo, String> apellidoPaterno;
    @FXML
    private TableColumn<BebeModelo, String> apellidoMaterno;
    @FXML
    private TableColumn<BebeModelo, Integer> sexo;
    @FXML
    private TableColumn<BebeModelo, String> fechaNacimiento;
    @FXML
    private TableColumn<BebeModelo, Integer> meses;
    @FXML
    private TableColumn<BebeModelo, Integer> fkUsuario;
    @FXML
    private ToggleGroup pruebas;
    
    ObservableList<BebeModelo> listaBebes = FXCollections.observableArrayList();
    @FXML
    private RadioButton w303642;
    @FXML
    private RadioButton w48;
    @FXML
    private RadioButton expcab;
    @FXML
    private RadioButton lectconj;
    @FXML
    private Label idbebeprueba;
    @FXML
    private RadioButton cuid;
    @FXML
    private RadioButton sociod;
    @FXML
    private RadioButton socioe;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            BebeModelo bm = new BebeModelo();
            LinkedList<BebeModelo> resultados = bm.readBebe(-1, "", "", "", -1, "",-1,-1, "");
            for(BebeModelo b:resultados) listaBebes.add(b);
            idBebe.setCellValueFactory(new PropertyValueFactory<>("idBebe"));
            nombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
            apellidoPaterno.setCellValueFactory(new PropertyValueFactory<>("apellidoPaterno"));
            apellidoMaterno.setCellValueFactory(new PropertyValueFactory<>("apellidoMaterno"));
            sexo.setCellValueFactory(new PropertyValueFactory<>("sexo"));
            fechaNacimiento.setCellValueFactory(new PropertyValueFactory<>("fechaNacimiento"));
            meses.setCellValueFactory(new PropertyValueFactory<>("edad"));
            fkUsuario.setCellValueFactory(new PropertyValueFactory<>("fkUsuario"));
            tablabebes.setItems(listaBebes);
            //tablaBebes.getColumns().addAll(idBebe,nombre,apellidoPaterno,apellidoMaterno,sexo,fechaNacimiento,fkUsuario);
        } catch (SQLException ex) {
            Logger.getLogger(BorrarController.class.getName()).log(Level.SEVERE, null, ex);
        }
        TableView.TableViewSelectionModel<BebeModelo> selection = tablabebes.getSelectionModel();
        ObservableList<BebeModelo> selectedItems = selection.getSelectedItems();
        selectedItems.addListener(new ListChangeListener<BebeModelo>() {
        @Override
        public void onChanged(ListChangeListener.Change<? extends BebeModelo> change) {
            //selectedItems.clear();
            //selectedItems.addAll(selection.getSelectedItems());
            try{
            idbebeprueba.setText(String.valueOf(selectedItems.get(0).getIdBebe()));
            } catch (Exception e) {
                //System.out.println("No pasa nada oiga");
            }
        }
        });
    }    

    @FXML
    private void irAPrueba(ActionEvent event) throws IOException {
        if(idbebeprueba.getText().equals("0")){
            alertInformation("Alerta","","No se ha seleccionado un infante al cual se le desee agregar datos.");
            return;
        }
        
        String direccion = "";
        String prueba = "";
        if(w303642.isSelected()){
            direccion = "/babywizardjavafx/vista/Wppsi303642.fxml";
            prueba = "WPPSI 30 36 42";
            FXMLLoader loader = showWindow(direccion,prueba);
            Wppsi303642Controller wcont = loader.getController();
            wcont.inicializarBebe(Integer.valueOf(idbebeprueba.getText()));
        } else if(w48.isSelected()){
            direccion = "/babywizardjavafx/vista/Wppsi48.fxml";
            prueba = "WPPSI 48";
            FXMLLoader loader = showWindow(direccion,prueba);
            
            Wppsi48Controller wcont = loader.getController();
            wcont.inicializarBebe(Integer.valueOf(idbebeprueba.getText()));
        } else if(lectconj.isSelected()){
            direccion = "/babywizardjavafx/vista/LecturaConjunta.fxml";
            prueba = "Tarea de Lectura Conjunta";
            FXMLLoader loader = showWindow(direccion,prueba);
            LecturaConjuntaController wcont = loader.getController();
            wcont.inicializarBebe(Integer.valueOf(idbebeprueba.getText()));
        } else if(expcab.isSelected()){
            direccion = "/babywizardjavafx/vista/ExperimentoCabina.fxml";
            prueba = "Experimento de Cabina";
            FXMLLoader loader = showWindow(direccion,prueba);
            ExperimentoCabinaController wcont = loader.getController();
            wcont.inicializarBebe(Integer.valueOf(idbebeprueba.getText()));
        } else if(cuid.isSelected()){
            direccion = "/babywizardjavafx/vista/AgregarCuidador.fxml";
            prueba = "Cuidador";
            FXMLLoader loader = showWindow(direccion,prueba);
            AgregarCuidadorController wcont = loader.getController();
            wcont.inicializarBebe(Integer.valueOf(idbebeprueba.getText()));
        } else if(sociod.isSelected()){
            direccion = "/babywizardjavafx/vista/AgregarSociod.fxml";
            prueba = "Sociodemográfico";
            FXMLLoader loader = showWindow(direccion,prueba);
            AgregarSociodController wcont = loader.getController();
            wcont.inicializarBebe(Integer.valueOf(idbebeprueba.getText()));
        } else if(socioe.isSelected()){
            direccion = "/babywizardjavafx/vista/AgregarSocioe.fxml";
            prueba = "Socioeconómico";
            FXMLLoader loader = showWindow(direccion,prueba);
            AgregarSocioeController wcont = loader.getController();
            wcont.inicializarBebe(Integer.valueOf(idbebeprueba.getText()));
        } else {return;}
        
        
        
        
    }
    
    public FXMLLoader showWindow(String direccion, String prueba) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource(direccion));
        Parent loadMenuPrincipal = (Parent) loader.load();
        JMetro jmetro = new JMetro(Style.LIGHT);
        jmetro.setParent(loadMenuPrincipal);
        //RegistroBBController rbc = loader.getController();
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
        tablabebes.getItems().clear();
        try {
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = new Date();
            BebeModelo bm = new BebeModelo();
            int id = -1;
            if(Pattern.matches("-?\\d+",idbebebusqueda.getText())){
                id = Integer.parseInt(idbebebusqueda.getText());
            }
            int sexoinfante = -1;
            if(mbusqueda.isSelected()){
                sexoinfante = 0;
            }
            if(fbusqueda.isSelected()){
                sexoinfante = 1;
            }
            int mesesmin = -1;
            int mesesmax = -1;
            if(edadbusquedamin.getText().matches("\\d+")) mesesmin = Integer.parseInt(edadbusquedamin.getText());
            if(edadbusquedamax.getText().matches("\\d+")) mesesmax = Integer.parseInt(edadbusquedamax.getText());
            LinkedList<BebeModelo> resultados = bm.readBebe(id, nombrebusqueda.getText(), apellidombusqueda.getText(), apellidopbusqueda.getText(), sexoinfante, "", mesesmin, mesesmax, "");
            for(BebeModelo b:resultados) listaBebes.add(b);
            idBebe.setCellValueFactory(new PropertyValueFactory<>("idBebe"));
            nombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
            apellidoPaterno.setCellValueFactory(new PropertyValueFactory<>("apellidoPaterno"));
            apellidoMaterno.setCellValueFactory(new PropertyValueFactory<>("apellidoMaterno"));
            sexo.setCellValueFactory(new PropertyValueFactory<>("sexo"));
            fechaNacimiento.setCellValueFactory(new PropertyValueFactory<>("fechaNacimiento"));
            meses.setCellValueFactory(new PropertyValueFactory<>("edad"));
            fkUsuario.setCellValueFactory(new PropertyValueFactory<>("fkUsuario"));
            tablabebes.setItems(listaBebes);
            //tablaBebes.getColumns().addAll(idBebe,nombre,apellidoPaterno,apellidoMaterno,sexo,fechaNacimiento,fkUsuario);
        } catch (SQLException ex) {
            Logger.getLogger(BorrarController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void alertInformation(String titulo, String header, String contenido) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.initOwner(idbebebusqueda.getParent().getScene().getWindow());
        alert.getDialogPane().getStylesheets().add("/babywizardjavafx/vista/EstiloGeneral.css");
        alert.setTitle(titulo);
        if(header.equals("")) {
            alert.setHeaderText(null);
        } else {alert.setHeaderText(header);}
        alert.setContentText(contenido);
        alert.showAndWait();
    }
    
}
