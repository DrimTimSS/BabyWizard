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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    int edad;
    String nombreC;
    String primerApellidoC;
    String segundoApellidoC;
    String ocupacion;
    String primerTelefono;
    String segundoTelefono;
    int aniosEstudio;
    int fkBebe;
    String relacion;

    public CuidadorModelo() {
    }

    public CuidadorModelo(String correoElectronico, int edad, String nombreC, String primerApellidoC, String segundoApellidoC, String ocupacion, String primerTelefono, String segundoTelefono, int aniosEstudio, String relacion, int fkBebe) {
        this.correoElectronico = correoElectronico;
        this.edad = edad;
        this.nombreC = nombreC;
        this.primerApellidoC = primerApellidoC;
        this.segundoApellidoC = segundoApellidoC;
        this.ocupacion = ocupacion;
        this.primerTelefono = primerTelefono;
        this.segundoTelefono = segundoTelefono;
        this.aniosEstudio = aniosEstudio;
        this.relacion = relacion;
        this.fkBebe = fkBebe;
    }

    public String getRelacion() {
        return relacion;
    }

    public void setRelacion(String relacion) {
        this.relacion = relacion;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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

    public int getFkBebe() {
        return fkBebe;
    }

    public void setFkBebe(int fkBebe) {
        this.fkBebe = fkBebe;
    }
    
    
   
    //CRUD
    //Create
    public void createCuidador() throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        String query;
        query = "INSERT INTO `babywizard`.`cuidador` (correoElectronico, edad, nombreC, primerApellidoC, segundoApellidoC, ocupacion, primerTelefono, segundoTelefono, aniosEstudio, relacion, fkBebe) "
                + "VALUES ('"+correoElectronico.replace("'","''")+"', '"+edad+"', '"+nombreC.replace("'","''")+"', '"+primerApellidoC.replace("'","''")+"', '"+segundoApellidoC.replace("'","''")+"', '"+ocupacion.replace("'","''")+"', '"+primerTelefono+"', '"+segundoTelefono+"', '"+aniosEstudio+"', '"+relacion+"', '"+fkBebe+"');";
        Statement stmt = con.createStatement();
        int executeUpdate = stmt.executeUpdate(query,Statement.RETURN_GENERATED_KEYS);
        
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()){
            idCuidador= rs.getInt(1);
        }
        rs.close();
        con.close();
    }
    
    public LinkedList<CuidadorModelo> readCuidadorPorIds(LinkedList<Integer> ids) throws SQLException {
        LinkedList<CuidadorModelo> cuidadores = new LinkedList<CuidadorModelo>();
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        String query;
        String abuscar = "(";
        int size = ids.size();
        for(int i = 0; i < size-1; i++) abuscar += ids.get(i)+",";
        abuscar+=ids.get(size-1)+")";
        
        query = "select * FROM cuidador where fkBebe in "+abuscar+";";
        //System.out.print(con);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        
        while(rs.next()){
            CuidadorModelo cm = new CuidadorModelo();
            cm.setIdCuidador(rs.getInt("idCuidador"));
            cm.setCorreoElectronico(rs.getString("correoElectronico"));
            cm.setEdad(rs.getInt("edad"));
            cm.setNombreC(rs.getString("nombreC"));
            cm.setPrimerApellidoC(rs.getString("primerApellidoC"));
            cm.setSegundoApellidoC(rs.getString("segundoApellidoC"));
            cm.setPrimerTelefono(rs.getString("primerTelefono"));
            cm.setSegundoTelefono(rs.getString("segundoTelefono"));
            cm.setOcupacion(rs.getString("ocupacion"));
            cm.setAniosEstudio(rs.getInt("aniosEstudio"));
            cm.setRelacion(rs.getString("relacion"));
            cm.setFkBebe(rs.getInt("fkBebe"));
            cuidadores.add(cm);
        }
        con.close();
        return cuidadores;
    }
    
    public LinkedList<CuidadorModelo> readCuidador(int idCuidador, String correoElectronico, int edad, String nombreC, String primerApellidoC, String segundoApellidoC, String ocupacion, String primerTelefono, String segundoTelefono, int aniosEstudio, String relacion, int fkBebe) throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        LinkedList<String> toRead = new LinkedList<>();
        if(idCuidador>-1) toRead.add("idCuidador = '"+idCuidador+"'");
        if(!"".equals(correoElectronico)) toRead.add("correoElectronico = '"+correoElectronico+"'");
        if(edad>-1) toRead.add("edad = '"+edad+"'");
        if(!"".equals(nombreC)) toRead.add("nombreC = '"+nombreC+"'");
        if(!"".equals(primerApellidoC)) toRead.add("primerApellidoC = '"+primerApellidoC+"'");
        if(!"".equals(segundoApellidoC)) toRead.add("segundoApellidoC = '"+segundoApellidoC+"'");
        if(!"".equals(ocupacion)) toRead.add("ocupacion = '"+ocupacion+"'");
        if(!"".equals(primerTelefono)) toRead.add("primerTelefono = '"+primerTelefono+"'");
        if(!"".equals(segundoTelefono)) toRead.add("segundoTelefono = '"+segundoTelefono+"'");
        if(!"".equals(relacion)) toRead.add("relacion = '"+relacion+"'");
        if(aniosEstudio > -1) toRead.add("aniosEstudio = '"+aniosEstudio+"'");
        if(fkBebe>-1) toRead.add("fkBebe = '"+fkBebe+"'");
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
        LinkedList<CuidadorModelo> cuidadores = new LinkedList<>();
        while(rs.next()){
            CuidadorModelo cm = new CuidadorModelo();
            cm.setIdCuidador(rs.getInt("idCuidador"));
            cm.setCorreoElectronico(rs.getString("correoElectronico"));
            cm.setEdad(rs.getInt("edad"));
            cm.setNombreC(rs.getString("nombreC"));
            cm.setPrimerApellidoC(rs.getString("primerApellidoC"));
            cm.setSegundoApellidoC(rs.getString("segundoApellidoC"));
            cm.setPrimerTelefono(rs.getString("primerTelefono"));
            cm.setSegundoTelefono(rs.getString("segundoTelefono"));
            cm.setOcupacion(rs.getString("ocupacion"));
            cm.setAniosEstudio(rs.getInt("aniosEstudio"));
            cm.setRelacion(rs.getString("relacion"));
            cm.setFkBebe(rs.getInt("fkBebe"));
            cuidadores.add(cm);
        }
        con.close();
        return cuidadores;
    }
    
    public void updateCuidador(int idCuidadorActualizar, int idCuidador, String correoElectronico, int edad, String nombreC, String primerApellidoC, String segundoApellidoC, String ocupacion, String primerTelefono, String segundoTelefono, int aniosEstudio, String relacion, int fkBebe) throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        LinkedList<String> toUpdate = new LinkedList<>();
        if (idCuidador > -1) {
           String idCuidadorQ = "`idCuidador` = '"+idCuidador+"'";
           toUpdate.add(idCuidadorQ);
        }
        if (!"".equals(correoElectronico)) {
            String correoElectronicoQ = "`correoElectronico` = '"+correoElectronico.replace("'","''")+"'";
            toUpdate.add(correoElectronicoQ);
        }
        if (!"".equals(nombreC)) {
            String nombreCQ = "`nombreC` = '"+nombreC.replace("'","''")+"'";
            toUpdate.add(nombreCQ);
        }
        if (!"".equals(primerApellidoC)) {
            String primerApellidoCQ = "`primerApellidoC` = '"+primerApellidoC.replace("'","''")+"'";
            toUpdate.add(primerApellidoCQ);
        }
        if (!"".equals(segundoApellidoC)) {
            String segundoApellidoCQ = "`segundoApellidoC` = '"+segundoApellidoC.replace("'","''")+"'";
            toUpdate.add(segundoApellidoCQ);
        }
        if (edad>-1) {
            String edadCQ = "`edad` = '"+edad+"'";
            toUpdate.add(edadCQ);
        }
        if (!"".equals(ocupacion)) {
            String ocupacionQ = "`ocupacion` = '"+ocupacion.replace("'","''")+"'";
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
        if (!"".equals(relacion)) {
            System.out.println(relacion);
            String relacionQ = "`relacion` = '"+relacion+"'";
            toUpdate.add(relacionQ);
        }
        if (fkBebe > -1) {
           String fkBebeQ = "`fkBebe` = '"+fkBebe+"'";
           toUpdate.add(fkBebeQ);
        }
      
        String query1 = "UPDATE `babywizard`.`cuidador` SET ";
        String query2 = "";
        for(int i = 0; i<toUpdate.size()-1;i++){
            query2 = query2+toUpdate.get(i)+", ";
        }
        String query3 = toUpdate.getLast()+" WHERE (`idCuidador` = '"+idCuidadorActualizar+"');";
        Statement stmt = con.createStatement();
        System.out.println(query1+query2+query3);
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
