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
public class SociodemograficoModelo {
    
    int idSociodemografico;
    String fechaDeCita;
    int gestacion;
    int semanasDeNacimiento;
    int ptApgar1;
    int ptApgar2;
    double pesoAlNacer;
    int problemasAlNacer;
    int problemasDeSalud;
    int problemasDeAudicion;
    int problemasDeVision;
    int otroIdioma;
    int hermanos;
    int lugarOcupa;
    int adultos;
    int ninios;
    String cuidadorPrincipal;
    int guarderia;
    int tiempoAsistiendoMesesG;
    int tiempoQueAsisteG;
    int preescolar;
    int tiempoAsistiendoMesesP;
    int tiempoQueAsisteP;
    String observaciones;
    int fkBebeSociodemografico;
    SocioeconomicoModelo sem;

    public SociodemograficoModelo() {
        sem = new SocioeconomicoModelo();
    }

    public SociodemograficoModelo(String fechaDeCita, int gestacion, int semanasDeNacimiento, int ptApgar1, int ptApgar2, double pesoAlNacer, int problemasAlNacer, int problemasDeSalud, int problemasDeAudicion, int problemasDeVision, int otroIdioma, int hermanos, int lugarOcupa, int adultos, int ninios, String cuidadorPrincipal, int guarderia, int tiempoAsistiendoMesesG, int tiempoQueAsisteG, int preescolar, int tiempoAsistiendoMesesP, int tiempoQueAsisteP, String observaciones, int fkBebeSociodemografico) {
        this.fechaDeCita = fechaDeCita;
        this.gestacion = gestacion;
        this.semanasDeNacimiento = semanasDeNacimiento;
        this.ptApgar1 = ptApgar1;
        this.ptApgar2 = ptApgar2;
        this.pesoAlNacer = pesoAlNacer;
        this.problemasAlNacer = problemasAlNacer;
        this.problemasDeSalud = problemasDeSalud;
        this.problemasDeAudicion = problemasDeAudicion;
        this.problemasDeVision = problemasDeVision;
        this.otroIdioma = otroIdioma;
        this.hermanos = hermanos;
        this.lugarOcupa = lugarOcupa;
        this.adultos = adultos;
        this.ninios = ninios;
        this.cuidadorPrincipal = cuidadorPrincipal;
        this.guarderia = guarderia;
        this.tiempoAsistiendoMesesG = tiempoAsistiendoMesesG;
        this.tiempoQueAsisteG = tiempoQueAsisteG;
        this.preescolar = preescolar;
        this.tiempoAsistiendoMesesP = tiempoAsistiendoMesesP;
        this.tiempoQueAsisteP = tiempoQueAsisteP;
        this.observaciones = observaciones;
        this.fkBebeSociodemografico = fkBebeSociodemografico;
        sem = new SocioeconomicoModelo();
    }

    public int getIdSociodemografico() {
        return idSociodemografico;
    }

    public void setIdSociodemografico(int idSociodemografico) {
        this.idSociodemografico = idSociodemografico;
    }

    public String getFechaDeCita() {
        return fechaDeCita;
    }

    public void setFechaDeCita(String fechaDeCita) {
        this.fechaDeCita = fechaDeCita;
    }

    public int getSemanasDeNacimiento() {
        return semanasDeNacimiento;
    }

    public void setSemanasDeNacimiento(int semanasDeNacimiento) {
        this.semanasDeNacimiento = semanasDeNacimiento;
    }

    public int getPtApgar1() {
        return ptApgar1;
    }

    public void setPtApgar1(int ptApgar1) {
        this.ptApgar1 = ptApgar1;
    }

    public int getPtApgar2() {
        return ptApgar2;
    }

    public void setPtApgar2(int ptApgar2) {
        this.ptApgar2 = ptApgar2;
    }

    public double getPesoAlNacer() {
        return pesoAlNacer;
    }

