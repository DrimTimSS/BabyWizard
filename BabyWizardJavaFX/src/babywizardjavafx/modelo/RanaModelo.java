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
public class RanaModelo {
    
    int idRana;
    boolean typeOrToken;
    int preposicion;
    int sustantivo;
    int articulo;
    int verbo;
    int ininteligible;
    int adjetivo;
    int pronombre;
    int adverbio;
    int conjuncion;
    int interjeccion;
    int fkBebe;
    int fkCuidador;

    public RanaModelo() {
    }

    public RanaModelo(boolean typeOrToken, int preposicion, int sustantivo, int articulo, int verbo, int ininteligible, int adjetivo, int pronombre, int adverbio, int conjuncion, int interjeccion, int fkBebe, int fkCuidador) {
        this.typeOrToken = typeOrToken;
        this.preposicion = preposicion;
        this.sustantivo = sustantivo;
        this.articulo = articulo;
        this.verbo = verbo;
        this.ininteligible = ininteligible;
        this.adjetivo = adjetivo;
        this.pronombre = pronombre;
        this.adverbio = adverbio;
        this.conjuncion = conjuncion;
        this.interjeccion = interjeccion;
        this.fkBebe = fkBebe;
        this.fkCuidador = fkCuidador;
    }

    public int getIdRana() {
        return idRana;
    }

    public void setIdRana(int idRana) {
        this.idRana = idRana;
    }

    public boolean isTypeOrToken() {
        return typeOrToken;
    }

    public void setTypeOrToken(boolean typeOrToken) {
        this.typeOrToken = typeOrToken;
    }

    public int getPreposicion() {
        return preposicion;
    }

    public void setPreposicion(int preposicion) {
        this.preposicion = preposicion;
    }

    public int getSustantivo() {
        return sustantivo;
    }

    public void setSustantivo(int sustantivo) {
        this.sustantivo = sustantivo;
    }

    public int getArticulo() {
        return articulo;
    }

    public void setArticulo(int articulo) {
        this.articulo = articulo;
    }

    public int getVerbo() {
        return verbo;
    }

    public void setVerbo(int verbo) {
        this.verbo = verbo;
    }

    public int getIninteligible() {
        return ininteligible;
    }

    public void setIninteligible(int ininteligible) {
        this.ininteligible = ininteligible;
    }

    public int getAdjetivo() {
        return adjetivo;
    }

    public void setAdjetivo(int adjetivo) {
        this.adjetivo = adjetivo;
    }

    public int getPronombre() {
        return pronombre;
    }

    public void setPronombre(int pronombre) {
        this.pronombre = pronombre;
    }

    public int getAdverbio() {
        return adverbio;
    }

    public void setAdverbio(int adverbio) {
        this.adverbio = adverbio;
    }

    public int getConjuncion() {
        return conjuncion;
    }

    public void setConjuncion(int conjuncion) {
        this.conjuncion = conjuncion;
    }

    public int getInterjeccion() {
        return interjeccion;
    }

    public void setInterjeccion(int interjeccion) {
        this.interjeccion = interjeccion;
    }

    public int getFkBebe() {
        return fkBebe;
    }

    public void setFkBebe(int fkBebe) {
        this.fkBebe = fkBebe;
    }

    public int getFkCuidador() {
        return fkCuidador;
    }

    public void setFkCuidador(int fkCuidador) {
        this.fkCuidador = fkCuidador;
    }
    
    
}
