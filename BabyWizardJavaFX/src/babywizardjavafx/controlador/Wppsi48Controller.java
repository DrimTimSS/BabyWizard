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
    
}
