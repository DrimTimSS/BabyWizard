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
public class Wppsi303642Modelo {
    
    int idWppsi303642;
    int vocabularioReceptivoNatural;
    int disenioCubosNatural;
    int informacionNatural;
    int rompecabezasNatural;
    int denominacionesNatural;
    int fkBebe;

    public Wppsi303642Modelo(int vocabularioReceptivoNatural, int disenioCubosNatural, int informacionNatural, int rompecabezasNatural, int denominacionesNatural, int fkBebe) {
        this.vocabularioReceptivoNatural = vocabularioReceptivoNatural;
        this.disenioCubosNatural = disenioCubosNatural;
        this.informacionNatural = informacionNatural;
        this.rompecabezasNatural = rompecabezasNatural;
        this.denominacionesNatural = denominacionesNatural;
        this.fkBebe = fkBebe;
    }

    public Wppsi303642Modelo() {
    }

    public int getIdWppsi303642() {
        return idWppsi303642;
    }

    public void setIdWppsi303642(int idWppsi303642) {
        this.idWppsi303642 = idWppsi303642;
    }

    public int getVocabularioReceptivoNatural() {
        return vocabularioReceptivoNatural;
    }

    public void setVocabularioReceptivoNatural(int vocabularioReceptivoNatural) {
        this.vocabularioReceptivoNatural = vocabularioReceptivoNatural;
    }

    public int getDisenioCubosNatural() {
        return disenioCubosNatural;
    }

    public void setDisenioCubosNatural(int disenioCubosNatural) {
        this.disenioCubosNatural = disenioCubosNatural;
    }

    public int getInformacionNatural() {
        return informacionNatural;
    }

    public void setInformacionNatural(int informacionNatural) {
        this.informacionNatural = informacionNatural;
    }

    public int getRompecabezasNatural() {
        return rompecabezasNatural;
    }

    public void setRompecabezasNatural(int rompecabezasNatural) {
        this.rompecabezasNatural = rompecabezasNatural;
    }

    public int getDenominacionesNatural() {
        return denominacionesNatural;
    }

    public void setDenominacionesNatural(int denominacionesNatural) {
        this.denominacionesNatural = denominacionesNatural;
    }

    public int getFkBebe() {
        return fkBebe;
    }

    public void setFkBebe(int fkBebe) {
        this.fkBebe = fkBebe;
    }
    
