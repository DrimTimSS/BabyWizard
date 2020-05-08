/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx.controlador;

import babywizardjavafx.modelo.BebeModelo;
import babywizardjavafx.modelo.CuidadorModelo;
import babywizardjavafx.modelo.ExperimentoCabinaModelo;
import babywizardjavafx.modelo.LecturaConjuntaModelo;
import babywizardjavafx.modelo.SociodemograficoModelo;
import babywizardjavafx.modelo.SocioeconomicoModelo;
import java.net.URL;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBoxTreeItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.CheckBoxTreeCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;

/**
 * FXML Controller class
 *
 * @author Vicaris
 */
public class ResultadoController implements Initializable {
    
    //Arbol para creacion de tablas
    private TreeView<String> tree;
    //Ids bebes que entran por la busqueda
    LinkedList<Integer> ids;
    
    //Tabla para bebes
    @FXML
    private TableView<BebeModelo> resultadosbebe;
    @FXML
    private TableColumn<BebeModelo, String> resid;
    @FXML
    private TableColumn<BebeModelo, String> resnombre;
    @FXML
    private TableColumn<BebeModelo, String> resapellidop;
    @FXML
    private TableColumn<BebeModelo, String> resapellidom;
    @FXML
    private TableColumn<BebeModelo, Integer> ressexo;
    @FXML
    private TableColumn<BebeModelo, String> resfechan;
    @FXML
    private TableColumn<BebeModelo, Integer> resmeses;
    @FXML
    private TableColumn<BebeModelo, Integer> resusuario;
    ObservableList<BebeModelo> listaBebes = FXCollections.observableArrayList();
    
    @FXML
    private GridPane grid;
    
    //Tabla para cuidador
    @FXML
    private TableView<CuidadorModelo> resultadoscuidador;
    @FXML
    private TableColumn<CuidadorModelo, Integer> residc;
    @FXML
    private TableColumn<CuidadorModelo, String> rescorreoc;
    @FXML
    private TableColumn<CuidadorModelo, String> resnombrec;
    @FXML
    private TableColumn<CuidadorModelo, String> resapellidopc;
    @FXML
    private TableColumn<CuidadorModelo, String> resapellidomc;
    @FXML
    private TableColumn<CuidadorModelo, String> resocupacion;
    @FXML
    private TableColumn<CuidadorModelo, String> restelefono1;
    @FXML
    private TableColumn<CuidadorModelo, String> restelefono2;
    @FXML
    private TableColumn<CuidadorModelo, String> resfechanc;
    @FXML
    private TableColumn<CuidadorModelo, Integer> resaniosestudio;
    @FXML
    private TableColumn<CuidadorModelo, Integer> residbebec;
    ObservableList<CuidadorModelo> listaCuidadores = FXCollections.observableArrayList();
    
