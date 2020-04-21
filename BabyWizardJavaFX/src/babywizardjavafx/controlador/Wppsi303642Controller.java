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
public class Wppsi303642Controller implements Initializable {
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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
    
      /*  public int[] naturalesAEscalares4042(int dc, int in, int mt,int vb, int cd, int bs, int ps, int cl, int cm, int fi, int se, int vr, int rc, int dn){
        int[] ptsEsc = new int[14];
        int[] conDC = {};
        int[] conIN = {};
        int[] conMT = {};
        int[] conVB = {};
        int[] conCD = {};
        int[] conBS = {};
        int[] conPS = {};
        int[] conCL = {};
        int[] conCM = {};
        int[] conFI = {};
        int[] conSE = {};
        int[] conVR = {};
        int[] conRC = {};
        int[] conDN = {};
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
*/
}
