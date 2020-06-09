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
    
    int sustdn;
    
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
        this.vocabularioReceptivoEscalar=0;
        this.disenioCubosEscalar=0;
        this.informacionEscalar=0;
        this.rompecabezasEscalar=0;
        this.denominacionesEscalar=0;
        this.equivciv = new String[4];
        this.equivcie = new String[4];
        this.equivcit = new String[4];
        this.equivcgl = new String[4];
    }

    public Wppsi303642Modelo() {
        this.vocabularioReceptivoEscalar=0;
        this.disenioCubosEscalar=0;
        this.informacionEscalar=0;
        this.rompecabezasEscalar=0;
        this.denominacionesEscalar=0;
        this.equivciv = new String[4];
        this.equivcie = new String[4];
        this.equivcit = new String[4];
        this.equivcgl = new String[4];
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

    public int getSustdn() {
        return sustdn;
    }

    public void setSustdn(int sustdn) {
        this.sustdn = sustdn;
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
    public String getCiv0() {
        return equivciv[0];
    }
    public String getCiv1() {
        return equivciv[1];
    }
    public String getCiv2() {
        return equivciv[2];
    }
    public String getCiv3() {
        return equivciv[3];
    }

    public void setEquivciv(String[] equivciv) {
        this.equivciv = equivciv;
    }

    public String[] getEquivcie() {
        return equivcie;
    }
    public String getCie0() {
        return equivcie[0];
    }
    public String getCie1() {
        return equivcie[1];
    }
    public String getCie2() {
        return equivcie[2];
    }
    public String getCie3() {
        return equivcie[3];
    }

    public void setEquivcie(String[] equivcie) {
        this.equivcie = equivcie;
    }

    public String[] getEquivcit() {
        return equivcit;
    }
    public String getCit0() {
        return equivcit[0];
    }
    public String getCit1() {
        return equivcit[1];
    }
    public String getCit2() {
        return equivcit[2];
    }
    public String getCit3() {
        return equivcit[3];
    }

    public void setEquivcit(String[] equivcit) {
        this.equivcit = equivcit;
    }

    public String[] getEquivcgl() {
        return equivcgl;
    }
    public String getCgl0() {
        return equivcgl[0];
    }
    public String getCgl1() {
        return equivcgl[1];
    }
    public String getCgl2() {
        return equivcgl[2];
    }
    public String getCgl3() {
        return equivcgl[3];
    }

    public void setEquivcgl(String[] equivcgl) {
        this.equivcgl = equivcgl;
    }
    
    
    public boolean setEscalares() throws SQLException{
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
            return false;
        }
        if(edad<30) return false;
        if(edad >= 30 && edad <= 32) res = wcont.naturalesAEscalares2628(this.getVocabularioReceptivoNatural(), this.getDisenioCubosNatural(), this.getInformacionNatural(), this.getRompecabezasNatural(), this.getDenominacionesNatural());
        if(edad >= 33 && edad <= 35) res = wcont.naturalesAEscalares29211(this.getVocabularioReceptivoNatural(), this.getDisenioCubosNatural(), this.getInformacionNatural(), this.getRompecabezasNatural(), this.getDenominacionesNatural());
        if(edad >= 36 && edad <= 38) res = wcont.naturalesAEscalares3032(this.getVocabularioReceptivoNatural(), this.getDisenioCubosNatural(), this.getInformacionNatural(), this.getRompecabezasNatural(), this.getDenominacionesNatural());
        if(edad >= 39 && edad <= 41) res = wcont.naturalesAEscalares3335(this.getVocabularioReceptivoNatural(), this.getDisenioCubosNatural(), this.getInformacionNatural(), this.getRompecabezasNatural(), this.getDenominacionesNatural());
        if(edad >= 42 && edad <= 44) res = wcont.naturalesAEscalares3638(this.getVocabularioReceptivoNatural(), this.getDisenioCubosNatural(), this.getInformacionNatural(), this.getRompecabezasNatural(), this.getDenominacionesNatural());
        if(edad >= 45 && edad <= 47) res = wcont.naturalesAEscalares39311(this.getVocabularioReceptivoNatural(), this.getDisenioCubosNatural(), this.getInformacionNatural(), this.getRompecabezasNatural(), this.getDenominacionesNatural());
        if(edad>47) return false;
        
        this.setVocabularioReceptivoEscalar(res[0]);
        this.setDisenioCubosEscalar(res[1]);
        this.setInformacionEscalar(res[2]);
        this.setRompecabezasEscalar(res[3]);
        this.setDenominacionesEscalar(res[4]);
        
        return true;
    }
    
    public int[] setEquivalentes() {
        int[] sumas = {0,0,0,0};
        
        Wppsi303642Controller wcont = new Wppsi303642Controller();
        int vr = this.getVocabularioReceptivoEscalar();
        int in = this.getInformacionEscalar();
        int dc = this.getDisenioCubosEscalar();
        int rc = this.getRompecabezasEscalar();
        int dn = this.getDenominacionesEscalar();
        
        if(sustdn==1) vr=dn;
        if(vr>0 && in>0) {
            this.setEquivciv(wcont.equivalentesCIV(vr+in));
            sumas[0] = vr+in;
        }
        if(dc>0 && rc>0) {
            this.setEquivcie(wcont.equivalentesCIE(dc+rc));
            sumas[1] = dc+rc;
        }
        if(vr>0 && in>0 && dc>0 && rc>0) {
            this.setEquivcit(wcont.equivalentesCIT(vr+in+dc+rc));
            sumas[2] = vr+in+dc+rc;
        }
        if(vr>0 && dn>0 && sustdn!=1) { 
            this.setEquivcgl(wcont.equivalentesCGL(vr+dn));
            sumas[3] = vr + dn;
        } 
        
        return sumas;
    }
    
    public void createWppsi303642() throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        String query;
        query = "INSERT INTO `babywizard`.`wppsi303642` (`vocabularioReceptivoNatural`, `disenioCubosNatural`, `informacionNatural`, `rompecabezasNatural`, `denominacionesNatural`, `fechaAplicacion`, `fkBebe`, `sustdn`) "
                + "VALUES ('"+this.getVocabularioReceptivoNatural()+"', '"+this.getDisenioCubosNatural()+"', '"+this.getInformacionNatural()+"', '"+this.getRompecabezasNatural()+"', '"+this.getDenominacionesNatural()+"',  '"+this.getFechaAplicacion()+"', '"+this.getFkBebe()+"', '"+this.getSustdn()+"');";
        Statement stmt = con.createStatement();
        int executeUpdate = stmt.executeUpdate(query,Statement.RETURN_GENERATED_KEYS);
        
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()){
            idWppsi303642=rs.getInt(1);
        }
        rs.close();
        con.close();
    }
    
    public LinkedList<Wppsi303642Modelo> readWppsi303642(int idWppsi303642, int vocabularioReceptivoNatural, int disenioCubosNatural, int informacionNatural, int rompecabezasNatural, int denominacionesNatural, String fechaAplicacion, int fkBebe, int sustdn) throws SQLException {
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
        if(sustdn == 0 || sustdn == 1) toRead.add("sustdn = '"+sustdn+"'");
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
            wm.setSustdn(rs.getInt("sustdn"));
            wppsis.add(wm);
        }
        con.close();
        return wppsis;
    }
    
    public void updateWppsi303642(int idWppsi303642Actualizar, int idWppsi303642, int vocabularioReceptivoNatural, int disenioCubosNatural, int informacionNatural, int rompecabezasNatural, int denominacionesNatural, String fechaAplicacion, int fkBebe, int sustdn) throws SQLException {
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
        if (sustdn == 0 || sustdn == 1) {
           String sustdnQ = "`sustdn` = '"+sustdn+"'";
           toUpdate.add(sustdnQ);
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

    public LinkedList<Wppsi303642Modelo> readWppsi303642PorIds(LinkedList<Integer> ids) throws SQLException {
        LinkedList<Wppsi303642Modelo> wppsis = new LinkedList<Wppsi303642Modelo>();
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        String query;
        String abuscar = "(";
        int size = ids.size();
        for(int i = 0; i < size-1; i++) abuscar += ids.get(i)+",";
        abuscar+=ids.get(size-1)+")";
        
        query = "select * FROM wppsi303642 where fkBebe in "+abuscar+";";
        //System.out.print(con);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        
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
            wm.setSustdn(rs.getInt("sustdn"));
            wppsis.add(wm);
        }
        con.close();
        return wppsis;
    }
}
