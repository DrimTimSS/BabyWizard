/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx.controlador;

import babywizardjavafx.modelo.BebeModelo;
import babywizardjavafx.modelo.Cdi12Modelo;
import babywizardjavafx.modelo.Cdi182430Modelo;
import babywizardjavafx.modelo.CuidadorModelo;
import babywizardjavafx.modelo.IcplimModelo;
import babywizardjavafx.modelo.LecturaConjuntaModelo;
import babywizardjavafx.modelo.SociodemograficoModelo;
import babywizardjavafx.modelo.SocioeconomicoModelo;
import babywizardjavafx.modelo.Wppsi303642Modelo;
import babywizardjavafx.modelo.Wppsi48Modelo;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
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
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceDialog;
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
    private RadioButton infante;
    @FXML
    private Label idbebeprueba;//id bebe a editar
    @FXML
    private ToggleGroup pruebas;
    @FXML
    private RadioButton sociodem;
    @FXML
    private RadioButton socioeco;
    @FXML
    private RadioButton cdi12;
    @FXML
    private RadioButton cdi182430;
    @FXML
    private RadioButton icplim;

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
    private void irAPrueba(ActionEvent event) throws SQLException, IOException {
        
        int id = 0; 
        if(idbebeprueba.getText().equals("0")){
            alertInformation("Alerta","","No se ha seleccionado un infante al cual se desee editar datos.");
            return;
        } else{
            id = Integer.parseInt(idbebeprueba.getText());           
        }

        String direccion = "";
        String prueba = "";
        //====================================================
        //Para editar Infante
        //====================================================
        if (infante.isSelected()){
            BebeModelo bm = new BebeModelo();
            bm = bm.readBebe(id, "", "", "", -1, "", -1, -1, "").getFirst();
            direccion = "/babywizardjavafx/vista/EditarBB.fxml";
            prueba = "Infante";
            FXMLLoader loader = showWindow(direccion, prueba);
            
            EditarBBController wcont = loader.getController();
            
            wcont.setIdBebeActualizar(id);
            wcont.setBBAEditar(bm);
            wcont.setCampos();
        } 
        else
        //====================================================
        //Para editar Cuidador
        //====================================================
        if (cuidador.isSelected()) {
            CuidadorModelo cm = new CuidadorModelo();
            List<String> choices = new LinkedList<>();
            LinkedList<CuidadorModelo> cuidadores = cm.readCuidador(-1, "", -1, "", "", "", "", "", "", -1, "", id);
            if(cuidadores.size()<1) {
                alertInformation("Alerta","","No hay cuidadores registrado.");
                return;
            }
            for(CuidadorModelo c:cuidadores){
                choices.add(c.getIdCuidador()+" - "+c.getRelacion());
            }

            ChoiceDialog<String> dialog = new ChoiceDialog<>(choices.get(0), choices);
            dialog.initOwner(idbebebusqueda.getParent().getScene().getWindow());
            dialog.getDialogPane().getStylesheets().add("/babywizardjavafx/vista/EstiloGeneral.css");
            dialog.setTitle("Elección para edición.");
            dialog.setHeaderText("Escoger el elemento que se desea editar.");
            dialog.setContentText("¿Cuál es el id del elemento a editar? ");

            Optional<String> result = dialog.showAndWait();
            if (result.isPresent()) {
                cm = cm.readCuidador(Integer.parseInt(result.get().split(" ")[0]), "", -1, "", "", "", "", "", "", -1, "", -1).getFirst();
                direccion = "/babywizardjavafx/vista/AgregarCuidador.fxml";
                prueba = "Cuidador";
                FXMLLoader loader = showWindow(direccion, prueba);
                AgregarCuidadorController wcont = loader.getController();

                wcont.setEditable(true);
                wcont.setCuidadorActualizar(cm.getIdCuidador());
                wcont.inicializarBebe(id);
                wcont.setCuidadorAEditar(cm);
                wcont.setCampos();
            }
            
            
        }else
        //====================================================
        //Para editar WPPSI 303642
        //====================================================
        if (w303642.isSelected()) {
            Wppsi303642Modelo wm = new Wppsi303642Modelo();
            List<String> choices = new LinkedList<>();
            LinkedList<Wppsi303642Modelo> wppsis = wm.readWppsi303642(-1, -1, -1, -1, -1, -1, "", id, -1);
            if(wppsis.size()<1) {
                alertInformation("Alerta","","No hay WPPSI 30 36 42 registrado.");
                return;
            }
            for(Wppsi303642Modelo w:wppsis){
                choices.add(w.getIdWppsi303642()+" "+w.getFechaAplicacion());
            }

            ChoiceDialog<String> dialog = new ChoiceDialog<>(choices.get(0), choices);
            dialog.initOwner(idbebebusqueda.getParent().getScene().getWindow());
            dialog.getDialogPane().getStylesheets().add("/babywizardjavafx/vista/EstiloGeneral.css");
            dialog.setTitle("Elección para edición.");
            dialog.setHeaderText("Escoger el elemento que se desea editar.");
            dialog.setContentText("¿Cuál es el id del elemento a editar? ");

            Optional<String> result = dialog.showAndWait();
            if (result.isPresent()) {
                wm = wm.readWppsi303642(Integer.parseInt(result.get().split(" ")[0]), -1, -1, -1, -1, -1, "", -1, -1).getFirst();
                direccion = "/babywizardjavafx/vista/Wppsi303642.fxml";
                prueba = "WPPSI 30 36 42";
                FXMLLoader loader = showWindow(direccion, prueba);
                Wppsi303642Controller wcont = loader.getController();

                wcont.setEditable(true);
                wcont.setIdBebeActualizar(id);
                wcont.inicializarBebe(id);
                wcont.setWppsiAEditar(wm);
                wcont.setCampos();
            }
            
            
        } else 
        //====================================================
        //Para editar SocioDyE
        //====================================================
        if (sociodem.isSelected()) {
            SociodemograficoModelo sdm = new SociodemograficoModelo();
            List<String> choices = new LinkedList<>();
            LinkedList<SociodemograficoModelo> socios = sdm.readSociodemografico(-1, "", -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, "", -1, -1, -1, -1, -1, -1, "", id);
            if(socios.size()<1) {
                alertInformation("Alerta","","No hay sociodemográfico registrado.");
                return;
            }
            for(SociodemograficoModelo s:socios){
                choices.add(s.getIdSociodemografico()+" "+s.getFechaDeCita());
            }

            ChoiceDialog<String> dialog = new ChoiceDialog<>(choices.get(0), choices);
            dialog.initOwner(idbebebusqueda.getParent().getScene().getWindow());
            dialog.getDialogPane().getStylesheets().add("/babywizardjavafx/vista/EstiloGeneral.css");
            dialog.setTitle("Elección para edición.");
            dialog.setHeaderText("Escoger el elemento que se desea editar.");
            dialog.setContentText("¿Cuál es el id del elemento a editar? ");

            Optional<String> result = dialog.showAndWait();
            if (result.isPresent()) {
                sdm = sdm.readSociodemografico(Integer.parseInt(result.get().split(" ")[0]), "", -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, "", -1, -1, -1, -1, -1, -1, "", -1).getFirst();
                direccion = "/babywizardjavafx/vista/AgregarSociod.fxml";
                prueba = "Sociodemográfico";
                FXMLLoader loader = showWindow(direccion, prueba);
                AgregarSociodController wcont = loader.getController();

                wcont.setEditable(true);
                wcont.inicializarBebe(id);
                wcont.setSociodAEditar(sdm);
                wcont.setCampos();
            }
        } else
        //====================================================
        //Para editar socioeconomico
        //====================================================
        if (socioeco.isSelected()) {
            SocioeconomicoModelo sem = new SocioeconomicoModelo();
            List<String> choices = new LinkedList<>();
            LinkedList<SocioeconomicoModelo> socios = sem.readSocioeconomico(-1, -1, "","", id);
            if(socios.size()<1) {
                alertInformation("Alerta","","No hay socioeconómico registrado.");
                return;
            }
            for(SocioeconomicoModelo s:socios){
                choices.add(s.getIdSocioeconomico()+" "+s.getNse());
            }

            ChoiceDialog<String> dialog = new ChoiceDialog<>(choices.get(0), choices);
            dialog.initOwner(idbebebusqueda.getParent().getScene().getWindow());
            dialog.getDialogPane().getStylesheets().add("/babywizardjavafx/vista/EstiloGeneral.css");
            dialog.setTitle("Elección para edición.");
            dialog.setHeaderText("Escoger el elemento que se desea editar.");
            dialog.setContentText("¿Cuál es el id del elemento a editar? ");

            Optional<String> result = dialog.showAndWait();
            if (result.isPresent()) {
                sem = sem.readSocioeconomico(Integer.parseInt(result.get().split(" ")[0]), -1, "", "", -1).getFirst();
                direccion = "/babywizardjavafx/vista/AgregarSocioe.fxml";
                prueba = "Socioeconómico";
                FXMLLoader loader = showWindow(direccion, prueba);
                AgregarSocioeController wcont = loader.getController();

                wcont.setEditable(true);
                wcont.inicializarBebe(id);
                wcont.setSocioeAEditar(sem);
                wcont.setCampos();
            }
            
            
        } else
        //====================================================
        //Para editar WPPSI 48
        //====================================================
        if (w48.isSelected()) {
            Wppsi48Modelo wm = new Wppsi48Modelo();
            List<String> choices = new LinkedList<>();
            LinkedList<Wppsi48Modelo> wppsis = wm.readWppsi48(-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, "", -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, id);
            if(wppsis.size()<1) {
                alertInformation("Alerta","","No hay WPPSI 48 registrado.");
                return;
            } //echar notificacion
            for(Wppsi48Modelo w:wppsis){
                choices.add(w.getIdWppsi48()+" "+w.getFechaAplicacion());
            }

            ChoiceDialog<String> dialog = new ChoiceDialog<>(choices.get(0), choices);
            dialog.initOwner(idbebebusqueda.getParent().getScene().getWindow());
            dialog.getDialogPane().getStylesheets().add("/babywizardjavafx/vista/EstiloGeneral.css");
            dialog.setTitle("Elección para edición.");
            dialog.setHeaderText("Escoger el elemento que se desea editar.");
            dialog.setContentText("¿Cuál es el id del elemento a editar? ");

            Optional<String> result = dialog.showAndWait();
            if (result.isPresent()) {
                wm = wm.readWppsi48(Integer.parseInt(result.get().split(" ")[0]), -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, "", -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1).getFirst();
                direccion = "/babywizardjavafx/vista/Wppsi48.fxml";
                prueba = "WPPSI 48";
                FXMLLoader loader = showWindow(direccion, prueba);
                Wppsi48Controller wcont = loader.getController();

                wcont.setEditable(true);
                wcont.setIdBebeActualizar(id);
                wcont.inicializarBebe(id);
                wcont.setWppsiAEditar(wm);
                wcont.setCampos();
            }
        } else 
        //====================================================
        //Para editar Lectura Conjunta
        //====================================================
        if (lectconj.isSelected()) {
            LecturaConjuntaModelo lcm = new LecturaConjuntaModelo();
            List<String> choices = new LinkedList<>();
            LinkedList<LecturaConjuntaModelo> lecturas = lcm.readLecturaConjunta(-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, id);
            if(lecturas.size()<1) {
                alertInformation("Alerta","","No hay Lectura Conjunta registrada.");
                return;
            } //echar notificacion
            for(LecturaConjuntaModelo l:lecturas){
                choices.add(l.getIdLecturaConjunta()+" "+l.getTypeOrTokenString()+" "+l.getCuidadorBebeString());
            }

            ChoiceDialog<String> dialog = new ChoiceDialog<>(choices.get(0), choices);
            dialog.initOwner(idbebebusqueda.getParent().getScene().getWindow());
            dialog.getDialogPane().getStylesheets().add("/babywizardjavafx/vista/EstiloGeneral.css");
            dialog.setTitle("Elección para edición.");
            dialog.setHeaderText("Escoger el elemento que se desea editar.");
            dialog.setContentText("¿Cuál es el id del elemento a editar? ");

            Optional<String> result = dialog.showAndWait();
            if (result.isPresent()) {
                lcm = lcm.readLecturaConjunta(Integer.parseInt(result.get().split(" ")[0]), -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1).getFirst();
                direccion = "/babywizardjavafx/vista/LecturaConjunta.fxml";
                prueba = "Lectura Conjunta";
                FXMLLoader loader = showWindow(direccion, prueba);
                LecturaConjuntaController lcont = loader.getController();

                lcont.setEditable(true);
                lcont.setIdBebeActualizar(id);
                lcont.inicializarBebe(id);
                lcont.setLecturaAEditar(lcm);
                lcont.setCampos();
            }
        } else
        //====================================================
        //Para editar CDI12
        //====================================================
        if (cdi12.isSelected()) {
            Cdi12Modelo cdim = new Cdi12Modelo();
            List<String> choices = new LinkedList<>();
            LinkedList<Cdi12Modelo> cdis = cdim.readCdi12(-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, "", id);
            if(cdis.size()<1) {
                alertInformation("Alerta","","No hay CDI 12 registrado.");
                return;
            } //echar notificacion
            for(Cdi12Modelo c:cdis){
                //System.out.println(c.getFechaAplicacion());
                choices.add(c.getIdCdi12()+" "+c.getFechaAplicacion());
            }

            ChoiceDialog<String> dialog = new ChoiceDialog<>(choices.get(0), choices);
            dialog.initOwner(idbebebusqueda.getParent().getScene().getWindow());
            dialog.getDialogPane().getStylesheets().add("/babywizardjavafx/vista/EstiloGeneral.css");
            dialog.setTitle("Elección para edición.");
            dialog.setHeaderText("Escoger el elemento que se desea editar.");
            dialog.setContentText("¿Cuál es el id del elemento a editar? ");

            Optional<String> result = dialog.showAndWait();
            if (result.isPresent()) {
                cdim = cdim.readCdi12(Integer.parseInt(result.get().split(" ")[0]), -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, "", -1).getFirst();
                direccion = "/babywizardjavafx/vista/AgregarCdi12.fxml";
                prueba = "CDI 12";
                FXMLLoader loader = showWindow(direccion, prueba);
                AgregarCdi12Controller cdicont = loader.getController();

                cdicont.setEditable(true);
                cdicont.setIdBebeActualizar(id);
                cdicont.inicializarBebe(id);
                cdicont.setCdi12AEditar(cdim);
                cdicont.setCampos();
            }
        } else
        //====================================================
        //Para editar CDI182430
        //====================================================
        if (cdi182430.isSelected()) {
            Cdi182430Modelo cdim = new Cdi182430Modelo();
            List<String> choices = new LinkedList<>();
            LinkedList<Cdi182430Modelo> cdis = cdim.readCdi182430(-1, -1, -1, -1, -1, -1, -1, -1, -1, "", id);
            if(cdis.size()<1) {
                alertInformation("Alerta","","No hay CDI 18 24 30 registrado.");
                return;
            } //echar notificacion
            for(Cdi182430Modelo c:cdis){
                //System.out.println(c.getFechaAplicacion());
                choices.add(c.getIdCdi182430()+" "+c.getFechaAplicacion());
            }

            ChoiceDialog<String> dialog = new ChoiceDialog<>(choices.get(0), choices);
            dialog.initOwner(idbebebusqueda.getParent().getScene().getWindow());
            dialog.getDialogPane().getStylesheets().add("/babywizardjavafx/vista/EstiloGeneral.css");
            dialog.setTitle("Elección para edición.");
            dialog.setHeaderText("Escoger el elemento que se desea editar.");
            dialog.setContentText("¿Cuál es el id del elemento a editar? ");

            Optional<String> result = dialog.showAndWait();
            if (result.isPresent()) {
                cdim = cdim.readCdi182430(Integer.parseInt(result.get().split(" ")[0]), -1, -1, -1, -1, -1, -1, -1, -1, "", -1).getFirst();
                direccion = "/babywizardjavafx/vista/AgregarCdi182430.fxml";
                prueba = "CDI 18 24 30";
                FXMLLoader loader = showWindow(direccion, prueba);
                AgregarCdi182430Controller cdicont = loader.getController();

                cdicont.setEditable(true);
                cdicont.setIdBebeActualizar(id);
                cdicont.inicializarBebe(id);
                cdicont.setCdi182430AEditar(cdim);
                cdicont.setCampos();
            }
        } else
        //====================================================
        //Para editar ICPLIM
        //====================================================
        if (icplim.isSelected()) {
            IcplimModelo icplimm = new IcplimModelo();
            List<String> choices = new LinkedList<>();
            LinkedList<IcplimModelo> icplims = icplimm.readIcplim(-1, -1, -1, -1, -1, -1, -1, "", id);
            if(icplims.size()<1) {
                alertInformation("Alerta","","No hay ICPLIM registrado.");
                return;
            } //echar notificacion
            for(IcplimModelo i:icplims){
                //System.out.println(c.getFechaAplicacion());
                choices.add(i.getIdIcplim()+" "+i.getFechaAplicacion());
            }

            ChoiceDialog<String> dialog = new ChoiceDialog<>(choices.get(0), choices);
            dialog.initOwner(idbebebusqueda.getParent().getScene().getWindow());
            dialog.getDialogPane().getStylesheets().add("/babywizardjavafx/vista/EstiloGeneral.css");
            dialog.setTitle("Elección para edición.");
            dialog.setHeaderText("Escoger el elemento que se desea editar.");
            dialog.setContentText("¿Cuál es el id del elemento a editar? ");

            Optional<String> result = dialog.showAndWait();
            if (result.isPresent()) {
                icplimm = icplimm.readIcplim(Integer.parseInt(result.get().split(" ")[0]), -1, -1, -1, -1, -1, -1, "", -1).getFirst();
                direccion = "/babywizardjavafx/vista/AgregarIcplim.fxml";
                prueba = "ICPLIM";
                FXMLLoader loader = showWindow(direccion, prueba);
                AgregarIcplimController cdicont = loader.getController();

                cdicont.setEditable(true);
                cdicont.setIdBebeActualizar(id);
                cdicont.inicializarBebe(id);
                cdicont.setIcplimAEditar(icplimm);
                cdicont.setCampos();
            }
        } else
            if (expcab.isSelected()) {
            direccion = "/babywizardjavafx/vista/ExperimentoCabina.fxml";
            prueba = "Experimento de Cabina";
            FXMLLoader loader = showWindow(direccion, prueba);
            ExperimentoCabinaController wcont = loader.getController();
            wcont.inicializarBebe(Integer.valueOf(idbebeprueba.getText()));
        } else {
                alertInformation("Alerta","","No hay elemento seleccionado para editar.");
                return;
            }
    }

    //====================================================
    //Metodo que recibe una direccion para ubicar la vista a ser cargada y el titulo de la ventana
    //====================================================
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
    
    private void alertInformation(String titulo, String header, String contenido) {
        Alert alert = new Alert(AlertType.INFORMATION);
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
