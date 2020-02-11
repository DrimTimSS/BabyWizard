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
public class SocioeconomicoModelo {
    int idSocioeconomico;
    int puntajeCrudo;
    String nse;
    int fkSociodemografico;

    public SocioeconomicoModelo() {
    }

    public SocioeconomicoModelo(int puntajeCrudo, String nse, int fkSociodemografico) {
        this.puntajeCrudo = puntajeCrudo;
        this.nse = nse;
        this.fkSociodemografico = fkSociodemografico;
    }

    public int getIdSocioeconomico() {
        return idSocioeconomico;
    }

    public void setIdSocioeconomico(int idSocioeconomico) {
        this.idSocioeconomico = idSocioeconomico;
    }

    public int getPuntajeCrudo() {
        return puntajeCrudo;
    }

    public void setPuntajeCrudo(int puntajeCrudo) {
        this.puntajeCrudo = puntajeCrudo;
    }

    public String getNse() {
        return nse;
    }

    public void setNse(String nse) {
        this.nse = nse;
    }

    public int getFkSociodemografico() {
        return fkSociodemografico;
    }

    public void setFkSociodemografico(int fkSociodemografico) {
        this.fkSociodemografico = fkSociodemografico;
    }
    
    
}


