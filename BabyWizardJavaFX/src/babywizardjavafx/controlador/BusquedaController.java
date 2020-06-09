/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx.controlador;

import babywizardjavafx.modelo.BebeModelo;
import babywizardjavafx.modelo.JdbConnection;
import babywizardjavafx.modelo.SociodemograficoModelo;
import babywizardjavafx.modelo.SocioeconomicoModelo;
import com.mysql.cj.util.StringUtils;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
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
public class BusquedaController implements Initializable {

    @FXML
    private ToggleGroup gestacion;
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
    private TextField edadbusquedamin;
    @FXML
    private TextField edadbusquedamax;
    @FXML
    private RadioButton prematurobusqueda;
    @FXML
    private RadioButton aterminobusqueda;
    @FXML
    private TextField adultosbusqueda;
    @FXML
    private ComboBox<String> cuidadorbusqueda;
    @FXML
    private TextField hermanosbusqueda;
    @FXML
    private TextField lugarbusqueda;
    @FXML
    private TextField niniosbusqueda;
    @FXML
    private TextField gtiempobusqueda;
    @FXML
    private TextField ptiempobusqueda;
    @FXML
    private TextField gasistenciabusqueda;
    @FXML
    private TextField pasistenciabusqueda;
    @FXML
    private ComboBox<Integer> apgar1busqueda;
    @FXML
    private ComboBox<Integer> apgar2busqueda;
    @FXML
    private TextField pcbusqueda;
    @FXML
    private TextField usuariobusqueda;
    @FXML
    private CheckBox wppsi303642;
    @FXML
    private CheckBox lecturaconjunta;
    @FXML
    private CheckBox wppsi48;
    @FXML
    private CheckBox experimentocabina;
    @FXML
    private ComboBox<String> nse;
    @FXML
    private TextField pesobusqueda1;
    @FXML
    private TextField pesobusqueda2;
    @FXML
    private RadioButton pnacersi;
    @FXML
    private ToggleGroup gestacion1;
    @FXML
    private RadioButton pnacerno;
    @FXML
    private RadioButton psaludsi;
    @FXML
    private ToggleGroup gestacion2;
    @FXML
    private RadioButton psaludno;
    @FXML
    private RadioButton paudicionsi;
    @FXML
    private ToggleGroup gestacion3;
    @FXML
    private RadioButton paudicionno;
    @FXML
    private RadioButton pvisionsi;
    @FXML
    private ToggleGroup gestacion4;
    @FXML
    private RadioButton pvisionno;
    @FXML
    private RadioButton otroidiomasi;
    @FXML
    private ToggleGroup gestacion41;
    @FXML
    private RadioButton otroidiomano;
    @FXML
    private RadioButton guarderiasi;
    @FXML
    private ToggleGroup gestacion411;
    @FXML
    private RadioButton guarderiano;
    @FXML
    private RadioButton preescolarsi;
    @FXML
    private ToggleGroup gestacion4111;
    @FXML
    private RadioButton preescolarno;
    @FXML
    private Button btnbuscar1;
    @FXML
    private Button btnbuscar2;
    @FXML
    private Button btnbuscar3;
    @FXML
    private Button btnbuscar4;
    @FXML
    private Button btnbuscar5;
    @FXML
    private Button btnbuscar6;
    private boolean abrir;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        abrir = true;
        for (int i=0;i<11;i++){
        apgar1busqueda.getItems().add(i);
        apgar2busqueda.getItems().add(i);
        }
        cuidadorbusqueda.getItems().add("Madre");
        cuidadorbusqueda.getItems().add("Padre");
        cuidadorbusqueda.getItems().add("Abuela");
        cuidadorbusqueda.getItems().add("Abuelo");
        cuidadorbusqueda.getItems().add("Tía");
        cuidadorbusqueda.getItems().add("Tío");
        cuidadorbusqueda.getItems().add("Hermana");
        cuidadorbusqueda.getItems().add("Hermano");
        cuidadorbusqueda.getItems().add("Otro");
        
