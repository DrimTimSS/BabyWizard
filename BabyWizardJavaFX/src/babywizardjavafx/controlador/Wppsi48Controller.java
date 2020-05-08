/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx.controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Vicaris
 */
public class Wppsi48Controller implements Initializable {
    
    int idbebe;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
      
    public int[] naturalesAEscalares4042(int dc, int in, int mt,int vb, int cd, int bs, int ps, int cl, int cm, int fi, int se, int vr, int rc, int dn){
        int[] ptsEsc = new int[14];
        int[] conDC = {1,2,3,3,4,4,4,5,5,6,6,6,7,7,8,8,9,9,10,10,11,11,12,12,13,14,15,16,17,18,19,19,19,19,19,19,19,19,19,19,19};
        int[] conIN = {1,1,1,1,2,2,2,3,3,4,4,4,5,5,6,7,8,8,9,9,10,11,12,13,14,14,15,16,17,18,18,19,19,19,19};
        int[] conMT = {2,4,5,6,7,8,9,9,10,11,11,12,13,13,14,14,15,15,16,17,17,18,18,18,19,19,19,19,19,19};
        int[] conVB = {1,2,3,4,5,5,6,7,8,8,9,9,10,10,11,11,12,12,13,13,14,14,15,15,15,16,16,17,17,17,18,18,18,19,19,19,19,19,19,19,19,19,19,19};
        int[] conCD = {3,5,6,7,8,9,9,10,11,11,12,12,13,13,14,14,15,15,16,16,17,17,18,18,19,19,19,19,19};
        int[] conBS = {5,7,8,9,10,10,10,10,11,11,11,11,11,12,12,12,12,12,13,13,13,14,14,14,14,15,15,15,15,15,16,16,16,16,16,16,17,17,17,17,17,17,18,18,18,18,19,19,19,19,19};
        int[] conPS = {4,6,7,7,8,8,9,9,10,10,11,11,12,12,12,13,13,14,14,15,15,16,16,17,17,18,19,19,19};
        int[] conCL = {4,6,7,7,8,8,8,8,9,9,9,9,10,10,10,10,10,11,11,11,11,11,12,12,12,12,12,12,13,13,13,13,13,14,14,14,14,15,15,15,15,15,15,16,16,16,16,16,16,17,17,17,17,17,17,18,18,18,18,18,19,19,19,19,19,19};
        int[] conCM = {5,7,8,8,9,9,10,10,10,11,11,11,12,12,12,13,13,13,14,14,14,15,15,16,16,16,17,17,17,17,18,18,18,19,19,19,19,19,19};
        int[] conFI = {2,4,5,6,7,7,8,8,9,9,10,10,11,11,12,12,12,13,13,14,14,15,15,16,16,16,17,17,18,18,19,19,19};
        int[] conSE = {6,7,7,8,8,9,9,9,10,10,10,10,10,11,11,11,12,12,12,13,13,13,13,14,14,14,15,15,15,16,16,16,16,17,17,17,18,18,18,19,19,19,19,19,19,19,19};
        int[] conVR = {1,1,1,2,2,3,3,4,4,4,5,5,5,6,6,7,7,8,8,8,9,9,10,10,11,11,12,12,13,13,14,15,15,16,17,18,19,19,19};
        int[] conRC = {1,3,4,4,5,6,6,6,7,7,8,8,9,9,9,10,10,10,10,11,11,11,11,12,12,12,13,13,13,14,14,15,15,16,16,17,18,19};
        int[] conDN = {1,1,1,1,2,3,3,4,4,5,6,6,7,8,8,9,10,10,11,12,13,13,14,15,16,16,17,18,19,19,19};
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
        int[] conDC = {1,2,2,3,3,4,4,4,5,5,5,6,6,7,7,8,8,9,9,10,10,11,11,12,12,13,14,15,16,17,18,19,19,19,19,19,19,19,19,19,19};
        int[] conIN = {1,1,1,1,1,2,2,2,3,3,4,4,4,5,5,6,7,8,8,9,9,10,11,12,13,14,15,16,17,17,18,19,19,19,19};
        int[] conMT = {1,3,4,5,6,7,8,9,9,10,11,11,12,12,13,14,14,15,15,16,16,17,17,18,18,19,19,19,19,19};
        int[] conVB = {1,2,3,4,5,5,6,6,7,8,8,9,9,10,10,11,11,12,12,13,13,13,14,14,15,15,15,16,16,17,17,18,18,18,19,19,19,19,19,19,19,19,19,19};
        int[] conCD = {2,4,5,6,7,8,9,9,10,10,11,12,12,13,13,14,14,15,15,16,16,17,17,18,18,19,19,19,19};
        int[] conBS = {4,6,7,8,9,9,10,10,10,10,11,11,11,11,11,12,12,12,12,12,13,13,13,14,14,14,14,15,15,15,15,15,16,16,16,16,16,16,17,17,17,17,17,18,18,18,18,19,19,19,19};
        int[] conPS = {3,5,6,7,7,8,8,9,9,10,10,11,11,12,12,13,13,13,14,14,15,15,16,16,17,17,18,19,19};
        int[] conCL = {3,5,6,6,7,7,7,8,8,8,9,9,9,9,10,10,10,10,10,11,11,11,11,11,11,12,12,12,12,12,12,13,13,13,13,13,14,14,14,14,15,15,15,15,15,15,16,16,16,16,16,17,17,17,17,17,17,18,18,18,18,18,19,19,19,19};
        int[] conCM = {4,6,7,8,8,9,9,10,10,10,11,11,11,12,12,12,13,13,13,13,13,14,14,14,15,15,16,16,16,16,17,17,17,18,18,18,19,19,19,19,19};
        int[] conFI = {1,3,4,5,6,6,7,7,8,8,9,9,10,10,11,11,12,12,13,13,14,14,14,15,15,16,16,17,17,18,18,19,19};
        int[] conSE = {5,6,7,7,8,8,9,9,9,10,10,10,10,10,11,11,11,12,12,12,12,13,13,13,13,14,14,14,15,15,15,16,16,16,17,17,17,18,18,18,19,19,19,19,19,19,19};
        int[] conVR = {1,1,1,2,2,2,3,3,3,4,4,4,5,5,6,6,6,7,7,8,8,9,9,9,10,10,11,11,12,13,13,14,15,16,17,18,19,19,19};
        int[] conRC = {1,2,3,4,4,5,5,6,6,7,7,8,8,8,9,9,9,10,10,10,10,11,11,11,11,12,12,12,13,13,13,14,14,15,16,16,17,18};
        int[] conDN = {1,1,1,1,1,2,3,3,4,45,6,6,7,8,8,9,10,10,11,12,13,13,14,15,16,17,18,18,19,19};
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
        int[] conDC = {1,1,2,2,3,3,4,4,4,5,5,5,6,6,7,7,8,8,9,9,10,10,10,11,11,12,13,13,14,15,16,18,19,19,19,19,19,19,19,19,19};
        int[] conIN = {1,1,1,1,1,1,2,2,2,3,3,4,4,4,5,5,6,7,8,8,9,9,10,11,12,13,14,15,16,17,18,19,19,19,19};
        int[] conMT = {1,2,3,4,5,6,7,8,9,9,10,11,11,12,12,13,13,13,14,14,15,15,15,16,16,17,17,17,18,18,18,19,19,19,19,19,19,19,19};
        int[] conVB = {1,2,2,3,4,5,5,6,6,7,8,8,9,9,10,10,11,11,12,12,13,13,13,14,14,15,15,15,16,16,17,17,17,17,18,18,18,19,19,19,19,19,19,19,19};
        int[] conCD = {2,4,5,6,7,7,8,9,9,10,10,11,11,12,13,13,14,14,15,15,16,16,17,17,18,18,19,19,19};
        int[] conBS = {4,6,7,8,8,9,9,9,10,10,10,11,11,11,11,11,11,12,12,12,12,12,13,13,13,13,14,14,14,15,15,15,15,15,16,16,16,16,16,16,17,17,17,17,17,18,18,18,18,19,19,19};
        int[] conPS = {3,5,5,6,7,7,8,8,9,9,10,10,11,11,12,12,13,13,14,14,15,15,16,16,17,17,18,19,19};
        int[] conCL = {2,4,5,5,6,6,7,7,7,8,8,8,9,9,9,9,10,10,10,10,10,11,11,11,11,11,11,12,12,12,12,12,12,13,13,13,13,13,14,14,14,14,14,15,15,15,15,15,15,16,16,16,16,16,17,17,17,17,17,18,18,18,18,19,19,19};
        int[] conCM = {3,5,6,7,8,8,9,9,10,10,10,10,11,11,11,12,12,13,13,13,14,14,14,15,15,15,16,16,16,17,17,17,18,18,18,19,19,19,19};
        int[] conFI = {1,2,3,4,5,6,6,7,7,8,8,9,9,10,10,11,11,11,12,12,13,13,14,14,15,15,16,16,17,17,18,18,19};
        int[] conSE = {4,5,6,7,7,8,8,9,9,9,10,10,10,10,10,10,11,11,11,12,12,12,12,13,13,13,14,14,14,14,15,15,16,16,16,17,17,17,18,18,18,19,19,19,19,19,19};
        int[] conVR = {1,1,1,1,1,2,2,2,3,3,3,4,4,4,5,5,6,6,7,7,7,8,8,9,9,10,10,11,11,12,12,13,14,15,16,17,18,19,19};
        int[] conRC = {1,2,3,3,4,4,5,5,6,6,7,7,8,8,8,8,9,9,9,10,10,10,10,11,11,11,11,12,12,12,13,13,14,14,15,16,17,18};
        int[] conDN = {1,1,1,1,1,12,3,3,4,4,5,6,6,7,8,8,9,10,10,11,12,13,14,14,15,16,17,18,19,19};
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
        int[] conDC = {1,1,1,2,2,3,3,4,4,4,5,5,5,6,6,7,7,8,8,9,9,10,10,10,11,11,12,13,13,14,15,16,18,19,19,19,19,19,19,19,19};
        int[] conIN = {1,1,1,1,1,1,2,2,2,3,3,3,4,4,4,5,5,6,7,8,8,9,10,11,11,12,13,14,15,16,17,18,19,19,19};
        int[] conMT = {1,2,3,4,5,6,7,7,8,9,9,10,10,11,12,12,13,13,14,15,15,16,16,17,17,18,19,19,19,19};
        int[] conVB = {1,2,2,3,3,4,5,5,6,6,7,8,8,9,9,10,10,11,11,11,12,12,13,13,14,14,14,15,15,15,16,16,17,17,18,18,18,19,19,19,19,19,19,19};
        int[] conCD = {1,3,4,5,6,7,7,8,8,9,10,10,11,11,12,12,13,14,14,15,15,16,16,17,17,18,18,19,19};
        int[] conBS = {4,5,6,7,8,8,9,9,9,10,10,10,10,11,11,11,11,11,12,12,12,12,12,13,13,13,13,14,14,14,14,15,15,15,15,16,16,16,16,16,16,17,17,17,17,18,18,18,19,19,19};
        int[] conPS = {3,4,5,6,6,7,7,8,8,9,9,10,10,11,11,12,12,13,13,14,14,15,16,16,17,17,18,19,19};
        int[] conCL = {1,3,4,4,5,5,6,6,7,7,7,8,8,8,9,9,9,9,10,10,10,10,10,10,11,11,11,11,11,12,12,12,12,12,12,13,13,13,13,13,14,14,14,14,14,15,15,15,15,15,15,15,16,16,16,16,17,17,17,17,17,18,18,18,19,19};
        int[] conCM = {3,4,5,6,7,7,8,8,9,9,10,10,10,11,11,11,12,12,12,13,13,13,14,14,15,15,15,16,16,16,17,17,17,18,18,18,19,19,19};
        int[] conFI = {1,2,3,4,4,5,6,6,7,7,7,8,8,9,9,10,11,11,12,12,12,13,13,14,14,14,15,15,16,17,17,18,19};
        int[] conSE = {3,4,5,6,6,7,7,8,8,9,9,9,10,10,10,10,10,11,11,11,11,12,12,12,12,13,13,13,14,14,14,15,15,15,16,16,17,17,17,18,18,18,19,19,19,19,19};
        int[] conVR = {1,1,1,1,1,1,2,2,2,3,3,3,3,4,4,5,5,5,6,6,7,7,8,8,9,9,9,10,10,11,12,12,13,14,15,16,17,18,19};
        int[] conRC = {1,2,3,3,3,4,4,5,5,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10,11,11,11,12,12,12,13,13,14,14,15,16,17};
        int[] conDN = {1,1,1,1,1,1,1,2,3,3,4,4,5,6,6,7,8,8,9,10,11,11,12,13,14,15,16,17,18,19,19};
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
        int[] conDC = {1,1,1,2,2,2,3,3,4,4,4,5,5,5,6,6,6,7,7,8,8,9,9,10,10,11,11,12,12,13,14,15,16,18,19,19,19,19,19,19,19};
        int[] conIN = {1,1,1,1,1,1,1,2,2,2,3,3,3,4,4,4,5,5,6,7,7,8,9,10,11,12,13,14,15,16,17,17,18,19,19};
        int[] conMT = {1,2,3,4,4,5,6,7,7,8,9,9,10,10,11,12,12,13,13,14,15,15,16,16,17,18,18,19,19,19};
        int[] conVB = {1,1,2,2,3,34,5,5,6,6,7,8,8,9,9,9,10,10,11,11,12,12,13,13,13,14,14,15,15,15,16,16,17,17,17,18,18,18,19,19,19,19,19};
        int[] conCD = {1,3,4,5,5,6,6,7,8,8,9,9,10,11,11,12,12,13,13,14,15,15,16,16,17,17,18,18,19};
        int[] conBS = {3,4,5,6,7,7,8,8,9,9,10,10,10,10,11,11,11,11,11,12,12,12,12,13,13,13,13,14,14,14,14,15,15,15,15,16,16,16,16,16,16,17,17,17,17,18,18,18,19,19};
        int[] conPS = {2,4,4,5,5,6,6,7,7,8,8,9,9,10,10,11,12,12,13,13,14,14,15,16,16,17,18,18,19};
        int[] conCL = {1,2,3,4,4,5,5,5,6,6,7,7,7,8,8,8,8,9,9,9,9,10,10,10,10,10,11,11,11,11,11,12,12,12,12,12,12,13,13,13,13,13,14,14,14,14,14,15,15,15,15,15,15,16,16,16,16,16,17,17,17,17,17,18,18,19};
        int[] conCM = {2,3,4,5,6,67,7,8,8,9,9,10,10,10,11,11,11,12,12,12,13,13,13,14,14,14,15,15,16,16,16,17,17,18,18,18,19,19};
        int[] conFI = {1,2,2,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10,11,11,12,12,13,13,14,14,15,15,16,16,17,18,19};
        int[] conSE = {2,3,4,5,6,6,7,7,8,8,8,9,9,9,10,10,10,10,10,11,11,11,11,12,12,12,12,13,13,13,14,14,14,15,15,15,16,16,17,17,18,18,18,19,19,19,19,19};
        int[] conVR = {1,1,1,1,1,1,1,1,2,2,2,3,3,3,4,4,4,5,5,6,6,7,7,8,8,8,9,9,10,10,11,11,12,13,14,15,16,18,19};
        int[] conRC = {1,2,2,3,3,3,4,4,5,5,5,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10,11,11,11,12,12,12,13,13,14,15,16};
        int[] conDN = {1,1,1,1,1,1,1,2,2,3,3,4,5,5,6,6,7,8,9,9,10,11,11,12,13,14,15,16,17,18,19};
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
        int[] conDC = {1,1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,7,7,8,8,9,9,10,10,11,11,12,12,13,14,15,16,18,19,19,19,19,19,19};
        int[] conIN = {1,1,1,1,1,1,1,2,2,2,3,3,3,4,4,4,5,5,6,7,7,8,9,9,10,11,12,13,14,15,16,17,18,19,19};
        int[] conMT = {1,2,3,3,4,5,5,6,7,7,8,9,9,10,10,11,12,12,13,13,14,15,15,16,16,17,18,18,19,19};
        int[] conVB = {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10,11,11,12,12,12,13,13,14,14,14,15,15,15,16,16,17,17,18,18,18,19,19,19,19};
        int[] conCD = {1,3,4,4,5,5,6,6,7,7,8,9,9,10,10,11,12,12,13,13,14,14,15,16,16,17,17,18,19};
        int[] conBS = {3,4,5,5,6,6,7,7,8,8,9,9,9,10,10,10,10,11,11,11,11,11,12,12,12,12,13,13,13,13,14,14,14,14,15,15,15,15,16,16,16,16,16,16,17,17,17,18,18,19,19};
        int[] conPS = {2,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10,11,11,12,13,13,14,15,15,16,1717,18,19};
        int[] conCL = {1,2,2,3,4,4,4,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,9,10,10,10,10,10,11,11,11,11,11,12,12,12,12,12,12,13,13,13,13,13,14,14,14,14,14,15,15,15,15,15,15,16,16,16,16,16,17,17,17,17,18,19};
        int[] conCM = {2,3,4,5,5,6,6,7,7,8,8,8,9,9,10,10,10,11,11,11,12,12,13,13,13,14,14,14,15,15,15,16,16,17,17,18,18,18,19};
        int[] conFI = {1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,8,9,9,10,10,11,11,12,13,13,14,14,15,15,16,17,18,19};
        int[] conSE = {1,3,4,5,5,6,6,7,7,7,8,8,8,9,9,9,10,10,10,10,11,11,11,11,12,12,12,13,13,13,13,14,14,14,15,15,16,16,17,17,18,18,18,19,19,19,19};
        int[] conVR = {1,1,1,1,1,1,1,1,1,2,2,2,3,3,3,3,4,4,5,5,5,6,6,7,7,8,8,9,9,10,10,11,11,12,13,14,15,17,19};
        int[] conRC = {1,2,2,3,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10,11,11,11,12,12,13,13,14,15};
        int[] conDN = {1,1,1,1,1,1,1,1,2,2,3,3,4,5,5,6,7,7,8,9,9,10,11,12,13,13,14,16,17,18,19};
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
        int[] conDC = {1,1,1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,7,7,8,8,9,9,10,10,11,11,12,12,13,14,15,16,18,19,19,19,19,19};
        int[] conIN = {1,1,1,1,1,1,1,1,2,2,2,3,3,3,4,4,4,5,5,6,7,7,8,8,9,10,11,12,13,14,15,16,17,18,19};
        int[] conMT = {1,2,2,3,4,4,5,5,6,7,7,8,9,9,10,10,11,12,12,13,13,14,15,15,16,16,17,18,19,19};
        int[] conVB = {1,1,2,2,3,3,4,4,4,5,5,6,6,7,7,8,8,9,9,10,10,10,11,11,11,12,12,13,13,13,14,14,15,15,15,16,16,17,17,17,18,18,19,19,19};
        int[] conCD = {1,2,3,4,4,5,5,5,6,6,7,7,8,9,9,10,10,11,11,12,13,13,14,14,15,16,16,17,18,19};
        int[] conBS = {3,4,5,5,6,6,6,7,7,8,8,8,8,9,9,10,10,10,10,11,11,11,11,11,12,12,12,12,13,13,13,13,14,14,14,14,15,15,15,15,16,16,16,16,16,17,17,17,18,18,19};
        int[] conPS = {1,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,11,11,12,12,13,14,15,15,16,17,18,19};
        int[] conCL = {1,2,2,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,8,9,9,9,9,10,10,10,10,10,11,11,11,11,11,12,12,12,12,12,13,13,13,13,13,14,14,14,14,14,15,15,15,15,15,16,16,16,16,16,17,17,17,17,18,19};
        int[] conCM = {1,3,4,4,5,5,6,6,7,7,8,8,8,9,9,9,10,10,10,11,11,12,12,12,13,13,14,14,14,15,15,16,16,16,17,17,18,18,19};
        int[] conFI = {1,1,2,2,3,3,4,4,5,5,6,6,7,7,7,8,8,9,9,10,10,11,11,12,12,13,14,14,15,16,17,18,19};
        int[] conSE = {1,3,4,5,5,6,6,6,7,7,7,8,8,8,9,9,9,9,10,10,10,10,11,11,11,11,12,12,12,13,13,13,14,14,14,15,15,16,16,17,17,18,18,18,19,19,19};
        int[] conVR = {1,1,1,1,1,1,1,1,1,1,2,2,2,2,3,3,3,4,4,4,5,5,6,6,7,7,8,8,9,9,10,10,11,11,12,13,14,16,18};
        int[] conRC = {1,2,2,3,3,3,3,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10,10,11,11,12,12,13,14,15};
        int[] conDN = {1,1,1,1,1,1,1,1,1,2,2,3,4,4,5,5,6,7,7,8,9,10,10,11,12,13,14,16,17,18,19};
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
        int[] conDC = {1,1,1,1,1,1,2,2,2,3,3,3,4,4,4,5,5,6,6,7,7,7,8,8,9,9,9,10,10,11,12,12,13,14,15,16,18,19,19,19,19};
        int[] conIN = {1,1,1,1,1,1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,7,7,8,9,9,10,11,12,14,15,16,17,18,19};
        int[] conMT = {1,2,2,3,3,4,4,5,6,6,7,7,8,9,9,10,10,11,12,12,13,13,14,15,15,16,17,17,18,19};
        int[] conVB = {1,1,1,2,2,3,3,4,4,5,5,5,6,6,7,7,8,8,9,9,9,10,10,11,11,12,12,12,13,13,14,14,14,15,15,15,16,16,17,17,18,18,19,19};
        int[] conCD = {1,2,3,4,4,4,5,6,6,6,7,7,8,9,9,10,10,11,11,12,12,13,14,14,15,16,17,18,19};
        int[] conBS = {2,3,4,5,5,6,6,6,7,7,7,8,8,8,9,9,9,9,10,10,10,10,11,11,11,11,12,12,12,12,13,13,13,13,14,14,14,14,14,15,15,15,15,16,16,16,17,17,18,18,19};
        int[] conPS = {1,1,2,2,3,3,4,4,5,6,6,7,7,8,8,9,9,10,10,11,12,13,13,14,15,16,17,18,19};
        int[] conCL = {1,1,2,2,3,3,4,4,4,5,5,5,5,6,6,6,6,7,7,7,7,8,8,8,8,9,9,9,9,10,10,10,10,10,11,11,11,11,11,12,12,12,12,13,13,13,13,13,14,14,14,14,14,15,15,15,15,15,16,16,16,16,17,17,18,19};
        int[] conCM = {1,2,3,4,4,5,5,6,6,6,7,7,8,8,8,9,9,9,10,10,11,11,11,12,12,13,13,13,14,14,15,15,16,16,16,17,17,18,19};
        int[] conFI = {1,1,2,2,3,3,4,4,4,5,5,6,6,7,7,7,8,8,9,9,10,10,11,11,12,12,13,14,15,16,17,18,19};
        int[] conSE = {1,2,3,4,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,9,10,10,10,10,11,11,11,12,12,12,13,13,13,14,14,14,15,15,16,16,17,17,18,18,19,19,19};
        int[] conVR = {1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,3,3,3,4,4,4,5,5,6,6,7,7,8,8,9,9,10,10,11,12,13,14,16,18};
        int[] conRC = {1,2,2,2,3,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9,10,10,10,10,11,11,12,12,13,14};
        int[] conDN = {1,1,1,1,1,1,1,1,1,2,2,3,3,4,4,5,6,6,7,8,8,9,10,11,12,12,14,15,16,17,19};
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
        int[] conDC = {1,1,1,1,1,1,1,2,2,2,3,3,3,4,4,4,5,5,6,6,7,7,7,8,8,9,9,9,10,10,11,11,12,13,14,15,16,18,19,19,19};
        int[] conIN = {1,1,1,1,1,1,1,1,1,2,2,2,3,3,3,4,4,4,5,5,6,7,7,8,8,9,10,11,12,14,15,16,17,18,19};
        int[] conMT = {1,1,2,2,3,4,4,5,5,6,6,7,8,8,9,9,10,10,11,12,12,13,13,14,15,15,16,17,18,19};
        int[] conVB = {1,1,1,2,2,3,3,4,4,4,5,5,5,6,6,7,7,8,8,8,9,9,10,10,10,11,11,12,12,13,13,13,14,14,15,15,15,16,16,17,17,18,18,19};
        int[] conCD = {1,2,3,3,4,4,5,5,6,6,6,7,7,8,8,9,9,10,10,11,12,12,13,14,15,16,17,18,19};
        int[] conBS = {1,2,3,4,5,5,6,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10,11,11,11,11,12,12,12,12,13,13,13,13,14,14,14,14,14,15,15,15,16,16,16,17,17,18,19};
        int[] conPS = {1,1,2,2,3,3,3,4,4,5,5,6,6,7,7,8,8,9,10,10,11,12,13,14,15,16,17,18,19};
        int[] conCL = {1,1,2,2,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,7,7,7,7,7,8,8,8,8,9,9,9,9,9,10,10,10,10,11,11,11,11,11,12,12,12,12,13,13,13,13,13,14,14,14,14,14,15,15,15,15,16,16,16,17,17,18};
        int[] conCM = {1,2,3,4,4,5,5,5,6,6,6,7,7,7,8,8,8,9,9,9,10,10,10,11,11,11,12,12,13,13,14,14,15,15,15,16,17,17,18,19};
        int[] conFI = {1,1,1,2,2,3,3,4,4,5,5,5,6,6,6,7,7,8,8,9,9,10,10,11,11,12,13,13,14,15,16,17,19};
        int[] conSE = {1,2,3,4,5,5,6,6,6,6,7,7,7,7,8,8,8,9,9,9,9,10,10,10,10,11,11,11,12,12,12,13,13,13,14,14,14,15,15,16,16,17,17,18,18,19,19};
        int[] conVR = {1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,3,3,3,4,4,4,5,5,6,6,7,7,8,8,9,9,10,11,12,13,14,15,17};
        int[] conRC = {1,2,2,2,3,3,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,8,9,9,9,9,10,10,10,11,11,12,13,14};
        int[] conDN = {1,1,1,1,1,1,1,1,1,1,2,2,3,3,4,4,5,6,7,7,8,9,9,10,11,12,3,14,16,17,19};
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
        int[] conDC = {1,1,1,1,1,1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,7,7,8,8,8,9,9,9,10,10,11,11,12,13,14,15,16,18,19,19};
        int[] conIN = {1,1,1,1,1,1,1,1,1,2,2,2,3,3,3,4,4,4,5,5,6,6,7,7,8,8,9,10,11,13,14,15,16,17,19};
        int[] conMT = {1,1,2,2,3,3,4,4,5,5,6,7,7,8,8,9,9,10,10,11,12,12,13,13,14,15,16,17,18,19};
        int[] conVB = {1,1,1,2,2,3,3,3,4,4,4,5,5,5,6,6,7,7,7,8,8,9,9,9,10,10,11,11,11,12,12,13,13,13,14,14,15,15,15,16,16,17,18,19};
        int[] conCD = {1,2,3,3,4,4,4,5,5,5,6,6,7,7,8,8,8,9,9,10,10,11,12,13,14,15,16,17,18,19};
        int[] conBS = {1,2,3,4,4,5,5,6,6,6,6,7,7,7,7,8,8,8,8,8,9,9,9,9,10,10,10,10,11,11,11,11,12,12,12,12,13,13,13,14,14,14,14,15,15,15,16,16,17,17,18};
        int[] conPS = {1,1,1,2,2,2,3,3,4,4,4,5,6,6,7,7,8,8,9,9,10,11,11,12,13,14,15,17,18};
        int[] conCL = {1,1,1,2,2,3,3,3,4,4,4,4,4,5,5,5,5,6,6,6,6,7,7,7,7,7,8,8,8,8,9,9,9,9,9,10,10,10,10,11,11,11,11,12,12,12,12,13,13,13,13,14,14,14,14,15,15,15,15,16,16,16,17,17};
        int[] conCM = {1,2,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,9,9,9,10,10,10,11,11,12,12,12,13,13,14,14,15,15,16,17,18,19};
        int[] conFI = {1,1,1,2,2,3,3,4,4,4,5,5,5,6,6,6,7,7,8,8,9,9,9,10,10,111,12,12,13,14,15,16,18};
        int[] conSE = {1,2,3,4,5,5,5,6,6,6,6,7,7,7,7,8,8,8,8,9,9,9,9,10,10,10,10,11,11,11,12,12,12,13,13,13,14,14,15,15,16,16,17,17,18,18,19};
        int[] conVR = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,3,3,3,4,4,4,4,5,5,6,7,7,8,8,9,9,10,11,12,13,14,16};
        int[] conRC = {1,2,2,2,3,3,3,3,3,4,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,8,9,9,9,9,9,10,10,11,11,12,13};
        int[] conDN = {1,1,1,1,1,1,1,1,1,1,2,2,3,3,4,4,5,5,6,7,8,8,9,9,10,11,12,14,15,17,19};
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
        int[] conDC = {1,1,1,1,1,1,1,1,2,2,2,3,3,3,4,4,4,4,5,5,6,6,7,7,8,8,8,9,9,9,10,10,11,12,12,13,14,15,16,18,19};
        int[] conIN = {1,1,1,1,1,1,1,1,1,1,2,2,2,3,3,3,4,4,4,5,5,6,6,7,7,8,8,9,10,11,12,14,15,16,18};
        int[] conMT = {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10,11,12,12,13,13,14,15,16,17,19};
        int[] conVB = {1,1,1,1,2,2,3,3,3,4,4,4,5,5,5,6,6,7,7,8,8,8,9,9,10,10,10,11,11,12,12,12,13,13,13,14,14,15,15,16,17,18,19};
        int[] conCD = {1,2,3,3,4,4,4,5,5,5,6,6,7,7,8,8,9,9,9,10,10,11,12,13,14,15,16,17,19};
        int[] conBS = {1,2,3,4,4,5,5,5,6,6,6,6,6,7,7,7,7,8,8,8,8,8,8,9,9,9,9,10,10,10,10,11,11,11,11,12,12,12,12,13,13,13,14,14,14,15,15,16,16,17,18};
        int[] conPS = {1,1,1,1,1,2,2,3,3,3,4,4,5,5,6,7,7,8,8,9,9,10,11,11,12,13,15,17,18};
        int[] conCL = {1,1,1,2,2,2,2,3,3,3,3,3,4,4,4,4,5,5,5,5,5,6,6,6,6,6,7,7,7,7,7,8,8,8,8,8,9,9,9,9,10,10,10,10,11,11,11,11,12,12,12,12,13,13,13,14,14,14,14,15,15,16,16,16,17};
        int[] conCM = {1,2,3,3,4,4,5,5,5,5,6,6,6,7,7,7,8,8,8,9,9,9,10,10,10,11,11,11,12,12,13,13,14,14,15,15,16,17,19};
        int[] conFI = {1,1,1,2,2,2,3,3,4,4,4,5,5,5,6,6,6,7,7,8,8,8,9,9,10,10,11,12,13,14,15,16,18};
        int[] conSE = {1,2,3,3,4,5,5,5,6,6,6,6,7,7,7,8,8,8,8,9,9,9,9,10,10,10,10,11,11,11,12,12,12,13,13,13,14,14,14,15,15,16,16,17,17,18,19};
        int[] conVR = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,3,3,3,4,4,4,4,5,6,6,7,7,8,8,9,9,10,11,12,13,15};
        int[] conRC = {1,2,2,2,3,3,3,3,3,3,4,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,8,9,9,9,9,9,10,10,11,12,13};
        int[] conDN = {1,1,1,1,1,1,1,1,1,1,1,2,3,3,3,4,4,5,6,6,7,8,8,9,10,10,11,13,15,17,19};
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
        int[] conDC = {1,1,1,1,1,1,1,1,1,2,2,2,3,3,3,4,4,4,5,5,6,6,7,7,7,8,8,9,9,9,10,10,11,12,12,13,14,15,16,18,19};
        int[] conIN = {1,1,1,1,1,1,1,1,1,1,2,2,2,3,3,3,4,4,4,5,5,6,6,7,7,8,8,9,10,11,12,14,15,16,18};
        int[] conMT = {1,1,2,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,11,11,12,12,13,13,14,15,16,18};
        int[] conVB = {1,1,1,1,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,9,9,9,10,10,11,11,11,12,12,12,13,13,14,14,15,15,16,17,19};
        int[] conCD = {1,2,2,3,3,4,4,4,5,5,6,6,7,7,8,8,8,9,9,10,10,11,12,12,13,14,15,16,18};
        int[] conBS = {1,2,3,4,4,4,5,5,6,6,6,6,6,7,7,7,7,7,8,8,8,8,8,9,9,9,9,9,10,10,10,10,10,11,11,11,11,12,12,12,12,13,13,13,14,14,15,15,16,17};
        int[] conPS = {1,1,1,1,1,2,2,3,3,3,3,4,4,4,5,5,6,7,7,8,8,9,10,11,11,12,13,15,17,18};
        int[] conCL = {1,1,1,1,2,2,2,2,2,3,3,3,3,3,4,4,4,4,4,4,5,5,5,5,5,6,6,6,6,6,7,7,7,7,7,7,8,8,8,8,8,9,9,9,9,9,10,10,10,10,11,11,11,11,12,12,12,13,13,13,14,14,14,15,15,16,16};
        int[] conCM = {1,2,3,3,4,4,4,5,5,5,6,6,6,6,7,7,7,8,8,8,9,9,9,10,10,10,11,11,11,12,12,13,13,14,15,15,16,17,19};
        int[] conFI = {1,1,1,1,2,2,2,3,3,4,4,4,5,5,5,6,6,6,7,7,8,8,8,9,9,10,10,11,12,13,14,15,17};
        int[] conSE = {1,1,2,3,3,4,5,5,5,6,6,6,6,7,7,7,7,8,8,8,8,9,9,9,9,10,10,10,10,11,11,11,12,12,12,13,13,14,14,14,15,15,16,16,17,18,19};
        int[] conVR = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,3,3,3,4,4,4,4,5,6,6,7,7,8,8,9,10,11,12,13,15};
        int[] conRC = {1,1,2,2,2,3,3,3,3,3,4,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,8,8,9,9,9,9,9,10,10,10,11,13};
        int[] conDN = {1,1,1,1,1,1,1,1,1,1,1,2,3,3,3,4,4,4,5,6,7,8,8,9,9,10,11,12,14,16,18};
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
        
        int[] civ = {};
        
        
        return equivalentes;
    }
    
    public void inicializarBebe(int idbebe){
        this.idbebe = idbebe;
        System.out.println(idbebe);
    }
}