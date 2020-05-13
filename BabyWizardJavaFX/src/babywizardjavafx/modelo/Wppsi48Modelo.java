/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx.modelo;

import babywizardjavafx.controlador.Wppsi303642Controller;
import babywizardjavafx.controlador.Wppsi48Controller;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Vicaris
 */
public class Wppsi48Modelo {
    
    String fechaAplicacion;
    
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
    
    int disenioCubosEscalar;
    int informacionEscalar;
    int semejanzasEscalar;
    int matricesEscalar;
    int vocabularioEscalar;
    int conceptosConDibujosEscalar;
    int busquedaSimbolosEscalar;
    int pistasEscalar;
    int clavesEscalar;
    int comprensionEscalar;
    int figurasIncompletasEscalar;
    int vocabularioReceptivoEscalar;
    int rompecabezasEscalar;
    int denominacionesEscalar;

    public int getDisenioCubosEscalar() {
        return disenioCubosEscalar;
    }

    public void setDisenioCubosEscalar(int disenioCubosEscalar) {
        this.disenioCubosEscalar = disenioCubosEscalar;
    }

    public int getInformacionEscalar() {
        return informacionEscalar;
    }

    public void setInformacionEscalar(int informacionEscalar) {
        this.informacionEscalar = informacionEscalar;
    }

    public int getSemejanzasEscalar() {
        return semejanzasEscalar;
    }

    public void setSemejanzasEscalar(int semejanzasEscalar) {
        this.semejanzasEscalar = semejanzasEscalar;
    }

    public int getMatricesEscalar() {
        return matricesEscalar;
    }

    public void setMatricesEscalar(int matricesEscalar) {
        this.matricesEscalar = matricesEscalar;
    }

    public int getVocabularioEscalar() {
        return vocabularioEscalar;
    }

    public void setVocabularioEscalar(int vocabularioEscalar) {
        this.vocabularioEscalar = vocabularioEscalar;
    }

    public int getConceptosConDibujosEscalar() {
        return conceptosConDibujosEscalar;
    }

    public void setConceptosConDibujosEscalar(int conceptosConDibujosEscalar) {
        this.conceptosConDibujosEscalar = conceptosConDibujosEscalar;
    }

    public int getBusquedaSimbolosEscalar() {
        return busquedaSimbolosEscalar;
    }

    public void setBusquedaSimbolosEscalar(int busquedaSimbolosEscalar) {
        this.busquedaSimbolosEscalar = busquedaSimbolosEscalar;
    }

    public int getPistasEscalar() {
        return pistasEscalar;
    }

    public void setPistasEscalar(int pistasEscalar) {
        this.pistasEscalar = pistasEscalar;
    }

    public int getClavesEscalar() {
        return clavesEscalar;
    }

    public void setClavesEscalar(int clavesEscalar) {
        this.clavesEscalar = clavesEscalar;
    }

    public int getComprensionEscalar() {
        return comprensionEscalar;
    }

    public void setComprensionEscalar(int comprensionEscalar) {
        this.comprensionEscalar = comprensionEscalar;
    }

    public int getFigurasIncompletasEscalar() {
        return figurasIncompletasEscalar;
    }

    public void setFigurasIncompletasEscalar(int figurasIncompletasEscalar) {
        this.figurasIncompletasEscalar = figurasIncompletasEscalar;
    }

    public int getVocabularioReceptivoEscalar() {
        return vocabularioReceptivoEscalar;
    }

    public void setVocabularioReceptivoEscalar(int vocabularioReceptivoEscalar) {
        this.vocabularioReceptivoEscalar = vocabularioReceptivoEscalar;
    }

    public int getRompecabezasEscalar() {
        return rompecabezasEscalar;
    }

    public void setRompecabezasEscalar(int rompecabezasEscalar) {
        this.rompecabezasEscalar = rompecabezasEscalar;
    }

    public int getDenominacionesEscalar() {
        return denominacionesEscalar;
    }

    public void setDenominacionesEscalar(int denominacionesEscalar) {
        this.denominacionesEscalar = denominacionesEscalar;
    }

    public Wppsi48Modelo() {
    }