        nse.getItems().add("A\\B");
        nse.getItems().add("C+");
        nse.getItems().add("C");
        nse.getItems().add("C-");
        nse.getItems().add("D+");
        nse.getItems().add("D");
        nse.getItems().add("E");
        
        pcbusqueda.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, 
            String newValue) {
                if (!newValue.matches("\\d\\d")) {
                    pcbusqueda.setText(newValue.replaceAll("[^\\d]", ""));
                    if(!(pcbusqueda.getText().length()<2)) pcbusqueda.setText(pcbusqueda.getText().substring(0,2));
                }
            }
        });
        
        hermanosbusqueda.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, 
            String newValue) {
                if (!newValue.matches("\\d*")) {
                    hermanosbusqueda.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
        
        lugarbusqueda.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, 
            String newValue) {
                if (!newValue.matches("\\d*")) {
                    lugarbusqueda.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
        
       adultosbusqueda.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, 
            String newValue) {
                if (!newValue.matches("\\d*")) {
                   adultosbusqueda.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
        
        niniosbusqueda.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, 
            String newValue) {
                if (!newValue.matches("\\d*")) {
                    niniosbusqueda.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
        
        gtiempobusqueda.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, 
            String newValue) {
                if (!newValue.matches("\\d*")) {
                    gtiempobusqueda.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
        
        gasistenciabusqueda.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, 
            String newValue) {
                if (!newValue.matches("\\d*")) {
                    gasistenciabusqueda.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
        ptiempobusqueda.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, 
            String newValue) {
                if (!newValue.matches("\\d*")) {
                    ptiempobusqueda.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
        
        pasistenciabusqueda.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, 
            String newValue) {
                if (!newValue.matches("\\d*")) {
                    pasistenciabusqueda.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
        
        pesobusqueda1.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, 
            String newValue) {
                if (!newValue.matches("[0-9]?(\\.[0-9]{0,2})?")) {
                    pesobusqueda1.setText(oldValue);
                }
            }
        });
        pesobusqueda2.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, 
            String newValue) {
                if (!newValue.matches("[0-9]?(\\.[0-9]{0,2})?")) {
                    pesobusqueda2.setText(oldValue);
                }
            }
        });
        
        btnbuscar1.setOnKeyPressed(new EventHandler<KeyEvent>()
    {
        @Override
        public void handle(KeyEvent ke)
        {
            if (ke.getCode().equals(KeyCode.ENTER))
            {
                try {
                    buscarBebes(null);
                } catch (IOException ex) {
                    Logger.getLogger(InicioSesionController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(InicioSesionController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    });
        btnbuscar2.setOnKeyPressed(new EventHandler<KeyEvent>()
    {
        @Override
        public void handle(KeyEvent ke)
        {
            if (ke.getCode().equals(KeyCode.ENTER))
            {
                try {
                    buscarSocioeconomico(null);
                } catch (IOException ex) {
                    Logger.getLogger(InicioSesionController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(InicioSesionController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    });
        
       btnbuscar3.setOnKeyPressed(new EventHandler<KeyEvent>()
    {
        @Override
        public void handle(KeyEvent ke)
        {
            if (ke.getCode().equals(KeyCode.ENTER))
            {
                try {
                    buscarPorUsuario(null);
                } catch (IOException ex) {
                    Logger.getLogger(InicioSesionController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(InicioSesionController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    });
       btnbuscar4.setOnKeyPressed(new EventHandler<KeyEvent>()
    {
        @Override
        public void handle(KeyEvent ke)
        {
            if (ke.getCode().equals(KeyCode.ENTER))
            {
                try {
                    buscarSociodemografico(null);
                } catch (IOException ex) {
                    Logger.getLogger(InicioSesionController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(InicioSesionController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    });
       btnbuscar5.setOnKeyPressed(new EventHandler<KeyEvent>()
    {
        @Override
        public void handle(KeyEvent ke)
        {
            if (ke.getCode().equals(KeyCode.ENTER))
            {
                try {
                    buscarPrueba(null);
                } catch (IOException ex) {
                    Logger.getLogger(InicioSesionController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(InicioSesionController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    });
       
    }

    
    @FXML
    private void guarderiaChecked(ActionEvent event){
        boolean checked = guarderiasi.isSelected();
        if(checked==true){
            gtiempobusqueda.setDisable(false);
            gasistenciabusqueda.setDisable(false);
        } else {
            gtiempobusqueda.setDisable(true);
            gasistenciabusqueda.setDisable(true);
        }
    }
    
    @FXML
    private void preescolarChecked(ActionEvent event){
        boolean checked = preescolarsi.isSelected();
        if(checked==true){
            ptiempobusqueda.setDisable(false);
            pasistenciabusqueda.setDisable(false);
        } else {
            ptiempobusqueda.setDisable(true);
            pasistenciabusqueda.setDisable(true);
        }
    }

    @FXML
    private LinkedList<Integer> buscarSociodemografico(ActionEvent event) throws SQLException, IOException {
        LinkedList<Integer> ids = new LinkedList<>();
        LinkedList<SociodemograficoModelo> resultados = new LinkedList<>(); 
        
        SociodemograficoModelo sdm = new SociodemograficoModelo();
        
        double pesonacermin = isEmpty(pesobusqueda1)?-1:Double.parseDouble(pesobusqueda1.getText());
        double pesonacermax = isEmpty(pesobusqueda2)?-1:Double.parseDouble(pesobusqueda2.getText());
        
        int gest = -1;
        int probnac = -1;
        int probsalud = -1;
        int probaud = -1;
        int probvis = -1;
        int idioma = -1;
        
        if(aterminobusqueda.isSelected()){
            gest = 0;
        } else if(prematurobusqueda.isSelected()){
            gest = 1;
        }
        if(pnacerno.isSelected()){
            probnac = 0;
        } else if(pnacersi.isSelected()){
            probnac = 1;
        }
        if(psaludno.isSelected()){
            probsalud = 0;
        } else if(psaludsi.isSelected()){
            probsalud = 1;
        }
        if(paudicionno.isSelected()){
            probaud = 0;
        } else if(paudicionsi.isSelected()){
            probaud = 1;
        }
        if(pvisionno.isSelected()){
            probvis = 0;
        } else if(pvisionsi.isSelected()){
            probvis = 1;
        }
        if(otroidiomano.isSelected()){
            idioma = 0;
        } else if(otroidiomasi.isSelected()){
            idioma = 1;
        }
        
        int g = -1;
        int p = -1;
        
        if(guarderiasi.isSelected()){
            g=1;
        } else if(guarderiano.isSelected()){
            g=0;
        }
        if(preescolarsi.isSelected()){
            p=1;
        } else if(preescolarno.isSelected()){
            p=0;
        }
        
        int tag = isEmpty(gtiempobusqueda) ? -1 : Integer.parseInt(gtiempobusqueda.getText());
        int tqag = isEmpty(gasistenciabusqueda) ? -1 : Integer.parseInt(gasistenciabusqueda.getText());
        int tap = isEmpty(ptiempobusqueda) ? -1 : Integer.parseInt(ptiempobusqueda.getText());
        int tqap = isEmpty(pasistenciabusqueda) ? -1 : Integer.parseInt(pasistenciabusqueda.getText());
        
        //try{    
            int pta1 = apgar1busqueda.getValue()==null?-1:apgar1busqueda.getValue();
            int pta2 = apgar2busqueda.getValue()==null?-1:apgar2busqueda.getValue();
            String cuid = cuidadorbusqueda.getValue()==null?"":cuidadorbusqueda.getValue();
            int herm = isEmpty(hermanosbusqueda) ? -1 : Integer.parseInt(hermanosbusqueda.getText());
            int locu = isEmpty(lugarbusqueda) ? -1 : Integer.parseInt(lugarbusqueda.getText());
            int adultos = isEmpty(adultosbusqueda) ? -1 : Integer.parseInt(adultosbusqueda.getText());
            int ninios = isEmpty(niniosbusqueda) ? -1 : Integer.parseInt(niniosbusqueda.getText());
            resultados = sdm.readSociodemografico(-1, "", gest, -1, pta1, pta2, pesonacermin, pesonacermax,
                    probnac, probsalud, probaud, probvis, idioma, herm, locu, adultos, ninios,
                    cuid, g, tag, tqag, p, tap, tqap, "", -1);
        //} catch(Exception e){
        //}
        
        for(SociodemograficoModelo b:resultados){
                ids.add(b.getFkBebeSociodemografico());
            }
        if(abrir)abrirResultado(ids);
        return ids;
    }
    
    private boolean isEmpty(TextField textfield){
        return StringUtils.isEmptyOrWhitespaceOnly(textfield.getText());
    }

    @FXML
    private LinkedList<Integer> buscarPrueba(ActionEvent event) throws SQLException, IOException {
        LinkedList<Integer> ids = new LinkedList<>();
        
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        String query = "";
        String ec = "SELECT experimentocabina.fkBebe FROM babywizard.experimentocabina";
        String lc = "SELECT lecturaconjunta.fkBebe FROM babywizard.lecturaconjunta";
        String w30 = "SELECT wppsi303642.fkBebe FROM babywizard.wppsi303642";
        String w48 = "SELECT wppsi48.fkBebe FROM babywizard.wppsi48";
        
        int intcounter = 0;
       
        boolean primero = false;
        intcounter = (lecturaconjunta.isSelected()) ? ++intcounter : intcounter;
        intcounter = (wppsi303642.isSelected()) ? ++intcounter : intcounter;
        intcounter = (wppsi48.isSelected()) ? ++intcounter : intcounter;
        intcounter = (experimentocabina.isSelected()) ? ++intcounter : intcounter;
        int parentesises = intcounter;
        if(lecturaconjunta.isSelected()){
            if(intcounter>1) {
                query = lc+" where lecturaconjunta.fkBebe IN (";
                primero = true;
                intcounter--;
            } else {
                query = lc;
                primero = true;
                intcounter--;
            }
        }
        if(experimentocabina.isSelected()){
            if(primero == false){
                if(intcounter>1) {
                    query = ec+" where experimentocabina.fkBebe IN (";
                    primero = true;
                    intcounter--;
                } else {
                    query = ec;
                    primero = true;
                    intcounter--;
                }
            } else {
                if(intcounter>1) {
                    query += ec+" where experimentocabina.fkBebe IN (";
                    primero = true;
                    intcounter--;
                } else {
                    query += ec;
                    primero = true;
                    intcounter--;
                }
            }
        }
        if(wppsi303642.isSelected()){
            if(primero == false){
                if(intcounter>1) {
                    query = w30+" where wppsi303642.fkBebe IN (";
                    primero = true;
                    intcounter--;
                } else {
                    query = w30;
                    primero = true;
                    intcounter--;
                }
            } else {
                if(intcounter>1) {
                    query += w30+" where wppsi303642.fkBebe IN (";
                    primero = true;
                    intcounter--;
                } else {
                    query += w30;
                    primero = true;
                    intcounter--;
                }
            }
        }
        if(wppsi48.isSelected()){
            if(primero == false){
                if(intcounter>1) {
                    query = w48+" where wppsi48.fkBebe IN (";
                    primero = true;
                    intcounter--;
                } else {
                    query = w48;
                    primero = true;
                    intcounter--;
                }
            } else {
                if(intcounter>1) {
                    query += w48+" where wppsi48.fkBebe IN (";
                    primero = true;
                    intcounter--;
                } else {
                    query += w48;
                    primero = true;
                    intcounter--;
                }
            }
        }
        for(int i = 0; i<parentesises-1;i++){
            query+=")";
        }
        Statement stmt = con.createStatement();
        ResultSet rs;
        if(parentesises>0){
            rs = stmt.executeQuery(query);
        } else{
            rs = stmt.executeQuery("select idBebe from babywizard.bebe");
        }
        while(rs.next()){
            ids.add(rs.getInt(1));
        }
        if(abrir)abrirResultado(ids);
        return ids;
    }

    @FXML
    private LinkedList<Integer> buscarBebes(ActionEvent event) throws SQLException, IOException {
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
            
            
            LinkedList<Integer> ids = new LinkedList<>();
            for(BebeModelo b:resultados){
                ids.add(b.getIdBebe());
            }
            
            
            if(abrir)abrirResultado(ids);
            
            return ids;
    }

    @FXML
    private LinkedList<Integer> buscarSocioeconomico(ActionEvent event) throws SQLException, IOException {
        LinkedList<Integer> ids = new LinkedList<>();
        LinkedList<Integer> idst = new LinkedList<>();
        
        SocioeconomicoModelo sem = new SocioeconomicoModelo();
        int pc = -1;
        ResultSet rs;
        
        if(pcbusqueda.getText().matches("\\d+")) pc = Integer.parseInt(pcbusqueda.getText());
        String n = "";
        if(!(nse.getValue()==null)) n = nse.getValue().replaceAll("\\\\", "");
        LinkedList<SocioeconomicoModelo> resultados = sem.readSocioeconomico(-1, pc, n, -1);    
        for(SocioeconomicoModelo s:resultados){
            ids.add(s.getFkSociodemografico());
        }
        
        SociodemograficoModelo sdm = new SociodemograficoModelo();
        
        for(int i=0; i<resultados.size();i++){  
        idst.add(sdm.readSociodemografico(ids.get(i), "", -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, "", -1, -1, -1, -1, -1, -1, "", -1).get(0).getFkBebeSociodemografico());
        }
        if(abrir)abrirResultado(idst);
        return idst;
    }

    @FXML
    private LinkedList<Integer> buscarPorUsuario(ActionEvent event) throws SQLException, IOException {
        LinkedList<Integer> ids = new LinkedList<>();
        LinkedList<BebeModelo> bbs;
        BebeModelo bm = new BebeModelo();
        String us = usuariobusqueda.getText();
        if(us.equals("")){
            bbs = bm.readBebe(-1, "", "", "", -1, "", -1, -1, "");
        } else {
            bbs = bm.readBebe(-1, "", "", "", -1, "", -1, -1, us);
        }
        
        bbs.forEach((bb) -> {
            ids.add(bb.getIdBebe());
        });
        if(abrir)abrirResultado(ids);
        return ids;
    }
    
    public void abrirResultado(LinkedList<Integer> ids) throws IOException, SQLException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/babywizardjavafx/vista/Resultado.fxml"));
        Parent loadCuidador = (Parent) loader.load();
        JMetro jmetro = new JMetro(Style.LIGHT);
        jmetro.setParent(loadCuidador);
        Scene CuidadorScene = new Scene(loadCuidador);
        ResultadoController rc = loader.getController();
        Instant iniciobusquedadeids = Instant.now();
        rc.meterIds(ids);
        Stage mainWindow = (Stage) idbebebusqueda.getScene().getWindow();
        mainWindow.setScene(CuidadorScene);
        mainWindow.show();  
    }

    @FXML
    private LinkedList<Integer> buscarCompleto(ActionEvent event) throws SQLException, IOException {
        //Instant start = Instant.now();
        LinkedList<Integer> ids = new LinkedList<>();
        abrir = false;
        ids = intersection(intersection(intersection(intersection(buscarBebes(null),buscarPorUsuario(null)),buscarPrueba(null)),buscarSociodemografico(null)),buscarSocioeconomico(null));
        //Instant busquedatodosids = Instant.now();
        //long busquedaids = Duration.between(start, busquedatodosids).toMillis();
        //System.out.println(busquedaids);
        abrir=true;
        //Instant abririnicio = Instant.now();
        abrirResultado(ids);
        //Instant abrirfinal = Instant.now();
        //long abrirtodo = Duration.between(abririnicio, abrirfinal).toMillis();
        
        //System.out.println(abrirtodo);
        return ids;
    }
    
    private LinkedList<Integer> intersection(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        for(int i = list2.size() - 1; i > -1; --i){
            Integer entero = list2.get(i);
            if(!list1.remove(entero)) list2.remove(entero);
        }
        return list2;
    }
}
