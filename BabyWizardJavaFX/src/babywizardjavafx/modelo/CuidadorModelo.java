/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx.modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

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
   
        //CRUD
    //Create
    public void createCuidador() throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        String query;
        query = "INSERT INTO `babywizard`.`cuidador` (correoElectronico, fechaDeNacimiento, nombreC, primerApellidoC, segundoApellidoC, ocupacion, primerTelefono, segundoTelefono, aniosEstudio) "
                + "VALUES ('"+correoElectronico+"', '"+fechaDeNacimiento+"', '"+nombreC+"', '"+primerApellidoC+"', '"+segundoApellidoC+"', '"+ocupacion+"', '"+primerTelefono+"', '"+segundoTelefono+"', '"+aniosEstudio+"');";
        Statement stmt = con.createStatement();
        int executeUpdate = stmt.executeUpdate(query,Statement.RETURN_GENERATED_KEYS);
        
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()){
            idCuidador= rs.getInt(1);
        }
        rs.close();
        con.close();
    }
    
    public ObservableList<CuidadorModelo> readCuidador(int idCuidador, String correoElectronico, String fechaDeNacimiento, String nombreC, String primerApellidoC, String segundoApellidoC, String ocupacion, String primerTelefono, String segundoTelefono, int aniosEstudio) throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        LinkedList<String> toRead = new LinkedList<>();
        if(idCuidador>-1) toRead.add("idCuidador = '"+idCuidador+"'");
        if(!"".equals(correoElectronico)) toRead.add("correoElectronico = '"+correoElectronico+"'");
        if(!"".equals(fechaDeNacimiento)) toRead.add("fechaDeNacimiento = '"+fechaDeNacimiento+"'");
        if(!"".equals(nombreC)) toRead.add("nombreC = '"+nombreC+"'");
        if(!"".equals(primerApellidoC)) toRead.add("primerApellidoC = '"+primerApellidoC+"'");
        if(!"".equals(segundoApellidoC)) toRead.add("segundoApellidoC = '"+segundoApellidoC+"'");
        if(!"".equals(ocupacion)) toRead.add("ocupacion = '"+ocupacion+"'");
        if(!"".equals(primerTelefono)) toRead.add("primerTelefono = '"+primerTelefono+"'");
        if(!"".equals(segundoTelefono)) toRead.add("segundoTelefono = '"+segundoTelefono+"'");
        if(aniosEstudio > -1) toRead.add("aniosEstudio = '"+aniosEstudio+"'");
        String query1 = "SELECT * FROM babywizard.cuidador WHERE ";
        String query2 = "";
        for(int i = 0; i<toRead.size()-1;i++){
            query2 = query2+toRead.get(i)+" AND ";
        }
        String query3 = "";
        if(toRead.size()>0) query3 = toRead.getLast()+";";
        Statement stmt = con.createStatement();
        ResultSet rs;
        if (toRead.size()>0) {
        rs = stmt.executeQuery(query1+query2+query3);
        } else {
        rs = stmt.executeQuery("SELECT * FROM babywizard.cuidador");
        }
        ObservableList<CuidadorModelo> cuidadores = FXCollections.observableArrayList();
        while(rs.next()){
            CuidadorModelo cm = new CuidadorModelo();
            cm.setIdCuidador(rs.getInt("idCuidador"));
            cm.setCorreoElectronico(rs.getString("correoElectronico"));
            cm.setFechaDeNacimiento(rs.getString("fechaDeNacimiento"));
            cm.setNombreC(rs.getString("nombreC"));
            cm.setPrimerApellidoC(rs.getString("primerApellidoC"));
            cm.setSegundoApellidoC(rs.getString("segundoApellidoC"));
            cm.setPrimerTelefono(rs.getString("primerTelefono"));
            cm.setSegundoTelefono(rs.getString("segundoTelefono"));
            cm.setOcupacion(rs.getString("ocupacion"));
            cm.setAniosEstudio(rs.getInt("aniosEstudio"));
            cuidadores.add(cm);
        }
        con.close();
        return cuidadores;
    }
    
    public void updateCuidador(int idCuidadorActualizar, int idCuidador, String correoElectronico, String fechaDeNacimiento, String nombreC, String primerApellidoC, String segundoApellidoC, String ocupacion, String primerTelefono, String segundoTelefono, int aniosEstudio) throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        LinkedList<String> toUpdate = new LinkedList<>();
        if (idCuidador > -1) {
           String idCuidadorQ = "`idCuidador` = '"+idCuidador+"'";
           toUpdate.add(idCuidadorQ);
        }
        if (!"".equals(correoElectronico)) {
            String correoElectronicoQ = "`correoElectronico` = '"+correoElectronico+"'";
            toUpdate.add(correoElectronicoQ);
        }
        if (!"".equals(nombreC)) {
            String nombreCQ = "`nombreC` = '"+nombreC+"'";
            toUpdate.add(nombreCQ);
        }
        if (!"".equals(primerApellidoC)) {
            String primerApellidoCQ = "`primerApellidoC` = '"+primerApellidoC+"'";
            toUpdate.add(primerApellidoCQ);
        }
        if (!"".equals(segundoApellidoC)) {
            String segundoApellidoCQ = "`segundoApellidoCQ` = '"+segundoApellidoC+"'";
            toUpdate.add(segundoApellidoCQ);
        }
        if (!"".equals(fechaDeNacimiento)) {
            String fechaDeNacimientoCQ = "`fechaDeNacimientoCQ` = '"+fechaDeNacimiento+"'";
            toUpdate.add(fechaDeNacimientoCQ);
        }
        if (!"".equals(ocupacion)) {
            String ocupacionQ = "`ocupacion` = '"+ocupacion+"'";
            toUpdate.add(ocupacionQ);
        }
        if (!"".equals(primerTelefono)) {
            String primerTelefonoQ = "`primerTelefono` = '"+primerTelefono+"'";
            toUpdate.add(primerTelefonoQ);
        }
        if (!"".equals(segundoTelefono)) {
            String segundoTelefonoQ = "`segundoTelefono` = '"+segundoTelefono+"'";
            toUpdate.add(segundoTelefonoQ);
        }
        if (aniosEstudio > -1) {
           String aniosEstudioQ = "`aniosEstudio` = '"+aniosEstudio+"'";
           toUpdate.add(aniosEstudioQ);
        }
      
        String query1 = "UPDATE `babywizard`.`cuidador` SET ";
        String query2 = "";
        for(int i = 0; i<toUpdate.size()-1;i++){
            query2 = query2+toUpdate.get(i)+", ";
        }
        String query3 = toUpdate.getLast()+" WHERE (`idCuidador` = '"+idCuidadorActualizar+"');";
        Statement stmt = con.createStatement();
        if(toUpdate.size() > 0) stmt.executeUpdate(query1+query2+query3);
        con.close();
    }
    
    public void deleteCuidador(int idCuidador) throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        Statement stmt = con.createStatement();
        stmt.executeUpdate("DELETE FROM `babywizard`.`cuidador` WHERE (`idCuidador` = '"+idCuidador+"');");
        con.close();
    }
}
