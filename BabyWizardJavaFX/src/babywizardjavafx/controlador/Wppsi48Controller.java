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
    
    public int[] naturalesAEscalares4850(int dcn, int inn, int mtn, int vbn, int cdn, int bsn, int psn, int cln, int cmn, int fin, int sen, int vrn, int rcn, int dnn){
        int[] ptsEsc = new int[14];
        
        int[] convDC = {1,2,3,3,4,4,4,5,5,6,6,6,7,7,8,8,9,9,10,10,11,11,12,12,13,14,15,16,17,18,19,19,19,19,19,19,19,19,19,19,19};
        int[] convIN = {1,1,1,1,2,2,2,3,3,4,4,4,5,5,6,7,8,8,9,9,10,11,12,13,14,14,15,16,17,18,18,19,19,19,19};
        int[] convMT = {2,4,5,6,7,8,9,9,10,11,11,12,13,13,14,14,15,15,16,17,17,18,18,18,19,19,19,19,19,19};
        int[] convVB = {1,2,3,4,5,5,6,7,8,8,9,9,10,10,11,11,12,12,13,13,14,14,15,15,15,16,16,17,17,17,18,18,18,19,19,19,19,19,19,19,19,19,19,19};
        int[] convCD = {3,5,6,7,8,9,9,10,11,11,12,12,13,13,14,14,15,15,16,16,17,17,18,18,19,19,19,19,19};
        int[] convBS = {5,7,8,9,10,10,10,10,11,11,11,11,11,12,12,12,12,12,13,13,13,14,14,14,14,15,15,15,15,15,16,16,16,16,16,16,17,17,17,17,17,17,18,18,18,18,19,19,19,19,19};
        int[] convPS = {4,6,7,7,8,8,9,9,10,10,11,11,12,12,12,13,13,14,14,15,15,16,16,17,17,18,19,19,19};
        int[] convCL = {4,6,7,7,8,8,8,8,9,9,9,9,10,10,10,10,10,11,11,11,11,11,12,12,12,12,12,12,13,13,13,13,13,14,14,14,14,15,15,15,15,15,15,16,16,16,16,16,16,17,17,17,17,17,17,18,18,18,18,18,19,19,19,19,19,19};
        int[] convCM = {5,7,8,8,9,9,10,10,10,11,11,11,12,12,12,13,13,13,14,14,14,15,15,};
        
        for(int i = 0; i<convCL.length;i++){
            System.out.println(i+" "+convCL[i]);
        }
        
        return ptsEsc;
    }
}
