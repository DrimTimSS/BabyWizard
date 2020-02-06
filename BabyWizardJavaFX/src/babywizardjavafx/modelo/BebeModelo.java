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
public class BebeModelo {
    int idBebe;
    String nombre;
    String primerMaterno;
    String segundoPaterno;
    boolean sexo;
    String fechaNacimiento;
    int fkUsuario;

    public BebeModelo() {
    }

    public BebeModelo(String nombre, String primerMaterno, String segundoPaterno, boolean sexo, String fechaNacimiento, int fkUsuario) {
        this.nombre = nombre;
        this.primerMaterno = primerMaterno;
        this.segundoPaterno = segundoPaterno;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.fkUsuario = fkUsuario;
    }
    
    

    public int getIdBebe() {
        return idBebe;
    }

    public void setIdBebe(int idBebe) {
        this.idBebe = idBebe;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerMaterno() {
        return primerMaterno;
    }

    public void setPrimerMaterno(String primerMaterno) {
        this.primerMaterno = primerMaterno;
    }

    public String getSegundoPaterno() {
        return segundoPaterno;
    }

    public void setSegundoPaterno(String segundoPaterno) {
        this.segundoPaterno = segundoPaterno;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getFkUsuario() {
        return fkUsuario;
    }

    public void setFkUsuario(int fkUsuario) {
        this.fkUsuario = fkUsuario;
    }
    
}
