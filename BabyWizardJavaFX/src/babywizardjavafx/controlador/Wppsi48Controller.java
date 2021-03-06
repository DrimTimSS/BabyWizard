/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx.controlador;

import babywizardjavafx.modelo.Wppsi48Modelo;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import jfxtras.styles.jmetro.JMetro;
import jfxtras.styles.jmetro.Style;

/**
 * FXML Controller class
 *
 * @author Vicaris
 */
public class Wppsi48Controller implements Initializable {
    
    int idbebe;
    @FXML
    private TextField dcn;
    @FXML
    private TextField inn;
    @FXML
    private TextField mtn;
    @FXML
    private TextField vcn;
    @FXML
    private TextField cpn;
    @FXML
    private TextField bsn;
    @FXML
    private TextField psn;
    @FXML
    private TextField cln;
    @FXML
    private TextField cmn;
    @FXML
    private TextField fin;
    @FXML
    private TextField sen;
    @FXML
    private TextField vrn;
    @FXML
    private TextField rcn;
    @FXML
    private TextField dnn;
    @FXML
    private Label dce;
    @FXML
    private Label ine;
    @FXML
    private Label mte;
    @FXML
    private Label vce;
    @FXML
    private Label cpe;
    @FXML
    private Label bse;
    @FXML
    private Label pse;
    @FXML
    private Label cle;
    @FXML
    private Label cme;
    @FXML
    private Label fie;
    @FXML
    private Label see;
    @FXML
    private Label vre;
    @FXML
    private Label rce;
    @FXML
    private Label dne;
    @FXML
    private CheckBox dcfi;
    @FXML
    private CheckBox dcrc;
    @FXML
    private CheckBox pscm;
    @FXML
    private CheckBox psse;
    @FXML
    private CheckBox clbs;
    @FXML
    private CheckBox mtfi;
    @FXML
    private CheckBox mtrc;
    @FXML
    private CheckBox incm;
    @FXML
    private CheckBox inse;
    @FXML
    private CheckBox vccm;
    @FXML
    private CheckBox vcse;
    @FXML
    private CheckBox cpfi;
    @FXML
    private CheckBox cprc;
    @FXML
    private DatePicker fechaaplic;
    @FXML
    private Label compciv;
    @FXML
    private Label compcie;
    @FXML
    private Label compcvp;
    @FXML
    private Label compcit;
    @FXML
    private Label compcgl;
    @FXML
    private Label rpciv;
    @FXML
    private Label rpcie;
    @FXML
    private Label rpcvp;
    @FXML
    private Label rpcit;
    @FXML
    private Label rpcgl;
    @FXML
    private Label ic1civ;
    @FXML
    private Label ic1cie;
    @FXML
    private Label ic1cvp;
    @FXML
    private Label ic1cit;
    @FXML
    private Label ic1cgl;
    @FXML
    private Label ic2civ;
    @FXML
    private Label ic2cie;
    @FXML
    private Label ic2cvp;
    @FXML
    private Label ic2cit;
    @FXML
    private Label ic2cgl;
    @FXML
    private Button calcular;
    @FXML
    private Button agregar;
    
    
    Wppsi48Modelo wm;
    @FXML
    private Label sumaciv;
    @FXML
    private Label sumacie;
    @FXML
    private Label sumacvp;
    @FXML
    private Label sumacit;
    @FXML
    private Label sumacgl;
    
    boolean creable;
    private int idBebeAtualizar;
    private boolean editable;
    private Wppsi48Modelo wppsi48AEditar;
    
    Alertas alerta;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        creable = false;
        
