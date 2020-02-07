/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx.modelo;

/**
 *
 * @author Vicaris
 */
public class UsuarioModelo {
    
    int idUsuario;
    String nombreU;
    String apellidoPaternoU;
    String apellidoMaternoU;
    String contrasenia;
    boolean administrador;

    public UsuarioModelo() {
    }

    public UsuarioModelo(String nombreU, String apellidoPaternoU, String apellidoMaternoU, String contrasenia, boolean administrador) {
        this.nombreU = nombreU;
        this.apellidoPaternoU = apellidoPaternoU;
        this.apellidoMaternoU = apellidoMaternoU;
        this.contrasenia = contrasenia;
        this.administrador = administrador;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreU() {
        return nombreU;
    }

    public void setNombreU(String nombreU) {
        this.nombreU = nombreU;
    }

    public String getApellidoPaternoU() {
        return apellidoPaternoU;
    }

    public void setApellidoPaternoU(String apellidoPaternoU) {
        this.apellidoPaternoU = apellidoPaternoU;
    }

    public String getApellidoMaternoU() {
        return apellidoMaternoU;
    }

    public void setApellidoMaternoU(String apellidoMaternoU) {
        this.apellidoMaternoU = apellidoMaternoU;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }
    
    
}