    public Wppsi48Modelo(int disenioCubosNatural, int informacionNatural, int semejanzasNatural, int matricesNatural, int vocabularioNatural, int conceptosConDibujosNatural, int busquedaSimbolosNatural, int pistasNatural, int clavesNatural, int comprensionNatural, int figurasIncompletasNatural, int vocabularioReceptivoNatural, int rompecabezasNatural, int denominacionesNatural, String fechaAplicacion, int fkBebe) {
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
        this.fechaAplicacion = fechaAplicacion;
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

    public String getFechaAplicacion() {
        return fechaAplicacion;
    }

    public void setFechaAplicacion(String fechaAplicacion) {
        this.fechaAplicacion = fechaAplicacion;
    }

    public void setFkBebe(int fkBebe) {
        this.fkBebe = fkBebe;
    }
    
    public int[] setEscalares() throws SQLException{
        int[] res = new int[14];
        Wppsi48Controller wcont = new Wppsi48Controller();
        BebeModelo bm = new BebeModelo();
        LinkedList<BebeModelo> bebe = bm.readBebe(this.getFkBebe(), "", "", "", -1, "", -1, -1, "");
        int edad = 0;
        String fecha = "";
        
        if(bebe.size()>0) {
            fecha = bebe.getFirst().getFechaNacimiento();
            LocalDate fechaApl = LocalDate.parse(this.getFechaAplicacion(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            LocalDate fechaNac = LocalDate.parse(bebe.getFirst().fechaNacimiento, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            Period tiempo = Period.between(fechaNac, fechaApl);
            edad = tiempo.getMonths()+(tiempo.getYears()*12);
        } else {
            return null;
        }
        System.out.println(edad);
        if(edad >= 48 && edad <= 50) res = wcont.naturalesAEscalares4042(this.getDisenioCubosNatural(), this.getInformacionNatural(), this.getMatricesNatural(), this.getVocabularioNatural(), this.getConceptosConDibujosNatural(), this.getBusquedaSimbolosNatural(), this.getPistasNatural(), this.getClavesNatural(), this.getComprensionNatural(), this.getFigurasIncompletasNatural(), this.getSemejanzasNatural(), this.getVocabularioReceptivoNatural(), this.getRompecabezasNatural(), this.getDenominacionesNatural());
        if(edad >= 51 && edad <= 53) res = wcont.naturalesAEscalares4345(this.getDisenioCubosNatural(), this.getInformacionNatural(), this.getMatricesNatural(), this.getVocabularioNatural(), this.getConceptosConDibujosNatural(), this.getBusquedaSimbolosNatural(), this.getPistasNatural(), this.getClavesNatural(), this.getComprensionNatural(), this.getFigurasIncompletasNatural(), this.getSemejanzasNatural(), this.getVocabularioReceptivoNatural(), this.getRompecabezasNatural(), this.getDenominacionesNatural());
        if(edad >= 54 && edad <= 56) res = wcont.naturalesAEscalares4648(this.getDisenioCubosNatural(), this.getInformacionNatural(), this.getMatricesNatural(), this.getVocabularioNatural(), this.getConceptosConDibujosNatural(), this.getBusquedaSimbolosNatural(), this.getPistasNatural(), this.getClavesNatural(), this.getComprensionNatural(), this.getFigurasIncompletasNatural(), this.getSemejanzasNatural(), this.getVocabularioReceptivoNatural(), this.getRompecabezasNatural(), this.getDenominacionesNatural());
        if(edad >= 57 && edad <= 59) res = wcont.naturalesAEscalares49411(this.getDisenioCubosNatural(), this.getInformacionNatural(), this.getMatricesNatural(), this.getVocabularioNatural(), this.getConceptosConDibujosNatural(), this.getBusquedaSimbolosNatural(), this.getPistasNatural(), this.getClavesNatural(), this.getComprensionNatural(), this.getFigurasIncompletasNatural(), this.getSemejanzasNatural(), this.getVocabularioReceptivoNatural(), this.getRompecabezasNatural(), this.getDenominacionesNatural());
        if(edad >= 60 && edad <= 62) res = wcont.naturalesAEscalares5052(this.getDisenioCubosNatural(), this.getInformacionNatural(), this.getMatricesNatural(), this.getVocabularioNatural(), this.getConceptosConDibujosNatural(), this.getBusquedaSimbolosNatural(), this.getPistasNatural(), this.getClavesNatural(), this.getComprensionNatural(), this.getFigurasIncompletasNatural(), this.getSemejanzasNatural(), this.getVocabularioReceptivoNatural(), this.getRompecabezasNatural(), this.getDenominacionesNatural());
        if(edad >= 63 && edad <= 65) res = wcont.naturalesAEscalares5355(this.getDisenioCubosNatural(), this.getInformacionNatural(), this.getMatricesNatural(), this.getVocabularioNatural(), this.getConceptosConDibujosNatural(), this.getBusquedaSimbolosNatural(), this.getPistasNatural(), this.getClavesNatural(), this.getComprensionNatural(), this.getFigurasIncompletasNatural(), this.getSemejanzasNatural(), this.getVocabularioReceptivoNatural(), this.getRompecabezasNatural(), this.getDenominacionesNatural());
        if(edad >= 66 && edad <= 68) res = wcont.naturalesAEscalares5658(this.getDisenioCubosNatural(), this.getInformacionNatural(), this.getMatricesNatural(), this.getVocabularioNatural(), this.getConceptosConDibujosNatural(), this.getBusquedaSimbolosNatural(), this.getPistasNatural(), this.getClavesNatural(), this.getComprensionNatural(), this.getFigurasIncompletasNatural(), this.getSemejanzasNatural(), this.getVocabularioReceptivoNatural(), this.getRompecabezasNatural(), this.getDenominacionesNatural());
        if(edad >= 69 && edad <= 71) res = wcont.naturalesAEscalares59511(this.getDisenioCubosNatural(), this.getInformacionNatural(), this.getMatricesNatural(), this.getVocabularioNatural(), this.getConceptosConDibujosNatural(), this.getBusquedaSimbolosNatural(), this.getPistasNatural(), this.getClavesNatural(), this.getComprensionNatural(), this.getFigurasIncompletasNatural(), this.getSemejanzasNatural(), this.getVocabularioReceptivoNatural(), this.getRompecabezasNatural(), this.getDenominacionesNatural());
        if(edad >= 72 && edad <= 75) res = wcont.naturalesAEscalares6063(this.getDisenioCubosNatural(), this.getInformacionNatural(), this.getMatricesNatural(), this.getVocabularioNatural(), this.getConceptosConDibujosNatural(), this.getBusquedaSimbolosNatural(), this.getPistasNatural(), this.getClavesNatural(), this.getComprensionNatural(), this.getFigurasIncompletasNatural(), this.getSemejanzasNatural(), this.getVocabularioReceptivoNatural(), this.getRompecabezasNatural(), this.getDenominacionesNatural());
        if(edad >= 76 && edad <= 79) res = wcont.naturalesAEscalares6467(this.getDisenioCubosNatural(), this.getInformacionNatural(), this.getMatricesNatural(), this.getVocabularioNatural(), this.getConceptosConDibujosNatural(), this.getBusquedaSimbolosNatural(), this.getPistasNatural(), this.getClavesNatural(), this.getComprensionNatural(), this.getFigurasIncompletasNatural(), this.getSemejanzasNatural(), this.getVocabularioReceptivoNatural(), this.getRompecabezasNatural(), this.getDenominacionesNatural());
        if(edad >= 80 && edad <= 83) res = wcont.naturalesAEscalares68611(this.getDisenioCubosNatural(), this.getInformacionNatural(), this.getMatricesNatural(), this.getVocabularioNatural(), this.getConceptosConDibujosNatural(), this.getBusquedaSimbolosNatural(), this.getPistasNatural(), this.getClavesNatural(), this.getComprensionNatural(), this.getFigurasIncompletasNatural(), this.getSemejanzasNatural(), this.getVocabularioReceptivoNatural(), this.getRompecabezasNatural(), this.getDenominacionesNatural());
        if(edad >= 84 && edad <= 87) res = wcont.naturalesAEscalares7073(this.getDisenioCubosNatural(), this.getInformacionNatural(), this.getMatricesNatural(), this.getVocabularioNatural(), this.getConceptosConDibujosNatural(), this.getBusquedaSimbolosNatural(), this.getPistasNatural(), this.getClavesNatural(), this.getComprensionNatural(), this.getFigurasIncompletasNatural(), this.getSemejanzasNatural(), this.getVocabularioReceptivoNatural(), this.getRompecabezasNatural(), this.getDenominacionesNatural());
        if(edad >= 88) res = wcont.naturalesAEscalares7073(this.getDisenioCubosNatural(), this.getInformacionNatural(), this.getMatricesNatural(), this.getVocabularioNatural(), this.getConceptosConDibujosNatural(), this.getBusquedaSimbolosNatural(), this.getPistasNatural(), this.getClavesNatural(), this.getComprensionNatural(), this.getFigurasIncompletasNatural(), this.getSemejanzasNatural(), this.getVocabularioReceptivoNatural(), this.getRompecabezasNatural(), this.getDenominacionesNatural());
        
        this.setDisenioCubosEscalar(res[0]);
        this.setInformacionEscalar(res[1]);
        this.setMatricesEscalar(res[2]);
        this.setVocabularioEscalar(res[3]);
        this.setConceptosConDibujosEscalar(res[4]);
        this.setBusquedaSimbolosEscalar(res[5]);
        this.setPistasEscalar(res[6]);
        this.setClavesEscalar(res[7]);
        this.setComprensionEscalar(res[8]);
        this.setFigurasIncompletasEscalar(res[9]);
        this.setSemejanzasEscalar(res[10]);
        this.setVocabularioReceptivoEscalar(res[11]);
        this.setRompecabezasEscalar(res[12]);
        this.setDenominacionesEscalar(res[13]);
        
        return res;
    }
    
    public void createWppsi48() throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        String query;
        query = "INSERT INTO `babywizard`.`wppsi48` (`disenioConCubosNatural`, `informacionNatural`, `semejanzasNatural`, `matricesNatural`, `vocabularioNatural`, `conceptosConDibujosNatural`, `busquedaSimbolosNatural`, `pistasNatural`, `clavesNatural`, `comprensionNatural`, `figurasIncompletasNatural`, `vocabularioReceptivoNatural`, `rompecabezasNatural`, `denominacionesNatural`, `fechaAplicacion`, `fkBebe`) "
                + "VALUES ('"+this.getDisenioCubosNatural()+"', '"+this.informacionNatural+"', '"+this.getSemejanzasNatural()+"', '"+this.getMatricesNatural()+"', '"+this.getVocabularioNatural()+"', '"+this.conceptosConDibujosNatural+"', '"+this.busquedaSimbolosNatural+"', '"+this.getPistasNatural()+"', '"+this.getClavesNatural()+"', '"+this.getComprensionNatural()+"', '"+this.getFigurasIncompletasNatural()+"', '"+this.getVocabularioReceptivoNatural()+"', '"+this.getRompecabezasNatural()+"', '"+this.getDenominacionesNatural()+"', '"+this.getFechaAplicacion()+"', '"+this.getFkBebe()+"');";
        Statement stmt = con.createStatement();
        int executeUpdate = stmt.executeUpdate(query,Statement.RETURN_GENERATED_KEYS);
        
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()){
            idWppsi48=rs.getInt(1);
        }
        rs.close();
        con.close();
    }
    
    public LinkedList<Wppsi48Modelo> readWppsi48(int idWppsi48,int disenioCubosNatural, int informacionNatural, int semejanzasNatural, int matricesNatural, int vocabularioNatural, int conceptosConDibujosNatural, int busquedaSimbolosNatural, int pistasNatural, int clavesNatural, int comprensionNatural, int figurasIncompletasNatural, int vocabularioReceptivoNatural, int rompecabezasNatural, int denominacionesNatural, String fechaAplicacion, int fkBebe) throws SQLException {
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
        if(!"".equals(fechaAplicacion)) toRead.add("fechaAplicacion = '"+fechaAplicacion+"'");
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
        LinkedList<Wppsi48Modelo> wppsis = new LinkedList<>();
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
            wm.setFechaAplicacion(rs.getString("fechaAplicacion"));
            wppsis.add(wm);
        }
        con.close();
        return wppsis;
    }
    
    public void updateWppsi48(int idWppsi48Actualizar, int idWppsi48,int disenioCubosNatural, int informacionNatural, int semejanzasNatural, int matricesNatural, int vocabularioNatural, int conceptosConDibujosNatural, int busquedaSimbolosNatural, int pistasNatural, int clavesNatural, int comprensionNatural, int figurasIncompletasNatural, int vocabularioReceptivoNatural, int rompecabezasNatural, int denominacionesNatural, String fechaAplicacion, int fkBebe) throws SQLException {
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
        if (!"".equals(fechaAplicacion)) {
            String fechaAplicacionQ = "`fechaAplicacion` = '"+fechaAplicacion+"'";
            toUpdate.add(fechaAplicacionQ);
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