    public void createWppsi303642() throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        String query;
        query = "INSERT INTO `babywizard`.`wppsi303642` (`vocabularioReceptivoNatural`, `disenioCubosNatural`, `informacionNatural`, `rompecabezasNatural`, `denominacionesNatural`, `fkBebe`) "
                + "VALUES ('"+this.getVocabularioReceptivoNatural()+"', '"+this.getDisenioCubosNatural()+"', '"+this.getInformacionNatural()+"', '"+this.getRompecabezasNatural()+"', '"+this.getDenominacionesNatural()+"', '"+this.getFkBebe()+"');";
        Statement stmt = con.createStatement();
        int executeUpdate = stmt.executeUpdate(query);
        con.close();
    }
    
    public ObservableList<Wppsi303642Modelo> readWppsi303642(int idWppsi303642, int vocabularioReceptivoNatural, int disenioCubosNatural, int informacionNatural, int rompecabezasNatural, int denominacionesNatural, int fkBebe) throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        LinkedList<String> toRead = new LinkedList<>();
        if(idWppsi303642>-1) toRead.add("idWppsi303642 = '"+idWppsi303642+"'");
        if(vocabularioReceptivoNatural > -1) toRead.add("vocabularioReceptivoNatural = '"+vocabularioReceptivoNatural+"'");
        if(disenioCubosNatural > -1) toRead.add("disenioCubosNatural = '"+disenioCubosNatural+"'");
        if(informacionNatural > -1) toRead.add("informacionNatural = '"+informacionNatural+"'");
        if(rompecabezasNatural > -1) toRead.add("rompecabezasNatural = '"+rompecabezasNatural+"'");
        if(denominacionesNatural > -1) toRead.add("denominacionesNatural = '"+denominacionesNatural+"'");
        if(fkBebe > -1) toRead.add("fkBebe = '"+fkBebe+"'");
        String query1 = "SELECT * FROM babywizard.wppsi303642 WHERE ";
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
        rs = stmt.executeQuery("SELECT * FROM babywizard.wppsi303642");
        }
        ObservableList<Wppsi303642Modelo> wppsis = FXCollections.observableArrayList();
        while(rs.next()){
            Wppsi303642Modelo wm = new Wppsi303642Modelo();
            wm.setDenominacionesNatural(rs.getInt("denominacionesNatural"));
            wm.setDisenioCubosNatural(rs.getInt("disenioCubosNatural"));
            wm.setFkBebe(rs.getInt("fkBebe"));
            wm.setIdWppsi303642(rs.getInt("idWppsi303642"));
            wm.setInformacionNatural(rs.getInt("informacionNatural"));
            wm.setRompecabezasNatural(rs.getInt("rompecabezasNatural"));
            wm.setVocabularioReceptivoNatural(rs.getInt("vocabularioReceptivo"));
            wppsis.add(wm);
        }
        con.close();
        return wppsis;
    }
    
    public void updateWppsi303642(int idWppsi303642Actualizar, int idWppsi303642, int vocabularioReceptivoNatural, int disenioCubosNatural, int informacionNatural, int rompecabezasNatural, int denominacionesNatural, int fkBebe) throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        LinkedList<String> toUpdate = new LinkedList<>();
        if (idWppsi303642 > -1) {
           String idWppsi303642Q = "`idWppsi303642` = '"+idWppsi303642+"'";
           toUpdate.add(idWppsi303642Q);
        }
        if (vocabularioReceptivoNatural > -1) {
           String vocabularioReceptivoNaturalQ = "`vocabularioReceptivoNatural` = '"+vocabularioReceptivoNatural+"'";
           toUpdate.add(vocabularioReceptivoNaturalQ);
        }
        if (disenioCubosNatural > -1) {
           String disenioCubosNaturalQ = "`disenioCubosNatural` = '"+disenioCubosNatural+"'";
           toUpdate.add(disenioCubosNaturalQ);
        }
        if (informacionNatural > -1) {
           String informacionNaturalQ = "`informacionNatural` = '"+informacionNatural+"'";
           toUpdate.add(informacionNaturalQ);
        }
        if (rompecabezasNatural > -1) {
           String rompecabezasNaturalQ = "`rompecabezasNatural` = '"+rompecabezasNatural+"'";
           toUpdate.add(rompecabezasNaturalQ);
        }
        if (denominacionesNatural > -1) {
           String denominacionesNaturalQ = "`denominacionesNatural` = '"+denominacionesNatural+"'";
           toUpdate.add(denominacionesNaturalQ);
        }
        if (fkBebe > -1) {
           String fkBebeQ = "`fkBebe` = '"+fkBebe+"'";
           toUpdate.add(fkBebeQ);
        }
      
        String query1 = "UPDATE `babywizard`.`wppsi303642` SET ";
        String query2 = "";
        for(int i = 0; i<toUpdate.size()-1;i++){
            query2 = query2+toUpdate.get(i)+", ";
        }
        String query3 = toUpdate.getLast()+" WHERE (`idWppsi303642` = '"+idWppsi303642Actualizar+"');";
        Statement stmt = con.createStatement();
        if(toUpdate.size() > 0) stmt.executeUpdate(query1+query2+query3);
        con.close();
    }
    
    public void deleteWippsi303642(int idWippsi303642) throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        Statement stmt = con.createStatement();
        stmt.executeUpdate("DELETE FROM `babywizard`.`wippsi303642` WHERE (`idWippsi303642` = '"+idWippsi303642+"');");
        con.close();
    }
}
