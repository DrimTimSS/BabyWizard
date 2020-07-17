/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx.controlador;

import babywizardjavafx.modelo.BebeModelo;
import babywizardjavafx.modelo.Cdi12Modelo;
import babywizardjavafx.modelo.Cdi182430Modelo;
import babywizardjavafx.modelo.ExperimentoCabinaModelo;
import babywizardjavafx.modelo.IcplimModelo;
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
import javafx.beans.value.ObservableValue;
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
    @FXML
    private Button borrarpureba;
    
    int idelementoaborrar;
    @FXML
    private Label elementoaborrar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            BebeModelo bm = new BebeModelo();
            LinkedList<BebeModelo> resultados = bm.readBebe(-1, "", "", "", -1, "",-1,-1, "");
            for(BebeModelo b:resultados) {
                b.setEdad();
                listaBebes.add(b);
            }
            idBebe.setCellValueFactory(new PropertyValueFactory<>("idBebe"));
            nombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
            apellidoPaterno.setCellValueFactory(new PropertyValueFactory<>("apellidoPaterno"));
            apellidoMaterno.setCellValueFactory(new PropertyValueFactory<>("apellidoMaterno"));
            sexo.setCellValueFactory(new PropertyValueFactory<>("sexo"));
            fechaNacimiento.setCellValueFactory(new PropertyValueFactory<>("fechaNacimiento"));
            meses.setCellValueFactory(new PropertyValueFactory<>("edadMesesTotales"));
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
        listaexperimentos.getSelectionModel().selectedItemProperty().addListener((ObservableValue<? extends String> ov, String old_val, String new_val) -> {
            if (listaexperimentos.getSelectionModel().getSelectedItem()!=null) {
                String seleccionado = listaexperimentos.getSelectionModel().getSelectedItem();
                elementoaborrar.setText(seleccionado.split(", ")[1]);
                String selectedItem = seleccionado.split(" ")[1];
                idelementoaborrar = Integer.parseInt(selectedItem.substring(0, selectedItem.length()-1));
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
            for(BebeModelo b:resultados) {
                b.setEdad();
                listaBebes.add(b);
            }
            idBebe.setCellValueFactory(new PropertyValueFactory<>("idBebe"));
            nombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
            apellidoPaterno.setCellValueFactory(new PropertyValueFactory<>("apellidoPaterno"));
            apellidoMaterno.setCellValueFactory(new PropertyValueFactory<>("apellidoMaterno"));
            sexo.setCellValueFactory(new PropertyValueFactory<>("sexo"));
            fechaNacimiento.setCellValueFactory(new PropertyValueFactory<>("fechaNacimiento"));
            meses.setCellValueFactory(new PropertyValueFactory<>("edadMesesTotales"));
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
        alert.getDialogPane().getStylesheets().add("/babywizardjavafx/vista/EstiloGeneral.css");
        alert.setTitle("Confirmar borrar infante.");
        alert.setHeaderText("Se borrará el infante con todos \nsus registros y pruebas.");
        alert.setContentText("¿Está seguro?");
        //Scene scene = alert.getDialogPane().getScene();
        //JMetro jmetro = new JMetro(Style.LIGHT);
        //jmetro.setScene(scene);
        

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK) {
            if (!idbebeaborrar.getText().equals("")) {
                BebeModelo bm = new BebeModelo();
                bm.deleteBebe(Integer.parseInt(idbebeaborrar.getText()));
                tablabebes.getItems().clear();
                listaexperimentos.getItems().clear();
                idbebeaborrar.setText("");
                idelementoaborrar = 0;
                elementoaborrar.setText("...");
                this.buscarbebes(event);
                alertInformation("Éxito","","Elemento borrado de forma exitosa.");
            }
        } else {
            // ... user chose CANCEL or closed the dialog
        }
        
    }
    
    public void encontrarPruebas() throws SQLException{
        
        if (!idbebeaborrar.getText().equals("")) {
            listaexperimentos.getItems().clear();
            listaPruebas.clear();
            ExperimentoCabinaModelo ecm = new ExperimentoCabinaModelo();
            LecturaConjuntaModelo lcm = new LecturaConjuntaModelo();
            Wppsi303642Modelo w30 = new Wppsi303642Modelo();
            Wppsi48Modelo w48 = new Wppsi48Modelo();
            Cdi12Modelo cdi12 = new Cdi12Modelo();
            Cdi182430Modelo cdi182430 = new Cdi182430Modelo();
            IcplimModelo icplim = new IcplimModelo();
            if (ecm.readExperimentoCabina(-1, "", -1, -1, -1, -1, -1, -1, Integer.parseInt(idbebeaborrar.getText())).size() > 0) {
                listaPruebas.add("Experimento de Cabina.");
            }
            LinkedList<LecturaConjuntaModelo> lecturas = lcm.readLecturaConjunta(-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, "", Integer.parseInt(idbebeaborrar.getText()));
            if (lecturas.size() > 0) {
                for (LecturaConjuntaModelo l : lecturas) {
                    listaPruebas.add("ID: " + l.getIdLecturaConjunta() + ", Lectura Conjunta: " + l.getFechaAplicacion());
                }
            }
            LinkedList<Wppsi303642Modelo> w30s = w30.readWppsi303642(-1, -1, -1, -1, -1, -1, "", Integer.parseInt(idbebeaborrar.getText()), -1);
            if (w30s.size() > 0) {
                for (Wppsi303642Modelo w : w30s) {
                    listaPruebas.add("ID: " + w.getIdWppsi303642() + ", WPPSI303642 " + w.getFechaAplicacion());
                }
            }
            LinkedList<Wppsi48Modelo> w48s = w48.readWppsi48(-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, "", -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Integer.parseInt(idbebeaborrar.getText()));
            if (w48s.size() > 0) {
                for (Wppsi48Modelo w : w48s) {
                    listaPruebas.add("ID: " + w.getIdWppsi48() + ", WPPSI48 " + w.getFechaAplicacion());
                }
            }
            LinkedList<Cdi12Modelo> cdi12s = cdi12.readCdi12(-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, "", Integer.parseInt(idbebeaborrar.getText()));
            if (cdi12s.size() > 0) {
                for (Cdi12Modelo c : cdi12s) {
                    listaPruebas.add("ID: " + c.getIdCdi12() + ", CDI12 " + c.getFechaAplicacion());
                }
            }
            LinkedList<Cdi182430Modelo> cdi182430s = cdi182430.readCdi182430(-1, -1, -1, -1, -1, -1, -1, -1, -1, "", Integer.parseInt(idbebeaborrar.getText()));
            if (cdi182430s.size() > 0) {
                for (Cdi182430Modelo c : cdi182430s) {
                    listaPruebas.add("ID: " + c.getIdCdi182430() + ", CDI182430 " + c.getFechaAplicacion());
                }
            }
            LinkedList<IcplimModelo> icplims = icplim.readIcplim(-1, -1, -1, -1, -1, -1, -1, "", Integer.parseInt(idbebeaborrar.getText()));
            if (icplims.size() > 0) {
                for (IcplimModelo c : icplims) {
                    listaPruebas.add("ID: " + c.getIdIcplim() + ", Icplim " + c.getFechaAplicacion());
                }
            }
            
            listaexperimentos.getItems().addAll(listaPruebas);
        }
    }

    @FXML
    private void borrarprueba(ActionEvent event) throws SQLException {
        if (idelementoaborrar != 0) {
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.initOwner(idbebebusqueda.getParent().getScene().getWindow());
            alert.getDialogPane().getStylesheets().add("/babywizardjavafx/vista/EstiloGeneral.css");
            alert.setTitle("Confirmar borrar registro.");
            alert.setHeaderText("Se borrará el registro seleccionado.");
            alert.setContentText("¿Está seguro?");
            
            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK) {
                String prueba = elementoaborrar.getText().split(" ")[0];
                if (prueba.equals("Lectura")) {
                    LecturaConjuntaModelo l = new LecturaConjuntaModelo();
                    l.deleteLecturaConjunta(idelementoaborrar);
                    alertInformation("Éxito","","Elemento borrado de forma exitosa.");
                } else if (prueba.equals("WPPSI303642")) {
                    Wppsi303642Modelo w = new Wppsi303642Modelo();
                    w.deleteWppsi303642(idelementoaborrar);
                    alertInformation("Éxito","","Elemento borrado de forma exitosa.");
                } else if (prueba.equals("WPPSI48")) {
                    Wppsi48Modelo w = new Wppsi48Modelo();
                    w.deleteWppsi48(idelementoaborrar);
                    alertInformation("Éxito","","Elemento borrado de forma exitosa.");
                } else if (prueba.equals("CDI12")) {
                    Cdi12Modelo c = new Cdi12Modelo();
                    c.deleteCdi12(idelementoaborrar);
                    alertInformation("Éxito","","Elemento borrado de forma exitosa.");
                } else if (prueba.equals("CDI182430")) {
                    Cdi182430Modelo c = new Cdi182430Modelo();
                    c.deleteCdi182430(idelementoaborrar);
                    alertInformation("Éxito","","Elemento borrado de forma exitosa.");
                } else if (prueba.equals("Icplim")) {
                    IcplimModelo c = new IcplimModelo();
                    c.deleteIcplim(idelementoaborrar);
                    alertInformation("Éxito","","Elemento borrado de forma exitosa.");
                }
                encontrarPruebas();
            } else {
            }
        } else {
            alertInformation("Error","","No se ha seleccionado un registro a eliminar.");
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
