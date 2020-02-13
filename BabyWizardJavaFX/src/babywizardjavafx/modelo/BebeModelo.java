/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx.modelo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Vicaris
 */
public class BebeModelo {
    
    //Atributos
    int idBebe;
    String nombre;
    String apellidoMaterno;
    String apellidoPaterno;
    int sexo;
    String fechaNacimiento;
    int fkUsuario;

    //Contructores
    public BebeModelo() {
    }

    public BebeModelo(String nombre, String primerMaterno, String segundoPaterno, int sexo, String fechaNacimiento, int fkUsuario) {
        this.nombre = nombre;
        this.apellidoMaterno = primerMaterno;
        this.apellidoPaterno = segundoPaterno;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.fkUsuario = fkUsuario;
    }
    
    //Getters and Setters
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

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
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
    
    //CRUD
    //Create
    public void createBebe() throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        String query;
        query = "INSERT INTO `babywizard`.`bebe` (`nombre`, `apellidoMaterno`, `apellidoPaterno`, `sexo`, `fechaNacimientoBb`, `fkUsuario`) "
                + "VALUES ('"+nombre+"', '"+apellidoMaterno+"', '"+apellidoPaterno+"', '"+sexo+"', '"+fechaNacimiento+"', '"+fkUsuario+"');";
        Statement stmt = con.createStatement();
        int executeUpdate = stmt.executeUpdate(query);
    }
    
    public BebeModelo readBebe(String readQuery) {
        return null;
    }
    
    public void updateBebe() {
        
    }
    
    public void deleteBebe() {
    
    }
}
