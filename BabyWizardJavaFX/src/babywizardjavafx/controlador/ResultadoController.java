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
import babywizardjavafx.modelo.Wppsi303642Modelo;
import java.net.URL;
import java.sql.SQLException;
import java.util.Arrays;
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
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;

/**
 * FXML Controller class
 *
 * @author Vicaris
 */
public class ResultadoController implements Initializable {
    

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
    
    @FXML
    private TableView<Wppsi303642Modelo> resultadoswppsi30;
    @FXML
    private TableColumn<Wppsi303642Modelo, Integer> idinfantew30;
    @FXML
    private TableColumn<Wppsi303642Modelo, Integer> vrnw30;
    @FXML
    private TableColumn<Wppsi303642Modelo, Integer> vrew30;
    @FXML
    private TableColumn<Wppsi303642Modelo, Integer> dcnw30;
    @FXML
    private TableColumn<Wppsi303642Modelo, Integer> dcew30;
    @FXML
    private TableColumn<Wppsi303642Modelo, Integer> innw30;
    @FXML
    private TableColumn<Wppsi303642Modelo, Integer> inew30;
    @FXML
    private TableColumn<Wppsi303642Modelo, Integer> rcnw30;
    @FXML
    private TableColumn<Wppsi303642Modelo, Integer> rcew30;
    @FXML
    private TableColumn<Wppsi303642Modelo, Integer> dnnw30;
    @FXML
    private TableColumn<Wppsi303642Modelo, Integer> dnew30;
    @FXML
    private TableColumn<Wppsi303642Modelo, String> civw30;
    @FXML
    private TableColumn<Wppsi303642Modelo, String> civrpw30;
    @FXML
    private TableColumn<Wppsi303642Modelo, String> civnc90w30;
    @FXML
    private TableColumn<Wppsi303642Modelo, String> civnc95w30;
    @FXML
    private TableColumn<Wppsi303642Modelo, String> ciew30;
    @FXML
    private TableColumn<Wppsi303642Modelo, String> cierpw30;
    @FXML
    private TableColumn<Wppsi303642Modelo, String> cienc90w30;
    @FXML
    private TableColumn<Wppsi303642Modelo, String> cienc95w30;
    @FXML
    private TableColumn<Wppsi303642Modelo, String> citw30;
    @FXML
    private TableColumn<Wppsi303642Modelo, String> citrpw30;
    @FXML
    private TableColumn<Wppsi303642Modelo, String> citnc90w30;
    @FXML
    private TableColumn<Wppsi303642Modelo, String> citnc95w30;
    @FXML
    private TableColumn<Wppsi303642Modelo, String> cglw30;
    @FXML
    private TableColumn<Wppsi303642Modelo, String> cglrpw30;
    @FXML
    private TableColumn<Wppsi303642Modelo, String> cglnc90w30;
    @FXML
    private TableColumn<Wppsi303642Modelo, String> cglnc95w30;
    ObservableList<Wppsi303642Modelo> listaWppsi303642 = FXCollections.observableArrayList();
    
