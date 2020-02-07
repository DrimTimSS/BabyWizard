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
public class ExperimentoCabinaModelo {
    int idExperimentoCabina;
    String tipoExperimento;
    boolean entrenamientoOPrueba;
    double protarPre;
    double protarPos;
    double llkdifPre;
    double llkdifPos;
    double tr;
    int fkBebe;

    public ExperimentoCabinaModelo() {
    }

    public ExperimentoCabinaModelo(String tipoExperimento, boolean entrenamientoOPrueba, double protarPre, double protarPos, double llkdifPre, double llkdifPos, double tr, int fkBebe) {
        this.tipoExperimento = tipoExperimento;
        this.entrenamientoOPrueba = entrenamientoOPrueba;
        this.protarPre = protarPre;
        this.protarPos = protarPos;
        this.llkdifPre = llkdifPre;
        this.llkdifPos = llkdifPos;
        this.tr = tr;
        this.fkBebe = fkBebe;
    }

    public int getIdExperimentoCabina() {
        return idExperimentoCabina;
    }

    public void setIdExperimentoCabina(int idExperimentoCabina) {
        this.idExperimentoCabina = idExperimentoCabina;
    }

    public String getTipoExperimento() {
        return tipoExperimento;
    }

    public void setTipoExperimento(String tipoExperimento) {
        this.tipoExperimento = tipoExperimento;
    }

    public boolean isEntrenamientoOPrueba() {
        return entrenamientoOPrueba;
    }

    public void setEntrenamientoOPrueba(boolean entrenamientoOPrueba) {
        this.entrenamientoOPrueba = entrenamientoOPrueba;
    }

    public double getProtarPre() {
        return protarPre;
    }

    public void setProtarPre(double protarPre) {
        this.protarPre = protarPre;
    }

    public double getProtarPos() {
        return protarPos;
    }

    public void setProtarPos(double protarPos) {
        this.protarPos = protarPos;
    }

    public double getLlkdifPre() {
        return llkdifPre;
    }

    public void setLlkdifPre(double llkdifPre) {
        this.llkdifPre = llkdifPre;
    }

    public double getLlkdifPos() {
        return llkdifPos;
    }

    public void setLlkdifPos(double llkdifPos) {
        this.llkdifPos = llkdifPos;
    }

    public double getTr() {
        return tr;
    }

    public void setTr(double tr) {
        this.tr = tr;
    }

    public int getFkBebe() {
        return fkBebe;
    }

    public void setFkBebe(int fkBebe) {
        this.fkBebe = fkBebe;
    }
    
    
    
}
