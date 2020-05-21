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
    
    int dcfi;
    int dcrc;
    int incm;
    int inse;
    int mtfi;
    int mtrc;
    int vccm;
    int vcse;
    int cpfi;
    int cprc;
    int pscm;
    int psse;
    int clbs;
    
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
    
    String[] equivciv;
    String[] equivcie;
    String[] equivcvp;
    String[] equivcit;
    String[] equivcgl;
    
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
        this.equivciv = new String[4];
        this.equivcie = new String[4];
        this.equivcvp = new String[4];
        this.equivcit = new String[4];
        this.equivcgl = new String[4];
        this.dcfi = 0;
        this.dcrc = 0;
        this.incm = 0;
        this.inse = 0;
        this.mtfi = 0;
        this.mtrc = 0;
        this.vccm = 0;
        this.vcse = 0;
        this.cpfi = 0;
        this.cprc = 0;
        this.pscm = 0;
        this.psse = 0;
        this.clbs = 0;
    }

    public Wppsi48Modelo() {
        this.idWppsi48 = 0;
        this.disenioCubosNatural = 0;
        this.informacionNatural = 0;
        this.semejanzasNatural = 0;
        this.matricesNatural = 0;
        this.vocabularioNatural = 0;
        this.conceptosConDibujosNatural = 0;
        this.busquedaSimbolosNatural = 0;
        this.pistasNatural = 0;
        this.clavesNatural = 0;
        this.comprensionNatural = 0;
        this.figurasIncompletasNatural = 0;
        this.vocabularioReceptivoNatural = 0;
        this.rompecabezasNatural = 0;
        this.denominacionesNatural = 0;
        this.fkBebe = 0;
        this.equivciv = new String[4];
        this.equivcie = new String[4];
        this.equivcvp = new String[4];
        this.equivcit = new String[4];
        this.equivcgl = new String[4];
        this.dcfi = 0;
        this.dcrc = 0;
        this.incm = 0;
        this.inse = 0;
        this.mtfi = 0;
        this.mtrc = 0;
        this.vccm = 0;
        this.vcse = 0;
        this.cpfi = 0;
        this.cprc = 0;
        this.pscm = 0;
        this.psse = 0;
        this.clbs = 0;
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

    public int getDcfi() {
        return dcfi;
    }

    public void setDcfi(int dcfi) {
        this.dcfi = dcfi;
    }

    public int getDcrc() {
        return dcrc;
    }

    public void setDcrc(int dcrc) {
        this.dcrc = dcrc;
    }

    public int getIncm() {
        return incm;
    }

    public void setIncm(int incm) {
        this.incm = incm;
    }

    public int getInse() {
        return inse;
    }

    public void setInse(int inse) {
        this.inse = inse;
    }

    public int getMtfi() {
        return mtfi;
    }

    public void setMtfi(int mtfi) {
        this.mtfi = mtfi;
    }

    public int getMtrc() {
        return mtrc;
    }

    public void setMtrc(int mtrc) {
        this.mtrc = mtrc;
    }

    public int getVccm() {
        return vccm;
    }

    public void setVccm(int vccm) {
        this.vccm = vccm;
    }

    public int getVcse() {
        return vcse;
    }

    public void setVcse(int vcse) {
        this.vcse = vcse;
    }

    public int getCpfi() {
        return cpfi;
    }

    public void setCpfi(int cpfi) {
        this.cpfi = cpfi;
    }

    public int getCprc() {
        return cprc;
    }

    public void setCprc(int cprc) {
        this.cprc = cprc;
    }

    public int getPscm() {
        return pscm;
    }

    public void setPscm(int pscm) {
        this.pscm = pscm;
    }

    public int getPsse() {
        return psse;
    }

    public void setPsse(int psse) {
        this.psse = psse;
    }

    public int getClbs() {
        return clbs;
    }

    public void setClbs(int clbs) {
        this.clbs = clbs;
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

    public String[] getEquivcvp() {
        return equivcvp;
    }
    public String getCvp0() {
        return equivcvp[0];
    }
    public String getCvp1() {
        return equivcvp[1];
    }
    public String getCvp2() {
        return equivcvp[2];
    }
    public String getCvp3() {
        return equivcvp[3];
    }

    public void setEquivcvp(String[] equivcvp) {
        this.equivcvp = equivcvp;
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
            return false;
        }
        if(edad<48) return false;
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
        
        return true;
    }
    
    public int[] setEquivalentes() {
        int[] sumas = {0,0,0,0,0};
        
        Wppsi48Controller wcont = new Wppsi48Controller();
        
        int dc = this.getDisenioCubosEscalar();
        int in = this.getInformacionEscalar();
        int mt = this.getMatricesEscalar();
        int vc = this.getVocabularioEscalar();
        int cp = this.getConceptosConDibujosEscalar();
        int bs = this.getBusquedaSimbolosEscalar();
        int ps = this.getPistasEscalar();
        int cl = this.getClavesEscalar();
        int cm = this.getComprensionEscalar();
        int fi = this.getFigurasIncompletasEscalar();
        int se = this.getSemejanzasEscalar();
        int vr = this.getVocabularioReceptivoEscalar();
        int rc = this.getRompecabezasEscalar();
        int dn = this.getDenominacionesEscalar();
        
        int vcrciv = valorreal(vc,cm,se,vccm,vcse);
        int inrciv = valorreal(in,cm,se,incm,inse);
        int psrciv = valorreal(ps,cm,se,pscm,psse);
        if(vcrciv>0 && inrciv>0 && psrciv > 0) {
            this.setEquivciv(wcont.equivalentesCIV(vcrciv+inrciv+psrciv));
            sumas[0] = vcrciv+inrciv+psrciv;
        }
        int dcrcie = valorreal(dc,fi,rc,dcfi,dcrc);
        int mtrcie = valorreal(mt,fi,rc,mtfi,mtrc);
        int cprcie = valorreal(cp,fi,rc,cpfi,cprc);
        if(dcrcie>0 && mtrcie>0 && cprcie>0) {
            this.setEquivcie(wcont.equivalentesCIE(dcrcie + mtrcie + cprcie));
            sumas[1] = dcrcie + mtrcie + cprcie;
        }
        if(bs>0 && cl>0) {
            this.setEquivcvp(wcont.equivalentesCVP(bs+cl));
            sumas[2] = bs+cl;
        }
        int vcrcit = valorreal(vc,cm,se,vccm,vcse);
        int inrcit = valorreal(in,cm,se,incm,inse);
        int psrcit = valorreal(ps,cm,se,pscm,psse);
        int dcrcit = valorreal(dc,fi,rc,dcfi,dcrc);
        int mtrcit = valorreal(mt,fi,rc,mtfi,mtrc);
        int cprcit = valorreal(cp,fi,rc,cpfi,cprc);
        if(vcrcit>0 && inrcit>0 && psrcit>0 && dcrcit>0 && mtrcit>0 && cprcit>0 && cl>0) { 
            this.setEquivcit(wcont.equivalentesCIT(vcrcit + inrcit + psrcit + dcrcit + mtrcit + cprcit + cl));
            sumas[3] = vcrcit + inrcit + psrcit + dcrcit + mtrcit + cprcit + cl;
        }
        if(vr>0 && dn>0) {
            this.setEquivcgl(wcont.equivalentesCGL(vr + dn));
            sumas[4] = vr + dn;
        }
        
        return sumas;
    }
    
    public int valorreal(int original, int valor1, int valor2, int sust1, int sust2) {
        int real = original;
        if(sust1==1) {
            real = valor1;
        } else if (sust2==1) {
            real = valor2;
        }
        return real;
    }
    
    public void createWppsi48() throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        String query;
        query = "INSERT INTO `babywizard`.`wppsi48` (`disenioConCubosNatural`, `informacionNatural`, `semejanzasNatural`, `matricesNatural`, `vocabularioNatural`, `conceptosConDibujosNatural`, `busquedaSimbolosNatural`, `pistasNatural`, `clavesNatural`, `comprensionNatural`, `figurasIncompletasNatural`, `vocabularioReceptivoNatural`, `rompecabezasNatural`, `denominacionesNatural`, `fechaAplicacion`, `fkBebe`, `dcfi`, `dcrc`, `incm`, `inse`, `mtfi`, `mtrc`, `vccm`, `vcse`, `cpfi`, `cprc`, `pscm`, `psse`, `clbs`) "
                + "VALUES ('"+this.getDisenioCubosNatural()+"', '"+this.informacionNatural+"', '"+this.getSemejanzasNatural()+"', '"+this.getMatricesNatural()+"', '"+this.getVocabularioNatural()+"', '"+this.conceptosConDibujosNatural+"', '"+this.busquedaSimbolosNatural+"', '"+this.getPistasNatural()+"', '"+this.getClavesNatural()+"', '"+this.getComprensionNatural()+"', '"+this.getFigurasIncompletasNatural()+"', '"+this.getVocabularioReceptivoNatural()+"', '"+this.getRompecabezasNatural()+"', '"+this.getDenominacionesNatural()+"', '"+this.getFechaAplicacion()+"', '"+this.getFkBebe()+"', '"+this.getDcfi()+"', '"+this.getDcrc()+"', '"+this.getIncm()+"', '"+this.getInse()+"', '"+this.getMtfi()+"', '"+this.getMtrc()+"', '"+this.getVccm()+"', '"+this.getVcse()+"', '"+this.getCpfi()+"', '"+this.getCprc()+"', '"+this.getPscm()+"', '"+this.getPsse()+"', '"+this.getClbs()+"');";
        Statement stmt = con.createStatement();
        int executeUpdate = stmt.executeUpdate(query,Statement.RETURN_GENERATED_KEYS);
        
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()){
            idWppsi48=rs.getInt(1);
        }
        rs.close();
        con.close();
    }
    
    public LinkedList<Wppsi48Modelo> readWppsi48(int idWppsi48,int disenioCubosNatural, int informacionNatural, int semejanzasNatural, int matricesNatural, int vocabularioNatural, int conceptosConDibujosNatural, int busquedaSimbolosNatural, int pistasNatural, int clavesNatural, int comprensionNatural, int figurasIncompletasNatural, int vocabularioReceptivoNatural, int rompecabezasNatural, int denominacionesNatural, String fechaAplicacion, int fkBebe, int dcfi, int dcrc, int incm, int inse, int mtfi, int mtrc, int vccm, int vcse, int cpfi, int cprc, int pscm, int psse, int clbs) throws SQLException {
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
        if(dcfi == 0 || dcfi == 1) toRead.add("dcfi = '"+dcfi+"'");
        if(dcrc == 0 || dcrc == 1) toRead.add("dcrc = '"+dcrc+"'");
        if(incm == 0 || incm == 1) toRead.add("incm = '"+incm+"'");
        if(inse == 0 || inse == 1) toRead.add("inse = '"+inse+"'");
        if(mtfi == 0 || mtfi == 1) toRead.add("mtfi = '"+mtfi+"'");
        if(mtrc == 0 || mtrc == 1) toRead.add("mtrc = '"+mtrc+"'");
        if(vccm == 0 || vccm == 1) toRead.add("vccm = '"+vccm+"'");
        if(vcse == 0 || vcse == 1) toRead.add("vcse = '"+vcse+"'");
        if(cpfi == 0 || cpfi == 1) toRead.add("cpfi = '"+cpfi+"'");
        if(cprc == 0 || cprc == 1) toRead.add("cprc = '"+cprc+"'");
        if(pscm == 0 || pscm == 1) toRead.add("pscm = '"+pscm+"'");
        if(psse == 0 || psse == 1) toRead.add("psse = '"+psse+"'");
        if(clbs == 0 || clbs == 1) toRead.add("clbs = '"+clbs+"'");
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
            wm.setDcfi(rs.getInt("dcfi"));
            wm.setDcrc(rs.getInt("dcrc"));
            wm.setIncm(rs.getInt("incm"));
            wm.setInse(rs.getInt("inse"));
            wm.setMtfi(rs.getInt("mtfi"));
            wm.setMtrc(rs.getInt("mtrc"));
            wm.setVccm(rs.getInt("vccm"));
            wm.setVcse(rs.getInt("vcse"));
            wm.setCpfi(rs.getInt("cpfi"));
            wm.setCprc(rs.getInt("cprc"));
            wm.setPscm(rs.getInt("pscm"));
            wm.setPsse(rs.getInt("psse"));
            wm.setClbs(rs.getInt("clbs"));
            wppsis.add(wm);
        }
        con.close();
        return wppsis;
    }
    
    public void updateWppsi48(int idWppsi48Actualizar, int idWppsi48,int disenioCubosNatural, int informacionNatural, int semejanzasNatural, int matricesNatural, int vocabularioNatural, int conceptosConDibujosNatural, int busquedaSimbolosNatural, int pistasNatural, int clavesNatural, int comprensionNatural, int figurasIncompletasNatural, int vocabularioReceptivoNatural, int rompecabezasNatural, int denominacionesNatural, String fechaAplicacion, int fkBebe, int dcfi, int dcrc, int incm, int inse, int mtfi, int mtrc, int vccm, int vcse, int cpfi, int cprc, int pscm, int psse, int clbs) throws SQLException {
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
        if (dcfi == 0 || dcfi == 1) {
           String dcfiQ = "`dcfi` = '"+dcfi+"'";
           toUpdate.add(dcfiQ);
        }
        if (dcrc == 0 || dcrc == 1) {
           String dcrcQ = "`dcrc` = '"+dcrc+"'";
           toUpdate.add(dcrcQ);
        }
        if (incm == 0 || incm == 1) {
           String incmQ = "`incm` = '"+incm+"'";
           toUpdate.add(incmQ);
        }
        if (inse == 0 || inse == 1) {
           String inseQ = "`inse` = '"+inse+"'";
           toUpdate.add(inseQ);
        }
        if (mtfi == 0 || mtfi == 1) {
           String mtfiQ = "`mtfi` = '"+mtfi+"'";
           toUpdate.add(mtfiQ);
        }
        if (mtrc == 0 || mtrc == 1) {
           String mtrcQ = "`mtrc` = '"+mtrc+"'";
           toUpdate.add(mtrcQ);
        }
        if (vccm == 0 || vccm == 1) {
           String vccmQ = "`vccm` = '"+vccm+"'";
           toUpdate.add(vccmQ);
        }
        if (vcse == 0 || vcse == 1) {
           String vcseQ = "`vcse` = '"+vcse+"'";
           toUpdate.add(vcseQ);
        }
        if (cpfi == 0 || cpfi == 1) {
           String cpfiQ = "`cpfi` = '"+cpfi+"'";
           toUpdate.add(cpfiQ);
        }
        if (cprc == 0 || cprc == 1) {
           String cprcQ = "`cprc` = '"+cprc+"'";
           toUpdate.add(cprcQ);
        }
        if (pscm == 0 || pscm == 1) {
           String pscmQ = "`pscm` = '"+pscm+"'";
           toUpdate.add(pscmQ);
        }
        if (psse == 0 || psse == 1) {
           String psseQ = "`psse` = '"+psse+"'";
           toUpdate.add(psseQ);
        }
        if (clbs == 0 || clbs == 1) {
           String clbsQ = "`clbs` = '"+clbs+"'";
           toUpdate.add(clbsQ);
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