    //Tabla sociodemografico socioeconomico
    @FXML
    private TableView<SociodemograficoModelo> resultadossd;
    @FXML
    private TableColumn<SociodemograficoModelo, Integer> idinfantesd;
    @FXML
    private TableColumn<SociodemograficoModelo, String> fechacitasd;
    @FXML
    private TableColumn<SociodemograficoModelo, Integer> gestacionsd;
    @FXML
    private TableColumn<SociodemograficoModelo, Integer> semnacsd;
    @FXML
    private TableColumn<SociodemograficoModelo, Integer> apgar1sd;
    @FXML
    private TableColumn<SociodemograficoModelo, Integer> apgar2sd;
    @FXML
    private TableColumn<SociodemograficoModelo, Double> pesosd;
    @FXML
    private TableColumn<SociodemograficoModelo, Integer> prnacsd;
    @FXML
    private TableColumn<SociodemograficoModelo, Integer> prsaludsd;
    @FXML
    private TableColumn<SociodemograficoModelo, Integer> praudsd;
    @FXML
    private TableColumn<SociodemograficoModelo, Integer> prvissd;
    @FXML
    private TableColumn<SociodemograficoModelo, Integer> otroidiomasd;
    @FXML
    private TableColumn<SociodemograficoModelo, Integer> hermsd;
    @FXML
    private TableColumn<SociodemograficoModelo, Integer> lugocupasd;
    @FXML
    private TableColumn<SociodemograficoModelo, Integer> adultossd;
    @FXML
    private TableColumn<SociodemograficoModelo, Integer> niniossd;
    @FXML
    private TableColumn<SociodemograficoModelo, String> cuidprincsd;
    @FXML
    private TableColumn<SociodemograficoModelo, Integer> guarderiasd;
    @FXML
    private TableColumn<SociodemograficoModelo, Integer> mesesgsd;
    @FXML
    private TableColumn<SociodemograficoModelo, Integer> horasasistegsd;
    @FXML
    private TableColumn<SociodemograficoModelo, Integer> preescolarsd;
    @FXML
    private TableColumn<SociodemograficoModelo, Integer> mesespsd;
    @FXML
    private TableColumn<SociodemograficoModelo, Integer> horasasistepsd;
    @FXML
    private TableColumn<SociodemograficoModelo, String> observacionessd;
    @FXML
    private TableColumn<SociodemograficoModelo, String> nsesd;
    @FXML
    private TableColumn<SociodemograficoModelo, Integer> puntajecrudosd;
    ObservableList<SociodemograficoModelo> listaSD = FXCollections.observableArrayList();
    
    //Tabla experimento cabina
    @FXML
    private TableView<ExperimentoCabinaModelo> resultadosexpcab;
    @FXML
    private TableColumn<ExperimentoCabinaModelo, Integer> idinfanteec;
    @FXML
    private TableColumn<ExperimentoCabinaModelo, Integer> tipoexpec;
    @FXML
    private TableColumn<ExperimentoCabinaModelo, Integer> entoprec;
    @FXML
    private TableColumn<ExperimentoCabinaModelo, Double> protarpreec;
    @FXML
    private TableColumn<ExperimentoCabinaModelo, Double> protarposec;
    @FXML
    private TableColumn<ExperimentoCabinaModelo, Double> llkdifpreec;
    @FXML
    private TableColumn<ExperimentoCabinaModelo, Double> llkdifposec;
    @FXML
    private TableColumn<ExperimentoCabinaModelo, Double> trec;
    ObservableList<ExperimentoCabinaModelo> listaEC = FXCollections.observableArrayList();
    
