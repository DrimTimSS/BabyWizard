/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx.modelo;

/**
 *
 * @author Vicaris
 */
public class SociodemograficoModelo {
    
    int idSociodemografico;
    String fechaDeCita;
    boolean gestacion;
    int semanasDeNacimiento;
    int ptApgar1;
    int ptApgar2;
    double pesoAlNacer;
    boolean problemasAlNacer;
    boolean problemasDeSalud;
    boolean problemasDeAudicion;
    boolean problemasDeVision;
    boolean otroIdioma;
    int hermanos;
    int lugarOcupa;
    int adultos;
    int ninios;
    String cuidadorPrincipal;
    boolean guarderia;
    int tiempoAsistiendoMesesG;
    int tiempoQueAsisteG;
    boolean preescolar;
    int tiempoAsistiendoMesesP;
    int tiempoQueAsisteP;
    String observaciones;

    public SociodemograficoModelo() {
    }

    public SociodemograficoModelo(String fechaDeCita, boolean gestacion, int semanasDeNacimiento, int ptApgar1, int ptApgar2, double pesoAlNacer, boolean problemasAlNacer, boolean problemasDeSalud, boolean problemasDeAudicion, boolean problemasDeVision, boolean otroIdioma, int hermanos, int lugarOcupa, int adultos, int ninios, String cuidadorPrincipal, boolean guarderia, int tiempoAsistiendoMesesG, int tiempoQueAsisteG, boolean preescolar, int tiempoAsistiendoMesesP, int tiempoQueAsisteP, String observaciones) {
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

    public boolean isGestacion() {
        return gestacion;
    }

    public void setGestacion(boolean gestacion) {
        this.gestacion = gestacion;
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

    public boolean isProblemasAlNacer() {
        return problemasAlNacer;
    }

    public void setProblemasAlNacer(boolean problemasAlNacer) {
        this.problemasAlNacer = problemasAlNacer;
    }

    public boolean isProblemasDeSalud() {
        return problemasDeSalud;
    }

    public void setProblemasDeSalud(boolean problemasDeSalud) {
        this.problemasDeSalud = problemasDeSalud;
    }

    public boolean isProblemasDeAudicion() {
        return problemasDeAudicion;
    }

    public void setProblemasDeAudicion(boolean problemasDeAudicion) {
        this.problemasDeAudicion = problemasDeAudicion;
    }

    public boolean isProblemasDeVision() {
        return problemasDeVision;
    }

    public void setProblemasDeVision(boolean problemasDeVision) {
        this.problemasDeVision = problemasDeVision;
    }

    public boolean isOtroIdioma() {
        return otroIdioma;
    }

    public void setOtroIdioma(boolean otroIdioma) {
        this.otroIdioma = otroIdioma;
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

    public boolean isGuarderia() {
        return guarderia;
    }

    public void setGuarderia(boolean guarderia) {
        this.guarderia = guarderia;
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

    public boolean isPreescolar() {
        return preescolar;
    }

    public void setPreescolar(boolean preescolar) {
        this.preescolar = preescolar;
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
    
    
}
