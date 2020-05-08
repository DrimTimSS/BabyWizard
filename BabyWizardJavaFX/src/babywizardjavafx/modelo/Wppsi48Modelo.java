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
public class Wppsi48Modelo {
    int idWppsi48;
    int disenioCubosNatural;
    int informacionNatural;
    int semejanzasNatural;
    int matricesNatural;
    int vocabularioNatural;
    int conceptosConDibujosNatural;
    int busquedaSimbolosNatural;
    int pistasNatural;
    int clavesNatural;
    int comprensionNatural;
    int figurasIncompletasNatural;
    int vocabularioReceptivoNatural;
    int rompecabezasNatural;
    int denominacionesNatural;
    int fkBebe;

    public Wppsi48Modelo() {
    }

    public Wppsi48Modelo(int disenioCubosNatural, int informacionNatural, int semejanzasNatural, int matricesNatural, int vocabularioNatural, int conceptosConDibujosNatural, int busquedaSimbolosNatural, int pistasNatural, int clavesNatural, int comprensionNatural, int figurasIncompletasNatural, int vocabularioReceptivoNatural, int rompecabezasNatural, int denominacionesNatural, int fkBebe) {
        this.disenioCubosNatural = disenioCubosNatural;
        this.informacionNatural = informacionNatural;
        this.semejanzasNatural = semejanzasNatural;
        this.matricesNatural = matricesNatural;
        this.vocabularioNatural = vocabularioNatural;
        this.conceptosConDibujosNatural = conceptosConDibujosNatural;
        this.busquedaSimbolosNatural = busquedaSimbolosNatural;
        this.pistasNatural = pistasNatural;
        this.clavesNatural = clavesNatural;
        this.comprensionNatural = comprensionNatural;
        this.figurasIncompletasNatural = figurasIncompletasNatural;
        this.vocabularioReceptivoNatural = vocabularioReceptivoNatural;
        this.rompecabezasNatural = rompecabezasNatural;
        this.denominacionesNatural = denominacionesNatural;
        this.fkBebe = fkBebe;
    }

    public int getIdWppsi48() {
        return idWppsi48;
    }

    public void setIdWppsi48(int idWppsi48) {
        this.idWppsi48 = idWppsi48;
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

    public int getSemejanzasNatural() {
        return semejanzasNatural;
    }

    public void setSemejanzasNatural(int semejanzasNatural) {
        this.semejanzasNatural = semejanzasNatural;
    }

    public int getMatricesNatural() {
        return matricesNatural;
    }

    public void setMatricesNatural(int matricesNatural) {
        this.matricesNatural = matricesNatural;
    }

    public int getVocabularioNatural() {
        return vocabularioNatural;
    }

    public void setVocabularioNatural(int vocabularioNatural) {
        this.vocabularioNatural = vocabularioNatural;
    }

    public int getConceptosConDibujosNatural() {
        return conceptosConDibujosNatural;
    }

    public void setConceptosConDibujosNatural(int conceptosConDibujosNatural) {
        this.conceptosConDibujosNatural = conceptosConDibujosNatural;
    }

    public int getBusquedaSimbolosNatural() {
        return busquedaSimbolosNatural;
    }

    public void setBusquedaSimbolosNatural(int busquedaSimbolosNatural) {
        this.busquedaSimbolosNatural = busquedaSimbolosNatural;
    }

    public int getPistasNatural() {
        return pistasNatural;
    }

    public void setPistasNatural(int pistasNatural) {
        this.pistasNatural = pistasNatural;
    }

    public int getClavesNatural() {
        return clavesNatural;
    }

    public void setClavesNatural(int clavesNatural) {
        this.clavesNatural = clavesNatural;
    }

    public int getComprensionNatural() {
        return comprensionNatural;
    }

    public void setComprensionNatural(int comprensionNatural) {
        this.comprensionNatural = comprensionNatural;
    }

    public int getFigurasIncompletasNatural() {
        return figurasIncompletasNatural;
    }

    public void setFigurasIncompletasNatural(int figurasIncompletasNatural) {
        this.figurasIncompletasNatural = figurasIncompletasNatural;
    }

    public int getVocabularioReceptivoNatural() {
        return vocabularioReceptivoNatural;
    }

    public void setVocabularioReceptivoNatural(int vocabularioReceptivoNatural) {
        this.vocabularioReceptivoNatural = vocabularioReceptivoNatural;
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
    
    public void createWppsi48() throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        String query;
        query = "INSERT INTO `babywizard`.`wppsi48` (`disenioConCubosNatural`, `informacionNatural`, `semejanzasNatural`, `matricesNatural`, `vocabularioNatural`, `conceptosConDibujosNatural`, `busquedaSimbolosNatural`, `pistasNatural`, `clavesNatural`, `comprensionNatural`, `figurasIncompletasNatural`, `vocabularioReceptivoNatural`, `rompecabezasNatural`, `denominacionesNatural`, `fkBebe`) "
                + "VALUES ('"+this.getDisenioCubosNatural()+"', '"+this.informacionNatural+"', '"+this.getSemejanzasNatural()+"', '"+this.getMatricesNatural()+"', '"+this.getVocabularioNatural()+"', '"+this.conceptosConDibujosNatural+"', '"+this.busquedaSimbolosNatural+"', '"+this.getPistasNatural()+"', '"+this.getClavesNatural()+"', '"+this.getComprensionNatural()+"', '"+this.getFigurasIncompletasNatural()+"', '"+this.getVocabularioReceptivoNatural()+"', '"+this.getRompecabezasNatural()+"', '"+this.getDenominacionesNatural()+"', '"+this.getFkBebe()+"');";
        Statement stmt = con.createStatement();
        int executeUpdate = stmt.executeUpdate(query,Statement.RETURN_GENERATED_KEYS);
        
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()){
            idWppsi48=rs.getInt(1);
        }
        rs.close();
        con.close();
    }
    
