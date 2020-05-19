/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx.controlador;

import babywizardjavafx.modelo.Wppsi303642Modelo;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import jfxtras.styles.jmetro.JMetro;
import jfxtras.styles.jmetro.Style;

/**
 * FXML Controller class
 *
 * @author Vicaris
 */
public class Wppsi303642Controller implements Initializable {
    
    int idbebe;
    @FXML
    private TextField vrn;
    @FXML
    private TextField dcn;
    @FXML
    private TextField inn;
    @FXML
    private TextField rcn;
    @FXML
    private TextField dnn;
    @FXML
    private Button calcular;
    @FXML
    private CheckBox sust;
    @FXML
    private Label vre;
    @FXML
    private Label dce;
    @FXML
    private Label ine;
    @FXML
    private Label rce;
    @FXML
    private Label dne;
    @FXML
    private DatePicker fechaaplic;
    @FXML
    private Label sumaciv;
    @FXML
    private Label sumacie;
    @FXML
    private Label sumacit;
    @FXML
    private Label sumacgl;
    @FXML
    private Label compciv;
    @FXML
    private Label compcie;
    @FXML
    private Label compcit;
    @FXML
    private Label compcgl;
    @FXML
    private Label rpciv;
    @FXML
    private Label rpcie;
    @FXML
    private Label rpcit;
    @FXML
    private Label rpcgl;
    @FXML
    private Label ic1civ;
    @FXML
    private Label ic1cie;
    @FXML
    private Label ic1cit;
    @FXML
    private Label ic1cgl;
    @FXML
    private Label ic2civ;
    @FXML
    private Label ic2cie;
    @FXML
    private Label ic2cit;
    @FXML
    private Label ic2cgl;
    @FXML
    private Button agregar;
    @FXML
    private GridPane grid;
    
    Wppsi303642Modelo wm;
    
