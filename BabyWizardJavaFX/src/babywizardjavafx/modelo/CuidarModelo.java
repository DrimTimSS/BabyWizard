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
public class CuidarModelo {
    int idCuidador;
    int idBebe;
    String relacionBebeCuidador;

    public CuidarModelo(int idCuidador, int idBebe, String relacionBebeCuidador) {
        this.idCuidador = idCuidador;
        this.idBebe = idBebe;
        this.relacionBebeCuidador = relacionBebeCuidador;
    }

    public int getIdCuidador() {
        return idCuidador;
    }

    public void setIdCuidador(int idCuidador) {
        this.idCuidador = idCuidador;
    }

    public int getIdBebe() {
        return idBebe;
    }

    public void setIdBebe(int idBebe) {
        this.idBebe = idBebe;
    }

    public String getRelacionBebeCuidador() {
        return relacionBebeCuidador;
    }

    public void setRelacionBebeCuidador(String relacionBebeCuidador) {
        this.relacionBebeCuidador = relacionBebeCuidador;
    }
    
    
}
