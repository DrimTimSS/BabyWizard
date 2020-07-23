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
import babywizardjavafx.modelo.ExperimentoCabinaModelo;
import babywizardjavafx.modelo.IcplimModelo;
import babywizardjavafx.modelo.LecturaConjuntaModelo;
import babywizardjavafx.modelo.SociodemograficoModelo;
import babywizardjavafx.modelo.SocioeconomicoModelo;
import babywizardjavafx.modelo.Wppsi303642Modelo;
import babywizardjavafx.modelo.Wppsi48Modelo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBoxTreeItem;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.CheckBoxTreeCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import jfxtras.styles.jmetro.JMetro;
import jfxtras.styles.jmetro.Style;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

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
    private TableColumn<BebeModelo, Integer> resanios;
    @FXML
    private TableColumn<BebeModelo, Integer> resmesest;
    @FXML
    private TableColumn<BebeModelo, Integer> resdias;
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
    private TableColumn<CuidadorModelo, Integer> edad;
    @FXML
    private TableColumn<CuidadorModelo, Integer> resaniosestudio;
    @FXML
    private TableColumn<CuidadorModelo, Integer> residbebec;
    @FXML
    private TableColumn<CuidadorModelo, String> resrelacionc;
    ObservableList<CuidadorModelo> listaCuidadores = FXCollections.observableArrayList();
    
    //Tabla sociodemografico
    @FXML
    private TableView<SociodemograficoModelo> resultadossd;
    @FXML
    private TableColumn<SociodemograficoModelo, Integer> idinfantesd;
    @FXML
    private TableColumn<SociodemograficoModelo, String> fechacitasd;
    @FXML
    private TableColumn<SociodemograficoModelo, String> gestacionsd;
    @FXML
    private TableColumn<SociodemograficoModelo, Integer> semnacsd;
    @FXML
    private TableColumn<SociodemograficoModelo, Integer> apgar1sd;
    @FXML
    private TableColumn<SociodemograficoModelo, Integer> apgar2sd;
    @FXML
    private TableColumn<SociodemograficoModelo, Double> pesosd;
    @FXML
    private TableColumn<SociodemograficoModelo, String> prnacsd;
    @FXML
    private TableColumn<SociodemograficoModelo, String> prsaludsd;
    @FXML
    private TableColumn<SociodemograficoModelo, String> praudsd;
    @FXML
    private TableColumn<SociodemograficoModelo, String> prvissd;
    @FXML
    private TableColumn<SociodemograficoModelo, String> otroidiomasd;
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
    private TableColumn<SociodemograficoModelo, String> guarderiasd;
    @FXML
    private TableColumn<SociodemograficoModelo, Integer> mesesgsd;
    @FXML
    private TableColumn<SociodemograficoModelo, Integer> horasasistegsd;
    @FXML
    private TableColumn<SociodemograficoModelo, String> preescolarsd;
    @FXML
    private TableColumn<SociodemograficoModelo, Integer> mesespsd;
    @FXML
    private TableColumn<SociodemograficoModelo, Integer> horasasistepsd;
    @FXML
    private TableColumn<SociodemograficoModelo, String> observacionessd;
    ObservableList<SociodemograficoModelo> listaSD = FXCollections.observableArrayList();
    
    //Tabla experimento cabina
    @FXML
    private TableView<ExperimentoCabinaModelo> resultadosexpcab;
    @FXML
    private TableColumn<ExperimentoCabinaModelo, Integer> idinfanteec;
    @FXML
    private TableColumn<ExperimentoCabinaModelo, String> tipoexpec;
    @FXML
    private TableColumn<ExperimentoCabinaModelo, String> resdireccion;
    ObservableList<ExperimentoCabinaModelo> listaEC = FXCollections.observableArrayList();
    
    //Tabla Lectura Conjunta
    @FXML
    private TableView<LecturaConjuntaModelo> resultadoslc;
    @FXML
    private TableColumn<LecturaConjuntaModelo,Integer> idinfantelc;
    
    @FXML
    private TableColumn<LecturaConjuntaModelo, Integer> typetokenclc;
    @FXML
    private TableColumn<LecturaConjuntaModelo, Integer> preposicionclc;
    @FXML
    private TableColumn<LecturaConjuntaModelo, Integer> sustantivoclc;
    @FXML
    private TableColumn<LecturaConjuntaModelo, Integer> articuloclc;
    @FXML
    private TableColumn<LecturaConjuntaModelo, Integer> verboclc;
    @FXML
    private TableColumn<LecturaConjuntaModelo, Integer> adjetivoclc;
    @FXML
    private TableColumn<LecturaConjuntaModelo, Integer> pronombreclc;
    @FXML
    private TableColumn<LecturaConjuntaModelo, Integer> adverbioclc;
    @FXML
    private TableColumn<LecturaConjuntaModelo, Integer> conjuncionclc;
    @FXML
    private TableColumn<LecturaConjuntaModelo, Integer> interjeccionclc;
    @FXML
    private TableColumn<LecturaConjuntaModelo, Integer> ininteligibleclc;
    @FXML
    private TableColumn<LecturaConjuntaModelo, Integer> typetokenctlc;
    @FXML
    private TableColumn<LecturaConjuntaModelo, Integer> preposicionctlc;
    @FXML
    private TableColumn<LecturaConjuntaModelo, Integer> sustantivoctlc;
    @FXML
    private TableColumn<LecturaConjuntaModelo, Integer> articuloctlc;
    @FXML
    private TableColumn<LecturaConjuntaModelo, Integer> verboctlc;
    @FXML
    private TableColumn<LecturaConjuntaModelo, Integer> adjetivoctlc;
    @FXML
    private TableColumn<LecturaConjuntaModelo, Integer> pronombrectlc;
    @FXML
    private TableColumn<LecturaConjuntaModelo, Integer> adverbioctlc;
    @FXML
    private TableColumn<LecturaConjuntaModelo, Integer> conjuncionctlc;
    @FXML
    private TableColumn<LecturaConjuntaModelo, Integer> interjeccionctlc;
    @FXML
    private TableColumn<LecturaConjuntaModelo, Integer> ininteligiblectlc;
    @FXML
    private TableColumn<LecturaConjuntaModelo, Integer> typetokenbblc;
    @FXML
    private TableColumn<LecturaConjuntaModelo, Integer> preposicionbblc;
    @FXML
    private TableColumn<LecturaConjuntaModelo, Integer> sustantivobblc;
    @FXML
    private TableColumn<LecturaConjuntaModelo, Integer> articulobblc;
    @FXML
    private TableColumn<LecturaConjuntaModelo, Integer> verbobblc;
    @FXML
    private TableColumn<LecturaConjuntaModelo, Integer> adjetivobblc;
    @FXML
    private TableColumn<LecturaConjuntaModelo, Integer> pronombrebblc;
    @FXML
    private TableColumn<LecturaConjuntaModelo, Integer> adverbiobblc;
    @FXML
    private TableColumn<LecturaConjuntaModelo, Integer> conjuncionbblc;
    @FXML
    private TableColumn<LecturaConjuntaModelo, Integer> interjeccionbblc;
    @FXML
    private TableColumn<LecturaConjuntaModelo, Integer> ininteligiblebblc;
    @FXML
    private TableColumn<LecturaConjuntaModelo, Integer> typetokenbbtlc;
    @FXML
    private TableColumn<LecturaConjuntaModelo, Integer> preposicionbbtlc;
    @FXML
    private TableColumn<LecturaConjuntaModelo, Integer> sustantivobbtlc;
    @FXML
    private TableColumn<LecturaConjuntaModelo, Integer> articulobbtlc;
    @FXML
    private TableColumn<LecturaConjuntaModelo, Integer> verbobbtlc;
    @FXML
    private TableColumn<LecturaConjuntaModelo, Integer> adjetivobbtlc;
    @FXML
    private TableColumn<LecturaConjuntaModelo, Integer> pronombrebbtlc;
    @FXML
    private TableColumn<LecturaConjuntaModelo, Integer> adverbiobbtlc;
    @FXML
    private TableColumn<LecturaConjuntaModelo, Integer> conjuncionbbtlc;
    @FXML
    private TableColumn<LecturaConjuntaModelo, Integer> interjeccionbbtlc;
    @FXML
    private TableColumn<LecturaConjuntaModelo, Integer> ininteligiblebbtlc;
    
    ObservableList<LecturaConjuntaModelo> listaLC = FXCollections.observableArrayList();
    
    @FXML
    private TableView<Wppsi303642Modelo> resultadoswppsi30;
    @FXML
    private TableColumn<Wppsi303642Modelo, Integer> idinfantew30;
    @FXML
    private TableColumn<Wppsi303642Modelo, String> fechaaplicw30;
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
    private TableView<Wppsi48Modelo> resultadoswppsi48;
    @FXML
    private TableColumn<Wppsi48Modelo, Integer> idinfantew48;
    @FXML
    private TableColumn<Wppsi48Modelo, String> fechaaplicw48;
    @FXML
    private TableColumn<Wppsi48Modelo, Integer> dcnw48;
    @FXML
    private TableColumn<Wppsi48Modelo, Integer> dcew48;
    @FXML
    private TableColumn<Wppsi48Modelo, Integer> innw48;
    @FXML
    private TableColumn<Wppsi48Modelo, Integer> inew48;
    @FXML
    private TableColumn<Wppsi48Modelo, Integer> mtnw48;
    @FXML
    private TableColumn<Wppsi48Modelo, Integer> mtew48;
    @FXML
    private TableColumn<Wppsi48Modelo, Integer> vcnw48;
    @FXML
    private TableColumn<Wppsi48Modelo, Integer> vcew48;
    @FXML
    private TableColumn<Wppsi48Modelo, Integer> cpnw48;
    @FXML
    private TableColumn<Wppsi48Modelo, Integer> cpew48;
    @FXML
    private TableColumn<Wppsi48Modelo, Integer> bsnw48;
    @FXML
    private TableColumn<Wppsi48Modelo, Integer> bsew48;
    @FXML
    private TableColumn<Wppsi48Modelo, Integer> psnw48;
    @FXML
    private TableColumn<Wppsi48Modelo, Integer> psew48;
    @FXML
    private TableColumn<Wppsi48Modelo, Integer> clnw48;
    @FXML
    private TableColumn<Wppsi48Modelo, Integer> clew48;
    @FXML
    private TableColumn<Wppsi48Modelo, Integer> cmnw48;
    @FXML
    private TableColumn<Wppsi48Modelo, Integer> cmew48;
    @FXML
    private TableColumn<Wppsi48Modelo, Integer> finw48;
    @FXML
    private TableColumn<Wppsi48Modelo, Integer> fiew48;
    @FXML
    private TableColumn<Wppsi48Modelo, Integer> senw48;
    @FXML
    private TableColumn<Wppsi48Modelo, Integer> seew48;
    @FXML
    private TableColumn<Wppsi48Modelo, Integer> vrnw48;
    @FXML
    private TableColumn<Wppsi48Modelo, Integer> vrew48;
    @FXML
    private TableColumn<Wppsi48Modelo, Integer> rcnw48;
    @FXML
    private TableColumn<Wppsi48Modelo, Integer> rcew48;
    @FXML
    private TableColumn<Wppsi48Modelo, Integer> dnnw48;
    @FXML
    private TableColumn<Wppsi48Modelo, Integer> dnew48;
    @FXML
    private TableColumn<Wppsi48Modelo, String> civw48;
    @FXML
    private TableColumn<Wppsi48Modelo, String> civrpw48;
    @FXML
    private TableColumn<Wppsi48Modelo, String> civ90icw48;
    @FXML
    private TableColumn<Wppsi48Modelo, String> civ95icw48;
    @FXML
    private TableColumn<Wppsi48Modelo, String> ciew48;
    @FXML
    private TableColumn<Wppsi48Modelo, String> cierpw48;
    @FXML
    private TableColumn<Wppsi48Modelo, String> cie90icw48;
    @FXML
    private TableColumn<Wppsi48Modelo, String> cie95icw48;
    @FXML
    private TableColumn<Wppsi48Modelo, String> cvpw48;
    @FXML
    private TableColumn<Wppsi48Modelo, String> cvprpw48;
    @FXML
    private TableColumn<Wppsi48Modelo, String> cvp90icw48;
    @FXML
    private TableColumn<Wppsi48Modelo, String> cvp95icw48;
    @FXML
    private TableColumn<Wppsi48Modelo, String> citw48;
    @FXML
    private TableColumn<Wppsi48Modelo, String> citrpw48;
    @FXML
    private TableColumn<Wppsi48Modelo, String> cit90icw48;
    @FXML
    private TableColumn<Wppsi48Modelo, String> cit95icw48;
    @FXML
    private TableColumn<Wppsi48Modelo, String> cglw48;
    @FXML
    private TableColumn<Wppsi48Modelo, String> cglrpw48;
    @FXML
    private TableColumn<Wppsi48Modelo, String> cgl90icw48;
    @FXML
    private TableColumn<Wppsi48Modelo, String> cgl95icw48;
    ObservableList<Wppsi48Modelo> listaWppsi48 = FXCollections.observableArrayList();
    
    private Scene escenaAnterior;
    @FXML
    private TableView<SocioeconomicoModelo> resultadossocioec;
    @FXML
    private TableColumn<SocioeconomicoModelo, Integer> idinfantese;
    @FXML
    private TableColumn<SocioeconomicoModelo, Integer> puntajecrudose;
    @FXML
    private TableColumn<SocioeconomicoModelo, String> nsese;
    ObservableList<SocioeconomicoModelo> listaSE = FXCollections.observableArrayList();
    
    @FXML
    private TableView<Cdi12Modelo> resultadoscdi12;
    @FXML
    private TableColumn<Cdi12Modelo, Integer> residinfantecdi12;
    @FXML
    private TableColumn<Cdi12Modelo, Integer> respf;
    @FXML
    private TableColumn<Cdi12Modelo, Integer> respercpf;
    @FXML
    private TableColumn<Cdi12Modelo, Float> resproppf;
    @FXML
    private TableColumn<Cdi12Modelo, Integer> rescmp;
    @FXML
    private TableColumn<Cdi12Modelo, Float> respropcmp;
    @FXML
    private TableColumn<Cdi12Modelo, Integer> resperccmp;
    @FXML
    private TableColumn<Cdi12Modelo, Integer> resprod;
    @FXML
    private TableColumn<Cdi12Modelo, Float> respropprod;
    @FXML
    private TableColumn<Cdi12Modelo, Integer> respercprod;
    @FXML
    private TableColumn<Cdi12Modelo, Integer> resgtemp;
    @FXML
    private TableColumn<Cdi12Modelo, Integer> resprecgtemp;
    @FXML
    private TableColumn<Cdi12Modelo, Float> respropgtemp;
    @FXML
    private TableColumn<Cdi12Modelo, Integer> resgtard;
    @FXML
    private TableColumn<Cdi12Modelo, Float> respropgtard;
    @FXML
    private TableColumn<Cdi12Modelo, Integer> respercgtard;
    @FXML
    private TableColumn<Cdi12Modelo, Integer> restotg;
    @FXML
    private TableColumn<Cdi12Modelo, Float> resproptotg;
    @FXML
    private TableColumn<Cdi12Modelo, Integer> resperctotg;
    @FXML
    private TableColumn<Cdi12Modelo, String> resfechaaplicacioncdi12;
    ObservableList<Cdi12Modelo> listaCdi12 = FXCollections.observableArrayList();
    
    @FXML
    private TableView<Cdi182430Modelo> resultadoscdi18;
    @FXML
    private TableColumn<Cdi182430Modelo, Integer> residinfantecdi18;
    @FXML
    private TableColumn<Cdi182430Modelo, Integer> resprodcdi18;
    @FXML
    private TableColumn<Cdi182430Modelo, Float> respropprodcdi18;
    @FXML
    private TableColumn<Cdi182430Modelo, Integer> respercprodcdi18;
    @FXML
    private TableColumn<Cdi182430Modelo, Integer> resp3lpalabras;
    @FXML
    private TableColumn<Cdi182430Modelo, Integer> respercp3lpalabras;
    @FXML
    private TableColumn<Cdi182430Modelo, Integer> rescmpfrasescdi18;
    @FXML
    private TableColumn<Cdi182430Modelo, Float> respropcmpfrasescdi18;
    @FXML
    private TableColumn<Cdi182430Modelo, Integer> resperccmpfrasescdi18;
    @FXML
    private TableColumn<Cdi182430Modelo, String> resfechaaplicacioncdi18;
    ObservableList<Cdi182430Modelo> listaCdi182430 = FXCollections.observableArrayList();
    
    @FXML
    private TableView<IcplimModelo> resultadosicplim; 
    @FXML
    private TableColumn<IcplimModelo, Integer> residinfanteicplim;
    @FXML
    private TableColumn<IcplimModelo, Integer> resc;
    @FXML
    private TableColumn<IcplimModelo, Float> respropc;
    @FXML
    private TableColumn<IcplimModelo, Integer> rescyd;
    @FXML
    private TableColumn<IcplimModelo, Float> respropcyd;
    @FXML
    private TableColumn<IcplimModelo, Integer> restotalicplim;
    @FXML
    private TableColumn<IcplimModelo, Float> resproptotal;
    @FXML
    private TableColumn<IcplimModelo, String> resfechaaplicacionicplim;
    ObservableList<IcplimModelo> listaIcplim = FXCollections.observableArrayList();
    
    @FXML
    private Button exportar;
    @FXML
    private Button atras;
    private boolean flaginf;
    private boolean flagcuid;
    private boolean flagsd;
    private boolean flaglc;
    private boolean flagexpc;
    private boolean flagw30;
    private boolean flagw48;
    private boolean flagsocioec;
    private boolean flagc12;
    private boolean flagc18;
    private boolean flagicplim;
    
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb){
        flaginf = false;
        flagcuid = false;
        flagsd = false;
        flagsocioec = false;
        flaglc = false;
        flagexpc = false;
        flagw30 = false;
        flagw48 = false;
        flagc12 = false;
        flagc18 = false;
        flagicplim = false;
        
        resultadosbebe.setTableMenuButtonVisible(true);
        resultadoscuidador.setTableMenuButtonVisible(true);
        resultadossd.setTableMenuButtonVisible(true);
        resultadosexpcab.setTableMenuButtonVisible(true);
        resultadoslc.setTableMenuButtonVisible(true);
        resultadoswppsi30.setTableMenuButtonVisible(true);
        resultadoswppsi48.setTableMenuButtonVisible(true);
        
    }    

    @FXML
    private void exportar(ActionEvent event) throws FileNotFoundException, IOException, SQLException {
        
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().addAll(
            new FileChooser.ExtensionFilter("Archivo Excel xlsx", "*.xlsx"),
            new FileChooser.ExtensionFilter("Archivo Excel xls", "*.xls"),
            new FileChooser.ExtensionFilter("Archivo CSV", "*.csv"));
        Stage stage = (Stage) exportar.getScene().getWindow();
        showCuidador(null);
        showExpCab(null);
        showLectCab(null);
        showSociode(null);
        showWppsi30(null);
        showWppsi48(null);
        showInfante(null);
        showSocioec(null);
        showCdi12(null);
        showCdi18(null);
        showIcplim(null);
        try {
            File selectedFile = fileChooser.showSaveDialog(stage);
            if (selectedFile != null) {
                String name = selectedFile.getName();
                String extension = name.substring(name.lastIndexOf(".") + 1, name.length());
                Workbook workbook;
                if(extension.equals("xlsx")){
                    
                    workbook = new XSSFWorkbook();
                    write(workbook,selectedFile);
                }
                if(extension.equals("xls")){
                    workbook = new HSSFWorkbook();
                    write(workbook,selectedFile);
                }
                
            }
        } catch (Exception ex) {

        }
    }
    
    public void write(Workbook workbook, File selectedFile) throws FileNotFoundException, IOException {
        crearHoja(workbook, "Infantes", resultadosbebe);
        crearHoja(workbook, "Cuidador", resultadoscuidador);
        crearHoja(workbook, "SocioD", resultadossd);
        crearHoja(workbook, "SocioE", resultadossocioec);
        crearHoja(workbook, "WPPSI30", resultadoswppsi30);
        crearHoja(workbook, "WPPSI48", resultadoswppsi48);
        crearHoja(workbook, "Lectura Conjuta", resultadoslc);
        crearHoja(workbook, "Experimento Cab.", resultadosexpcab);
        crearHoja(workbook, "CDI12", resultadoscdi12);
        crearHoja(workbook, "CDI182430", resultadoscdi18);
        crearHoja(workbook, "Icplim", resultadosicplim);
        
        //File dir = selectedFile.getParentFile();//gets the selected directory
        FileOutputStream fileOut = new FileOutputStream(selectedFile.getAbsolutePath());
        workbook.write(fileOut);
        fileOut.close();
    }
    
    public void crearHoja(Workbook workbook, String tabla, TableView tv) {
        Sheet nuevahoja = workbook.createSheet(tabla);
        
        Row row = nuevahoja.createRow(0);
        ObservableList<TableColumn<?,?>> columns = tv.getColumns();
        ObservableList<TableColumn<?,?>> columnasVisibles = FXCollections.observableArrayList();
              
        int contadorVisibles = 0;
        for (int j = 0; j < columns.size(); j++) {
            if(columns.get(j).isVisible()) {
                row.createCell(contadorVisibles).setCellValue(columns.get(j).getText());
                contadorVisibles++;
            }
        }
        
        for (int i = 0; i < tv.getItems().size(); i++) {
            row = nuevahoja.createRow(i + 1);
            contadorVisibles = 0;
            for (int j = 0; j < columns.size(); j++) {
                if(columns.get(j).getCellData(i) != null && columns.get(j).isVisible()) {
                    if (columns.get(j).getCellData(i) instanceof Double) row.createCell(contadorVisibles).setCellValue(Double.parseDouble(columns.get(j).getCellData(i).toString()));
                    else if (columns.get(j).getCellData(i) instanceof Integer) row.createCell(contadorVisibles).setCellValue(Integer.parseInt(columns.get(j).getCellData(i).toString()));
                    else row.createCell(contadorVisibles).setCellValue(columns.get(j).getCellData(i).toString());
                    contadorVisibles++;
                }
                
            }
        }
    }

    @FXML
    private void showInfante(ActionEvent event) throws SQLException {
        resultadosbebe.toFront();
        if(!flaginf) {
            crearTablaInf();
            flaginf=true;
        }
    }
    
    private void crearTablaInf() throws SQLException{
        try { 
            BebeModelo bm = new BebeModelo();
            LinkedList<BebeModelo> resultados = new LinkedList<BebeModelo>();
            LinkedList<BebeModelo> bebes = bm.readBebePorIds(ids);
            if (bebes.size() > 0) {
                for (BebeModelo b : bebes) {
                    b.setEdad();
                    resultados.add(b);
                }
            }
            for(BebeModelo b:resultados) listaBebes.add(b);
            resid.setCellValueFactory(new PropertyValueFactory<>("idBebe"));
            resnombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
            resapellidop.setCellValueFactory(new PropertyValueFactory<>("apellidoPaterno"));
            resapellidom.setCellValueFactory(new PropertyValueFactory<>("apellidoMaterno"));
            ressexo.setCellValueFactory(new PropertyValueFactory<>("sexo"));
            resfechan.setCellValueFactory(new PropertyValueFactory<>("fechaNacimiento"));
            resanios.setCellValueFactory(new PropertyValueFactory<>("edadAnios"));
            resmeses.setCellValueFactory(new PropertyValueFactory<>("edadMeses"));
            resdias.setCellValueFactory(new PropertyValueFactory<>("edadDias"));
            resmesest.setCellValueFactory(new PropertyValueFactory<>("edadMesesTotales"));
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
            LinkedList<CuidadorModelo> cuidadores = cm.readCuidadorPorIds(ids);
            if (cuidadores.size() > 0) {
                for (CuidadorModelo m : cuidadores) {
                    resultados.add(m);
                }
            }
            for(CuidadorModelo c:resultados) listaCuidadores.add(c);
            residc.setCellValueFactory(new PropertyValueFactory<>("idCuidador"));
            rescorreoc.setCellValueFactory(new PropertyValueFactory<>("correoElectronico"));
            resnombrec.setCellValueFactory(new PropertyValueFactory<>("nombreC"));
            resapellidopc.setCellValueFactory(new PropertyValueFactory<>("primerApellidoC"));
            resapellidomc.setCellValueFactory(new PropertyValueFactory<>("segundoApellidoC"));
            resocupacion.setCellValueFactory(new PropertyValueFactory<>("ocupacion"));
            edad.setCellValueFactory(new PropertyValueFactory<>("edad"));
            restelefono1.setCellValueFactory(new PropertyValueFactory<>("primerTelefono"));
            restelefono2.setCellValueFactory(new PropertyValueFactory<>("segundoTelefono"));
            resaniosestudio.setCellValueFactory(new PropertyValueFactory<>("aniosEstudio"));
            residbebec.setCellValueFactory(new PropertyValueFactory<>("fkBebe"));
            resrelacionc.setCellValueFactory(new PropertyValueFactory<>("relacion"));
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
            LinkedList<SociodemograficoModelo> sociodes = sm.readSociodemograficoPorIds(ids);
            if (sociodes.size() > 0) {
                for (SociodemograficoModelo m : sociodes) {
                    resultados.add(m);
                }
            }
            for(SociodemograficoModelo s:resultados) listaSD.add(s);
            idinfantesd.setCellValueFactory(new PropertyValueFactory<>("fkBebeSociodemografico"));
            fechacitasd.setCellValueFactory(new PropertyValueFactory<>("fechaDeCita"));
            gestacionsd.setCellValueFactory(new PropertyValueFactory<>("gestacionString"));
            semnacsd.setCellValueFactory(new PropertyValueFactory<>("semanasDeNacimiento"));
            apgar1sd.setCellValueFactory(new PropertyValueFactory<>("ptApgar1"));
            apgar2sd.setCellValueFactory(new PropertyValueFactory<>("ptApgar2"));   
            pesosd.setCellValueFactory(new PropertyValueFactory<>("pesoAlNacer"));
            prnacsd.setCellValueFactory(new PropertyValueFactory<>("problemasAlNacerString"));
            prsaludsd.setCellValueFactory(new PropertyValueFactory<>("problemasDeSaludString"));
            praudsd.setCellValueFactory(new PropertyValueFactory<>("problemasDeAudicionString"));
            prvissd.setCellValueFactory(new PropertyValueFactory<>("problemasDeVisionString"));
            otroidiomasd.setCellValueFactory(new PropertyValueFactory<>("otroIdiomaString"));
            hermsd.setCellValueFactory(new PropertyValueFactory<>("hermanos"));
            lugocupasd.setCellValueFactory(new PropertyValueFactory<>("lugarOcupa"));
            adultossd.setCellValueFactory(new PropertyValueFactory<>("adultos"));
            niniossd.setCellValueFactory(new PropertyValueFactory<>("ninios"));
            cuidprincsd.setCellValueFactory(new PropertyValueFactory<>("cuidadorPrincipal"));
            guarderiasd.setCellValueFactory(new PropertyValueFactory<>("guarderiaString"));
            mesesgsd.setCellValueFactory(new PropertyValueFactory<>("tiempoAsistiendoMesesG"));
            horasasistegsd.setCellValueFactory(new PropertyValueFactory<>("tiempoQueAsisteG"));
            preescolarsd.setCellValueFactory(new PropertyValueFactory<>("preescolarString"));
            mesespsd.setCellValueFactory(new PropertyValueFactory<>("tiempoAsistiendoMesesP"));
            horasasistepsd.setCellValueFactory(new PropertyValueFactory<>("tiempoQueAsisteP"));
            observacionessd.setCellValueFactory(new PropertyValueFactory<>("observaciones"));
            
            resultadossd.setItems(listaSD);
            //resultadossd.getColumns().addAll(idinfantesd,fechacitasd,gestacionsd,semnacsd,apgar1sd,apgar2sd,pesosd,prnacsd,prsaludsd,praudsd,prvissd,otroidiomasd,hermsd,lugocupasd,adultossd,niniossd,cuidprincsd,guarderiasd,mesesgsd,horasasistegsd,preescolarsd,mesespsd,horasasistepsd,observacionessd,nsesd,puntajecrudosd);
        } catch (SQLException ex) {
            Logger.getLogger(ResultadoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    private void showSocioec(ActionEvent event) throws SQLException {
        resultadossocioec.toFront();
        if(!flagsocioec) {
            crearTablaSocioec();
            flagsocioec=true;
        }
    }
    
    private void crearTablaSocioec() throws SQLException {
        SocioeconomicoModelo sem = new SocioeconomicoModelo();
        LinkedList<SocioeconomicoModelo> resultados = new LinkedList<>();
        LinkedList<SocioeconomicoModelo> socioecs = sem.readSocioeconomicoPorIds(ids);
        if (socioecs.size() > 0) {
            for (SocioeconomicoModelo m : socioecs) {
                resultados.add(m);
            }
        }
        for(SocioeconomicoModelo em:resultados) listaSE.add(em);
        idinfantese.setCellValueFactory(new PropertyValueFactory<>("fkBebe"));
        nsese.setCellValueFactory(new PropertyValueFactory<>("nse"));
        puntajecrudose.setCellValueFactory(new PropertyValueFactory<>("puntajeCrudo"));
        resultadossocioec.setItems(listaSE);
        //resultadosexpcab.getColumns().addAll(idinfanteec,tipoexpec,entoprec,protarpreec,protarposec,llkdifpreec,llkdifposec,trec);
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
            LinkedList<ExperimentoCabinaModelo> exps = ecm.readExperimentoCabinaPorIds(ids);
            if (exps.size() > 0) {
                for (ExperimentoCabinaModelo e : exps) {
                    resultados.add(e);
                }
            }
            for(ExperimentoCabinaModelo em:resultados) listaEC.add(em);
            idinfanteec.setCellValueFactory(new PropertyValueFactory<>("fkBebe"));
            tipoexpec.setCellValueFactory(new PropertyValueFactory<>("tipoExperimento"));
            resdireccion.setCellValueFactory(new PropertyValueFactory<>("enlace"));
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
            LinkedList<LecturaConjuntaModelo> lecturas = lcm.readLecturaConjuntaPorIds(ids);
            if (lecturas.size() > 0) {
                for (LecturaConjuntaModelo m : lecturas) {
                    resultados.add(m);
                }
            }
            for(LecturaConjuntaModelo m:resultados) listaLC.add(m);
            idinfantelc.setCellValueFactory(new PropertyValueFactory<>("fkBebe"));
            typetokenclc.setCellValueFactory(new PropertyValueFactory<>("typeC"));
            preposicionclc.setCellValueFactory(new PropertyValueFactory<>("preposicionC"));
            sustantivoclc.setCellValueFactory(new PropertyValueFactory<>("sustantivoC"));
            articuloclc.setCellValueFactory(new PropertyValueFactory<>("articuloC"));
            verboclc.setCellValueFactory(new PropertyValueFactory<>("verboC"));
            adjetivoclc.setCellValueFactory(new PropertyValueFactory<>("adjetivoC"));
            pronombreclc.setCellValueFactory(new PropertyValueFactory<>("pronombreC"));
            adverbioclc.setCellValueFactory(new PropertyValueFactory<>("adverbioC"));
            conjuncionclc.setCellValueFactory(new PropertyValueFactory<>("conjuncionC"));
            interjeccionclc.setCellValueFactory(new PropertyValueFactory<>("interjeccionC"));
            ininteligibleclc.setCellValueFactory(new PropertyValueFactory<>("ininteligibleC"));
            
            typetokenctlc.setCellValueFactory(new PropertyValueFactory<>("typeCT"));
            preposicionctlc.setCellValueFactory(new PropertyValueFactory<>("preposicionCT"));
            sustantivoctlc.setCellValueFactory(new PropertyValueFactory<>("sustantivoCT"));
            articuloctlc.setCellValueFactory(new PropertyValueFactory<>("articuloCT"));
            verboctlc.setCellValueFactory(new PropertyValueFactory<>("verboCT"));
            adjetivoctlc.setCellValueFactory(new PropertyValueFactory<>("adjetivoCT"));
            pronombrectlc.setCellValueFactory(new PropertyValueFactory<>("pronombreCT"));
            adverbioctlc.setCellValueFactory(new PropertyValueFactory<>("adverbioCT"));
            conjuncionctlc.setCellValueFactory(new PropertyValueFactory<>("conjuncionCT"));
            interjeccionctlc.setCellValueFactory(new PropertyValueFactory<>("interjeccionCT"));
            ininteligiblectlc.setCellValueFactory(new PropertyValueFactory<>("ininteligibleCT"));
            
            typetokenbblc.setCellValueFactory(new PropertyValueFactory<>("typeBB"));
            preposicionbblc.setCellValueFactory(new PropertyValueFactory<>("preposicionBB"));
            sustantivobblc.setCellValueFactory(new PropertyValueFactory<>("sustantivoBB"));
            articulobblc.setCellValueFactory(new PropertyValueFactory<>("articuloBB"));
            verbobblc.setCellValueFactory(new PropertyValueFactory<>("verboBB"));
            adjetivobblc.setCellValueFactory(new PropertyValueFactory<>("adjetivoBB"));
            pronombrebblc.setCellValueFactory(new PropertyValueFactory<>("pronombreBB"));
            adverbiobblc.setCellValueFactory(new PropertyValueFactory<>("adverbioBB"));
            conjuncionbblc.setCellValueFactory(new PropertyValueFactory<>("conjuncionBB"));
            interjeccionbblc.setCellValueFactory(new PropertyValueFactory<>("interjeccionBB"));
            ininteligiblebblc.setCellValueFactory(new PropertyValueFactory<>("ininteligibleBB"));
            
            typetokenbbtlc.setCellValueFactory(new PropertyValueFactory<>("typeBBT"));
            preposicionbbtlc.setCellValueFactory(new PropertyValueFactory<>("preposicionBBT"));
            sustantivobbtlc.setCellValueFactory(new PropertyValueFactory<>("sustantivoBBT"));
            articulobbtlc.setCellValueFactory(new PropertyValueFactory<>("articuloBBT"));
            verbobbtlc.setCellValueFactory(new PropertyValueFactory<>("verboBBT"));
            adjetivobbtlc.setCellValueFactory(new PropertyValueFactory<>("adjetivoBBT"));
            pronombrebbtlc.setCellValueFactory(new PropertyValueFactory<>("pronombreBBT"));
            adverbiobbtlc.setCellValueFactory(new PropertyValueFactory<>("adverbioBBT"));
            conjuncionbbtlc.setCellValueFactory(new PropertyValueFactory<>("conjuncionBBT"));
            interjeccionbbtlc.setCellValueFactory(new PropertyValueFactory<>("interjeccionBBT"));
            ininteligiblebbtlc.setCellValueFactory(new PropertyValueFactory<>("ininteligibleBBT"));
            resultadoslc.setItems(listaLC);
            //resultadoslc.getColumns().addAll(idinfantelc,typetokenlc,cuidadorbebelc,preposicionlc,sustantivolc,articulolc,verbolc,adjetivolc,pronombrelc,adverbiolc,conjuncionlc,interjeccionlc,ininteligiblelc);
        } catch (SQLException ex) {
            Logger.getLogger(ResultadoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void showWppsi30(ActionEvent event) throws SQLException {
        resultadoswppsi30.toFront();
        if(!flagw30) {
            crearTablaW30();
            flagw30=true;
        }
    }
    
    private void crearTablaW30() throws SQLException {
        Wppsi303642Modelo w30 = new Wppsi303642Modelo();
        LinkedList<Wppsi303642Modelo> resultados = new LinkedList<>();
        LinkedList<Wppsi303642Modelo> wppsis = w30.readWppsi303642PorIds(ids);
        if (wppsis.size() > 0) {
            for (Wppsi303642Modelo m : wppsis) {
                m.setEscalares();
                m.setEquivalentes();
                resultados.add(m);
            }
        }
        for(Wppsi303642Modelo m:resultados) listaWppsi303642.add(m);   
        idinfantew30.setCellValueFactory(new PropertyValueFactory<>("fkBebe"));
        fechaaplicw30.setCellValueFactory(new PropertyValueFactory<>("fechaAplicacion"));
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
    }

    @FXML
    private void showWppsi48(ActionEvent event) throws SQLException {
        resultadoswppsi48.toFront();
        if(!flagw48) {
            crearTablaW48();
            flagw48=true;
        }
    }
    
    private void crearTablaW48() throws SQLException {
        Wppsi48Modelo w48 = new Wppsi48Modelo();
        LinkedList<Wppsi48Modelo> resultados = new LinkedList<>();
        LinkedList<Wppsi48Modelo> wppsis = w48.readWppsi48PorIds(ids);
        if (wppsis.size() > 0) {
            for (Wppsi48Modelo m : wppsis) {
                m.setEscalares();
                m.setEquivalentes();
                resultados.add(m);
            }
        }
        for (Wppsi48Modelo m : resultados) {
            listaWppsi48.add(m);
        }
        idinfantew48.setCellValueFactory(new PropertyValueFactory<>("fkBebe"));
        fechaaplicw48.setCellValueFactory(new PropertyValueFactory<>("fechaAplicacion"));
        dcnw48.setCellValueFactory(new PropertyValueFactory<>("disenioCubosNatural"));
        dcew48.setCellValueFactory(new PropertyValueFactory<>("disenioCubosEscalar"));
        innw48.setCellValueFactory(new PropertyValueFactory<>("informacionNatural"));
        inew48.setCellValueFactory(new PropertyValueFactory<>("informacionEscalar"));
        mtnw48.setCellValueFactory(new PropertyValueFactory<>("matricesNatural"));
        mtew48.setCellValueFactory(new PropertyValueFactory<>("matricesEscalar"));
        vcnw48.setCellValueFactory(new PropertyValueFactory<>("vocabularioNatural"));
        vcew48.setCellValueFactory(new PropertyValueFactory<>("vocabularioEscalar"));
        cpnw48.setCellValueFactory(new PropertyValueFactory<>("conceptosConDibujosNatural"));
        cpew48.setCellValueFactory(new PropertyValueFactory<>("conceptosConDibujosEscalar"));
        bsnw48.setCellValueFactory(new PropertyValueFactory<>("busquedaSimbolosNatural"));
        bsew48.setCellValueFactory(new PropertyValueFactory<>("busquedaSimbolosEscalar"));
        psnw48.setCellValueFactory(new PropertyValueFactory<>("pistasNatural"));
        psew48.setCellValueFactory(new PropertyValueFactory<>("pistasEscalar"));
        clnw48.setCellValueFactory(new PropertyValueFactory<>("clavesNatural"));
        clew48.setCellValueFactory(new PropertyValueFactory<>("clavesEscalar"));
        cmnw48.setCellValueFactory(new PropertyValueFactory<>("comprensionNatural"));
        cmew48.setCellValueFactory(new PropertyValueFactory<>("comprensionEscalar"));
        finw48.setCellValueFactory(new PropertyValueFactory<>("figurasIncompletasNatural"));
        fiew48.setCellValueFactory(new PropertyValueFactory<>("figurasIncompletasEscalar"));
        senw48.setCellValueFactory(new PropertyValueFactory<>("semejanzasNatural"));
        seew48.setCellValueFactory(new PropertyValueFactory<>("semejanzasEscalar"));
        vrnw48.setCellValueFactory(new PropertyValueFactory<>("vocabularioReceptivoNatural"));
        vrew48.setCellValueFactory(new PropertyValueFactory<>("vocabularoiReceptivoEscalar"));
        rcnw48.setCellValueFactory(new PropertyValueFactory<>("rompecabezasNatural"));
        rcew48.setCellValueFactory(new PropertyValueFactory<>("rompecabezasEscalar"));
        dnnw48.setCellValueFactory(new PropertyValueFactory<>("denominacionesNatural"));
        dnew48.setCellValueFactory(new PropertyValueFactory<>("denominacionesEscalar"));
        civw48.setCellValueFactory(new PropertyValueFactory<>("civ0"));
        civrpw48.setCellValueFactory(new PropertyValueFactory<>("civ1"));
        civ90icw48.setCellValueFactory(new PropertyValueFactory<>("civ2"));
        civ95icw48.setCellValueFactory(new PropertyValueFactory<>("civ3"));
        ciew48.setCellValueFactory(new PropertyValueFactory<>("cie0"));
        cierpw48.setCellValueFactory(new PropertyValueFactory<>("cie1"));
        cie90icw48.setCellValueFactory(new PropertyValueFactory<>("cie2"));
        cie95icw48.setCellValueFactory(new PropertyValueFactory<>("cie3"));
        cvpw48.setCellValueFactory(new PropertyValueFactory<>("cvp0"));
        cvprpw48.setCellValueFactory(new PropertyValueFactory<>("cvp1"));
        cvp90icw48.setCellValueFactory(new PropertyValueFactory<>("cvp2"));
        cvp95icw48.setCellValueFactory(new PropertyValueFactory<>("cvp3"));
        citw48.setCellValueFactory(new PropertyValueFactory<>("cit0"));
        citrpw48.setCellValueFactory(new PropertyValueFactory<>("cit1"));
        cit90icw48.setCellValueFactory(new PropertyValueFactory<>("cit2"));
        cit95icw48.setCellValueFactory(new PropertyValueFactory<>("cit3"));
        cglw48.setCellValueFactory(new PropertyValueFactory<>("cgl0"));
        cglrpw48.setCellValueFactory(new PropertyValueFactory<>("cgl1"));
        cgl90icw48.setCellValueFactory(new PropertyValueFactory<>("cgl2"));
        cgl95icw48.setCellValueFactory(new PropertyValueFactory<>("cgl3"));
        resultadoswppsi48.setItems(listaWppsi48);
        //resultadoslc.getColumns().addAll(idinfantelc,typetokenlc,cuidadorbebelc,preposicionlc,sustantivolc,articulolc,verbolc,adjetivolc,pronombrelc,adverbiolc,conjuncionlc,interjeccionlc,ininteligiblelc);
    }
    
    public void meterIds(LinkedList<Integer> ids) throws SQLException{
        this.ids = ids;
        showInfante(null);
    }

    @FXML
    private void atras(ActionEvent event) throws IOException {
        Stage actualWindow = (Stage) grid.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/babywizardjavafx/vista/Busqueda.fxml"));
        Parent root = (Parent) loader.load();
        Scene exito = escenaAnterior;
        JMetro jmetro = new JMetro(Style.LIGHT);
        jmetro.setParent(root);
        actualWindow.setScene(exito);
    }
    
    public void escenaBusqueda(Scene anterior){
        escenaAnterior = anterior;
    }

    @FXML
    private void showCdi12(ActionEvent event) throws SQLException {
        resultadoscdi12.toFront();
        if(!flagc12) {
            crearTablaC12();
            flagc12=true;
        }
    }
    
    private void crearTablaC12() throws SQLException {
        Cdi12Modelo c12 = new Cdi12Modelo();
        LinkedList<Cdi12Modelo> resultados = new LinkedList<>();
        LinkedList<Cdi12Modelo> cdis = c12.readCdi12PorIds(ids);
        if (cdis.size() > 0) {
            for (Cdi12Modelo c : cdis) {
                resultados.add(c);
            }
        }
        for (Cdi12Modelo m : resultados) {
            listaCdi12.add(m);
        }
        residinfantecdi12.setCellValueFactory(new PropertyValueFactory<>("fkBebe"));
        respf.setCellValueFactory(new PropertyValueFactory<>("primerasFrases"));
        resproppf.setCellValueFactory(new PropertyValueFactory<>("propPrimerasFrases"));
        respercpf.setCellValueFactory(new PropertyValueFactory<>("percPrimerasFrases"));
        rescmp.setCellValueFactory(new PropertyValueFactory<>("comprension"));
        respropcmp.setCellValueFactory(new PropertyValueFactory<>("propComprension"));
        resperccmp.setCellValueFactory(new PropertyValueFactory<>("percComprension"));
        resprod.setCellValueFactory(new PropertyValueFactory<>("produccion"));
        respropprod.setCellValueFactory(new PropertyValueFactory<>("propProduccion"));
        respercprod.setCellValueFactory(new PropertyValueFactory<>("percProduccion"));
        resgtemp.setCellValueFactory(new PropertyValueFactory<>("gestosTempranos"));
        resprecgtemp.setCellValueFactory(new PropertyValueFactory<>("propGestosTempranos"));
        respropgtemp.setCellValueFactory(new PropertyValueFactory<>("percGestosTempranos"));
        resgtard.setCellValueFactory(new PropertyValueFactory<>("gestosTardios"));
        respropgtard.setCellValueFactory(new PropertyValueFactory<>("propGestosTardios"));
        respercgtard.setCellValueFactory(new PropertyValueFactory<>("percGestosTardios"));
        restotg.setCellValueFactory(new PropertyValueFactory<>("totalGestos"));
        resproptotg.setCellValueFactory(new PropertyValueFactory<>("propTotalGestos"));
        resperctotg.setCellValueFactory(new PropertyValueFactory<>("percTotalGestos"));
        resfechaaplicacioncdi12.setCellValueFactory(new PropertyValueFactory<>("fechaAplicacion"));
        
        resultadoscdi12.setItems(listaCdi12);
    }

    @FXML
    private void showCdi18(ActionEvent event) throws SQLException {
        resultadoscdi18.toFront();
        if(!flagc18) {
            crearTablaC18();
            flagc18=true;
        }
    }
    
    private void crearTablaC18() throws SQLException {
        Cdi182430Modelo c18 = new Cdi182430Modelo();
        LinkedList<Cdi182430Modelo> resultados = new LinkedList<>();
        LinkedList<Cdi182430Modelo> cdis = c18.readCdi182430PorIds(ids);
        if (cdis.size() > 0) {
            for (Cdi182430Modelo c : cdis) {
                resultados.add(c);
            }
        }
        for (Cdi182430Modelo m : resultados) {
            listaCdi182430.add(m);
        }
        residinfantecdi18.setCellValueFactory(new PropertyValueFactory<>("fkBebe"));
        resprodcdi18.setCellValueFactory(new PropertyValueFactory<>("produccion"));
        respropprodcdi18.setCellValueFactory(new PropertyValueFactory<>("propProduccion"));
        respercprodcdi18.setCellValueFactory(new PropertyValueFactory<>("percProduccion"));
        resp3lpalabras.setCellValueFactory(new PropertyValueFactory<>("p3lPalabras"));
        respercp3lpalabras.setCellValueFactory(new PropertyValueFactory<>("percP3lPalabras"));
        rescmpfrasescdi18.setCellValueFactory(new PropertyValueFactory<>("complejidadFrases"));
        respropcmpfrasescdi18.setCellValueFactory(new PropertyValueFactory<>("propComplejidadFrases"));
        resperccmpfrasescdi18.setCellValueFactory(new PropertyValueFactory<>("percComplejidadFrases"));
        resfechaaplicacioncdi18.setCellValueFactory(new PropertyValueFactory<>("fechaAplicacion"));
        
        resultadoscdi18.setItems(listaCdi182430);
    }

    @FXML
    private void showIcplim(ActionEvent event) throws SQLException {
        resultadosicplim.toFront();
        if(!flagicplim) {
            crearTablaIcplim();
            flagicplim=true;
        }
    }

    private void crearTablaIcplim() throws SQLException {
        IcplimModelo icp = new IcplimModelo();
        LinkedList<IcplimModelo> resultados = new LinkedList<>();
        LinkedList<IcplimModelo> icplims = icp.readIcplimPorIds(ids);
        if (icplims.size() > 0) {
            for (IcplimModelo i : icplims) {
                resultados.add(i);
            }
        }
        for (IcplimModelo m : resultados) {
            
            residinfanteicplim.setCellValueFactory(new PropertyValueFactory<>("fkBebe"));
            resc.setCellValueFactory(new PropertyValueFactory<>("c"));
            respropc.setCellValueFactory(new PropertyValueFactory<>("propC"));
            rescyd.setCellValueFactory(new PropertyValueFactory<>("cYd"));
            respropcyd.setCellValueFactory(new PropertyValueFactory<>("propCyD"));
            restotalicplim.setCellValueFactory(new PropertyValueFactory<>("total"));
            resproptotal.setCellValueFactory(new PropertyValueFactory<>("propTotal"));
            resfechaaplicacionicplim.setCellValueFactory(new PropertyValueFactory<>("fechaAplicacion"));

            listaIcplim.add(m);
        }
        
        
        resultadosicplim.setItems(listaIcplim);
    }
    

    
}