    public void setPesoAlNacer(double pesoAlNacer) {
        this.pesoAlNacer = pesoAlNacer;
    }

    public int getGestacion() {
        return gestacion;
    }
    
    public String getGestacionString() {
        String g = "";
        g = (gestacion==0) ? "A término":"Prematuro";
        return g;
    }

    public void setGestacion(int gestacion) {
        this.gestacion = gestacion;
    }
    
    public int getProblemasAlNacer() {
        return problemasAlNacer;
    }

    public String getProblemasAlNacerString() {
        String p = "";
        p = (problemasAlNacer==0) ? "No" : "Sí";
        return p;
    }

    public void setProblemasAlNacer(int problemasAlNacer) {
        this.problemasAlNacer = problemasAlNacer;
    }

    public int getProblemasDeSalud() {
        return problemasDeSalud;
    }

    public String getProblemasDeSaludString() {
        String p = "";
        p = (problemasDeSalud==0) ? "No" : "Sí";
        return p;
    }

    public void setProblemasDeSalud(int problemasDeSalud) {
        this.problemasDeSalud = problemasDeSalud;
    }

    public int getProblemasDeAudicion() {
        return problemasDeAudicion;
    }

    public String getProblemasDeAudicionString() {
        String p = "";
        p = (problemasDeAudicion==0) ? "No" : "Sí";
        return p;
    }

    public void setProblemasDeAudicion(int problemasDeAudicion) {
        this.problemasDeAudicion = problemasDeAudicion;
    }

    public int getProblemasDeVision() {
        return problemasDeVision;
    }

    public String getProblemasDeVisionString() {
        String p = "";
        p = (problemasDeVision==0) ? "No" : "Sí";
        return p;
    }

    public void setProblemasDeVision(int problemasDeVision) {
        this.problemasDeVision = problemasDeVision;
    }

    public int getOtroIdioma() {
        return otroIdioma;
    }

    public String getOtroIdiomaString() {
        String p = "";
        p = (otroIdioma==0) ? "No" : "Sí";
        return p;
    }

    public void setOtroIdioma(int otroIdioma) {
        this.otroIdioma = otroIdioma;
    }

    public int getGuarderia() {
        return guarderia;
    }

    public String getGuarderiaString() {
        String p = "";
        p = (guarderia==0) ? "No" : "Sí";
        return p;
    }

    public void setGuarderia(int guarderia) {
        this.guarderia = guarderia;
    }

    public int getPreescolar() {
        return preescolar;
    }

    public String getPreescolarString() {
        String p = "";
        p = (preescolar==0) ? "No" : "Sí";
        return p;
    }

    public void setPreescolar(int preescolar) {
        this.preescolar = preescolar;
    }

    public int getHermanos() {
        return hermanos;
    }

    public void setHermanos(int hermanos) {
        this.hermanos = hermanos;
    }

    public int getLugarOcupa() {
        return lugarOcupa;
    }

    public void setLugarOcupa(int lugarOcupa) {
        this.lugarOcupa = lugarOcupa;
    }

    public int getAdultos() {
        return adultos;
    }

    public void setAdultos(int adultos) {
        this.adultos = adultos;
    }

    public int getNinios() {
        return ninios;
    }

    public void setNinios(int ninios) {
        this.ninios = ninios;
    }

    public String getCuidadorPrincipal() {
        return cuidadorPrincipal;
    }

    public void setCuidadorPrincipal(String cuidadorPrincipal) {
        this.cuidadorPrincipal = cuidadorPrincipal;
    }

    public int getTiempoAsistiendoMesesG() {
        return tiempoAsistiendoMesesG;
    }

    public void setTiempoAsistiendoMesesG(int tiempoAsistiendoMesesG) {
        this.tiempoAsistiendoMesesG = tiempoAsistiendoMesesG;
    }

    public int getTiempoQueAsisteG() {
        return tiempoQueAsisteG;
    }

