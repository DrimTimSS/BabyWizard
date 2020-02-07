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
public class CuidadorModelo {
    int idCuidador;
    String correoElectronico;
    String fechaDeNacimiento;
    String nombreC;
    String primerApellidoC;
    String segundoApellidoC;
    String ocupacion;
    String primerTelefono;
    String segundoTelefono;
    int aniosEstudio;

    public CuidadorModelo() {
    }

    public CuidadorModelo(String correoElectronico, String fechaDeNacimiento, String nombreC, String primerApellidoC, String segundoApellidoC, String ocupacion, String primerTelefono, String segundoTelefono, int aniosEstudio) {
        this.correoElectronico = correoElectronico;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.nombreC = nombreC;
        this.primerApellidoC = primerApellidoC;
        this.segundoApellidoC = segundoApellidoC;
        this.ocupacion = ocupacion;
        this.primerTelefono = primerTelefono;
        this.segundoTelefono = segundoTelefono;
        this.aniosEstudio = aniosEstudio;
    }

    public int getIdCuidador() {
        return idCuidador;
    }

    public void setIdCuidador(int idCuidador) {
        this.idCuidador = idCuidador;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public String getPrimerApellidoC() {
        return primerApellidoC;
    }

    public void setPrimerApellidoC(String primerApellidoC) {
        this.primerApellidoC = primerApellidoC;
    }

    public String getSegundoApellidoC() {
        return segundoApellidoC;
    }

    public void setSegundoApellidoC(String segundoApellidoC) {
        this.segundoApellidoC = segundoApellidoC;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getPrimerTelefono() {
        return primerTelefono;
    }

    public void setPrimerTelefono(String primerTelefono) {
        this.primerTelefono = primerTelefono;
    }

    public String getSegundoTelefono() {
        return segundoTelefono;
    }

    public void setSegundoTelefono(String segundoTelefono) {
        this.segundoTelefono = segundoTelefono;
    }

    public int getAniosEstudio() {
        return aniosEstudio;
    }

    public void setAniosEstudio(int aniosEstudio) {
        this.aniosEstudio = aniosEstudio;
    }
    
    
}