        dcn.textProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
            if (!newValue.matches("-?\\d*")) {
                dcn.setText(newValue.replaceAll("[^\\d-]", ""));
            }
        });
        inn.textProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
            if (!newValue.matches("-?\\d*")) {
                inn.setText(newValue.replaceAll("[^\\d-]", ""));
            }
        });
        mtn.textProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
            if (!newValue.matches("-?\\d*")) {
                mtn.setText(newValue.replaceAll("[^\\d-]", ""));
            }
        });
        vcn.textProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
            if (!newValue.matches("-?\\d*")) {
                vcn.setText(newValue.replaceAll("[^\\d-]", ""));
            }
        });
        cpn.textProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
            if (!newValue.matches("-?\\d*")) {
                cpn.setText(newValue.replaceAll("[^\\d-]", ""));
            }
        });
        bsn.textProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
            if (!newValue.matches("-?\\d*")) {
                bsn.setText(newValue.replaceAll("[^\\d-]", ""));
            }
        });
        psn.textProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
            if (!newValue.matches("-?\\d*")) {
                psn.setText(newValue.replaceAll("[^\\d-]", ""));
            }
        });
        cln.textProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
            if (!newValue.matches("-?\\d*")) {
                cln.setText(newValue.replaceAll("[^\\d-]", ""));
            }
        });
        cmn.textProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
            if (!newValue.matches("-?\\d*")) {
                cmn.setText(newValue.replaceAll("[^\\d-]", ""));
            }
        });
        fin.textProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
            if (!newValue.matches("-?\\d*")) {
                fin.setText(newValue.replaceAll("[^\\d-]", ""));
            }
        });
        sen.textProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
            if (!newValue.matches("-?\\d*")) {
                sen.setText(newValue.replaceAll("[^\\d-]", ""));
            }
        });
        vrn.textProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
            if (!newValue.matches("-?\\d*")) {
                vrn.setText(newValue.replaceAll("[^\\d-]", ""));
            }
        });
        rcn.textProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
            if (!newValue.matches("-?\\d*")) {
                rcn.setText(newValue.replaceAll("[^\\d-]", ""));
            }
        });
        dnn.textProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
            if (!newValue.matches("-?\\d*")) {
                dnn.setText(newValue.replaceAll("[^\\d-]", ""));
            }
        });
        
    }    
      
    public int[] naturalesAEscalares4042(int dc, int in, int mt,int vb, int cd, int bs, int ps, int cl, int cm, int fi, int se, int vr, int rc, int dn){
        int[] ptsEsc = new int[14];
        int[] conDC = {1, 2, 3, 3, 4, 4, 4, 5, 5, 6, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 14, 15, 16, 17, 18, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19};
        int[] conIN = {1, 1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 4, 5, 5, 6, 7, 8, 8, 9, 9, 10, 11, 12, 13, 14, 14, 15, 16, 17, 18, 18, 19, 19, 19, 19};
        int[] conMT = {2, 4, 5, 6, 7, 8, 9, 9, 10, 11, 11, 12, 13, 13, 14, 14, 15, 15, 16, 17, 17, 18, 18, 18, 19, 19, 19, 19, 19, 19};
        int[] conVB = {1, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 15, 16, 16, 17, 17, 17, 18, 18, 18, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19};
        int[] conCD = {3, 5, 6, 7, 8, 9, 9, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 17, 17, 18, 18, 19, 19, 19, 19, 19};
        int[] conBS = {5, 7, 8, 9, 10, 10, 10, 10, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 13, 13, 13, 14, 14, 14, 14, 15, 15, 15, 15, 15, 16, 16, 16, 16, 16, 16, 17, 17, 17, 17, 17, 17, 18, 18, 18, 18, 19, 19, 19, 19, 19};
        int[] conPS = {4, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 17, 17, 18, 19, 19, 19};
        int[] conCL = {4, 6, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 14, 14, 14, 14, 15, 15, 15, 15, 15, 15, 16, 16, 16, 16, 16, 16, 17, 17, 17, 17, 17, 17, 18, 18, 18, 18, 18, 19, 19, 19, 19, 19, 19};
        int[] conCM = {5, 7, 8, 8, 9, 9, 10, 10, 10, 11, 11, 11, 12, 12, 12, 13, 13, 13, 14, 14, 14, 15, 15, 16, 16, 16, 17, 17, 17, 17, 18, 18, 18, 19, 19, 19, 19, 19, 19};
        int[] conFI = {2, 4, 5, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 16, 17, 17, 18, 18, 19, 19, 19};
        int[] conSE = {6, 7, 7, 8, 8, 9, 9, 9, 10, 10, 10, 10, 10, 11, 11, 11, 12, 12, 12, 13, 13, 13, 13, 14, 14, 14, 15, 15, 15, 16, 16, 16, 16, 17, 17, 17, 18, 18, 18, 19, 19, 19, 19, 19, 19, 19, 19};
        int[] conVR = {1, 1, 1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 7, 7, 8, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 15, 15, 16, 17, 18, 19, 19, 19};
        int[] conRC = {1, 3, 4, 4, 5, 6, 6, 6, 7, 7, 8, 8, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 11, 12, 12, 12, 13, 13, 13, 14, 14, 15, 15, 16, 16, 17, 18, 19};
        int[] conDN = {1, 1, 1, 1, 2, 3, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9, 10, 10, 11, 12, 13, 13, 14, 15, 16, 16, 17, 18, 19, 19, 19};
        if(dc>=0) ptsEsc[0] = conDC[dc];
        if(in>=0) ptsEsc[1] = conIN[in];
        if(mt>=0) ptsEsc[2] = conMT[mt];
        if(vb>=0) ptsEsc[3] = conVB[vb];
        if(cd>=0) ptsEsc[4] = conCD[cd];
        if(bs>=0) ptsEsc[5] = conBS[bs];
        if(ps>=0) ptsEsc[6] = conPS[ps];
        if(cl>=0) ptsEsc[7] = conCL[cl];
        if(cm>=0) ptsEsc[8] = conCM[cm];
        if(fi>=0) ptsEsc[9] = conFI[fi];
        if(se>=0) ptsEsc[10] = conSE[se];
        if(vr>=0) ptsEsc[11] = conVR[vr];
        if(rc>=0) ptsEsc[12] = conRC[rc];
        if(dn>=0) ptsEsc[13] = conDN[dn];
        return ptsEsc;
    }
    
    public int[] naturalesAEscalares4345(int dc, int in, int mt,int vb, int cd, int bs, int ps, int cl, int cm, int fi, int se, int vr, int rc, int dn){
        int[] ptsEsc = new int[14];
        int[] conDC = {1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 14, 15, 16, 17, 18, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19};
        int[] conIN = {1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 4, 5, 5, 6, 7, 8, 8, 9, 9, 10, 11, 12, 13, 14, 15, 16, 17, 17, 18, 19, 19, 19, 19};
        int[] conMT = {1, 3, 4, 5, 6, 7, 8, 9, 9, 10, 11, 11, 12, 12, 13, 14, 14, 15, 15, 16, 16, 17, 17, 18, 18, 19, 19, 19, 19, 19};
        int[] conVB = {1, 2, 3, 4, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 13, 14, 14, 15, 15, 15, 16, 16, 17, 17, 18, 18, 18, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19};
        int[] conCD = {2, 4, 5, 6, 7, 8, 9, 9, 10, 10, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 17, 17, 18, 18, 19, 19, 19, 19};
        int[] conBS = {4, 6, 7, 8, 9, 9, 10, 10, 10, 10, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 13, 13, 13, 14, 14, 14, 14, 15, 15, 15, 15, 15, 16, 16, 16, 16, 16, 16, 17, 17, 17, 17, 17, 18, 18, 18, 18, 19, 19, 19, 19};
        int[] conPS = {3, 5, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 13, 14, 14, 15, 15, 16, 16, 17, 17, 18, 19, 19};
        int[] conCL = {3, 5, 6, 6, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 14, 14, 14, 14, 15, 15, 15, 15, 15, 15, 16, 16, 16, 16, 16, 17, 17, 17, 17, 17, 17, 18, 18, 18, 18, 18, 19, 19, 19, 19};
        int[] conCM = {4, 6, 7, 8, 8, 9, 9, 10, 10, 10, 11, 11, 11, 12, 12, 12, 13, 13, 13, 14, 14, 14, 15, 15, 16, 16, 16, 16, 17, 17, 17, 18, 18, 18, 19, 19, 19, 19, 19};
        int[] conFI = {1, 3, 4, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 14, 15, 15, 16, 16, 17, 17, 18, 18, 19, 19};
        int[] conSE = {5, 6, 7, 7, 8, 8, 9, 9, 9, 10, 10, 10, 10, 10, 11, 11, 11, 12, 12, 12, 12, 13, 13, 13, 13, 14, 14, 14, 15, 15, 15, 16, 16, 16, 17, 17, 17, 18, 18, 18, 19, 19, 19, 19, 19, 19, 19};
        int[] conVR = {1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 6, 6, 6, 7, 7, 8, 8, 9, 9, 9, 10, 10, 11, 11, 12, 13, 13, 14, 15, 16, 17, 18, 19, 19, 19};
        int[] conRC = {1, 2, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 11, 12, 12, 12, 13, 13, 13, 14, 14, 15, 16, 16, 17, 18};
        int[] conDN = {1, 1, 1, 1, 1, 2, 3, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9, 10, 10, 11, 12, 13, 13, 14, 15, 16, 17, 18, 18, 19, 19};
        if(dc>=0) ptsEsc[0] = conDC[dc];
        if(in>=0) ptsEsc[1] = conIN[in];
        if(mt>=0) ptsEsc[2] = conMT[mt];
        if(vb>=0) ptsEsc[3] = conVB[vb];
        if(cd>=0) ptsEsc[4] = conCD[cd];
        if(bs>=0) ptsEsc[5] = conBS[bs];
        if(ps>=0) ptsEsc[6] = conPS[ps];
        if(cl>=0) ptsEsc[7] = conCL[cl];
        if(cm>=0) ptsEsc[8] = conCM[cm];
        if(fi>=0) ptsEsc[9] = conFI[fi];
        if(se>=0) ptsEsc[10] = conSE[se];
        if(vr>=0) ptsEsc[11] = conVR[vr];
        if(rc>=0) ptsEsc[12] = conRC[rc];
        if(dn>=0) ptsEsc[13] = conDN[dn];
        return ptsEsc;
    }
    
    public int[] naturalesAEscalares4648(int dc, int in, int mt,int vb, int cd, int bs, int ps, int cl, int cm, int fi, int se, int vr, int rc, int dn){
        int[] ptsEsc = new int[14];
        int[] conDC = {1, 1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 10, 11, 11, 12, 13, 13, 14, 15, 16, 18, 19, 19, 19, 19, 19, 19, 19, 19, 19};
        int[] conIN = {1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 4, 5, 5, 6, 7, 8, 8, 9, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 19, 19, 19};
        int[] conMT = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 10, 11, 11, 12, 12, 13, 14, 14, 15, 15, 16, 16, 17, 17, 18, 18, 19, 19, 19, 19};
        int[] conVB = {1, 2, 2, 3, 4, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 13, 14, 14, 15, 15, 15, 16, 16, 17, 17, 17, 18, 18, 18, 19, 19, 19, 19, 19, 19, 19, 19};
        int[] conCD = {2, 4, 5, 6, 7, 7, 8, 9, 9, 10, 10, 11, 11, 12, 13, 13, 14, 14, 15, 15, 16, 16, 17, 17, 18, 18, 19, 19, 19};
        int[] conBS = {4, 6, 7, 8, 8, 9, 9, 9, 10, 10, 10, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 13, 13, 13, 13, 14, 14, 14, 15, 15, 15, 15, 15, 16, 16, 16, 16, 16, 16, 17, 17, 17, 17, 17, 18, 18, 18, 18, 19, 19, 19};
        int[] conPS = {3, 5, 5, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 17, 17, 18, 19, 19};
        int[] conCL = {2, 4, 5, 5, 6, 6, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 14, 14, 14, 14, 14, 15, 15, 15, 15, 15, 15, 16, 16, 16, 16, 16, 17, 17, 17, 17, 17, 18, 18, 18, 18, 19, 19, 19};
        int[] conCM = {3, 5, 6, 7, 8, 8, 9, 9, 10, 10, 10, 10, 11, 11, 11, 12, 12, 13, 13, 13, 14, 14, 14, 15, 15, 15, 16, 16, 16, 17, 17, 17, 18, 18, 18, 19, 19, 19, 19};
        int[] conFI = {1, 2, 3, 4, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 17, 17, 18, 18, 19};
        int[] conSE = {4, 5, 6, 7, 7, 8, 8, 9, 9, 9, 10, 10, 10, 10, 10, 10, 11, 11, 11, 12, 12, 12, 12, 13, 13, 13, 14, 14, 14, 14, 15, 15, 16, 16, 16, 17, 17, 17, 18, 18, 18, 19, 19, 19, 19, 19, 19};
        int[] conVR = {1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 6, 6, 7, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 14, 15, 16, 17, 18, 19, 19};
        int[] conRC = {1, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 11, 12, 12, 12, 13, 13, 14, 14, 15, 16, 17, 18};
        int[] conDN = {1, 1, 1, 1, 1, 1, 2, 3, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9, 10, 10, 11, 12, 13, 14, 14, 15, 16, 17, 18, 19, 19};
        if(dc>=0) ptsEsc[0] = conDC[dc];
        if(in>=0) ptsEsc[1] = conIN[in];
        if(mt>=0) ptsEsc[2] = conMT[mt];
        if(vb>=0) ptsEsc[3] = conVB[vb];
        if(cd>=0) ptsEsc[4] = conCD[cd];
        if(bs>=0) ptsEsc[5] = conBS[bs];
        if(ps>=0) ptsEsc[6] = conPS[ps];
        if(cl>=0) ptsEsc[7] = conCL[cl];
        if(cm>=0) ptsEsc[8] = conCM[cm];
        if(fi>=0) ptsEsc[9] = conFI[fi];
        if(se>=0) ptsEsc[10] = conSE[se];
        if(vr>=0) ptsEsc[11] = conVR[vr];
        if(rc>=0) ptsEsc[12] = conRC[rc];
        if(dn>=0) ptsEsc[13] = conDN[dn];
        return ptsEsc;
    }
    
    public int[] naturalesAEscalares49411(int dc, int in, int mt,int vb, int cd, int bs, int ps, int cl, int cm, int fi, int se, int vr, int rc, int dn){
        int[] ptsEsc = new int[14];
        int[] conDC = {1, 1, 1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 10, 11, 11, 12, 13, 13, 14, 15, 16, 18, 19, 19, 19, 19, 19, 19, 19, 19};
        int[] conIN = {1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 6, 7, 8, 8, 9, 10, 11, 11, 12, 13, 14, 15, 16, 17, 18, 19, 19, 19};
        int[] conMT = {1, 2, 3, 4, 5, 6, 7, 7, 8, 9, 9, 10, 10, 11, 12, 12, 13, 13, 14, 15, 15, 16, 16, 17, 17, 18, 19, 19, 19, 19};
        int[] conVB = {1, 2, 2, 3, 3, 4, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10, 10, 11, 11, 11, 12, 12, 13, 13, 14, 14, 14, 15, 15, 15, 16, 16, 17, 17, 18, 18, 18, 19, 19, 19, 19, 19, 19, 19};
        int[] conCD = {1, 3, 4, 5, 6, 7, 7, 8, 8, 9, 10, 10, 11, 11, 12, 12, 13, 14, 14, 15, 15, 16, 16, 17, 17, 18, 18, 19, 19};
        int[] conBS = {4, 5, 6, 7, 8, 8, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 13, 13, 13, 13, 14, 14, 14, 14, 15, 15, 15, 15, 16, 16, 16, 16, 16, 16, 17, 17, 17, 17, 18, 18, 18, 19, 19, 19};
        int[] conPS = {3, 4, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 16, 16, 17, 17, 18, 19, 19};
        int[] conCL = {1, 3, 4, 4, 5, 5, 6, 6, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 14, 14, 14, 14, 14, 15, 15, 15, 15, 15, 15, 15, 16, 16, 16, 16, 17, 17, 17, 17, 17, 18, 18, 18, 19, 19};
        int[] conCM = {3, 4, 5, 6, 7, 7, 8, 8, 9, 9, 10, 10, 10, 11, 11, 11, 12, 12, 12, 13, 13, 13, 14, 14, 15, 15, 15, 16, 16, 16, 17, 17, 17, 18, 18, 18, 19, 19, 19};
        int[] conFI = {1, 2, 3, 4, 4, 5, 6, 6, 7, 7, 7, 8, 8, 9, 9, 10, 11, 11, 12, 12, 12, 13, 13, 14, 14, 14, 15, 15, 16, 17, 17, 18, 19};
        int[] conSE = {3, 4, 5, 6, 6, 7, 7, 8, 8, 9, 9, 9, 10, 10, 10, 10, 10, 11, 11, 11, 11, 12, 12, 12, 12, 13, 13, 13, 14, 14, 14, 15, 15, 15, 16, 16, 17, 17, 17, 18, 18, 18, 19, 19, 19, 19, 19};
        int[] conVR = {1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 5, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 9, 10, 10, 11, 12, 12, 13, 14, 15, 16, 17, 18, 19};
        int[] conRC = {1, 2, 3, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 12, 12, 12, 13, 13, 14, 14, 15, 16, 17};
        int[] conDN = {1, 1, 1, 1, 1, 1, 1, 2, 3, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9, 10, 11, 11, 12, 13, 14, 15, 16, 17, 18, 19, 19};
        if(dc>=0) ptsEsc[0] = conDC[dc];
        if(in>=0) ptsEsc[1] = conIN[in];
        if(mt>=0) ptsEsc[2] = conMT[mt];
        if(vb>=0) ptsEsc[3] = conVB[vb];
        if(cd>=0) ptsEsc[4] = conCD[cd];
        if(bs>=0) ptsEsc[5] = conBS[bs];
        if(ps>=0) ptsEsc[6] = conPS[ps];
        if(cl>=0) ptsEsc[7] = conCL[cl];
        if(cm>=0) ptsEsc[8] = conCM[cm];
        if(fi>=0) ptsEsc[9] = conFI[fi];
        if(se>=0) ptsEsc[10] = conSE[se];
        if(vr>=0) ptsEsc[11] = conVR[vr];
        if(rc>=0) ptsEsc[12] = conRC[rc];
        if(dn>=0) ptsEsc[13] = conDN[dn];
        return ptsEsc;
    }
    
    public int[] naturalesAEscalares5052(int dc, int in, int mt,int vb, int cd, int bs, int ps, int cl, int cm, int fi, int se, int vr, int rc, int dn){
        int[] ptsEsc = new int[14];
        int[] conDC = {1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 14, 15, 16, 18, 19, 19, 19, 19, 19, 19, 19};
        int[] conIN = {1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 6, 7, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 17, 18, 19, 19};
        int[] conMT = {1, 2, 3, 4, 4, 5, 6, 7, 7, 8, 9, 9, 10, 10, 11, 12, 12, 13, 13, 14, 15, 15, 16, 16, 17, 18, 18, 19, 19, 19};
        int[] conVB = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6, 7, 8, 8, 9, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 13, 14, 14, 15, 15, 15, 16, 16, 17, 17, 17, 18, 18, 18, 19, 19, 19, 19, 19};
        int[] conCD = {1, 3, 4, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10, 11, 11, 12, 12, 13, 13, 14, 15, 15, 16, 16, 17, 17, 18, 18, 19};
        int[] conBS = {3, 4, 5, 6, 7, 7, 8, 8, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 11, 11, 12, 12, 12, 12, 13, 13, 13, 13, 14, 14, 14, 14, 15, 15, 15, 15, 16, 16, 16, 16, 16, 16, 17, 17, 17, 17, 18, 18, 18, 19, 19};
        int[] conPS = {2, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 12, 12, 13, 13, 14, 14, 15, 16, 16, 17, 18, 18, 19};
        int[] conCL = {1, 2, 3, 4, 4, 5, 5, 5, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 14, 14, 14, 14, 14, 15, 15, 15, 15, 15, 15, 16, 16, 16, 16, 16, 17, 17, 17, 17, 17, 18, 18, 19};
        int[] conCM = {2, 3, 4, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 10, 11, 11, 11, 12, 12, 12, 13, 13, 13, 14, 14, 14, 15, 15, 16, 16, 16, 17, 17, 18, 18, 18, 19, 19};
        int[] conFI = {1, 2, 2, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 17, 18, 19};
        int[] conSE = {2, 3, 4, 5, 6, 6, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10, 10, 11, 11, 11, 11, 12, 12, 12, 13, 13, 13, 14, 14, 14, 15, 15, 15, 16, 16, 17, 17, 18, 18, 18, 19, 19, 19, 19, 19};
        int[] conVR = {1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 8, 9, 9, 10, 10, 11, 11, 12, 13, 14, 15, 16, 18, 19};
        int[] conRC = {1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 5, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 12, 12, 12, 13, 13, 14, 15, 16};
        int[] conDN = {1, 1, 1, 1, 1, 1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6, 7, 8, 9, 9, 10, 11, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        if(dc>=0) ptsEsc[0] = conDC[dc];
        if(in>=0) ptsEsc[1] = conIN[in];
        if(mt>=0) ptsEsc[2] = conMT[mt];
        if(vb>=0) ptsEsc[3] = conVB[vb];
        if(cd>=0) ptsEsc[4] = conCD[cd];
        if(bs>=0) ptsEsc[5] = conBS[bs];
        if(ps>=0) ptsEsc[6] = conPS[ps];
        if(cl>=0) ptsEsc[7] = conCL[cl];
        if(cm>=0) ptsEsc[8] = conCM[cm];
        if(fi>=0) ptsEsc[9] = conFI[fi];
        if(se>=0) ptsEsc[10] = conSE[se];
        if(vr>=0) ptsEsc[11] = conVR[vr];
        if(rc>=0) ptsEsc[12] = conRC[rc];
        if(dn>=0) ptsEsc[13] = conDN[dn];
        return ptsEsc;
    }
    
    public int[] naturalesAEscalares5355(int dc, int in, int mt,int vb, int cd, int bs, int ps, int cl, int cm, int fi, int se, int vr, int rc, int dn){
        int[] ptsEsc = new int[14];
        int[] conDC = {1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 14, 15, 16, 18, 19, 19, 19, 19, 19, 19};
        int[] conIN = {1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 6, 7, 7, 8, 9, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 19};
        int[] conMT = {1, 2, 3, 3, 4, 5, 5, 6, 7, 7, 8, 9, 9, 10, 10, 11, 12, 12, 13, 13, 14, 15, 15, 16, 16, 17, 18, 18, 19, 19};
        int[] conVB = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 12, 13, 13, 14, 14, 14, 15, 15, 15, 16, 16, 17, 17, 18, 18, 18, 19, 19, 19, 19};
        int[] conCD = {1, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 9, 9, 10, 10, 11, 12, 12, 13, 13, 14, 14, 15, 16, 16, 17, 17, 18, 19};
        int[] conBS = {3, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 11, 11, 12, 12, 12, 12, 13, 13, 13, 13, 14, 14, 14, 14, 15, 15, 15, 15, 16, 16, 16, 16, 16, 16, 17, 17, 17, 18, 18, 19, 19};
        int[] conPS = {2, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 13, 13, 14, 15, 15, 16, 17, 17, 18, 19};
        int[] conCL = {1, 2, 2, 3, 4, 4, 4, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 14, 14, 14, 14, 14, 15, 15, 15, 15, 15, 15, 16, 16, 16, 16, 16, 17, 17, 17, 17, 18, 19};
        int[] conCM = {2, 3, 4, 5, 5, 6, 6, 7, 7, 8, 8, 8, 9, 9, 10, 10, 10, 11, 11, 11, 12, 12, 13, 13, 13, 14, 14, 14, 15, 15, 15, 16, 16, 17, 17, 18, 18, 18, 19};
        int[] conFI = {1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 8, 9, 9, 10, 10, 11, 11, 12, 13, 13, 14, 14, 15, 15, 16, 17, 18, 19};
        int[] conSE = {1, 3, 4, 5, 5, 6, 6, 7, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 11, 12, 12, 12, 13, 13, 13, 13, 14, 14, 14, 15, 15, 16, 16, 17, 17, 18, 18, 18, 19, 19, 19, 19};
        int[] conVR = {1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 5, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 13, 14, 15, 17, 19};
        int[] conRC = {1, 2, 2, 3, 3, 3, 3, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 12, 12, 13, 13, 14, 15};
        int[] conDN = {1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 7, 7, 8, 9, 9, 10, 11, 12, 13, 13, 14, 16, 17, 18, 19};
        if(dc>=0) ptsEsc[0] = conDC[dc];
        if(in>=0) ptsEsc[1] = conIN[in];
        if(mt>=0) ptsEsc[2] = conMT[mt];
        if(vb>=0) ptsEsc[3] = conVB[vb];
        if(cd>=0) ptsEsc[4] = conCD[cd];
        if(bs>=0) ptsEsc[5] = conBS[bs];
        if(ps>=0) ptsEsc[6] = conPS[ps];
        if(cl>=0) ptsEsc[7] = conCL[cl];
        if(cm>=0) ptsEsc[8] = conCM[cm];
        if(fi>=0) ptsEsc[9] = conFI[fi];
        if(se>=0) ptsEsc[10] = conSE[se];
        if(vr>=0) ptsEsc[11] = conVR[vr];
        if(rc>=0) ptsEsc[12] = conRC[rc];
        if(dn>=0) ptsEsc[13] = conDN[dn];
        return ptsEsc;
    }
    
    public int[] naturalesAEscalares5658(int dc, int in, int mt,int vb, int cd, int bs, int ps, int cl, int cm, int fi, int se, int vr, int rc, int dn){
        int[] ptsEsc = new int[14];
        int[] conDC = {1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 14, 15, 16, 18, 19, 19, 19, 19, 19};
        int[] conIN = {1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 6, 7, 7, 8, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        int[] conMT = {1, 2, 2, 3, 4, 4, 5, 5, 6, 7, 7, 8, 9, 9, 10, 10, 11, 12, 12, 13, 13, 14, 15, 15, 16, 16, 17, 18, 19, 19};
        int[] conVB = {1, 1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 10, 11, 11, 12, 12, 13, 13, 13, 14, 14, 15, 15, 15, 16, 16, 17, 17, 17, 18, 18, 19, 19, 19};
        int[] conCD = {1, 2, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 9, 9, 10, 10, 11, 11, 12, 13, 13, 14, 14, 15, 16, 16, 17, 18, 19};
        int[] conBS = {3, 4, 5, 5, 6, 6, 6, 7, 7, 8, 8, 8, 8, 9, 9, 10, 10, 10, 10, 11, 11, 11, 11, 11, 12, 12, 12, 12, 13, 13, 13, 13, 14, 14, 14, 14, 15, 15, 15, 15, 16, 16, 16, 16, 16, 17, 17, 17, 18, 18, 19};
        int[] conPS = {1, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 11, 11, 12, 12, 13, 14, 15, 15, 16, 17, 18, 19};
        int[] conCL = {1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 14, 14, 14, 14, 14, 15, 15, 15, 15, 15, 16, 16, 16, 16, 16, 17, 17, 17, 18, 19};
        int[] conCM = {1, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10, 10, 11, 11, 12, 12, 12, 13, 13, 14, 14, 14, 15, 15, 16, 16, 16, 17, 17, 18, 18, 19};
        int[] conFI = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 14, 14, 15, 16, 17, 18, 19};
        int[] conSE = {1, 3, 4, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 11, 12, 12, 12, 13, 13, 13, 14, 14, 14, 15, 15, 16, 16, 17, 17, 18, 18, 18, 19, 19, 19};
        int[] conVR = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 13, 14, 16, 18};
        int[] conRC = {1, 2, 2, 3, 3, 3, 3, 3, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10, 10, 11, 11, 12, 12, 13, 14, 15};
        int[] conDN = {1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 3, 4, 4, 5, 5, 6, 7, 7, 8, 9, 10, 10, 11, 12, 13, 14, 16, 17, 18, 19};
        if(dc>=0) ptsEsc[0] = conDC[dc];
        if(in>=0) ptsEsc[1] = conIN[in];
        if(mt>=0) ptsEsc[2] = conMT[mt];
        if(vb>=0) ptsEsc[3] = conVB[vb];
        if(cd>=0) ptsEsc[4] = conCD[cd];
        if(bs>=0) ptsEsc[5] = conBS[bs];
        if(ps>=0) ptsEsc[6] = conPS[ps];
        if(cl>=0) ptsEsc[7] = conCL[cl];
        if(cm>=0) ptsEsc[8] = conCM[cm];
        if(fi>=0) ptsEsc[9] = conFI[fi];
        if(se>=0) ptsEsc[10] = conSE[se];
        if(vr>=0) ptsEsc[11] = conVR[vr];
        if(rc>=0) ptsEsc[12] = conRC[rc];
        if(dn>=0) ptsEsc[13] = conDN[dn];
        return ptsEsc;
    }
    
    public int[] naturalesAEscalares59511(int dc, int in, int mt,int vb, int cd, int bs, int ps, int cl, int cm, int fi, int se, int vr, int rc, int dn){
        int[] ptsEsc = new int[14];
        int[] conDC = {1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 6, 6, 7, 7, 7, 8, 8, 9, 9, 9, 10, 10, 11, 12, 12, 13, 14, 15, 16, 18, 19, 19, 19, 19};
        int[] conIN = {1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 6, 6, 7, 7, 8, 9, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19};
        int[] conMT = {1, 2, 2, 3, 3, 4, 4, 5, 6, 6, 7, 7, 8, 9, 9, 10, 10, 11, 12, 12, 13, 13, 14, 15, 15, 16, 17, 17, 18, 19};
        int[] conVB = {1, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 9, 10, 10, 11, 11, 12, 12, 12, 13, 13, 14, 14, 14, 15, 15, 15, 16, 16, 17, 17, 18, 18, 19, 19};
        int[] conCD = {1, 2, 3, 4, 4, 4, 5, 6, 6, 6, 7, 7, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 14, 14, 15, 16, 17, 18, 19};
        int[] conBS = {2, 3, 4, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 11, 12, 12, 12, 12, 13, 13, 13, 13, 14, 14, 14, 14, 14, 15, 15, 15, 15, 16, 16, 16, 17, 17, 18, 18, 19};
        int[] conPS = {1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 12, 13, 13, 14, 15, 16, 17, 18, 19};
        int[] conCL = {1, 1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 12, 12, 12, 12, 13, 13, 13, 13, 13, 14, 14, 14, 14, 14, 15, 15, 15, 15, 15, 16, 16, 16, 16, 17, 17, 18, 19};
        int[] conCM = {1, 2, 3, 4, 4, 5, 5, 6, 6, 6, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10, 11, 11, 11, 12, 12, 13, 13, 13, 14, 14, 15, 15, 16, 16, 16, 17, 17, 18, 19};
        int[] conFI = {1, 1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 6, 6, 7, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 14, 15, 16, 17, 18, 19};
        int[] conSE = {1, 2, 3, 4, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 12, 12, 12, 13, 13, 13, 14, 14, 14, 15, 15, 16, 16, 17, 17, 18, 18, 19, 19, 19};
        int[] conVR = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 12, 13, 14, 16, 18};
        int[] conRC = {1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 11, 11, 12, 12, 13, 14};
        int[] conDN = {1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9, 10, 11, 12, 12, 14, 15, 16, 17, 19};
        if(dc>=0) ptsEsc[0] = conDC[dc];
        if(in>=0) ptsEsc[1] = conIN[in];
        if(mt>=0) ptsEsc[2] = conMT[mt];
        if(vb>=0) ptsEsc[3] = conVB[vb];
        if(cd>=0) ptsEsc[4] = conCD[cd];
        if(bs>=0) ptsEsc[5] = conBS[bs];
        if(ps>=0) ptsEsc[6] = conPS[ps];
        if(cl>=0) ptsEsc[7] = conCL[cl];
        if(cm>=0) ptsEsc[8] = conCM[cm];
        if(fi>=0) ptsEsc[9] = conFI[fi];
        if(se>=0) ptsEsc[10] = conSE[se];
        if(vr>=0) ptsEsc[11] = conVR[vr];
        if(rc>=0) ptsEsc[12] = conRC[rc];
        if(dn>=0) ptsEsc[13] = conDN[dn];
        return ptsEsc;
    }
    
    public int[] naturalesAEscalares6063(int dc, int in, int mt,int vb, int cd, int bs, int ps, int cl, int cm, int fi, int se, int vr, int rc, int dn){
        int[] ptsEsc = new int[14];
        int[] conDC = {1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 6, 6, 7, 7, 7, 8, 8, 9, 9, 9, 10, 10, 11, 11, 12, 13, 14, 15, 16, 18, 19, 19, 19};
        int[] conIN = {1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 6, 7, 7, 8, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19};
        int[] conMT = {1, 1, 2, 2, 3, 4, 4, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10, 10, 11, 12, 12, 13, 13, 14, 15, 15, 16, 17, 18, 19};
        int[] conVB = {1, 1, 1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 7, 7, 8, 8, 8, 9, 9, 10, 10, 10, 11, 11, 12, 12, 13, 13, 13, 14, 14, 15, 15, 15, 16, 16, 17, 17, 18, 18, 19};
        int[] conCD = {1, 2, 3, 3, 4, 4, 5, 5, 6, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 12, 12, 13, 14, 15, 16, 17, 18, 19};
        int[] conBS = {1, 2, 3, 4, 5, 5, 6, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 11, 12, 12, 12, 12, 13, 13, 13, 13, 14, 14, 14, 14, 14, 15, 15, 15, 16, 16, 16, 17, 17, 18, 19};
        int[] conPS = {1, 1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 10, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        int[] conCL = {1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 11, 11, 12, 12, 12, 12, 13, 13, 13, 13, 13, 14, 14, 14, 14, 14, 15, 15, 15, 15, 16, 16, 16, 17, 17, 18};
        int[] conCM = {1, 2, 3, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10, 10, 11, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 15, 16, 17, 17, 18, 19};
        int[] conFI = {1, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 13, 13, 14, 15, 16, 17, 19};
        int[] conSE = {1, 2, 3, 4, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 12, 12, 12, 13, 13, 13, 14, 14, 14, 15, 15, 16, 16, 17, 17, 18, 18, 19, 19};
        int[] conVR = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 11, 12, 13, 14, 15, 17};
        int[] conRC = {1, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 11, 11, 12, 13, 14};
        int[] conDN = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 7, 7, 8, 9, 9, 10, 11, 12, 13, 14, 16, 17, 19};
        if(dc>=0) ptsEsc[0] = conDC[dc];
        if(in>=0) ptsEsc[1] = conIN[in];
        if(mt>=0) ptsEsc[2] = conMT[mt];
        if(vb>=0) ptsEsc[3] = conVB[vb];
        if(cd>=0) ptsEsc[4] = conCD[cd];
        if(bs>=0) ptsEsc[5] = conBS[bs];
        if(ps>=0) ptsEsc[6] = conPS[ps];
        if(cl>=0) ptsEsc[7] = conCL[cl];
        if(cm>=0) ptsEsc[8] = conCM[cm];
        if(fi>=0) ptsEsc[9] = conFI[fi];
        if(se>=0) ptsEsc[10] = conSE[se];
        if(vr>=0) ptsEsc[11] = conVR[vr];
        if(rc>=0) ptsEsc[12] = conRC[rc];
        if(dn>=0) ptsEsc[13] = conDN[dn];
        return ptsEsc;
    }
    
    public int[] naturalesAEscalares6467(int dc, int in, int mt,int vb, int cd, int bs, int ps, int cl, int cm, int fi, int se, int vr, int rc, int dn){
        int[] ptsEsc = new int[14];
        int[] conDC = {1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10, 11, 11, 12, 13, 14, 15, 16, 18, 19, 19};
        int[] conIN = {1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 10, 11, 13, 14, 15, 16, 17, 19};
        int[] conMT = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 12, 12, 13, 13, 14, 15, 16, 17, 18, 19};
        int[] conVB = {1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 7, 7, 7, 8, 8, 9, 9, 9, 10, 10, 11, 11, 11, 12, 12, 13, 13, 13, 14, 14, 15, 15, 15, 16, 16, 17, 18, 19};
        int[] conCD = {1, 2, 3, 3, 4, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 8, 9, 9, 10, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        int[] conBS = {1, 2, 3, 4, 4, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 11, 12, 12, 12, 12, 13, 13, 13, 14, 14, 14, 14, 15, 15, 15, 16, 16, 17, 17, 18};
        int[] conPS = {1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 4, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 11, 11, 12, 13, 14, 15, 17, 18};
        int[] conCL = {1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 11, 12, 12, 12, 12, 13, 13, 13, 13, 14, 14, 14, 14, 15, 15, 15, 15, 16, 16, 16, 17, 17};
        int[] conCM = {1, 2, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10, 10, 11, 11, 12, 12, 12, 13, 13, 14, 14, 15, 15, 16, 17, 18, 19};
        int[] conFI = {1, 1, 1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 8, 8, 9, 9, 9, 10, 10, 11, 12, 12, 13, 14, 15, 16, 18};
        int[] conSE = {1, 2, 3, 4, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 12, 12, 12, 13, 13, 13, 14, 14, 15, 15, 16, 16, 17, 17, 18, 18, 19};
        int[] conVR = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 6, 7, 7, 8, 8, 9, 9, 10, 11, 12, 13, 14, 16};
        int[] conRC = {1, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 9, 10, 10, 11, 11, 12, 13};
        int[] conDN = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 8, 9, 9, 10, 11, 12, 14, 15, 17, 19};
        if(dc>=0) ptsEsc[0] = conDC[dc];
        if(in>=0) ptsEsc[1] = conIN[in];
        if(mt>=0) ptsEsc[2] = conMT[mt];
        if(vb>=0) ptsEsc[3] = conVB[vb];
        if(cd>=0) ptsEsc[4] = conCD[cd];
        if(bs>=0) ptsEsc[5] = conBS[bs];
        if(ps>=0) ptsEsc[6] = conPS[ps];
        if(cl>=0) ptsEsc[7] = conCL[cl];
        if(cm>=0) ptsEsc[8] = conCM[cm];
        if(fi>=0) ptsEsc[9] = conFI[fi];
        if(se>=0) ptsEsc[10] = conSE[se];
        if(vr>=0) ptsEsc[11] = conVR[vr];
        if(rc>=0) ptsEsc[12] = conRC[rc];
        if(dn>=0) ptsEsc[13] = conDN[dn];
        return ptsEsc;
    }

    public int[] naturalesAEscalares68611(int dc, int in, int mt,int vb, int cd, int bs, int ps, int cl, int cm, int fi, int se, int vr, int rc, int dn){
        int[] ptsEsc = new int[14];
        int[] conDC = {1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10, 11, 12, 12, 13, 14, 15, 16, 18, 19};
        int[] conIN = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 10, 11, 12, 14, 15, 16, 18};
        int[] conMT = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 12, 12, 13, 13, 14, 15, 16, 17, 19};
        int[] conVB = {1, 1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 7, 7, 7, 8, 8, 8, 9, 9, 10, 10, 10, 11, 11, 12, 12, 12, 13, 13, 13, 14, 14, 15, 15, 16, 17, 18, 19};
        int[] conCD = {1, 2, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 9, 10, 10, 11, 12, 13, 14, 15, 16, 17, 19};
        int[] conBS = {1, 2, 3, 4, 4, 5, 5, 5, 6, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 11, 12, 12, 12, 12, 13, 13, 13, 14, 14, 14, 15, 15, 16, 16, 17, 18};
        int[] conPS = {1, 1, 1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 6, 7, 7, 8, 8, 9, 9, 10, 11, 11, 12, 13, 15, 17, 18};
        int[] conCL = {1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 11, 12, 12, 12, 12, 13, 13, 13, 14, 14, 14, 14, 15, 15, 16, 16, 16, 17};
        int[] conCM = {1, 2, 3, 3, 4, 4, 5, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10, 10, 11, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 17, 19};
        int[] conFI = {1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 8, 8, 8, 9, 9, 10, 10, 11, 12, 13, 14, 15, 16, 18};
        int[] conSE = {1, 2, 3, 3, 4, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 12, 12, 12, 13, 13, 13, 14, 14, 15, 15, 16, 16, 17, 17, 18, 19};
        int[] conVR = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 11, 12, 13, 15};
        int[] conRC = {1, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 10, 10, 11, 12, 13};
        int[] conDN = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 3, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9, 10, 10, 11, 13, 15, 17, 19};
        if(dc>=0) ptsEsc[0] = conDC[dc];
        if(in>=0) ptsEsc[1] = conIN[in];
        if(mt>=0) ptsEsc[2] = conMT[mt];
        if(vb>=0) ptsEsc[3] = conVB[vb];
        if(cd>=0) ptsEsc[4] = conCD[cd];
        if(bs>=0) ptsEsc[5] = conBS[bs];
        if(ps>=0) ptsEsc[6] = conPS[ps];
        if(cl>=0) ptsEsc[7] = conCL[cl];
        if(cm>=0) ptsEsc[8] = conCM[cm];
        if(fi>=0) ptsEsc[9] = conFI[fi];
        if(se>=0) ptsEsc[10] = conSE[se];
        if(vr>=0) ptsEsc[11] = conVR[vr];
        if(rc>=0) ptsEsc[12] = conRC[rc];
        if(dn>=0) ptsEsc[13] = conDN[dn];
        return ptsEsc;
    }
    
    public int[] naturalesAEscalares7073(int dc, int in, int mt,int vb, int cd, int bs, int ps, int cl, int cm, int fi, int se, int vr, int rc, int dn){
        int[] ptsEsc = new int[14];
        int[] conDC = {1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 6, 6, 7, 7, 7, 8, 8, 9, 9, 9, 10, 10, 11, 12, 12, 13, 14, 15, 16, 18, 19};
        int[] conIN = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 10, 11, 12, 14, 15, 16, 18};
        int[] conMT = {1, 1, 2, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 11, 11, 12, 12, 13, 13, 14, 15, 16, 18};
        int[] conVB = {1, 1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10, 11, 11, 11, 12, 12, 12, 13, 13, 14, 14, 15, 15, 16, 17, 19};
        int[] conCD = {1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 8, 9, 9, 10, 10, 11, 12, 12, 13, 14, 15, 16, 18};
        int[] conBS = {1, 2, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 11, 11, 11, 11, 12, 12, 12, 12, 13, 13, 13, 14, 14, 15, 15, 16, 17};
        int[] conPS = {1, 1, 1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 6, 7, 7, 8, 8, 9, 10, 11, 11, 12, 13, 15, 17, 18};
        int[] conCL = {1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 11, 12, 12, 12, 13, 13, 13, 14, 14, 14, 15, 15, 16, 16};
        int[] conCM = {1, 2, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10, 10, 11, 11, 11, 12, 12, 13, 13, 14, 15, 15, 16, 17, 19};
        int[] conFI = {1, 1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 8, 8, 8, 9, 9, 10, 10, 11, 12, 13, 14, 15, 17};
        int[] conSE = {1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 12, 12, 12, 13, 13, 14, 14, 14, 15, 15, 16, 16, 17, 18, 19};
        int[] conVR = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 6, 6, 7, 7, 8, 8, 9, 10, 11, 12, 13, 15};
        int[] conRC = {1, 1, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 10, 10, 11, 13};
        int[] conDN = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 3, 3, 4, 4, 4, 5, 6, 7, 8, 8, 9, 9, 10, 11, 12, 14, 16, 18};
        if(dc>=0) ptsEsc[0] = conDC[dc];
        if(in>=0) ptsEsc[1] = conIN[in];
        if(mt>=0) ptsEsc[2] = conMT[mt];
        if(vb>=0) ptsEsc[3] = conVB[vb];
        if(cd>=0) ptsEsc[4] = conCD[cd];
        if(bs>=0) ptsEsc[5] = conBS[bs];
        if(ps>=0) ptsEsc[6] = conPS[ps];
        if(cl>=0) ptsEsc[7] = conCL[cl];
        if(cm>=0) ptsEsc[8] = conCM[cm];
        if(fi>=0) ptsEsc[9] = conFI[fi];
        if(se>=0) ptsEsc[10] = conSE[se];
        if(vr>=0) ptsEsc[11] = conVR[vr];
        if(rc>=0) ptsEsc[12] = conRC[rc];
        if(dn>=0) ptsEsc[13] = conDN[dn];
        return ptsEsc;
    }

    public String[] equivalentesCIV(int sumaPtsEsc){
        String[] equivalentes = new String[4];
        String[][] civs = new String[55][4];
        int[] civ = {45, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 77, 79, 81, 83, 85, 87, 89, 92, 94, 96, 98, 100, 101, 103, 105, 107, 110, 112, 114, 116, 118, 121, 123, 125, 127, 129, 131, 133, 135, 137, 139, 141, 143, 145, 147, 149, 151, 153, 155};
        double[] rp = {0.1, 0.1, 0.1, 0.1, 0.1, 0.2, 0.3, 0.4, 1, 1, 1, 2, 2, 3, 4, 5, 6, 8, 10, 13, 16, 19, 23, 30, 34, 39, 45, 50, 53, 58, 63, 68, 75, 79, 82, 86, 88, 92, 94, 95, 96, 97, 98, 99, 99, 99, 99.5, 99.7, 99.8, 99.9, 99.9, 99.9, 99.9, 99.9, 99.9};
        int[] nc901 = {43, 46, 47, 49, 51, 53, 55, 57, 59, 60, 62, 64, 66, 68, 70, 72, 73, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 95, 97, 99, 100, 103, 105, 107, 109, 111, 113, 115, 117, 119, 121, 123, 125, 126, 128, 130, 132, 134, 136, 138, 139, 141, 143, 145};
        int[] nc902 = {55, 58, 60, 61, 63, 65, 67, 69, 71, 73, 74, 76, 78, 80, 82, 84, 85, 87, 88, 90, 92, 94, 96, 99, 100, 102, 104, 106, 107, 109, 111, 113, 115, 117, 119, 121, 123, 126, 127, 129, 131, 133, 135, 137, 139, 140, 142, 144, 146, 148, 150, 152, 154, 155, 157};
        int[] nc951 = {42, 44, 46, 48, 50, 52, 54, 56, 57, 59, 61, 63, 65, 67, 69, 70, 71, 73, 75, 77, 79, 81, 83, 85, 87, 89, 91, 93, 94, 96, 97, 99, 102, 104, 106, 108, 110, 112, 114, 116, 118, 120, 122, 123, 125, 127, 129, 131, 133, 135, 136, 138, 140, 142, 144};
        int[] nc952 = {56, 59, 61, 63, 64, 66, 68, 70, 72, 74, 76, 77, 79, 81, 83, 85, 86, 88, 90, 91, 93, 95, 97, 100, 102, 104, 105, 107, 108, 110, 112, 114, 117, 118, 120, 122, 124, 127, 129, 130, 132, 134, 136, 138, 140, 142, 144, 145, 147, 149, 151, 153, 155, 157, 158};
        
        for(int i=0;i<3;i++){
            civs[i][0] = civ[i]+"";
            civs[i][1] = "<"+rp[i]+"";
            civs[i][2] = nc901[i]+"-"+nc902[i];
            civs[i][3] = nc951[i]+"-"+nc952[i];
        }
        for(int i=3;i<=civ.length-4;i++){
            civs[i][0] = civ[i]+"";
            civs[i][1] = rp[i]+"";
            civs[i][2] = nc901[i]+"-"+nc902[i];
            civs[i][3] = nc951[i]+"-"+nc952[i];
        }
        for(int i=civ.length-3;i<civ.length;i++){
            civs[i][0] = civ[i]+"";
            civs[i][1] = ">"+rp[i]+"";
            civs[i][2] = nc901[i]+"-"+nc902[i];
            civs[i][3] = nc951[i]+"-"+nc952[i];
        }
        
        int x = sumaPtsEsc-3;
        equivalentes = civs[x];
        
        return equivalentes;
    }
    
    public String[] equivalentesCIE(int sumaPtsEsc){
        String[] equivalentes = new String[4];
        String[][] cies = new String[55][4];
        int[] cie = {45, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 79, 81, 83, 85, 87, 89, 92, 94, 96, 98, 100, 102, 104, 106, 108, 111, 113, 115, 118, 120, 122, 124, 126, 128, 130, 132, 134, 136, 138, 140, 142, 144, 146, 148, 150, 152, 154, 155};
        double[] rp = {0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.2, 0.3, 0.4, 1, 1, 1, 2, 2, 3, 4, 5, 8, 10, 13, 16, 19, 23, 30, 34, 39, 45, 50, 55, 61, 66, 70, 77, 81, 84, 88, 91, 93, 95, 96, 97, 98, 98, 99, 99, 99, 99.6, 99.7, 99.8, 99.9, 99.9, 99.9, 99.9, 99.9, 99.9};
        int[] nc901 = {43, 44, 45, 47, 49, 51, 53, 55, 57, 59, 60, 62, 64, 66, 68, 70, 72, 75, 76, 78, 80, 82, 84, 87, 89, 91, 92, 94, 96, 98, 100, 102, 105, 107, 108, 111, 113, 115, 117, 119, 121, 123, 124, 126, 128, 130, 132, 134, 136, 138, 139, 141, 143, 145, 146};
        int[] nc902 = {54, 55, 57, 59, 61, 62, 64, 66, 68, 70, 72, 74, 76, 77, 79, 81, 83, 86, 88, 90, 92, 93, 95, 98, 100, 102, 104, 106, 108, 109, 111, 113, 116, 118, 120, 123, 124, 126, 128, 130, 132, 134, 136, 138, 140, 141, 143, 145, 147, 149, 151, 153, 155, 156, 157};
        int[] nc951 = {42, 42, 44, 46, 48, 50, 52, 54, 56, 58, 59, 61, 63, 65, 67, 69, 71, 73, 75, 77, 79, 81, 83, 86, 88, 89, 91, 93, 95, 97, 99, 101, 104, 105, 107, 110, 112, 114, 116, 118, 120, 121, 123, 125, 127, 129, 131, 133, 135, 136, 138, 140, 142, 144, 145};
        int[] nc952 = {55, 56, 58, 60, 62, 64, 65, 67, 69, 71, 73, 75, 77, 79, 80, 82, 84, 87, 89, 91, 93, 95, 96, 99, 101, 103, 105, 107, 109, 111, 112, 114, 117, 119, 121, 124, 126, 127, 129, 131, 133, 135, 137, 139, 141, 142, 144, 146, 148, 150, 152, 154, 156, 158, 158};
        
        for(int i=0;i<4;i++){
            cies[i][0] = cie[i]+"";
            cies[i][1] = "<"+rp[i]+"";
            cies[i][2] = nc901[i]+"-"+nc902[i];
            cies[i][3] = nc951[i]+"-"+nc952[i];
        }
        for(int i=4;i<=cie.length-5;i++){
            cies[i][0] = cie[i]+"";
            cies[i][1] = rp[i]+"";
            cies[i][2] = nc901[i]+"-"+nc902[i];
            cies[i][3] = nc951[i]+"-"+nc952[i];
        }
        for(int i=cie.length-4;i<cie.length;i++){
            cies[i][0] = cie[i]+"";
            cies[i][1] = ">"+rp[i]+"";
            cies[i][2] = nc901[i]+"-"+nc902[i];
            cies[i][3] = nc951[i]+"-"+nc952[i];
        }
        
        int x = sumaPtsEsc-3;
        equivalentes = cies[x];
        
        return equivalentes;
    }
    
    public String[] equivalentesCVP(int sumaPtsEsc){
        String[] equivalentes = new String[4];
        String[][] cvps = new String[37][4];
        int[] cvp = {45, 49, 53, 57, 60, 64, 67, 70, 72, 75, 77, 79, 82, 85, 88, 91, 94, 97, 100, 103, 106, 109, 112, 114, 117, 120, 123, 126, 129, 132, 135, 138, 141, 144, 148, 151, 155};
        double[] rp = {0.1, 0.1, 0.1, 0.2, 0.4, 1, 1, 2, 3, 5, 6, 8, 12, 16, 21, 27, 34, 42, 50, 58, 66, 73, 79, 82, 87, 91, 94, 96, 97, 98, 99, 99, 99.7, 99.8, 99.9, 99.9, 99.9};
        int[] nc901 = {44, 47, 51, 54, 57, 61, 63, 66, 68, 70, 72, 74, 77, 79, 82, 85, 87, 90, 93, 95, 98, 101, 103, 105, 108, 111, 113, 116, 119, 121, 124, 127, 129, 132, 135, 138, 142};
        int[] nc902 = {58, 62, 65, 69, 72, 75, 78, 81, 82, 85, 87, 89, 91, 94, 97, 99, 102, 105, 107, 110, 113, 115, 118, 120, 122, 125, 128, 130, 133, 136, 138, 141, 144, 146, 150, 153, 156};
        int[] nc951 = {42, 46, 49, 53, 56, 59, 62, 65, 66, 69, 71, 73, 75, 78, 81, 83, 86, 89, 91, 94, 97, 99, 102, 104, 106, 109, 112, 114, 117, 120, 122, 125, 128, 130, 134, 137, 140};
        int[] nc952 = {60, 63, 67, 70, 73, 77, 79, 82, 84, 86, 88, 90, 93, 95, 98, 101, 103, 106, 109, 111, 114, 117, 119, 121, 124, 126, 129, 132, 134, 137, 140, 142, 145, 148, 151, 154, 158};
        
        for(int i=0;i<2;i++){
            cvps[i][0] = cvp[i]+"";
            cvps[i][1] = "<"+rp[i]+"";
            cvps[i][2] = nc901[i]+"-"+nc902[i];
            cvps[i][3] = nc951[i]+"-"+nc952[i];
        }
        for(int i=2;i<=cvp.length-3;i++){
            cvps[i][0] = cvp[i]+"";
            cvps[i][1] = rp[i]+"";
            cvps[i][2] = nc901[i]+"-"+nc902[i];
            cvps[i][3] = nc951[i]+"-"+nc952[i];
        }
        for(int i=cvp.length-2;i<cvp.length;i++){
            cvps[i][0] = cvp[i]+"";
            cvps[i][1] = ">"+rp[i]+"";
            cvps[i][2] = nc901[i]+"-"+nc902[i];
            cvps[i][3] = nc951[i]+"-"+nc952[i];
        }
        
        int x = sumaPtsEsc-2;
        equivalentes = cvps[x];
        
        return equivalentes;
    }
    
    public String[] equivalentesCIT(int sumaPtsEsc){        
        String[] equivalentes = new String[4];
        String[][] cits = new String[127][4];
        int[] cit = {40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 62, 63, 64, 65, 66, 67, 68, 69, 70, 70, 71, 72, 73, 74, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 100, 101, 102, 103, 104, 105, 106, 107, 70, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 122, 123, 124, 125, 126, 127, 128, 130, 131, 132, 133, 134, 135, 135, 136, 137, 138, 139, 140, 140, 141, 142, 143, 144, 145, 145, 146, 147, 148, 149, 149, 150, 151, 152, 152, 153, 154, 155, 155, 156, 157, 158, 159, 160};
        double[] rp = {0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.2, 0.2, 0.3, 0.3, 0.4, 0.5, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 4, 4, 4, 5, 5, 6, 7, 8, 9, 10, 12, 13, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 37, 39, 42, 45, 50, 53, 55, 58, 61, 63, 66, 68, 108, 75, 77, 79, 81, 82, 84, 86, 87, 88, 90, 91, 93, 94, 95, 95, 96, 9, 97, 98, 98, 98, 99, 99, 99, 99, 99, 99, 99, 99.5, 99.6, 99.6, 99.7, 99.7, 99.8, 99.8, 99.9, 99.9, 99.9, 99.9, 99.9, 99.9, 99.9, 99.9, 99.9, 99.9, 99.9, 99.9, 99.9, 99.9, 99.9, 99.9, 99.9, 99.9, 99.9, 99.9};
        int[] nc901 = {38, 39, 40, 41, 42, 42, 43, 44, 45, 46, 47, 48, 49, 50, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 59, 60, 61, 62, 63, 64, 65, 66, 66, 66, 67, 68, 69, 70, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 90, 91, 92, 93, 95, 96, 97, 98, 99, 100, 101, 102, 103, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 114, 116, 117, 118, 119, 120, 121, 122, 124, 125, 126, 127, 128, 129, 129, 130, 131, 132, 133, 134, 134, 135, 136, 137, 138, 138, 138, 139, 140, 141, 142, 142, 143, 144, 145, 145, 146, 147, 148, 148, 149, 150, 151, 152, 153};
        int[] nc902 = {47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 60, 61, 62, 62, 63, 64, 65, 66, 67, 68, 68, 69, 70, 71, 72, 73, 74, 75, 76, 76, 77, 78, 79, 80, 80, 81, 82, 83, 84, 85, 86, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 105, 106, 107, 108, 109, 110, 110, 111, 112, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 126, 127, 128, 129, 130, 131, 132, 134, 134, 135, 136, 137, 138, 138, 139, 140, 141, 142, 143, 143, 144, 145, 146, 147, 148, 148, 149, 150, 151, 152, 152, 153, 154, 155, 155, 156, 157, 158, 158, 158, 159, 160, 161, 162};
        int[] nc951 = {37, 38, 39, 40, 41, 42, 43, 43, 44, 45, 46, 47, 48, 49, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 58, 59, 60, 61, 62, 63, 64, 65, 66, 66, 67, 67, 68, 69, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 91, 92, 94, 95, 96, 97, 98, 99, 100, 101, 102, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 123, 124, 125, 126, 127, 128, 128, 129, 130, 131, 132, 133, 133, 134, 135, 136, 137, 138, 138, 139, 139, 140, 141, 141, 142, 143, 144, 144, 145, 146, 147, 147, 148, 149, 150, 151, 152};
        int[] nc952 = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 61, 61, 62, 63, 64, 65, 66, 67, 68, 69, 69, 70, 71, 72, 73, 74, 75, 76, 77, 77, 78, 79, 80, 81, 81, 82, 83, 84, 85, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 106, 107, 108, 109, 109, 110, 111, 112, 113, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 139, 140, 141, 142, 143, 144, 144, 145, 146, 147, 148, 149, 149, 150, 151, 152, 153, 153, 154, 155, 156, 156, 157, 157, 158, 158, 159, 160, 161, 162, 163};
        
        for(int i=0;i<11;i++){
            cits[i][0] = cit[i]+"";
            cits[i][1] = "<"+rp[i]+"";
            cits[i][2] = nc901[i]+"-"+nc902[i];
            cits[i][3] = nc951[i]+"-"+nc952[i];
        }
        for(int i=11;i<=cit.length-14;i++){
            cits[i][0] = cit[i]+"";
            cits[i][1] = rp[i]+"";
            cits[i][2] = nc901[i]+"-"+nc902[i];
            cits[i][3] = nc951[i]+"-"+nc952[i];
        }
        for(int i=cit.length-13;i<cit.length;i++){
            cits[i][0] = cit[i]+"";
            cits[i][1] = ">"+rp[i]+"";
            cits[i][2] = nc901[i]+"-"+nc902[i];
            cits[i][3] = nc951[i]+"-"+nc952[i];
        }
        
        int x = sumaPtsEsc-7;
        equivalentes = cits[x];
        
        return equivalentes;   
    }
    
     public String[] equivalentesCGL(int sumaPtsEsc){
        String[] equivalentes = new String[4];
        String[][] cgls = new String[37][4];
         int[] cgl = {45, 48, 52, 55, 59, 62, 66, 69, 72, 75, 77, 80, 83, 85, 88, 91, 94, 97, 100, 103, 105, 108, 111, 114, 117, 120, 123, 126, 129, 132, 135, 138, 141, 144, 148, 151, 155};
         double[] rp = {0.1, 0.1, 0.1, 0.1, 0.3, 1, 1, 2, 3, 5, 6, 9, 13, 16, 21, 27, 34, 42, 50, 58, 63, 70, 77, 82, 87, 91, 94, 96, 97, 98, 99, 99, 99.7, 99.8, 99.9, 99.9, 99.9};
         int[] nc901 = {43, 46, 50, 52, 56, 59, 62, 65, 68, 70, 72, 75, 78, 79, 82, 85, 88, 90, 93, 96, 97, 100, 103, 106, 108, 111, 114, 116, 119, 122, 124, 127, 130, 133, 136, 139, 142};
         int[] nc902 = {58, 60, 64, 67, 70, 73, 76, 79, 82, 85, 86, 89, 92, 94, 96, 99, 102, 104, 107, 110, 112, 114, 117, 120, 122, 125, 128, 130, 133, 136, 139, 141, 144, 147, 150, 153, 157};
         int[] nc951 = {42, 45, 48, 51, 55, 57, 61, 64, 66, 69, 71, 74, 76, 78, 81, 84, 86, 89, 92, 94, 96, 99, 102, 104, 107, 110, 112, 115, 118, 120, 123, 126, 129, 131, 135, 138, 141};
         int[] nc952 = {59, 62, 65, 68, 71, 74, 78, 80, 83, 86, 88, 90, 93, 95, 98, 100, 103, 106, 108, 111, 113, 116, 118, 121, 124, 126, 129, 132, 134, 137, 140, 143, 145, 148, 152, 154, 158};
        
        for(int i=0;i<2;i++){
            cgls[i][0] = cgl[i]+"";
            cgls[i][1] = "<"+rp[i]+"";
            cgls[i][2] = nc901[i]+"-"+nc902[i];
            cgls[i][3] = nc951[i]+"-"+nc952[i];
        }
        for(int i=2;i<=cgl.length-3;i++){
            cgls[i][0] = cgl[i]+"";
            cgls[i][1] = rp[i]+"";
            cgls[i][2] = nc901[i]+"-"+nc902[i];
            cgls[i][3] = nc951[i]+"-"+nc952[i];
        }
        for(int i=cgl.length-2;i<cgl.length;i++){
            cgls[i][0] = cgl[i]+"";
            cgls[i][1] = ">"+rp[i]+"";
            cgls[i][2] = nc901[i]+"-"+nc902[i];
            cgls[i][3] = nc951[i]+"-"+nc952[i];
        }
        
        int x = sumaPtsEsc-2;
        equivalentes = cgls[x];
        
        return equivalentes;
     }
    
    public void inicializarBebe(int idbebe){
        this.idbebe = idbebe;
    }

    @FXML
    private void calcular(ActionEvent event) throws SQLException {
        clear();
        wm = new Wppsi48Modelo();
        
        int dc = (dcn.getText().equals(""))?-1:Integer.parseInt(dcn.getText());
        int in = (inn.getText().equals(""))?-1:Integer.parseInt(inn.getText());
        int mt = (mtn.getText().equals(""))?-1:Integer.parseInt(mtn.getText());
        int vc = (vcn.getText().equals(""))?-1:Integer.parseInt(vcn.getText());
        int cp = (cpn.getText().equals(""))?-1:Integer.parseInt(cpn.getText());
        int bs = (bsn.getText().equals(""))?-1:Integer.parseInt(bsn.getText());
        int ps = (psn.getText().equals(""))?-1:Integer.parseInt(psn.getText());
        int cl = (cln.getText().equals(""))?-1:Integer.parseInt(cln.getText());
        int cm = (cmn.getText().equals(""))?-1:Integer.parseInt(cmn.getText());
        int fi = (fin.getText().equals(""))?-1:Integer.parseInt(fin.getText());
        int se = (sen.getText().equals(""))?-1:Integer.parseInt(sen.getText());
        int vr = (vrn.getText().equals(""))?-1:Integer.parseInt(vrn.getText());
        int rc = (rcn.getText().equals(""))?-1:Integer.parseInt(rcn.getText());
        int dn = (dnn.getText().equals(""))?-1:Integer.parseInt(dnn.getText());
        
        try{
        String fechan = fechaaplic.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        wm.setFkBebe(idbebe);
        wm.setDisenioCubosNatural(dc);
        wm.setInformacionNatural(in);
        wm.setMatricesNatural(mt);
        wm.setVocabularioNatural(vc);
        wm.setConceptosConDibujosNatural(cp);
        wm.setBusquedaSimbolosNatural(bs);
        wm.setPistasNatural(ps);
        wm.setClavesNatural(cl);
        wm.setComprensionNatural(cm);
        wm.setFigurasIncompletasNatural(fi);
        wm.setSemejanzasNatural(se);
        wm.setVocabularioReceptivoNatural(vr);
        wm.setRompecabezasNatural(rc);
        wm.setDenominacionesNatural(dn);
        wm.setFechaAplicacion(fechan);
        wm.setDcfi(dcfi.isSelected()?1:0);
        wm.setDcrc(dcrc.isSelected()?1:0);
        wm.setIncm(incm.isSelected()?1:0);
        wm.setInse(inse.isSelected()?1:0);
        wm.setMtfi(mtfi.isSelected()?1:0);
        wm.setMtrc(mtrc.isSelected()?1:0);
        wm.setVccm(vccm.isSelected()?1:0);
        wm.setVcse(vcse.isSelected()?1:0);
        wm.setCpfi(cpfi.isSelected()?1:0);
        wm.setCprc(cprc.isSelected()?1:0);
        wm.setPscm(pscm.isSelected()?1:0);
        wm.setPsse(psse.isSelected()?1:0);
        wm.setClbs(clbs.isSelected()?1:0);
        creable = wm.setEscalares();
        
        int[] sumas = wm.setEquivalentes();
        
        dce.setText(wm.getDisenioCubosEscalar()+"");
        ine.setText(wm.getInformacionEscalar()+"");
        mte.setText(wm.getMatricesEscalar()+"");
        vce.setText(wm.getVocabularioEscalar()+"");
        cpe.setText(wm.getConceptosConDibujosEscalar()+"");
        bse.setText(wm.getBusquedaSimbolosEscalar()+"");
        pse.setText(wm.getPistasEscalar()+"");
        cle.setText(wm.getClavesEscalar()+"");
        cme.setText(wm.getComprensionEscalar()+"");
        fie.setText(wm.getFigurasIncompletasEscalar()+"");
        see.setText(wm.getSemejanzasEscalar()+"");
        vre.setText(wm.getVocabularioReceptivoEscalar()+"");
        rce.setText(wm.getRompecabezasEscalar()+"");
        dne.setText(wm.getDenominacionesEscalar()+"");
        sumaciv.setText(sumas[0]+"");
        sumacie.setText(sumas[1]+"");
        sumacvp.setText(sumas[2]+"");
        sumacit.setText(sumas[3]+"");
        sumacgl.setText(sumas[4]+"");
        compciv.setText(wm.getEquivciv()[0]);
        rpciv.setText(wm.getEquivciv()[1]);
        ic1civ.setText(wm.getEquivciv()[2]);
        ic2civ.setText(wm.getEquivciv()[3]);
        compcie.setText(wm.getEquivcie()[0]);
        rpcie.setText(wm.getEquivcie()[1]);
        ic1cie.setText(wm.getEquivcie()[2]);
        ic2cie.setText(wm.getEquivcie()[3]);
        compcvp.setText(wm.getEquivcvp()[0]);
        rpcvp.setText(wm.getEquivcvp()[1]);
        ic1cvp.setText(wm.getEquivcvp()[2]);
        ic2cvp.setText(wm.getEquivcvp()[3]);
        compcit.setText(wm.getEquivcit()[0]);
        rpcit.setText(wm.getEquivcit()[1]);
        ic1cit.setText(wm.getEquivcit()[2]);
        ic2cit.setText(wm.getEquivcit()[3]);
        compcgl.setText(wm.getEquivcgl()[0]);
        rpcgl.setText(wm.getEquivcgl()[1]);
        ic1cgl.setText(wm.getEquivcgl()[2]);
        ic2cgl.setText(wm.getEquivcgl()[3]);
        if(editable) creable = false;
        } catch (Exception e) {
            creable = false;
        }
    }
    
    public void clear() {
        dce.setText("");
        ine.setText("");
        mte.setText("");
        vce.setText("");
        cpe.setText("");
        bse.setText("");
        pse.setText("");
        cle.setText("");
        cme.setText("");
        fie.setText("");
        see.setText("");
        vre.setText("");
        rce.setText("");
        dne.setText("");
        sumaciv.setText("0");
        sumacie.setText("0");
        sumacvp.setText("0");
        sumacit.setText("0");
        sumacgl.setText("0");
        compciv.setText("");
        compcie.setText("");
        compcvp.setText("");
        compcit.setText("");
        compcgl.setText("");
        rpciv.setText("");
        rpcie.setText("");
        rpcvp.setText("");
        rpcit.setText("");
        rpcgl.setText("");
        ic1civ.setText("");
        ic1cie.setText("");
        ic1cvp.setText("");
        ic1cit.setText("");
        ic1cgl.setText("");
        ic2civ.setText("");
        ic2cie.setText("");
        ic2cvp.setText("");
        ic2cit.setText("");
        ic2cgl.setText("");
    }

    @FXML
    private void agregar(ActionEvent event) throws SQLException, IOException {
        if(editable == true) {
            int dc = (dcn.getText().equals("")) ? -1 : Integer.parseInt(dcn.getText());
            int in = (inn.getText().equals("")) ? -1 : Integer.parseInt(inn.getText());
            int mt = (mtn.getText().equals("")) ? -1 : Integer.parseInt(mtn.getText());
            int vc = (vcn.getText().equals("")) ? -1 : Integer.parseInt(vcn.getText());
            int cp = (cpn.getText().equals("")) ? -1 : Integer.parseInt(cpn.getText());
            int bs = (bsn.getText().equals("")) ? -1 : Integer.parseInt(bsn.getText());
            int ps = (psn.getText().equals("")) ? -1 : Integer.parseInt(psn.getText());
            int cl = (cln.getText().equals("")) ? -1 : Integer.parseInt(cln.getText());
            int cm = (cmn.getText().equals("")) ? -1 : Integer.parseInt(cmn.getText());
            int fi = (fin.getText().equals("")) ? -1 : Integer.parseInt(fin.getText());
            int se = (sen.getText().equals("")) ? -1 : Integer.parseInt(sen.getText());
            int vr = (vrn.getText().equals("")) ? -1 : Integer.parseInt(vrn.getText());
            int rc = (rcn.getText().equals("")) ? -1 : Integer.parseInt(rcn.getText());
            int dn = (dnn.getText().equals("")) ? -1 : Integer.parseInt(dnn.getText());
            try{
                String fechan = fechaaplic.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                wppsi48AEditar.updateWppsi48(wppsi48AEditar.getIdWppsi48(), -1, dc, in, se, mt, vc, cp, bs, ps, cl, cm, fi, vr, rc, dn, fechan, -1, dcfi.isSelected() ? 1 : 0, dcrc.isSelected() ? 1 : 0, pscm.isSelected() ? 1 : 0, psse.isSelected() ? 1 : 0, clbs.isSelected() ? 1 : 0, mtfi.isSelected() ? 1 : 0, mtrc.isSelected() ? 1 : 0, incm.isSelected() ? 1 : 0, inse.isSelected() ? 1 : 0, vccm.isSelected() ? 1 : 0, vcse.isSelected() ? 1 : 0, cpfi.isSelected() ? 1 : 0, cprc.isSelected() ? 1 : 0);
                alertInformation("Éxito","","WPPSI editado de forma exitosa.");
                Stage actualWindow = (Stage) dcn.getScene().getWindow();
                actualWindow.close();
            } catch (Exception e) {
                alerta = new Alertas(dcn.getParent().getScene().getWindow());
                alerta.alertInformation("Error en los datos", "Datos inválidos.", "Los datos proporcionados no permiten la edición en la base."
                    + "\n Compruebe que la fecha de la cita encaje con la fecha de nacimiento para que el infante tenga una edad válida para aplicar WPPSI303642.");
                return; //Poner mensaje si se quiere
            }
        }
        if(wm==null || creable == false) {
            alerta = new Alertas(dcn.getParent().getScene().getWindow());
            alerta.alertInformation("Error en los datos", "Datos inválidos.", "Los datos proporcionados no permiten la inserción en la base."
                    + "\n Compruebe que la fecha de la cita encaje con la fecha de nacimiento para que el infante tenga una edad válida para aplicar WPPSI303642.");
            return; //Poner mensaje si se quiere
        }
            
        wm.createWppsi48();
        alertInformation("Éxito","","WPPSI creado de forma exitosa.");
        Stage actualWindow = (Stage) dcn.getScene().getWindow();
        actualWindow.close();
    }
    void setEditable(boolean b) {
        this.editable = b;
    }

    void setIdBebeActualizar(int id) {
        this.idBebeAtualizar = id;
    }

    void setWppsiAEditar(Wppsi48Modelo wm) {
        this.wppsi48AEditar = wm;
    }

    void setCampos() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(wppsi48AEditar.getFechaAplicacion(), formatter);
        fechaaplic.setValue(localDate);
        dcn.setText(wppsi48AEditar.getDisenioCubosNatural()+"");
        mtn.setText(wppsi48AEditar.getMatricesNatural()+"");
        vcn.setText(wppsi48AEditar.getVocabularioNatural()+"");
        cpn.setText(wppsi48AEditar.getConceptosConDibujosNatural()+"");
        bsn.setText(wppsi48AEditar.getBusquedaSimbolosNatural()+"");
        psn.setText(wppsi48AEditar.getPistasNatural()+"");
        cln.setText(wppsi48AEditar.getClavesNatural()+"");
        cmn.setText(wppsi48AEditar.getComprensionNatural()+"");
        fin.setText(wppsi48AEditar.getFigurasIncompletasNatural()+"");
        sen.setText(wppsi48AEditar.getSemejanzasNatural()+"");
        vrn.setText(wppsi48AEditar.getVocabularioReceptivoNatural()+"");
        inn.setText(wppsi48AEditar.getInformacionNatural()+"");
        rcn.setText(wppsi48AEditar.getRompecabezasNatural()+"");
        dnn.setText(wppsi48AEditar.getDenominacionesNatural()+"");
        dcfi.setSelected(wppsi48AEditar.getDcfi()==1?true:false);
        dcrc.setSelected(wppsi48AEditar.getDcrc()==1?true:false);
        pscm.setSelected(wppsi48AEditar.getPscm()==1?true:false);
        psse.setSelected(wppsi48AEditar.getPsse()==1?true:false);
        clbs.setSelected(wppsi48AEditar.getClbs()==1?true:false);
        mtfi.setSelected(wppsi48AEditar.getMtfi()==1?true:false);
        mtrc.setSelected(wppsi48AEditar.getMtrc()==1?true:false);
        incm.setSelected(wppsi48AEditar.getIncm()==1?true:false);
        inse.setSelected(wppsi48AEditar.getInse()==1?true:false);
        vccm.setSelected(wppsi48AEditar.getVccm()==1?true:false);
        vcse.setSelected(wppsi48AEditar.getVcse()==1?true:false);
        cpfi.setSelected(wppsi48AEditar.getCpfi()==1?true:false);
        cprc.setSelected(wppsi48AEditar.getCprc()==1?true:false);
    }
    
    private void alertInformation(String titulo, String header, String contenido) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.initOwner(dcn.getParent().getScene().getWindow());
        alert.getDialogPane().getStylesheets().add("/babywizardjavafx/vista/EstiloGeneral.css");
        alert.setTitle(titulo);
        if(header.equals("")) {
            alert.setHeaderText(null);
        } else {alert.setHeaderText(header);}
        alert.setContentText(contenido);
        alert.showAndWait();
    }
}