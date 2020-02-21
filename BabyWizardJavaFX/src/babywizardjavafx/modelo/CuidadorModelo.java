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
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Vicaris
 */
public class CuidadorModelo {
    SimpleIntegerProperty idCuidador;
    SimpleStringProperty correoElectronico;
    SimpleStringProperty fechaDeNacimiento;
    SimpleStringProperty nombreC;
    SimpleStringProperty primerApellidoC;
    SimpleStringProperty segundoApellidoC;
    SimpleStringProperty ocupacion;
    SimpleStringProperty primerTelefono;
    SimpleStringProperty segundoTelefono;
    SimpleIntegerProperty aniosEstudio;

    public CuidadorModelo() {
    }

    public CuidadorModelo(String correoElectronico, String fechaDeNacimiento, String nombreC, String primerApellidoC, String segundoApellidoC, String ocupacion, String primerTelefono, String segundoTelefono, int aniosEstudio) {
        this.correoElectronico = new SimpleStringProperty(correoElectronico);
        this.fechaDeNacimiento = new SimpleStringProperty(fechaDeNacimiento);
        this.nombreC = new SimpleStringProperty(nombreC);
        this.primerApellidoC = new SimpleStringProperty(primerApellidoC);
        this.segundoApellidoC = new SimpleStringProperty(segundoApellidoC);
        this.ocupacion = new SimpleStringProperty(ocupacion);
        this.primerTelefono = new SimpleStringProperty(primerTelefono);
        this.segundoTelefono = new SimpleStringProperty(segundoTelefono);
        this.aniosEstudio = new SimpleIntegerProperty(aniosEstudio);
    }

    public int getIdCuidador() {
        return idCuidador.get();
    }

    public void setIdCuidador(int idCuidador) {
        this.idCuidador.set(idCuidador);
    }

    public String getCorreoElectronico() {
        return correoElectronico.get();
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico.set(correoElectronico);
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento.get();
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento.set(fechaDeNacimiento);
    }

    public String getNombreC() {
        return nombreC.get();
    }

    public void setNombreC(String nombreC) {
        this.nombreC.set(nombreC);
    }

    public String getPrimerApellidoC() {
        return primerApellidoC.get();
    }

    public void setPrimerApellidoC(String primerApellidoC) {
        this.primerApellidoC.set(primerApellidoC);
    }

    public String getSegundoApellidoC() {
        return segundoApellidoC.get();
    }

    public void setSegundoApellidoC(String segundoApellidoC) {
        this.segundoApellidoC.set(segundoApellidoC);
    }

    public String getOcupacion() {
        return ocupacion.get();
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion.set(ocupacion);
    }

    public String getPrimerTelefono() {
        return primerTelefono.get();
    }

    public void setPrimerTelefono(String primerTelefono) {
        this.primerTelefono.set(primerTelefono);
    }

    public String getSegundoTelefono() {
        return segundoTelefono.get();
    }

    public void setSegundoTelefono(String segundoTelefono) {
        this.segundoTelefono.set(segundoTelefono);
    }

    public int getAniosEstudio() {
        return aniosEstudio.get();
    }

    public void setAniosEstudio(int aniosEstudio) {
        this.aniosEstudio.set(aniosEstudio);
    }
    
        //CRUD
    //Create
    public void createCuidador() throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        String query;
        query = "INSERT INTO `babywizard`.`cuidador` (correoElectronico, fechaDeNacimiento, nombreC, primerApellidoC, segundoApellidoC, ocupacion, primerTelefono, segundoTelefono, aniosEstudio) "
                + "VALUES ('"+correoElectronico.get()+"', '"+fechaDeNacimiento.get()+"', '"+nombreC.get()+"', '"+primerApellidoC.get()+"', '"+segundoApellidoC.get()+"', '"+ocupacion.get()+"', '"+primerTelefono.get()+"', '"+segundoTelefono.get()+"', '"+aniosEstudio.get()+"');";
        Statement stmt = con.createStatement();
        int executeUpdate = stmt.executeUpdate(query);
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
        String query3 = toRead.getLast()+";";
        Statement stmt = con.createStatement();
        System.out.println(query1+query2+query3);
        ResultSet rs = stmt.executeQuery(query1+query2+query3);
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
    
    public void updateUsuario(int idUsuarioActualizar,int idUsuario, String nombreU, String apellidoMaternoU, String apellidoPaternoU, int administrador, String contrasenia) throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        LinkedList<String> toUpdate = new LinkedList<>();
        if (idUsuario > -1) {
           String idUsuarioQ = "`idUsuario` = '"+idUsuario+"'";
           toUpdate.add(idUsuarioQ);
        }
        if (!"".equals(nombreU)) {
            String nombreUQ = "`nombreU` = '"+nombreU+"'";
            toUpdate.add(nombreUQ);
        }
        if (!"".equals(apellidoMaternoU)) {
            String apellidoMaternoUQ = "`apellidoMaternoU` = '"+apellidoMaternoU+"'";
            toUpdate.add(apellidoMaternoUQ);
        }
        if (!"".equals(apellidoPaternoU)) {
            String apellidoPaternoUQ = "`apellidoPaternoU` = '"+apellidoPaternoU+"'";
            toUpdate.add(apellidoPaternoUQ);
        }
        if (administrador == 0 || administrador == 1) {
            String administradorQ = "`administrador` = '"+administrador+"'";
            toUpdate.add(administradorQ);
        }
        if (!"".equals(contrasenia)) {
            String contraseniaQ = "`contrasenia` = AES_ENCRYPT('"+contrasenia+"','babywizard')";
            toUpdate.add(contraseniaQ);
        }
        String query1 = "UPDATE `babywizard`.`usuario` SET ";
        String query2 = "";
        for(int i = 0; i<toUpdate.size()-1;i++){
            query2 = query2+toUpdate.get(i)+", ";
        }
        String query3 = toUpdate.getLast()+" WHERE (`idUsuario` = '"+idUsuarioActualizar+"');";
        Statement stmt = con.createStatement();
        System.out.println(query1+query2+query3);
        if(toUpdate.size() > 0) stmt.executeUpdate(query1+query2+query3);
        con.close();
    }
    
    public void deleteUsuario(int idUsuario) throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        Statement stmt = con.createStatement();
        stmt.executeUpdate("DELETE FROM `babywizard`.`usuario` WHERE (`idUsuario` = '"+idUsuario+"');");
        con.close();
    }
}