    @FXML
    private Button exportar;
    @FXML
    private Button atras;
    boolean flaginf;
    boolean flagcuid;
    boolean flagsd;
    boolean flaglc;
    boolean flagexpc;
    boolean flagw30;
    boolean flagw48;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb){
        flaginf = false;
        flagcuid = false;
        flagsd = false;
        flaglc = false;
        flagexpc = false;
        flagw30 = false;
        flagw48 = false;    
        
        resultadosbebe.setTableMenuButtonVisible(true);
        resultadoscuidador.setTableMenuButtonVisible(true);
        resultadossd.setTableMenuButtonVisible(true);
        resultadosexpcab.setTableMenuButtonVisible(true);
        resultadoslc.setTableMenuButtonVisible(true);
        resultadoswppsi30.setTableMenuButtonVisible(true);
        
    }    

    @FXML
    private void exportar(ActionEvent event) {
    }

    @FXML
    private void showInfante(ActionEvent event) {
        resultadosbebe.toFront();
        if(!flaginf) {
            crearTablaInf();
            flaginf=true;
        }
    }
    
    private void crearTablaInf(){
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
            //resultadosbebe.getColumns().addAll(resid,resnombre,resapellidop,resapellidom,ressexo,resfechan,resusuario);
        } catch (SQLException ex) {
            Logger.getLogger(ResultadoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void showCuidador(ActionEvent event) {
        resultadoscuidador.toFront();
        if(!flagcuid) {
            crearTablaCuid();
            flagcuid=true;
        }
    }
    
    private void crearTablaCuid() {
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
            //resultadoscuidador.getColumns().addAll(residc,resnombrec,resapellidopc,resapellidomc,resocupacion,resfechanc,restelefono1,restelefono2,resaniosestudio,residbebec);
        } catch (SQLException ex) {
            Logger.getLogger(ResultadoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void showSociode(ActionEvent event) {
        resultadossd.toFront();
        if(!flagsd) {
            crearTablaSociode();
            flagsd=true;
        }
    }
    
    private void crearTablaSociode() {
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
            //resultadossd.getColumns().addAll(idinfantesd,fechacitasd,gestacionsd,semnacsd,apgar1sd,apgar2sd,pesosd,prnacsd,prsaludsd,praudsd,prvissd,otroidiomasd,hermsd,lugocupasd,adultossd,niniossd,cuidprincsd,guarderiasd,mesesgsd,horasasistegsd,preescolarsd,mesespsd,horasasistepsd,observacionessd,nsesd,puntajecrudosd);
        } catch (SQLException ex) {
            Logger.getLogger(ResultadoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void showExpCab(ActionEvent event) {
        resultadosexpcab.toFront();
        if(!flagexpc) {
            crearTablaExpc();
            flagexpc=true;
        }
    }
    
    private void crearTablaExpc() {
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
            //resultadosexpcab.getColumns().addAll(idinfanteec,tipoexpec,entoprec,protarpreec,protarposec,llkdifpreec,llkdifposec,trec);
        } catch (SQLException ex) {
            Logger.getLogger(ResultadoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void showLectCab(ActionEvent event) {
        resultadoslc.toFront();
        if(!flaglc) {
            crearTablaLc();
            flaglc=true;
        }
    }
    
    private void crearTablaLc() {
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
            //resultadoslc.getColumns().addAll(idinfantelc,typetokenlc,cuidadorbebelc,preposicionlc,sustantivolc,articulolc,verbolc,adjetivolc,pronombrelc,adverbiolc,conjuncionlc,interjeccionlc,ininteligiblelc);
        } catch (SQLException ex) {
            Logger.getLogger(ResultadoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void showWppsi30(ActionEvent event) {
        resultadoswppsi30.toFront();
        if(!flagw30) {
            crearTablaW30();
            flagw30=true;
        }
    }
    
    private void crearTablaW30() {
        try {
            Wppsi303642Modelo w30 = new Wppsi303642Modelo();
            LinkedList<Wppsi303642Modelo> resultados = new LinkedList<>();
            for(int i:ids){
            LinkedList<Wppsi303642Modelo> r = w30.readWppsi303642(-1, -1, -1, -1, -1, -1, "", i, -1);
            if(r.size()>0){
            w30 = r.get(0);
            w30.setEscalares();
            w30.setEquivalentes();
            resultados.add(w30);
            }
            }
            for(Wppsi303642Modelo m:resultados) listaWppsi303642.add(m);
            idinfantew30.setCellValueFactory(new PropertyValueFactory<>("fkBebe"));
            vrnw30.setCellValueFactory(new PropertyValueFactory<>("vocabularioReceptivoNatural"));
            vrew30.setCellValueFactory(new PropertyValueFactory<>("vocabularioReceptivoEscalar"));
            dcnw30.setCellValueFactory(new PropertyValueFactory<>("disenioCubosNatural"));
            dcew30.setCellValueFactory(new PropertyValueFactory<>("disenioCubosEscalar"));
            innw30.setCellValueFactory(new PropertyValueFactory<>("informacionNatural"));
            inew30.setCellValueFactory(new PropertyValueFactory<>("informacionEscalar"));
            rcnw30.setCellValueFactory(new PropertyValueFactory<>("rompecabezasNatural"));
            rcew30.setCellValueFactory(new PropertyValueFactory<>("rompecabezasEscalar"));
            dnnw30.setCellValueFactory(new PropertyValueFactory<>("denominacionesNatural"));
            dnew30.setCellValueFactory(new PropertyValueFactory<>("denominacionesEscalar"));
            civw30.setCellValueFactory(new PropertyValueFactory<>("civ0"));
            civrpw30.setCellValueFactory(new PropertyValueFactory<>("civ1"));
            civnc90w30.setCellValueFactory(new PropertyValueFactory<>("civ2"));
            civnc95w30.setCellValueFactory(new PropertyValueFactory<>("civ3"));
            ciew30.setCellValueFactory(new PropertyValueFactory<>("cie0"));
            cierpw30.setCellValueFactory(new PropertyValueFactory<>("cie1"));
            cienc90w30.setCellValueFactory(new PropertyValueFactory<>("cie2"));
            cienc95w30.setCellValueFactory(new PropertyValueFactory<>("cie3"));
            citw30.setCellValueFactory(new PropertyValueFactory<>("cit0"));
            citrpw30.setCellValueFactory(new PropertyValueFactory<>("cit1"));
            citnc90w30.setCellValueFactory(new PropertyValueFactory<>("cit2"));
            citnc95w30.setCellValueFactory(new PropertyValueFactory<>("cit3"));
            cglw30.setCellValueFactory(new PropertyValueFactory<>("cgl0"));
            cglrpw30.setCellValueFactory(new PropertyValueFactory<>("cgl1"));
            cglnc90w30.setCellValueFactory(new PropertyValueFactory<>("cgl2"));
            cglnc95w30.setCellValueFactory(new PropertyValueFactory<>("cgl3"));
            resultadoswppsi30.setItems(listaWppsi303642);
            //resultadoslc.getColumns().addAll(idinfantelc,typetokenlc,cuidadorbebelc,preposicionlc,sustantivolc,articulolc,verbolc,adjetivolc,pronombrelc,adverbiolc,conjuncionlc,interjeccionlc,ininteligiblelc);
        } catch (SQLException ex) {
            Logger.getLogger(ResultadoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void showWppsi48(ActionEvent event) {
        if(!flagw48) {
            crearTablaW48();
            flagw48=true;
        }
    }
    
    private void crearTablaW48() {
    
    }
    
    public void meterIds(LinkedList<Integer> ids){
        this.ids = ids;
    }

    @FXML
    private void atras(ActionEvent event) {
    }
    
}
