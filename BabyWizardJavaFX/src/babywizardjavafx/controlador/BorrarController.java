/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx.controlador;

import babywizardjavafx.modelo.BebeModelo;
import babywizardjavafx.modelo.ExperimentoCabinaModelo;
import babywizardjavafx.modelo.LecturaConjuntaModelo;
import babywizardjavafx.modelo.Wppsi303642Modelo;
import babywizardjavafx.modelo.Wppsi48Modelo;
import java.net.URL;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import java.util.regex.*;
import javafx.collections.ListChangeListener;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TableView.TableViewSelectionModel;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import jfxtras.styles.jmetro.JMetro;
import jfxtras.styles.jmetro.Style;

/**
 * FXML Controller class
 *
 * @author Vicaris
 */
public class BorrarController implements Initializable {

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
    private RadioButton fbusqueda;
    @FXML
    private Button buscarbebes;
    @FXML
    private TextField idbebeaborrar;
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
    
    ObservableList<BebeModelo> listaBebes = FXCollections.observableArrayList();
    
    @FXML
    private ToggleGroup sexotoggle;
    @FXML
    private Button borrarconid;
    @FXML
    private ListView<String> listaexperimentos;
    
    ObservableList<String> listaPruebas = FXCollections.observableArrayList();

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
            //tablabebes.getColumns().addAll(idBebe,nombre,apellidoPaterno,apellidoMaterno,sexo,fechaNacimiento,fkUsuario);
        } catch (SQLException ex) {
            Logger.getLogger(BorrarController.class.getName()).log(Level.SEVERE, null, ex);
        }
        TableViewSelectionModel<BebeModelo> selection = tablabebes.getSelectionModel();
        ObservableList<BebeModelo> selectedItems = selection.getSelectedItems();
        selectedItems.addListener(new ListChangeListener<BebeModelo>() {
        @Override
        public void onChanged(Change<? extends BebeModelo> change) {
            //selectedItems.clear();
            //selectedItems.addAll(selection.getSelectedItems());
            try{
            idbebeaborrar.setText(String.valueOf(selectedItems.get(0).getIdBebe()));
            encontrarPruebas();
            } catch (Exception e) {
                //System.out.println("No pasa nada oiga");
            }
        }
        });
        borrarconid.setOnKeyPressed((KeyEvent ke) -> {
            if (ke.getCode().equals(KeyCode.ENTER))
            {
                try {
                    borrarconid(null);
                } catch (SQLException ex) {
                    Logger.getLogger(InicioSesionController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        buscarbebes.setOnKeyPressed((KeyEvent ke) -> {
            if (ke.getCode().equals(KeyCode.ENTER))
            {
                try {
                    buscarbebes(null);
                } catch (SQLException ex) {
                    Logger.getLogger(InicioSesionController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    @FXML
    public void buscarbebes(ActionEvent event) throws SQLException{
        tablabebes.getItems().clear();
        try {
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
    
    @FXML
    public void borrarconid(ActionEvent event) throws SQLException{
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.initOwner(idbebebusqueda.getParent().getScene().getWindow());
        alert.setTitle("Confirmar.");
        alert.setHeaderText("Se borrará el infante con todos \nsus registros y pruebas.");
        alert.setContentText("¿Está seguro?");
        alert.getDialogPane().getStylesheets().add("/babywizardjavafx/vista/EstiloGeneral.css");
        //Scene scene = alert.getDialogPane().getScene();
        //JMetro jmetro = new JMetro(Style.LIGHT);
        //jmetro.setScene(scene);
        

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK) {
            if (!idbebeaborrar.getText().equals("")) {
                BebeModelo bm = new BebeModelo();
                bm.deleteBebe(Integer.parseInt(idbebeaborrar.getText()));
                tablabebes.getItems().clear();
                this.buscarbebes(event);
            }
        } else {
            // ... user chose CANCEL or closed the dialog
        }
        
    }
    
    public void encontrarPruebas() throws SQLException{
        
        if(!idbebeaborrar.getText().equals("")){
        listaexperimentos.getItems().clear();
        listaPruebas.clear();
        ExperimentoCabinaModelo ecm = new ExperimentoCabinaModelo();
        LecturaConjuntaModelo lcm = new LecturaConjuntaModelo();
        Wppsi303642Modelo w30 = new Wppsi303642Modelo();
        Wppsi48Modelo w48 = new Wppsi48Modelo();
        if(ecm.readExperimentoCabina(-1, "", -1, -1, -1, -1, -1, -1, Integer.parseInt(idbebeaborrar.getText())).size()>0) listaPruebas.add("Experimento de Cabina.");
        if(lcm.readLecturaConjunta(-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Integer.parseInt(idbebeaborrar.getText())).size()>0){ 
            listaPruebas.add("Tarea de Lectura Conjunta (Rana).");
        }
        if(w30.readWppsi303642(-1, -1, -1, -1, -1, -1,"", Integer.parseInt(idbebeaborrar.getText()),-1).size()>0) listaPruebas.add("WPPSI 30 36 42.");
        if(w48.readWppsi48(-1, -1, -1, -1, -1, -1, -1,-1,-1,-1,-1,-1,-1,-1,-1,"",Integer.parseInt(idbebeaborrar.getText()),-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1).size()>0) listaPruebas.add("WPPSI 48.");
        listaexperimentos.getItems().addAll(listaPruebas);
        }
        
    }
    
}