    boolean creable;
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        agregar.setOnKeyPressed(new EventHandler<KeyEvent>()
    {
        @Override
        public void handle(KeyEvent ke)
        {
            if (ke.getCode().equals(KeyCode.ENTER))
            {
                try {
                    agregar(null);
                } catch (IOException ex) {
                    Logger.getLogger(InicioSesionController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(InicioSesionController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    });
        creable = false;
    }
    
    //Estas son las funciones que pasan las puntuaciones naturales a puntuaciones escalares usando las tablas
    public int[] naturalesAEscalares2628(int vrn, int dcn,int in,int rn, int dn){
        int[] ptsEsc = new int[5];
        int[] convVR = {2,3,4,5,6,6,7,7,8,8,9,9,9,10,10,11,11,11,12,12,13,13,13,14,14,15,15,16,16,17,17,18,18,19,19,19,19,19,19};
        int[] convDC = {3,4,5,6,7,7,8,8,9,9,10,10,10,11,11,12,13,13,14,14,15,16,17,18,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19};
        int[] convI = {1,3,4,5,6,6,7,8,8,9,9,10,10,11,12,12,13,13,14,14,15,15,16,16,17,18,18,19,19,19,19,19,19,19,19};
        int[] convR = {5,7,8,9,9,10,10,11,11,12,12,13,13,13,14,14,14,15,15,15,16,16,16,17,17,17,18,18,18,19,19,19,19,19,19,19,19,19};
        int[] convD = {3,5,6,6,7,8,8,9,9,10,11,11,12,12,13,13,14,14,15,15,16,16,17,17,18,18,19,19,19,19,19};
        if(vrn>=0) ptsEsc[0] = convVR[vrn];
        if(dcn>=0) ptsEsc[1] = convDC[dcn];
        if(in>=0) ptsEsc[2] = convI[in];
        if(rn>=0) ptsEsc[3] = convR[rn];
        if(dn>=0) ptsEsc[4] = convD[dn];
        return ptsEsc;
    }
    
    public int[] naturalesAEscalares29211(int vrn, int dcn,int in,int rn, int dn){
        int[] ptsEsc = new int[5];
        int[] convVR = {1,3,4,5,5,6,6,7,7,7,8,8,9,9,10,10,11,11,11,12,12,13,13,13,14,14,15,15,16,16,17,17,18,18,19,19,19,19,19};
        int[] convDC = {2,4,5,6,6,7,7,8,8,9,9,10,10,10,11,11,12,12,13,14,14,15,16,17,18,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19};
        int[] convI = {1,2,3,4,5,5,6,7,7,8,8,9,10,10,11,11,12,12,13,14,14,15,15,16,16,17,18,18,19,19,19,19,19,19,19};
        int[] convR = {4,6,7,8,9,9,10,10,11,11,12,12,12,13,13,13,14,14,14,15,15,15,16,16,16,17,17,17,18,18,18,19,19,19,19,19,19,19};
        int[] convD = {3,4,5,5,6,7,7,8,9,9,10,10,11,12,12,13,13,14,14,15,16,16,17,17,18,18,19,19,19,19,19};
        if(vrn>=0) ptsEsc[0] = convVR[vrn];
        if(dcn>=0) ptsEsc[1] = convDC[dcn];
        if(in>=0) ptsEsc[2] = convI[in];
        if(rn>=0) ptsEsc[3] = convR[rn];
        if(dn>=0) ptsEsc[4] = convD[dn];
        return ptsEsc;
    }
    
    public int[] naturalesAEscalares3032(int vrn, int dcn,int in,int rn, int dn){
        int[] ptsEsc = new int[5];
        int[] convVR = {1,2,3,4,5,5,6,6,6,7,7,8,8,9,9,9,10,10,11,11,12,12,13,13,13,14,14,15,15,16,16,17,17,18,18,19,19,19,19};
        int[] convDC = {2,3,4,5,6,6,7,7,8,8,9,9,10,10,10,11,11,12,12,13,14,14,15,16,17,18,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19};
        int[] convI = {1,2,3,3,4,4,5,6,6,7,7,8,9,9,10,11,11,12,12,13,14,14,15,15,16,17,17,18,18,19,19,19,19,19,19};
        int[] convR = {3,5,6,7,8,8,9,9,10,10,11,11,12,12,12,13,13,13,14,14,14,15,15,15,16,16,16,17,17,17,18,18,18,19,19,19,19,19};
        int[] convD = {2,3,4,4,5,6,6,7,8,8,9,9,10,11,11,12,13,13,14,14,15,16,16,17,17,18,18,19,19,19,19};
        if(vrn>=0) ptsEsc[0] = convVR[vrn];
        if(dcn>=0) ptsEsc[1] = convDC[dcn];
        if(in>=0) ptsEsc[2] = convI[in];
        if(rn>=0) ptsEsc[3] = convR[rn];
        if(dn>=0) ptsEsc[4] = convD[dn];
        return ptsEsc;
    }
    
    public int[] naturalesAEscalares3335(int vrn, int dcn,int in,int rn, int dn){
        int[] ptsEsc = new int[5];
        int[] convVR = {1,2,3,4,4,5,5,5,6,6,7,7,8,8,8,9,9,10,10,11,11,12,12,12,13,13,14,14,15,15,16,16,17,17,18,18,19,19,19};
        int[] convDC = {1,3,4,5,5,6,6,7,7,8,8,9,9,9,10,10,11,11,12,12,13,14,14,15,16,17,18,19,19,19,19,19,19,19,19,19,19,19,19,19,19};
        int[] convI = {1,1,2,2,3,4,4,5,5,6,7,7,8,8,9,10,10,11,12,12,13,13,14,15,15,16,17,17,18,19,19,19,19,19,19};
        int[] convR = {2,4,5,6,7,7,8,8,9,9,10,10,11,11,11,12,12,12,13,13,13,14,14,14,15,15,15,16,16,16,17,17,18,18,19,19,19,19};
        int[] convD = {1,2,3,4,4,5,5,6,7,7,8,9,9,10,11,11,12,13,13,14,14,15,16,16,17,18,18,19,19,19,19};
        if(vrn>=0) ptsEsc[0] = convVR[vrn];
        if(dcn>=0) ptsEsc[1] = convDC[dcn];
        if(in>=0) ptsEsc[2] = convI[in];
        if(rn>=0) ptsEsc[3] = convR[rn];
        if(dn>=0) ptsEsc[4] = convD[dn];
        return ptsEsc;
    }
    
    public int[] naturalesAEscalares3638(int vrn, int dcn,int in,int rn, int dn){
        int[] ptsEsc = new int[5];
        int[] convVR = {1,2,3,3,4,4,4,5,5,6,6,6,7,7,8,8,9,9,9,10,10,11,11,12,12,13,13,14,14,15,15,16,17,17,18,18,19,19,19};
        int[] convDC = {1,2,3,4,4,5,5,6,6,7,7,8,8,9,9,9,10,10,11,11,12,13,13,14,15,16,17,18,19,19,19,19,19,19,19,19,19,19,19,19,19};
        int[] convI = {1,1,1,2,2,3,3,4,5,5,6,6,7,8,8,9,9,10,11,11,12,13,13,14,15,16,17,17,18,18,19,19,19,19,19};
        int[] convR = {2,4,5,6,6,7,7,8,8,9,9,10,10,10,10,11,11,11,12,12,12,13,13,13,14,14,14,15,15,16,16,16,17,17,18,18,19,19};
        int[] convD = {1,2,2,3,3,4,5,5,6,7,7,8,9,9,10,10,11,12,12,13,14,15,15,16,17,17,18,18,19,19,19};
        if(vrn>=0) ptsEsc[0] = convVR[vrn];
        if(dcn>=0) ptsEsc[1] = convDC[dcn];
        if(in>=0) ptsEsc[2] = convI[in];
        if(rn>=0) ptsEsc[3] = convR[rn];
        if(dn>=0) ptsEsc[4] = convD[dn];
        return ptsEsc;
    }
    
    public int[] naturalesAEscalares39311(int vrn, int dcn,int in,int rn, int dn){
        int[] ptsEsc = new int[5];
        int[] convVR = {1,1,2,2,3,3,4,4,5,5,5,6,6,7,7,7,8,8,9,9,10,10,10,11,11,12,12,13,14,14,15,15,16,17,18,18,19,19,19};
        int[] convDC = {1,2,3,3,4,4,5,5,6,6,7,7,7,8,8,9,9,10,10,11,11,12,12,13,14,15,16,17,18,19,19,19,19,19,19,19,19,19,19,19,19};
        int[] convI = {1,1,1,1,2,2,3,3,4,4,5,5,6,6,7,8,9,9,10,10,11,12,13,13,14,15,16,17,17,18,19,19,19,19,19};
        int[] convR = {1,3,4,5,6,6,7,7,8,8,9,9,9,10,10,10,10,11,11,11,11,12,12,12,13,13,13,14,14,15,15,16,16,17,17,18,18,19};
        int[] convD = {1,1,2,2,3,3,4,5,5,6,6,7,8,8,9,10,10,11,12,12,13,14,15,15,16,17,18,18,19,19,19};
        if(vrn>=0) ptsEsc[0] = convVR[vrn];
        if(dcn>=0) ptsEsc[1] = convDC[dcn];
        if(in>=0) ptsEsc[2] = convI[in];
        if(rn>=0) ptsEsc[3] = convR[rn];
        if(dn>=0) ptsEsc[4] = convD[dn];
        return ptsEsc;
    }
    
    public String[] equivalentesCIV(int sumaPtsEsc){
        String[] equivalentes = new String[4];
        String[][] civs = new String[37][4];
        
        int[] civ = {45,49,52,56,59,63,66,70,73,76,79,82,84,88,91,94,97,99,101,103,105,107,110,113,117,120,123,126,130,133,136,139,142,145,148,151,155};
        double[] rp = {0.1,0.1,0.1,0.2,0.3,1,1,2,4,5,8,12,14,21,27,34,42,47,53,58,63,68,75,81,87,91,94,96,98,99,99,99.5,99.7,99.9,99.9,99.9,99.9};
        int[] nc901= {43,46,49,53,56,60,62,66,69,72,74,77,79,83,86,88,91,93,95,97,99,100,103,106,110,113,115,118,122,125,127,130,133,136,139,141,145};
        int[] nc902= {55,59,61,65,68,72,74,78,81,84,87,89,91,95,98,100,103,105,107,109,111,113,115,118,122,125,127,130,134,137,140,142,145,148,151,154,157};
        int[] nc951= {42,45,48,52,55,58,61,65,68,70,73,76,78,82,84,87,90,92,94,96,97,99,102,105,109,111,114,117,121,123,126,129,132,135,137,140,144};
        int[] nc952= {56,60,63,66,69,73,76,79,82,85,88,90,92,96,99,102,104,106,108,110,112,114,117,119,123,126,129,131,135,138,141,144,146,149,152,155,158};
        
        for(int i=0;i<2;i++){
            civs[i][0] = civ[i]+"";
            civs[i][1] = "<"+rp[i]+"";
            civs[i][2] = nc901[i]+"-"+nc902[i];
            civs[i][3] = nc951[i]+"-"+nc952[i];
        }
        for(int i=2;i<=civ.length-3;i++){
            civs[i][0] = civ[i]+"";
            civs[i][1] = rp[i]+"";
            civs[i][2] = nc901[i]+"-"+nc902[i];
            civs[i][3] = nc951[i]+"-"+nc952[i];
        }
        for(int i=civ.length-2;i<civ.length;i++){
            civs[i][0] = civ[i]+"";
            civs[i][1] = ">"+rp[i]+"";
            civs[i][2] = nc901[i]+"-"+nc902[i];
            civs[i][3] = nc951[i]+"-"+nc952[i];
        }
        
        int x = sumaPtsEsc-2;
        equivalentes = civs[x];
        return equivalentes;
    }
    
    public String[] equivalentesCIE(int sumaPtsEsc){
        String[] equivalentes = new String[4];
        String[][] cies = new String[37][4];
        
        int[] cie = {45,49,52,56,59,63,66,69,72,75,78,81,84,86,89,92,95,98,101,104,107,110,113,116,119,121,124,127,130,133,136,140,143,146,149,152,155};
        double[] rp = {0.1,0.1,0.1,0.2,0.3,1,1,2,3,5,7,10,14,18,23,30,37,45,53,61,68,75,81,88,90,92,95,96,98,99,99,99.6,99.8,99.9,99.9,99.9,99.9};
        int[] nc901= {43,47,50,53,56,60,62,65,68,70,73,76,79,80,83,86,88,91,94,97,99,102,105,107,110,112,115,117,120,123,125,129,132,134,137,140,142};
        int[] nc902= {58,61,64,67,70,74,76,79,82,85,87,90,93,94,97,100,103,105,108,111,113,116,119,121,124,126,129,131,134,137,139,143,146,148,151,154,157};
        int[] nc951= {42,46,48,52,55,58,61,64,66,69,72,75,77,79,82,84,87,90,93,95,98,101,103,106,109,111,113,116,119,121,124,128,130,133,136,138,141};
        int[] nc952= {59,62,65,69,71,75,78,80,83,86,89,91,94,96,98,101,104,107,109,112,115,117,120,123,125,127,130,133,135,138,141,144,147,150,152,155,158};
        
        for(int i=0;i<2;i++){
            cies[i][0] = cie[i]+"";
            cies[i][1] = "<"+rp[i]+"";
            cies[i][2] = nc901[i]+"-"+nc902[i];
            cies[i][3] = nc951[i]+"-"+nc952[i];
        }
        for(int i=2;i<=cie.length-3;i++){
            cies[i][0] = cie[i]+"";
            cies[i][1] = rp[i]+"";
            cies[i][2] = nc901[i]+"-"+nc902[i];
            cies[i][3] = nc951[i]+"-"+nc952[i];
        }
        for(int i=cie.length-2;i<cie.length;i++){
            cies[i][0] = cie[i]+"";
            cies[i][1] = ">"+rp[i]+"";
            cies[i][2] = nc901[i]+"-"+nc902[i];
            cies[i][3] = nc951[i]+"-"+nc952[i];
        }
        
        int x = sumaPtsEsc-2;
        equivalentes = cies[x];
        
        return equivalentes;
    }
    
    public String[] equivalentesCIT(int sumaPtsEsc){
        String[] equivalentes = new String[4];
        String[][] cits = new String[73][4];
        
        int[] cit = {40,41,43,45,47,49,51,53,55,57,59,60,62,63,65,66,68,69,71,73,75,76,78,80,82,83,85,86,88,89,91,93,95,97,99,100,101,103,104,106,107,109,110,112,113,115,117,118,120,122,124,126,128,130,132,134,135,137,138,140,141,143,144,146,147,149,150,152,153,155,156,158,160};
        double[] rp = {0.1,0.1,0.1,0.1,0.1,0.1,0.1,0.1,0.1,0.2,0.3,0.4,1,1,1,1,2,2,3,4,5,5,7,9,12,13,16,18,21,23,27,32,37,42,47,50,53,58,61,66,68,73,75,79,81,84,87,88,91,93,95,96,97,98,98,99,99,99,99,99.6,99.7,99.8,99.8,99.9,99.9,99.9,99.9,99.9,99.9,99.9,99.9,99.9,99.9};
        int[] nc901= {38,39,41,43,44,46,48,50,52,54,56,57,59,60,61,62,64,65,67,69,71,72,74,76,77,78,80,81,83,84,86,88,90,91,93,94,95,97,98,100,101,103,104,106,107,108,110,111,113,115,117,119,121,123, 124,126,127,129,130,132,133,135,136,138,138,140,141,143,144,146,147,149,151};
        int[] nc902= {49,50,52,54,56,58,60,62,63,65,67,68,70,71,73,74,76,77,78,80,82,83,85,87,89,90,92,93,94,95,97,99,101,103,105,106,107,109,109,111,112,114,115,117,118,120,122,123,124,126,128,130,132,134,136,138,139,140,141,143,144,146,147,149,150,152,153,155,156,157,158,160,162};
        int[] nc951= {37,38,40,42,43,45,47,49,51,53,55,56,58,58,60,61,63,64,66,68,70,71,73,74,76,77,79,80,82,83,84,86,88,90,92,93,94,96,97,99,100,102,103,105,105,107,109,110,112,114,116,118,120,121,123,125,126,128,129,131,132,134,135,136,137,139,140,142,143,145,146,148,150};
        int[] nc952= {50,51,53,55,57,59,61,63,64,66,68,69,71,72,74,75,77,78,80,81,83,84,86,88,90,91,93,94,95,96,98,100,102,104,106,107,108,110,111,112,113,115,116,118,119,121,123,124,126,127,129,131,133,135,137,139,140,142,142,144,145,147,148,150,151,153,154,156,157,158,159,161,163};
        
        for(int i=0;i<6;i++){
            cits[i][0] = cit[i]+"";
            cits[i][1] = "<"+rp[i]+"";
            cits[i][2] = nc901[i]+"-"+nc902[i];
            cits[i][3] = nc951[i]+"-"+nc952[i];
        }
        for(int i=2;i<=cit.length-8;i++){
            cits[i][0] = cit[i]+"";
            cits[i][1] = rp[i]+"";
            cits[i][2] = nc901[i]+"-"+nc902[i];
            cits[i][3] = nc951[i]+"-"+nc952[i];
        }
        for(int i=cit.length-7;i<cit.length;i++){
            cits[i][0] = cit[i]+"";
            cits[i][1] = ">"+rp[i]+"";
            cits[i][2] = nc901[i]+"-"+nc902[i];
            cits[i][3] = nc951[i]+"-"+nc952[i];
        }
        
        
        int x = sumaPtsEsc-4;
        equivalentes = cits[x];
        
        return equivalentes;
    }
    
    public String[] equivalentesCGL(int sumaPtsEsc){
        String[] equivalentes = new String[4];
        String[][] cies = new String[37][4];
        
        int[] cie = {45,49,52,56,60,63,66,69,72,75,78,81,84,87,89,92,95,97,100,102,105,108,111,114,117,120,123,126,129,132,135,138,141,144,147,151,155};
        double[] rp = {0.1,0.1,0.1,0.2,0.4,1,1,2,3,5,7,10,14,19,23,30,37,42,50,55,63,70,77,82,87,91,94,96,97,98,99,99,99.7,99.8,99.9,99.9,99.9};
        int[] nc901= {43,47,49,53,57,60,62,65,68,71,73,76,79,82,83,86,89,91,94,95,98,101,104,106,109,112,115,117,120,123,126,129,131,134,137,140,144};
        int[] nc902= {56,60,62,66,70,72,75,78,81,83,86,89,92,94,96,99,102,104,106,108,111,114,117,119,122,125,128,130,133,136,139,141,144,147,150,153,157};
        int[] nc951= {42,45,48,52,56,58,61,64,67,69,72,75,78,80,82,85,88,90,92,94,97,100,102,105,108,111,114,116,119,122,125,127,130,133,136,139,143};
        int[] nc952= {57,61,63,67,71,74,76,79,82,85,87,90,93,96,98,100,103,105,108,109,112,115,118,121,123,126,129,132,134,137,140,143,145,148,151,155,158};
        
        for(int i=0;i<2;i++){
            cies[i][0] = cie[i]+"";
            cies[i][1] = "<"+rp[i]+"";
            cies[i][2] = nc901[i]+"-"+nc902[i];
            cies[i][3] = nc951[i]+"-"+nc952[i];
        }
        for(int i=2;i<=cie.length-3;i++){
            cies[i][0] = cie[i]+"";
            cies[i][1] = rp[i]+"";
            cies[i][2] = nc901[i]+"-"+nc902[i];
            cies[i][3] = nc951[i]+"-"+nc952[i];
        }
        for(int i=cie.length-2;i<cie.length;i++){
            cies[i][0] = cie[i]+"";
            cies[i][1] = ">"+rp[i]+"";
            cies[i][2] = nc901[i]+"-"+nc902[i];
            cies[i][3] = nc951[i]+"-"+nc952[i];
        }
        
        int x = sumaPtsEsc-2;
        equivalentes = cies[x];
        
        return equivalentes;
    }
    
    public void inicializarBebe(int idbebe){
        this.idbebe = idbebe;
    }

    @FXML
    private void calcular(ActionEvent event) throws SQLException {
        
        clear();
        wm = new Wppsi303642Modelo();
        int vr = (vrn.getText().equals(""))?-1:Integer.parseInt(vrn.getText());
        int dc = (dcn.getText().equals(""))?-1:Integer.parseInt(dcn.getText());
        int in = (inn.getText().equals(""))?-1:Integer.parseInt(inn.getText());
        int rc = (rcn.getText().equals(""))?-1:Integer.parseInt(rcn.getText());
        int dn = (dnn.getText().equals(""))?-1:Integer.parseInt(dnn.getText());
        
        try{
        String fechan = fechaaplic.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        wm.setFkBebe(idbebe);
        wm.setVocabularioReceptivoNatural(vr);
        wm.setDisenioCubosNatural(dc);
        wm.setInformacionNatural(in);
        wm.setRompecabezasNatural(rc);
        wm.setDenominacionesNatural(dn);
        wm.setFechaAplicacion(fechan);
        creable = wm.setEscalares();
        
        int[] sumas = wm.setEquivalentes(sust.isSelected());
        vre.setText(wm.getVocabularioReceptivoEscalar()+"");
        dce.setText(wm.getDisenioCubosEscalar()+"");
        ine.setText(wm.getInformacionEscalar()+"");
        rce.setText(wm.getRompecabezasEscalar()+"");
        dne.setText(wm.getDenominacionesEscalar()+"");
        sumaciv.setText(sumas[0]+"");
        sumacie.setText(sumas[1]+"");
        sumacit.setText(sumas[2]+"");
        sumacgl.setText(sumas[3]+"");
        compciv.setText(wm.getEquivciv()[0]);
        rpciv.setText(wm.getEquivciv()[1]);
        ic1civ.setText(wm.getEquivciv()[2]);
        ic2civ.setText(wm.getEquivciv()[3]);
        compcie.setText(wm.getEquivcie()[0]);
        rpcie.setText(wm.getEquivcie()[1]);
        ic1cie.setText(wm.getEquivcie()[2]);
        ic2cie.setText(wm.getEquivcie()[3]);
        compcit.setText(wm.getEquivcit()[0]);
        rpcit.setText(wm.getEquivcit()[1]);
        ic1cit.setText(wm.getEquivcit()[2]);
        ic2cit.setText(wm.getEquivcit()[3]);
        compcgl.setText(wm.getEquivcgl()[0]);
        rpcgl.setText(wm.getEquivcgl()[1]);
        ic1cgl.setText(wm.getEquivcgl()[2]);
        ic2cgl.setText(wm.getEquivcgl()[3]);
       
        } catch (Exception e) {
            creable = false;
        }
        
    }

    @FXML
    private void agregar(ActionEvent event) throws SQLException, IOException {
        if(wm==null || creable ==false) return; //Poner mensaje si se quiere
        wm.createWppsi303642();
        Stage actualWindow = (Stage) grid.getScene().getWindow();
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/babywizardjavafx/vista/CreadoExitosamente.fxml"));
                    Parent root = (Parent) loader.load();
                    JMetro jmetro = new JMetro(Style.LIGHT);
                    jmetro.setParent(root);
                    CreadoExitosamenteController cec = loader.getController();
                    cec.queEsCreado("Infante Registrado Exitosamente.");
                    Scene exito = new Scene(root);
                    actualWindow.setScene(exito);
                    Image image = new Image("/babywizardjavafx/vista/imagenes/bwlogo.jpg");
                    actualWindow.getIcons().add(image);
                    actualWindow.setTitle("Exito");
                    actualWindow.show();
                    actualWindow.centerOnScreen();
    }

    private void clear() {
        vre.setText("");
        dce.setText("");
        ine.setText("");
        rce.setText("");
        dne.setText("");
        sumaciv.setText("0");
        sumacie.setText("0");
        sumacit.setText("0");
        sumacgl.setText("0");
        compciv.setText("");
        compcie.setText("");
        compcit.setText("");
        compcgl.setText("");
        rpciv.setText("");
        rpcie.setText("");
        rpcit.setText("");
        rpcgl.setText("");
        ic1civ.setText("");
        ic1cie.setText("");
        ic1cit.setText("");
        ic1cgl.setText("");
        ic2civ.setText("");
        ic2cie.setText("");
        ic2cit.setText("");
        ic2cgl.setText("");
    }

    
}
