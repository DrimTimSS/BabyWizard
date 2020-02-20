/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx.controlador;

import babywizardjavafx.modelo.BebeModelo;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author Vicaris
 */
public class BebeControlador {
    
    public void insertBebe(BebeModelo bm) throws SQLException{
        //BebeModelo b = new BebeModelo("BebeEjemplo","ApellidoEjemplo","ApellidoDos",0,"2020-01-02",1);
        bm.createBebe();
    }
    
    public LinkedList<BebeModelo> selectBebe(int idBebe, String nombre, String apellidoMaterno, String apellidoPaterno, int sexo, String fechaNacimiento, int fkUsuario) throws SQLException{
        LinkedList<BebeModelo> bebes = new LinkedList<>();
        BebeModelo bm = new BebeModelo();
        bebes = bm.readBebe(idBebe, nombre, apellidoMaterno, apellidoPaterno, sexo, fechaNacimiento, fkUsuario);
        return bebes;
    }
    
    public void updateBebe(int idBebeActualizar,int idBebe, String nombre, String apellidoMaterno, String apellidoPaterno, int sexo, String fechaNacimiento, int fkUsuario) throws SQLException {
        BebeModelo bm = new BebeModelo();
        bm.updateBebe(idBebeActualizar, idBebe, nombre, apellidoMaterno, apellidoPaterno, sexo, fechaNacimiento, fkUsuario);
    }
    
    public void deleteBebe(int idBebe) throws SQLException {
        BebeModelo bm = new BebeModelo();
        bm.deleteBebe(idBebe);
    }
}