    public ObservableList<Wppsi48Modelo> readWppsi48(int idWppsi48,int disenioCubosNatural, int informacionNatural, int semejanzasNatural, int matricesNatural, int vocabularioNatural, int conceptosConDibujosNatural, int busquedaSimbolosNatural, int pistasNatural, int clavesNatural, int comprensionNatural, int figurasIncompletasNatural, int vocabularioReceptivoNatural, int rompecabezasNatural, int denominacionesNatural, int fkBebe) throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        LinkedList<String> toRead = new LinkedList<>();
        if(idWppsi48>-1) toRead.add("idWppsi48 = '"+idWppsi48+"'");
        if(disenioCubosNatural > -1) toRead.add("disenioCubosNatural = '"+disenioCubosNatural+"'");
        if(informacionNatural > -1) toRead.add("informacionNatural = '"+informacionNatural+"'");
        if(semejanzasNatural > -1) toRead.add("semejanzasNatural = '"+semejanzasNatural+"'");
        if(matricesNatural > -1) toRead.add("matricesNatural = '"+matricesNatural+"'");
        if(vocabularioNatural > -1) toRead.add("vocabularioNatural = '"+vocabularioNatural+"'");
        if(conceptosConDibujosNatural > -1) toRead.add("conceptosConDibujosNatural = '"+conceptosConDibujosNatural+"'");
        if(busquedaSimbolosNatural > -1) toRead.add("busquedaSimbolosNatural = '"+busquedaSimbolosNatural+"'");
        if(pistasNatural > -1) toRead.add("pistasNatural = '"+pistasNatural+"'");
        if(clavesNatural > -1) toRead.add("clavesNatural = '"+clavesNatural+"'");
        if(comprensionNatural > -1) toRead.add("comprensionNatural = '"+comprensionNatural+"'");
        if(figurasIncompletasNatural > -1) toRead.add("figurasIncompletasNatural = '"+figurasIncompletasNatural+"'");
        if(vocabularioReceptivoNatural > -1) toRead.add("vocabularioReceptivoNatural = '"+vocabularioReceptivoNatural+"'");
        if(rompecabezasNatural > -1) toRead.add("rompecabezasNatural = '"+rompecabezasNatural+"'");
        if(denominacionesNatural > -1) toRead.add("denominacionesNatural = '"+denominacionesNatural+"'");
        if(fkBebe > -1) toRead.add("fkBebe = '"+fkBebe+"'");
        String query1 = "SELECT * FROM babywizard.wppsi48 WHERE ";
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
        rs = stmt.executeQuery("SELECT * FROM babywizard.wppsi48");
        }
        ObservableList<Wppsi48Modelo> wppsis = FXCollections.observableArrayList();
        while(rs.next()){
            Wppsi48Modelo wm = new Wppsi48Modelo();
            wm.setBusquedaSimbolosNatural(rs.getInt("busquedaSimbolosNatural"));
            wm.setClavesNatural(rs.getInt("clavesNatural"));
            wm.setComprensionNatural(rs.getInt("comprensionNatural"));
            wm.setConceptosConDibujosNatural(rs.getInt("conceptosConDibujosNatural"));
            wm.setFigurasIncompletasNatural(rs.getInt("figurasIncompletasNatural"));
            wm.setMatricesNatural(rs.getInt("matricesNatural"));
            wm.setPistasNatural(rs.getInt("pistasNatural"));
            wm.setSemejanzasNatural(rs.getInt("semejanzasNatural"));
            wm.setVocabularioNatural(rs.getInt("vocabularioNatural"));
            wm.setDenominacionesNatural(rs.getInt("denominacionesNatural"));
            wm.setDisenioCubosNatural(rs.getInt("disenioConCubosNatural"));
            wm.setFkBebe(rs.getInt("fkBebe"));
            wm.setIdWppsi48(rs.getInt("idWppsi48"));
            wm.setInformacionNatural(rs.getInt("informacionNatural"));
            wm.setRompecabezasNatural(rs.getInt("rompecabezasNatural"));
            wm.setVocabularioReceptivoNatural(rs.getInt("vocabularioReceptivoNatural"));
            wppsis.add(wm);
        }
        con.close();
        return wppsis;
    }
    
    public void updateWppsi48(int idWppsi48Actualizar, int idWppsi48,int disenioCubosNatural, int informacionNatural, int semejanzasNatural, int matricesNatural, int vocabularioNatural, int conceptosConDibujosNatural, int busquedaSimbolosNatural, int pistasNatural, int clavesNatural, int comprensionNatural, int figurasIncompletasNatural, int vocabularioReceptivoNatural, int rompecabezasNatural, int denominacionesNatural, int fkBebe) throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        LinkedList<String> toUpdate = new LinkedList<>();
        if (idWppsi48 > -1) {
           String idWppsi48Q = "`idWppsi48` = '"+idWppsi48+"'";
           toUpdate.add(idWppsi48Q);
        }
        if (disenioCubosNatural > -1) {
           String disenioCubosNaturalQ = "`disenioCubosNatural` = '"+disenioCubosNatural+"'";
           toUpdate.add(disenioCubosNaturalQ);
        }
        if (informacionNatural > -1) {
           String informacionNaturalQ = "`informacionNatural` = '"+informacionNatural+"'";
           toUpdate.add(informacionNaturalQ);
        }
        if (semejanzasNatural > -1) {
           String semejanzasNaturalQ = "`semejanzasNatural` = '"+semejanzasNatural+"'";
           toUpdate.add(semejanzasNaturalQ);
        }
        if (matricesNatural > -1) {
           String matricesNaturalQ = "`matricesNatural` = '"+matricesNatural+"'";
           toUpdate.add(matricesNaturalQ);
        }
        if (vocabularioNatural > -1) {
           String vocabularioNaturalQ = "`vocabularioNatural` = '"+vocabularioNatural+"'";
           toUpdate.add(vocabularioNaturalQ);
        }
        if (conceptosConDibujosNatural > -1) {
           String conceptosConDibujosNaturalQ = "`conceptosConDibujosNatural` = '"+conceptosConDibujosNatural+"'";
           toUpdate.add(conceptosConDibujosNaturalQ);
        }
        if (busquedaSimbolosNatural > -1) {
           String busquedaSimbolosNaturalQ = "`busquedaSimbolosNatural` = '"+busquedaSimbolosNatural+"'";
           toUpdate.add(busquedaSimbolosNaturalQ);
        }
        if (pistasNatural > -1) {
           String pistasNaturalQ = "`pistasNatural` = '"+pistasNatural+"'";
           toUpdate.add(pistasNaturalQ);
        }
        if (clavesNatural > -1) {
           String clavesNaturalQ = "`clavesNatural` = '"+clavesNatural+"'";
           toUpdate.add(clavesNaturalQ);
        }
        if (comprensionNatural > -1) {
           String comprensionNaturalQ = "`comprensionNatural` = '"+comprensionNatural+"'";
           toUpdate.add(comprensionNaturalQ);
        }
        if (figurasIncompletasNatural > -1) {
           String figurasIncompletasNaturalQ = "`figurasIncompletasNatural` = '"+figurasIncompletasNatural+"'";
           toUpdate.add(figurasIncompletasNaturalQ);
        }
        if (vocabularioReceptivoNatural > -1) {
           String vocabularioReceptivoNaturalQ = "`vocabularioReceptivoNatural` = '"+vocabularioReceptivoNatural+"'";
           toUpdate.add(vocabularioReceptivoNaturalQ);
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
      
        String query1 = "UPDATE `babywizard`.`wppsi48` SET ";
        String query2 = "";
        for(int i = 0; i<toUpdate.size()-1;i++){
            query2 = query2+toUpdate.get(i)+", ";
        }
        String query3 = toUpdate.getLast()+" WHERE (`idWppsi48` = '"+idWppsi48Actualizar+"');";
        Statement stmt = con.createStatement();
        if(toUpdate.size() > 0) stmt.executeUpdate(query1+query2+query3);
        con.close();
    }
    
    public void deleteWippsi48(int idWippsi48) throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        Statement stmt = con.createStatement();
        stmt.executeUpdate("DELETE FROM `babywizard`.`wippsi48` WHERE (`idWippsi48` = '"+idWippsi48+"');");
        con.close();
    }
}
