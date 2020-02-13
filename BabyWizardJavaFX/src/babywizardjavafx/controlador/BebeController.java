/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx.controlador;

import babywizardjavafx.modelo.BebeModelo;
import java.sql.SQLException;

/**
 *
 * @author Vicaris
 */
public class BebeController {
    
    public void insertBebe(/**BebeModelo bm**/) throws SQLException{
        BebeModelo b = new BebeModelo("BebeEjemplo","ApellidoEjemplo","ApellidoDos",0,"2020-01-02",1);
        b.createBebe();
    }
}
