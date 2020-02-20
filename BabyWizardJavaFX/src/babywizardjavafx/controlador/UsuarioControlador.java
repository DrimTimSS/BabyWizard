/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx.controlador;

import babywizardjavafx.modelo.UsuarioModelo;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author Vicaris
 */
public class UsuarioControlador {
    public void createUsuario(UsuarioModelo um) throws SQLException {
        um.createUsuario();
    }
    
    public LinkedList<UsuarioModelo> selectUsuario(int idUsuario, String nombreU, String apellidoMaternoU, String apellidoPaternoU, int administrador) throws SQLException{
        LinkedList<UsuarioModelo> usuarios = new LinkedList<>();
        UsuarioModelo um = new UsuarioModelo();
        usuarios = um.readUsuario(idUsuario, nombreU, apellidoMaternoU, apellidoPaternoU, administrador);
        return usuarios;
    }
    
    public void updateUsuario(int idUsuarioActualizar,int idUsuario, String nombreU, String apellidoMaternoU, String apellidoPaternoU, int administrador, String contrasenia) throws SQLException {
        UsuarioModelo um = new UsuarioModelo();
        um.updateUsuario(idUsuarioActualizar, idUsuario, nombreU, apellidoMaternoU, apellidoPaternoU, administrador, contrasenia);
    }
    
    public void deleteUsuario(int idUsuario) throws SQLException {
        UsuarioModelo um = new UsuarioModelo();
        um.deleteUsuario(idUsuario);
    }
}
