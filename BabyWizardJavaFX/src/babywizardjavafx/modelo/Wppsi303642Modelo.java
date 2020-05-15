/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx.modelo;

import babywizardjavafx.controlador.Wppsi303642Controller;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;

/**
 *
 * @author Vicaris
 */
public class Wppsi303642Modelo {
    
    String fechaAplicacion;
    
    int idWppsi303642;
    int vocabularioReceptivoNatural;
    int disenioCubosNatural;
    int informacionNatural;
    int rompecabezasNatural;
    int denominacionesNatural;
    int fkBebe;
    
    int vocabularioReceptivoEscalar;
    int disenioCubosEscalar;
    int informacionEscalar;
    int rompecabezasEscalar;
    int denominacionesEscalar;
    
    String[] equivciv;
    String[] equivcie;
    String[] equivcit;
    String[] equivcgl;

    public Wppsi303642Modelo(int vocabularioReceptivoNatural, int disenioCubosNatural, int informacionNatural, int rompecabezasNatural, int denominacionesNatural, String fechaAplicacion, int fkBebe) {
        this.fechaAplicacion = fechaAplicacion;
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

    public int getVocabularioReceptivoEscalar() {
        return vocabularioReceptivoEscalar;
    }

    public void setVocabularioReceptivoEscalar(int vocabularioReceptivoEscalar) {
        this.vocabularioReceptivoEscalar = vocabularioReceptivoEscalar;
    }

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

    public String getFechaAplicacion() {
        return fechaAplicacion;
    }

    public void setFechaAplicacion(String fechaAplicacion) {
        this.fechaAplicacion = fechaAplicacion;
    }

    public String[] getEquivciv() {
        return equivciv;
    }

    public void setEquivciv(String[] equivciv) {
        this.equivciv = equivciv;
    }

    public String[] getEquivcie() {
        return equivcie;
    }

    public void setEquivcie(String[] equivcie) {
        this.equivcie = equivcie;
    }

    public String[] getEquivcit() {
        return equivcit;
    }

    public void setEquivcit(String[] equivcit) {
        this.equivcit = equivcit;
    }

    public String[] getEquivcgl() {
        return equivcgl;
    }

    public void setEquivcgl(String[] equivcgl) {
        this.equivcgl = equivcgl;
    }
    
    
    public int[] setEscalares() throws SQLException{
        int[] res = new int[5];
        Wppsi303642Controller wcont = new Wppsi303642Controller();
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
        if(edad >= 30 && edad <= 32) res = wcont.naturalesAEscalares2628(this.getVocabularioReceptivoNatural(), this.getDisenioCubosNatural(), this.getInformacionNatural(), this.getRompecabezasNatural(), this.getDenominacionesNatural());
        if(edad >= 33 && edad <= 35) res = wcont.naturalesAEscalares29211(this.getVocabularioReceptivoNatural(), this.getDisenioCubosNatural(), this.getInformacionNatural(), this.getRompecabezasNatural(), this.getDenominacionesNatural());
        if(edad >= 36 && edad <= 38) res = wcont.naturalesAEscalares3032(this.getVocabularioReceptivoNatural(), this.getDisenioCubosNatural(), this.getInformacionNatural(), this.getRompecabezasNatural(), this.getDenominacionesNatural());
        if(edad >= 39 && edad <= 41) res = wcont.naturalesAEscalares3335(this.getVocabularioReceptivoNatural(), this.getDisenioCubosNatural(), this.getInformacionNatural(), this.getRompecabezasNatural(), this.getDenominacionesNatural());
        if(edad >= 42 && edad <= 44) res = wcont.naturalesAEscalares3638(this.getVocabularioReceptivoNatural(), this.getDisenioCubosNatural(), this.getInformacionNatural(), this.getRompecabezasNatural(), this.getDenominacionesNatural());
        if(edad >= 45 && edad <= 47) res = wcont.naturalesAEscalares39311(this.getVocabularioReceptivoNatural(), this.getDisenioCubosNatural(), this.getInformacionNatural(), this.getRompecabezasNatural(), this.getDenominacionesNatural());
        
        this.setVocabularioReceptivoEscalar(res[0]);
        this.setDisenioCubosEscalar(res[1]);
        this.setInformacionEscalar(res[2]);
        this.setRompecabezasEscalar(res[3]);
        this.setDenominacionesEscalar(res[4]);
        
        return res;
    }
    
    public int[] setEquivalentes() {
        
        Wppsi303642Controller wcont = new Wppsi303642Controller();
        
        int civ = this.getVocabularioReceptivoEscalar()+this.getInformacionEscalar();
        int cie = this.getDisenioCubosEscalar()+this.getRompecabezasEscalar();
        int cit = this.getVocabularioReceptivoEscalar()+this.getDisenioCubosEscalar()+this.getInformacionEscalar()+this.getRompecabezasEscalar();
        int cgl = this.getVocabularioReceptivoEscalar()+this.getDenominacionesEscalar();
        this.setEquivciv(wcont.equivalentesCIV(civ));
        this.setEquivcie(wcont.equivalentesCIE(cie));
        this.setEquivcit(wcont.equivalentesCIT(cit));
        this.setEquivcgl(wcont.equivalentesCGL(cgl));
        
        int[] sumas = {civ,cie,cit,cgl};
        
        return sumas;
    }
    
    public void createWppsi303642() throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        String query;
        query = "INSERT INTO `babywizard`.`wppsi303642` (`vocabularioReceptivoNatural`, `disenioCubosNatural`, `informacionNatural`, `rompecabezasNatural`, `denominacionesNatural`, `fechaAplicacion`, `fkBebe`) "
                + "VALUES ('"+this.getVocabularioReceptivoNatural()+"', '"+this.getDisenioCubosNatural()+"', '"+this.getInformacionNatural()+"', '"+this.getRompecabezasNatural()+"', '"+this.getDenominacionesNatural()+"',  '"+this.getFechaAplicacion()+"', '"+this.getFkBebe()+"');";
        Statement stmt = con.createStatement();
        int executeUpdate = stmt.executeUpdate(query,Statement.RETURN_GENERATED_KEYS);
        
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()){
            idWppsi303642=rs.getInt(1);
        }
        rs.close();
        con.close();
    }
    
    public LinkedList<Wppsi303642Modelo> readWppsi303642(int idWppsi303642, int vocabularioReceptivoNatural, int disenioCubosNatural, int informacionNatural, int rompecabezasNatural, int denominacionesNatural, String fechaAplicacion, int fkBebe) throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        LinkedList<String> toRead = new LinkedList<>();
        if(idWppsi303642>-1) toRead.add("idWppsi303642 = '"+idWppsi303642+"'");
        if(vocabularioReceptivoNatural > -1) toRead.add("vocabularioReceptivoNatural = '"+vocabularioReceptivoNatural+"'");
        if(disenioCubosNatural > -1) toRead.add("disenioCubosNatural = '"+disenioCubosNatural+"'");
        if(informacionNatural > -1) toRead.add("informacionNatural = '"+informacionNatural+"'");
        if(rompecabezasNatural > -1) toRead.add("rompecabezasNatural = '"+rompecabezasNatural+"'");
        if(denominacionesNatural > -1) toRead.add("denominacionesNatural = '"+denominacionesNatural+"'");
        if(!"".equals(fechaAplicacion)) toRead.add("fechaAplicacion = '"+fechaAplicacion+"'");
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
        LinkedList<Wppsi303642Modelo> wppsis = new LinkedList<>();
        while(rs.next()){
            Wppsi303642Modelo wm = new Wppsi303642Modelo();
            wm.setDenominacionesNatural(rs.getInt("denominacionesNatural"));
            wm.setDisenioCubosNatural(rs.getInt("disenioCubosNatural"));
            wm.setFkBebe(rs.getInt("fkBebe"));
            wm.setIdWppsi303642(rs.getInt("idWppsi303642"));
            wm.setInformacionNatural(rs.getInt("informacionNatural"));
            wm.setRompecabezasNatural(rs.getInt("rompecabezasNatural"));
            wm.setVocabularioReceptivoNatural(rs.getInt("vocabularioReceptivoNatural"));
            wm.setFechaAplicacion(rs.getString("fechaAplicacion"));
            wppsis.add(wm);
        }
        con.close();
        return wppsis;
    }
    
    public void updateWppsi303642(int idWppsi303642Actualizar, int idWppsi303642, int vocabularioReceptivoNatural, int disenioCubosNatural, int informacionNatural, int rompecabezasNatural, int denominacionesNatural, String fechaAplicacion, int fkBebe) throws SQLException {
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
        if (!"".equals(fechaAplicacion)) {
            String fechaAplicacionQ = "`fechaAplicacion` = '"+fechaAplicacion+"'";
            toUpdate.add(fechaAplicacionQ);
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