    public void setTiempoQueAsisteG(int tiempoQueAsisteG) {
        this.tiempoQueAsisteG = tiempoQueAsisteG;
    }

    public int getTiempoAsistiendoMesesP() {
        return tiempoAsistiendoMesesP;
    }

    public void setTiempoAsistiendoMesesP(int tiempoAsistiendoMesesP) {
        this.tiempoAsistiendoMesesP = tiempoAsistiendoMesesP;
    }

    public int getTiempoQueAsisteP() {
        return tiempoQueAsisteP;
    }

    public void setTiempoQueAsisteP(int tiempoQueAsisteP) {
        this.tiempoQueAsisteP = tiempoQueAsisteP;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getFkBebeSociodemografico() {
        return fkBebeSociodemografico;
    }

    public void setFkBebeSociodemografico(int fkBebeSociodemografico) {
        this.fkBebeSociodemografico = fkBebeSociodemografico;
    }
    
    
    
    public void createSociodemografico() throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        String query;
        query = "INSERT INTO `babywizard`.`sociodemografico` (`fechaCita`, `gestacion`, `semanasDeNacimiento`, `ptApgar1`, `ptApgar2`, `pesoAlNacer`, `problemasAlNacer`, `problemasDeSalud`, `problemasDeAudicion`, `problemasDeVision`, `otroIdioma`, `hermanos`, `lugarOcupa`, `adultos`, `ninios`, `cuidadorPrincipal`, `guarderia`, `tiempoAsistiendoMesesG`, `tiempoQueAsisteG`, `preescolar`, `tiempoAsistiendoMesesP`, `tiempoQueAsisteP`, `Observaciones`, `fkBebeSociodemografico`) "
                + "VALUES ('"+this.getFechaDeCita()+"', '"+this.getGestacion()+"', '"+this.getSemanasDeNacimiento()+"', '"+this.getPtApgar1()+"', '"+this.getPtApgar2()+"', '"+this.getPesoAlNacer()+"', '"+this.getProblemasAlNacer()+"', '"+this.getProblemasDeSalud()+"', '"+this.getProblemasDeAudicion()+"', '"+this.getProblemasDeVision()+"', '"+this.getOtroIdioma()+"', '"+this.getHermanos()+"', '"+this.getLugarOcupa()+"', '"+this.getAdultos()+"', '"+this.getNinios()+"', '"+this.getCuidadorPrincipal()+"', '"+this.getGuarderia()+"', '"+this.getTiempoAsistiendoMesesG()+"', '"+this.getTiempoQueAsisteG()+"', '"+this.getPreescolar()+"', '"+this.getTiempoAsistiendoMesesP()+"', '"+this.getTiempoQueAsisteP()+"', '"+this.getObservaciones()+"', '"+this.getFkBebeSociodemografico()+"');";
        Statement stmt = con.createStatement();
        int executeUpdate = stmt.executeUpdate(query,Statement.RETURN_GENERATED_KEYS);
        
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()){
            idSociodemografico=rs.getInt(1);
        }
        rs.close();
        con.close();
    }
    
   public LinkedList<SociodemograficoModelo> readSociodemografico(int idSociodemografico, String fechaDeCita, int gestacion, int semanasDeNacimiento, int ptApgar1, int ptApgar2, double pesoAlNacer1, double pesoAlNacer2, int problemasAlNacer, int problemasDeSalud, int problemasDeAudicion, int problemasDeVision, int otroIdioma, int hermanos, int lugarOcupa, int adultos, int ninios, String cuidadorPrincipal, int guarderia, int tiempoAsistiendoMesesG, int tiempoQueAsisteG, int preescolar, int tiempoAsistiendoMesesP, int tiempoQueAsisteP, String observaciones, int fkBebeSociodemografico) throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        LinkedList<String> toRead = new LinkedList<>();
        if(idSociodemografico>-1) toRead.add("idSociodemografico = '"+idSociodemografico+"'");
        if(!"".equals(fechaDeCita)) toRead.add("fechaDeCita = '"+fechaDeCita+"'");
        if(gestacion==1 || gestacion == 0) toRead.add("gestacion = '"+gestacion+"'");
        if(semanasDeNacimiento>-1) toRead.add("semanasDeNacimiento = '"+semanasDeNacimiento+"'");
        if(ptApgar1>-1) toRead.add("ptApgar1 = '"+ptApgar1+"'");
        if(ptApgar2>-1) toRead.add("ptApgar2 = '"+ptApgar2+"'");       
        if(problemasAlNacer==1 || problemasAlNacer == 0) toRead.add("problemasAlNacer = '"+problemasAlNacer+"'");
        if(problemasDeSalud==1 || problemasDeSalud == 0) toRead.add("problemasDeSalud = '"+problemasDeSalud+"'");
        if(problemasDeAudicion==1 || problemasDeAudicion == 0) toRead.add("problemasDeAudicion = '"+problemasDeAudicion+"'");
        if(problemasDeVision==1 || problemasDeVision == 0) toRead.add("problemasDeVision = '"+problemasDeVision+"'");
        if(otroIdioma==1 || otroIdioma == 0) toRead.add("otroIdioma = '"+otroIdioma+"'");
        if(hermanos>-1) toRead.add("hermanos = '"+hermanos+"'");
        if(lugarOcupa>-1) toRead.add("lugarOcupa = '"+lugarOcupa+"'");
        if(adultos>-1) toRead.add("adultos = '"+adultos+"'");
        if(ninios>-1) toRead.add("ninios = '"+ninios+"'");
        if(!"".equals(cuidadorPrincipal)) toRead.add("cuidadorPrincipal = '"+cuidadorPrincipal+"'");
        if(guarderia==1 || guarderia == 0) toRead.add("guarderia = '"+guarderia+"'");
        if(tiempoAsistiendoMesesG>-1) toRead.add("tiempoAsistiendoMesesG = '"+tiempoAsistiendoMesesG+"'");
        if(tiempoQueAsisteG>-1) toRead.add("tiempoQueAsisteG = '"+tiempoQueAsisteG+"'");
        if(preescolar==1 || preescolar == 0) toRead.add("preescolar = '"+preescolar+"'");
        if(tiempoAsistiendoMesesP>-1) toRead.add("tiempoAsistiendoMesesP = '"+tiempoAsistiendoMesesP+"'");
        if(tiempoQueAsisteP>-1) toRead.add("tiempoQueAsisteP = '"+tiempoQueAsisteP+"'");
        if(!"".equals(observaciones)) toRead.add("observaciones = '"+observaciones+"'");
        if(fkBebeSociodemografico>-1) toRead.add("fkBebeSociodemografico = '"+fkBebeSociodemografico+"'");
        if(pesoAlNacer1>-1) toRead.add("pesoAlNacer >= '"+pesoAlNacer1+"'");
        if(pesoAlNacer2>-1 && pesoAlNacer2>=pesoAlNacer1) toRead.add("pesoAlNacer <= '"+pesoAlNacer2+"'");
        
        String query1 = "SELECT * FROM babywizard.sociodemografico WHERE ";
        String query2 = "";
        for(int i = 0; i<toRead.size()-1;i++){
            query2 = query2+toRead.get(i)+" AND ";
        }
        String query3="";
        if(toRead.size()>0) query3 = toRead.getLast()+";";
        Statement stmt = con.createStatement();
        //System.out.println(query1+query2+query3);
        ResultSet rs;
        if (toRead.size()>0) {
        rs = stmt.executeQuery(query1+query2+query3);
        } else {
        rs = stmt.executeQuery("SELECT * FROM babywizard.sociodemografico;");
        }
        LinkedList<SociodemograficoModelo> sdms = new LinkedList<>();
        while(rs.next()){
            SociodemograficoModelo sdm = new SociodemograficoModelo();
            sdm.setAdultos(rs.getInt("adultos"));
            sdm.setCuidadorPrincipal(rs.getString("cuidadorPrincipal"));
            sdm.setFechaDeCita(rs.getString("fechaCita"));
            sdm.setFkBebeSociodemografico(rs.getInt("fkBebeSociodemografico"));
            sdm.setGestacion(rs.getInt("gestacion"));
            sdm.setGuarderia(rs.getInt("guarderia"));
            sdm.setHermanos(rs.getInt("hermanos"));
            sdm.setIdSociodemografico(rs.getInt("idSociodemografico"));
            sdm.setLugarOcupa(rs.getInt("lugarOcupa"));
            sdm.setNinios(rs.getInt("ninios"));
            sdm.setObservaciones(rs.getString("observaciones"));
            sdm.setOtroIdioma(rs.getInt("otroIdioma"));
            sdm.setPesoAlNacer(rs.getDouble("pesoAlNacer"));
            sdm.setPreescolar(rs.getInt("preescolar"));
            sdm.setProblemasAlNacer(rs.getInt("problemasAlNacer"));
            sdm.setProblemasDeAudicion(rs.getInt("problemasDeAudicion"));
            sdm.setProblemasDeSalud(rs.getInt("problemasDeSalud"));
            sdm.setProblemasDeVision(rs.getInt("problemasDeVision"));
            sdm.setPtApgar1(rs.getInt("ptApgar1"));
            sdm.setPtApgar2(rs.getInt("ptApgar2"));
            sdm.setSemanasDeNacimiento(rs.getInt("semanasDeNacimiento"));
            sdm.setTiempoAsistiendoMesesG(rs.getInt("tiempoAsistiendoMesesG"));
            sdm.setTiempoAsistiendoMesesP(rs.getInt("tiempoAsistiendoMesesP"));
            sdm.setTiempoQueAsisteG(rs.getInt("tiempoQueAsisteG"));
            sdm.setTiempoQueAsisteP(rs.getInt("tiempoQueAsisteP"));
            sdms.add(sdm);
        }
        con.close();
        return sdms;
    }
   
   public void updateSociodemografico(int idSociodemograficoActualizar, int idSociodemografico, String fechaDeCita, int gestacion, int semanasDeNacimiento, int ptApgar1, int ptApgar2, double pesoAlNacer, int problemasAlNacer, int problemasDeSalud, int problemasDeAudicion, int problemasDeVision, int otroIdioma, int hermanos, int lugarOcupa, int adultos, int ninios, String cuidadorPrincipal, int guarderia, int tiempoAsistiendoMesesG, int tiempoQueAsisteG, int preescolar, int tiempoAsistiendoMesesP, int tiempoQueAsisteP, String observaciones, int fkBebeSociodemografico) throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        LinkedList<String> toUpdate = new LinkedList<>();
        if (idSociodemografico > -1) {
           String idSociodemograficoQ = "`idSociodemografico` = '"+idSociodemografico+"'";
           toUpdate.add(idSociodemograficoQ);
        }
        if (!"".equals(fechaDeCita)) {
            String fechaDeCitaQ = "`fechaCita` = '"+fechaDeCita+"'";
            toUpdate.add(fechaDeCitaQ);
        }
        if (gestacion==0 || gestacion==1) {
           String gestacionQ = "`gestacion` = '"+gestacion+"'";
           toUpdate.add(gestacionQ);
        }
        if (semanasDeNacimiento > -1) {
           String semanasDeNacimientoQ = "`semanasDeNacimiento` = '"+semanasDeNacimiento+"'";
           toUpdate.add(semanasDeNacimientoQ);
        }
        if (ptApgar1 > -1) {
           String ptApgar1Q = "`ptApgar1` = '"+ptApgar1+"'";
           toUpdate.add(ptApgar1Q);
        }
        if (ptApgar2 > -1) {
           String ptApgar2Q = "`ptApgar2` = '"+ptApgar2+"'";
           toUpdate.add(ptApgar2Q);
        }
        if (pesoAlNacer >= 0) {
           String pesoAlNacerQ = "`pesoAlNacer` = '"+pesoAlNacer+"'";
           toUpdate.add(pesoAlNacerQ);
        }
        if (problemasAlNacer==0 || problemasAlNacer==1) {
           String problemasAlNacerQ = "`problemasAlNacer` = '"+problemasAlNacer+"'";
           toUpdate.add(problemasAlNacerQ);
        }
        if (problemasDeSalud==0 || problemasDeSalud==1) {
           String problemasDeSaludQ = "`problemasDeSalud` = '"+problemasDeSalud+"'";
           toUpdate.add(problemasDeSaludQ);
        }
        if (problemasDeAudicion==0 || problemasDeAudicion==1) {
           String problemasDeAudicionQ = "`problemasDeAudicion` = '"+problemasDeAudicion+"'";
           toUpdate.add(problemasDeAudicionQ);
        }
        if (problemasDeVision==0 || problemasDeVision==1) {
           String problemasDeVisionQ = "`problemasDeVision` = '"+problemasDeVision+"'";
           toUpdate.add(problemasDeVisionQ);
        }
        if (otroIdioma > -1) {
           String otroIdiomaQ = "`otroIdioma` = '"+otroIdioma+"'";
           toUpdate.add(otroIdiomaQ);
        }
        if (hermanos > -1) {
           String hermanosQ = "`hermanos` = '"+hermanos+"'";
           toUpdate.add(hermanosQ);
        }
        if (lugarOcupa > -1) {
           String lugarOcupaQ = "`lugarOcupa` = '"+lugarOcupa+"'";
           toUpdate.add(lugarOcupaQ);
        }
        if (adultos > -1) {
           String adultosQ = "`adultos` = '"+adultos+"'";
           toUpdate.add(adultosQ);
        }
        if (ninios > -1) {
           String niniosQ = "`ninios` = '"+ninios+"'";
           toUpdate.add(niniosQ);
        }
        if (!"".equals(cuidadorPrincipal)) {
            String cuidadorPrincipalQ = "`cuidadorPrincipal` = '"+cuidadorPrincipal+"'";
            toUpdate.add(cuidadorPrincipalQ);
        }
        if (guarderia == 0 || guarderia == 1) {
            String guarderiaQ = "`guarderia` = '"+guarderia+"'";
            toUpdate.add(guarderiaQ);
        }
        if (tiempoAsistiendoMesesG > -1) {
           String tiempoAsistiendoMesesGQ = "`tiempoAsistiendoMesesG` = '"+tiempoAsistiendoMesesG+"'";
           toUpdate.add(tiempoAsistiendoMesesGQ);
        }
        if (tiempoQueAsisteG > -1) {
           String tiempoQueAsisteGQ = "`tiempoQueAsisteG` = '"+tiempoQueAsisteG+"'";
           toUpdate.add(tiempoQueAsisteGQ);
        }
        if (preescolar == 0 || preescolar == 1) {
            String preescolarQ = "`preescolar` = '"+preescolar+"'";
            toUpdate.add(preescolarQ);
        }
        if (tiempoAsistiendoMesesP > -1) {
           String tiempoAsistiendoMesesPQ = "`tiempoAsistiendoMesesP` = '"+tiempoAsistiendoMesesP+"'";
           toUpdate.add(tiempoAsistiendoMesesPQ);
        }
        if (tiempoQueAsisteP > -1) {
           String tiempoQueAsistePQ = "`tiempoQueAsisteP` = '"+tiempoQueAsisteP+"'";
           toUpdate.add(tiempoQueAsistePQ);
        }
        if (!"".equals(observaciones)) {
            String observacionesQ = "`Observaciones` = '"+observaciones+"'";
            toUpdate.add(observacionesQ);
        }
        if (!"".equals(fkBebeSociodemografico)) {
            String fkBebeSociodemograficoQ = "`fkBebeSociodemografico` = '"+fkBebeSociodemografico+"'";
            toUpdate.add(fkBebeSociodemograficoQ);
        }
        String query1 = "UPDATE `babywizard`.`sociodemografico` SET ";
        String query2 = "";
        for(int i = 0; i<toUpdate.size()-1;i++){
            query2 = query2+toUpdate.get(i)+", ";
        }
        String query3 = toUpdate.getLast()+" WHERE (`idSociodemografico` = '"+idSociodemograficoActualizar+"');";
        Statement stmt = con.createStatement();
        System.out.println(query1+query2+query3);
        if(toUpdate.size() > 0) stmt.executeUpdate(query1+query2+query3);
        con.close();
    }
    
   public void deleteSociodemografico(int idSociodemografico) throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        Statement stmt = con.createStatement();
        stmt.executeUpdate("DELETE FROM `babywizard`.`Sociodemografico` WHERE (`idSociodemografico` = '"+idSociodemografico+"');");
        con.close();
    }

    public LinkedList<SociodemograficoModelo> readSociodemograficoPorIds(LinkedList<Integer> ids) throws SQLException {
        LinkedList<SociodemograficoModelo> sdms = new LinkedList<SociodemograficoModelo>();
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        String query;
        String abuscar = "(";
        int size = ids.size();
        for(int i = 0; i < size-1; i++) abuscar += ids.get(i)+",";
        abuscar+=ids.get(size-1)+")";
        
        query = "select * FROM sociodemografico where fkBebeSociodemografico in "+abuscar+";";
        //System.out.print(con);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        
        while(rs.next()){
            SociodemograficoModelo sdm = new SociodemograficoModelo();
            sdm.setAdultos(rs.getInt("adultos"));
            sdm.setCuidadorPrincipal(rs.getString("cuidadorPrincipal"));
            sdm.setFechaDeCita(rs.getString("fechaCita"));
            sdm.setFkBebeSociodemografico(rs.getInt("fkBebeSociodemografico"));
            sdm.setGestacion(rs.getInt("gestacion"));
            sdm.setGuarderia(rs.getInt("guarderia"));
            sdm.setHermanos(rs.getInt("hermanos"));
            sdm.setIdSociodemografico(rs.getInt("idSociodemografico"));
            sdm.setLugarOcupa(rs.getInt("lugarOcupa"));
            sdm.setNinios(rs.getInt("ninios"));
            sdm.setObservaciones(rs.getString("observaciones"));
            sdm.setOtroIdioma(rs.getInt("otroIdioma"));
            sdm.setPesoAlNacer(rs.getDouble("pesoAlNacer"));
            sdm.setPreescolar(rs.getInt("preescolar"));
            sdm.setProblemasAlNacer(rs.getInt("problemasAlNacer"));
            sdm.setProblemasDeAudicion(rs.getInt("problemasDeAudicion"));
            sdm.setProblemasDeSalud(rs.getInt("problemasDeSalud"));
            sdm.setProblemasDeVision(rs.getInt("problemasDeVision"));
            sdm.setPtApgar1(rs.getInt("ptApgar1"));
            sdm.setPtApgar2(rs.getInt("ptApgar2"));
            sdm.setSemanasDeNacimiento(rs.getInt("semanasDeNacimiento"));
            sdm.setTiempoAsistiendoMesesG(rs.getInt("tiempoAsistiendoMesesG"));
            sdm.setTiempoAsistiendoMesesP(rs.getInt("tiempoAsistiendoMesesP"));
            sdm.setTiempoQueAsisteG(rs.getInt("tiempoQueAsisteG"));
            sdm.setTiempoQueAsisteP(rs.getInt("tiempoQueAsisteP"));
            sdms.add(sdm);
        }
        con.close();
        return sdms;
    }
}
