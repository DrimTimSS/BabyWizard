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

/**
 *
 * @author Vicaris
 */
public class CuidarModelo {
    int idCuidador;
    int idBebe;
    String relacionBebeCuidador;

    public CuidarModelo(int idCuidador, int idBebe, String relacionBebeCuidador) {
        this.idCuidador = idCuidador;
        this.idBebe = idBebe;
        this.relacionBebeCuidador = relacionBebeCuidador;
    }

    private CuidarModelo() {
        
    }

    public int getIdCuidador() {
        return idCuidador;
    }

    public void setIdCuidador(int idCuidador) {
        this.idCuidador = idCuidador;
    }

    public int getIdBebe() {
        return idBebe;
    }

    public void setIdBebe(int idBebe) {
        this.idBebe = idBebe;
    }

    public String getRelacionBebeCuidador() {
        return relacionBebeCuidador;
    }

    public void setRelacionBebeCuidador(String relacionBebeCuidador) {
        this.relacionBebeCuidador = relacionBebeCuidador;
    }
    
    public void createCuidar() throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        String query;
        query = "INSERT INTO `babywizard`.`cuidar` (`idCuidador`, `idBebe`, `relacionBebeCuidador`) "
                + "VALUES ('"+idCuidador+"', '"+idBebe+"', '"+relacionBebeCuidador+"');";
        Statement stmt = con.createStatement();
        int executeUpdate = stmt.executeUpdate(query);
        con.close();
    }
    
    public LinkedList<CuidarModelo> readCuidar(int idBebe, int idCuidador, String relacionBebeCuidador) throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        LinkedList<String> toRead = new LinkedList<>();
        if(idBebe>-1) toRead.add("idBebe = '"+idBebe+"'");
        if(idCuidador>-1) toRead.add("idCuidador = '"+idCuidador+"'");
        if(!"".equals(relacionBebeCuidador)) toRead.add("relacionBebeCuidador = '"+relacionBebeCuidador+"'");
        String query1 = "SELECT * FROM babywizard.cuidar WHERE ";
        String query2 = "";
        for(int i = 0; i<toRead.size()-1;i++){
            query2 = query2+toRead.get(i)+" AND ";
        }
        String query3="";
        if(toRead.size()>0) query3 = toRead.getLast()+";";
        Statement stmt = con.createStatement();
        ResultSet rs;
        if (toRead.size()>0) {
        rs = stmt.executeQuery(query1+query2+query3);
        } else {
        rs = stmt.executeQuery("SELECT * FROM babywizard.cuidar");
        }
        LinkedList<CuidarModelo> cuidados = new LinkedList<>();
        while(rs.next()){
            CuidarModelo cm = new CuidarModelo();
            cm.setIdBebe(rs.getInt("idBebe"));
            cm.setIdCuidador(rs.getInt("idCuidador"));
            cm.setRelacionBebeCuidador(rs.getString("relacionBebeCuidador"));
            cuidados.add(cm);
        }
        con.close();
        return cuidados;
    }

    public void updateCuidar (int idBebeActualizar, int idCuidadorActualizar, int idBebe, int idCuidador, String relacionBebeCuidador) throws SQLException {
        //implementar
    }

    
    public void deleteCuidar(int idBebe, int idCuidador) throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        Statement stmt = con.createStatement();
        stmt.executeUpdate("DELETE FROM `babywizard`.`cuidar` WHERE (`idBebe` = '"+idBebe+"') AND (`idCuidador` = '"+idCuidador+"');");
        con.close();
    }
    
}
