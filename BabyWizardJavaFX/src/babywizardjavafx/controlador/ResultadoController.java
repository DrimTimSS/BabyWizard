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
    private TableView<Wppsi48Modelo> resultadoswppsi48;
    @FXML
    private TableColumn<Wppsi48Modelo, Integer> idinfantew48;
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
    boolean flagsocioec;
    
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
            new FileChooser.ExtensionFilter("Archivo Excel xls", "*.xls"));
        Stage stage = (Stage) exportar.getScene().getWindow();
        showCuidador(null);
        showExpCab(null);
        showLectCab(null);
        showSociode(null);
        showWppsi30(null);
        showWppsi48(null);
        showInfante(null);
        showSocioec(null);
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
                    row.createCell(contadorVisibles).setCellValue(columns.get(j).getCellData(i).toString());
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
            LinkedList<LecturaConjuntaModelo> lecturas = lcm.readLecturaConjuntaPorIds(ids);
            if (lecturas.size() > 0) {
                for (LecturaConjuntaModelo m : lecturas) {
                    resultados.add(m);
                }
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
                resultados.add(m);
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
                resultados.add(m);
            }
        }
        for (Wppsi48Modelo m : resultados) {
            listaWppsi48.add(m);
        }
        idinfantew48.setCellValueFactory(new PropertyValueFactory<>("fkBebe"));
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
}