    //Tabla Lectura Conjunta
    @FXML
    private TableView<LecturaConjuntaModelo> resultadoslc;
    @FXML
    private TableColumn<LecturaConjuntaModelo,Integer> idinfantelc;
    @FXML
    private TableColumn<LecturaConjuntaModelo,Integer> typetokenlc;
    @FXML
    private TableColumn<LecturaConjuntaModelo,Integer> cuidadorbebelc;
    @FXML
    private TableColumn<LecturaConjuntaModelo,Integer> preposicionlc;
    @FXML
    private TableColumn<LecturaConjuntaModelo,Integer> sustantivolc;
    @FXML
    private TableColumn<LecturaConjuntaModelo,Integer> articulolc;
    @FXML
    private TableColumn<LecturaConjuntaModelo,Integer> verbolc;
    @FXML
    private TableColumn<LecturaConjuntaModelo,Integer> adjetivolc;
    @FXML
    private TableColumn<LecturaConjuntaModelo,Integer> pronombrelc;
    @FXML
    private TableColumn<LecturaConjuntaModelo,Integer> adverbiolc;
    @FXML
    private TableColumn<LecturaConjuntaModelo,Integer> conjuncionlc;
    @FXML
    private TableColumn<LecturaConjuntaModelo,Integer> interjeccionlc;
    @FXML
    private TableColumn<LecturaConjuntaModelo,Integer> ininteligiblelc;
    ObservableList<LecturaConjuntaModelo> listaLC = FXCollections.observableArrayList();
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb){
        CheckBoxTreeItem root = new CheckBoxTreeItem<>("Todo");
        
        CheckBoxTreeItem infante = new CheckBoxTreeItem<>("Infante");
        CheckBoxTreeItem cuidador = new CheckBoxTreeItem<>("Cuidador");
        CheckBoxTreeItem sociodemografico = new CheckBoxTreeItem<>("Sociodemográfico");
        CheckBoxTreeItem socioeconomico = new CheckBoxTreeItem<>("Socioeconómico");
        CheckBoxTreeItem pruebas = new CheckBoxTreeItem<>("Pruebas");
        
        tree = new TreeView<>();
        root.getChildren().addAll(infante,cuidador,sociodemografico,socioeconomico,pruebas);
        tree.setRoot(root);
        root.setExpanded(true);
        
        tree.setCellFactory(CheckBoxTreeCell.<String>forTreeView());
        
        grid.getChildren().add(tree);
        
        resultadosbebe.setTableMenuButtonVisible(true);
        resultadoscuidador.setTableMenuButtonVisible(true);
        resultadossd.setTableMenuButtonVisible(true);
        resultadosexpcab.setTableMenuButtonVisible(true);
        resultadoslc.setTableMenuButtonVisible(true);
        
    }    

    @FXML
    private void exportar(ActionEvent event) {
    }

    @FXML
    private void crearTablas(ActionEvent event) {
        resultadosbebe.getItems().clear();
        resultadoscuidador.getItems().clear();
        resultadossd.getItems().clear();
        //Infante
        try {
            BebeModelo bm = new BebeModelo();
            LinkedList<BebeModelo> resultados = new LinkedList<BebeModelo>();
            for(int i:ids){
            resultados.addAll(bm.readBebe(i, "", "", "", -1, "",-1,-1, ""));
            }
            for(BebeModelo b:resultados) listaBebes.add(b);
            resid.setCellValueFactory(new PropertyValueFactory<>("idBebe"));
            resnombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
            resapellidop.setCellValueFactory(new PropertyValueFactory<>("apellidoPaterno"));
            resapellidom.setCellValueFactory(new PropertyValueFactory<>("apellidoMaterno"));
            ressexo.setCellValueFactory(new PropertyValueFactory<>("sexo"));
            resfechan.setCellValueFactory(new PropertyValueFactory<>("fechaNacimiento"));
            resmeses.setCellValueFactory(new PropertyValueFactory<>("edad"));
            resusuario.setCellValueFactory(new PropertyValueFactory<>("fkUsuario"));
            resultadosbebe.setItems(listaBebes);
            //tablaBebes.getColumns().addAll(idBebe,nombre,apellidoPaterno,apellidoMaterno,sexo,fechaNacimiento,fkUsuario);
        } catch (SQLException ex) {
            Logger.getLogger(ResultadoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Cuidador
        try {
            CuidadorModelo cm = new CuidadorModelo();
            LinkedList<CuidadorModelo> resultados = new LinkedList<CuidadorModelo>();
            for(int i:ids){
            resultados.addAll(cm.readCuidador(-1, "", "", "", "", "", "", "", "", -1, i));
            }
            for(CuidadorModelo c:resultados) listaCuidadores.add(c);
            residc.setCellValueFactory(new PropertyValueFactory<>("idCuidador"));
            rescorreoc.setCellValueFactory(new PropertyValueFactory<>("correoElectronico"));
            resnombrec.setCellValueFactory(new PropertyValueFactory<>("nombreC"));
            resapellidopc.setCellValueFactory(new PropertyValueFactory<>("primerApellidoC"));
            resapellidomc.setCellValueFactory(new PropertyValueFactory<>("segundoApellidoC"));
            resocupacion.setCellValueFactory(new PropertyValueFactory<>("ocupacion"));
            resfechanc.setCellValueFactory(new PropertyValueFactory<>("fechaDeNacimiento"));
            restelefono1.setCellValueFactory(new PropertyValueFactory<>("primerTelefono"));
            restelefono2.setCellValueFactory(new PropertyValueFactory<>("segundoTelefono"));
            resaniosestudio.setCellValueFactory(new PropertyValueFactory<>("aniosEstudio"));
            residbebec.setCellValueFactory(new PropertyValueFactory<>("fkBebe"));
            resultadoscuidador.setItems(listaCuidadores);
            //tablaBebes.getColumns().addAll(idBebe,nombre,apellidoPaterno,apellidoMaterno,sexo,fechaNacimiento,fkUsuario);
        } catch (SQLException ex) {
            Logger.getLogger(ResultadoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //sociodem socioec
        try {
            SociodemograficoModelo sm = new SociodemograficoModelo();
            LinkedList<SociodemograficoModelo> resultados = new LinkedList<>();
            for(int i:ids){
            resultados.addAll(sm.readSociodemografico(-1, "", -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, "", -1, -1, -1, -1, -1, -1, "", i));
            }
            for(SociodemograficoModelo s:resultados) listaSD.add(s);
            idinfantesd.setCellValueFactory(new PropertyValueFactory<>("fkBebeSociodemografico"));
            fechacitasd.setCellValueFactory(new PropertyValueFactory<>("fechaDeCita"));
            gestacionsd.setCellValueFactory(new PropertyValueFactory<>("gestacion"));
            semnacsd.setCellValueFactory(new PropertyValueFactory<>("semanasDeNacimiento"));
            apgar1sd.setCellValueFactory(new PropertyValueFactory<>("ptApgar1"));
            apgar2sd.setCellValueFactory(new PropertyValueFactory<>("ptApgar2"));   
            pesosd.setCellValueFactory(new PropertyValueFactory<>("pesoAlNacer"));
            prnacsd.setCellValueFactory(new PropertyValueFactory<>("problemasAlNacer"));
            prsaludsd.setCellValueFactory(new PropertyValueFactory<>("problemasDeSalud"));
            praudsd.setCellValueFactory(new PropertyValueFactory<>("problemasDeAudicion"));
            prvissd.setCellValueFactory(new PropertyValueFactory<>("problemasDeVision"));
            otroidiomasd.setCellValueFactory(new PropertyValueFactory<>("otroIdioma"));
            hermsd.setCellValueFactory(new PropertyValueFactory<>("hermanos"));
            lugocupasd.setCellValueFactory(new PropertyValueFactory<>("lugarOcupa"));
            adultossd.setCellValueFactory(new PropertyValueFactory<>("adultos"));
            niniossd.setCellValueFactory(new PropertyValueFactory<>("ninios"));
            cuidprincsd.setCellValueFactory(new PropertyValueFactory<>("cuidadorPrincipal"));
            guarderiasd.setCellValueFactory(new PropertyValueFactory<>("guarderia"));
            mesesgsd.setCellValueFactory(new PropertyValueFactory<>("tiempoAsistiendoMesesG"));
            horasasistegsd.setCellValueFactory(new PropertyValueFactory<>("tiempoQueAsisteG"));
            preescolarsd.setCellValueFactory(new PropertyValueFactory<>("preescolar"));
            mesespsd.setCellValueFactory(new PropertyValueFactory<>("tiempoAsistiendoMesesP"));
            horasasistepsd.setCellValueFactory(new PropertyValueFactory<>("tiempoQueAsisteP"));
            observacionessd.setCellValueFactory(new PropertyValueFactory<>("observaciones"));
            nsesd.setCellValueFactory(new PropertyValueFactory<>("nse"));
            puntajecrudosd.setCellValueFactory(new PropertyValueFactory<>("puntajeCrudo"));
            resultadossd.setItems(listaSD);
            //tablaBebes.getColumns().addAll(idBebe,nombre,apellidoPaterno,apellidoMaterno,sexo,fechaNacimiento,fkUsuario);
        } catch (SQLException ex) {
            Logger.getLogger(ResultadoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Experimento Cabina
        try {
            ExperimentoCabinaModelo ecm = new ExperimentoCabinaModelo();
            LinkedList<ExperimentoCabinaModelo> resultados = new LinkedList<>();
            for(int i:ids){
            resultados.addAll(ecm.readExperimentoCabina(-1, "", -1, -1, -1, -1, -1, -1, i));
            }
            for(ExperimentoCabinaModelo em:resultados) listaEC.add(em);
            idinfanteec.setCellValueFactory(new PropertyValueFactory<>("fkBebe"));
            tipoexpec.setCellValueFactory(new PropertyValueFactory<>("tipoExperimento"));
            entoprec.setCellValueFactory(new PropertyValueFactory<>("entrenamientoOPrueba"));
            protarpreec.setCellValueFactory(new PropertyValueFactory<>("protarPre"));
            protarposec.setCellValueFactory(new PropertyValueFactory<>("protarPos"));
            llkdifpreec.setCellValueFactory(new PropertyValueFactory<>("llkdifPre"));
            llkdifposec.setCellValueFactory(new PropertyValueFactory<>("llkdifPos"));
            trec.setCellValueFactory(new PropertyValueFactory<>("tr"));
            
            
            resultadosexpcab.setItems(listaEC);
            //tablaBebes.getColumns().addAll(idBebe,nombre,apellidoPaterno,apellidoMaterno,sexo,fechaNacimiento,fkUsuario);
        } catch (SQLException ex) {
            Logger.getLogger(ResultadoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Lectura Conjunta
        try {
            LecturaConjuntaModelo lcm = new LecturaConjuntaModelo();
            LinkedList<LecturaConjuntaModelo> resultados = new LinkedList<>();
            for(int i:ids){
            resultados.addAll(lcm.readLecturaConjunta(-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, i));
            }
            for(LecturaConjuntaModelo m:resultados) listaLC.add(m);
            idinfantelc.setCellValueFactory(new PropertyValueFactory<>("fkBebe"));
            typetokenlc.setCellValueFactory(new PropertyValueFactory<>("typeOrToken"));
            cuidadorbebelc.setCellValueFactory(new PropertyValueFactory<>("cuidadorBebe"));
            preposicionlc.setCellValueFactory(new PropertyValueFactory<>("preposicion"));
            sustantivolc.setCellValueFactory(new PropertyValueFactory<>("sustantivo"));
            articulolc.setCellValueFactory(new PropertyValueFactory<>("articulo"));
            verbolc.setCellValueFactory(new PropertyValueFactory<>("verbo"));
            adjetivolc.setCellValueFactory(new PropertyValueFactory<>("adjetivo"));
            pronombrelc.setCellValueFactory(new PropertyValueFactory<>("pronombre"));
            adverbiolc.setCellValueFactory(new PropertyValueFactory<>("adverbio"));
            conjuncionlc.setCellValueFactory(new PropertyValueFactory<>("conjuncion"));
            interjeccionlc.setCellValueFactory(new PropertyValueFactory<>("interjeccion"));
            ininteligiblelc.setCellValueFactory(new PropertyValueFactory<>("ininteligible"));
            
            resultadoslc.setItems(listaLC);
            //tablaBebes.getColumns().addAll(idBebe,nombre,apellidoPaterno,apellidoMaterno,sexo,fechaNacimiento,fkUsuario);
        } catch (SQLException ex) {
            Logger.getLogger(ResultadoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void showInfante(ActionEvent event) {
        resultadosbebe.toFront();
    }

    @FXML
    private void showCuidador(ActionEvent event) {
        resultadoscuidador.toFront();
    }

    @FXML
    private void showSociode(ActionEvent event) {
        resultadossd.toFront();
    }

    @FXML
    private void showExpCab(ActionEvent event) {
        resultadosexpcab.toFront();
    }

    @FXML
    private void showLectCab(ActionEvent event) {
        resultadoslc.toFront();
    }

    @FXML
    private void showWppsi30(ActionEvent event) {
    }

    @FXML
    private void showWppsi48(ActionEvent event) {
    }
    
    public void meterIds(LinkedList<Integer> ids){
        this.ids = ids;
    }
    
}
