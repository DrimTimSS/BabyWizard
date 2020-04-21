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
public class LecturaConjuntaModelo {
    
    int idLecturaConjunta;
    int typeOrToken;
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

    public LecturaConjuntaModelo() {
    }

    public LecturaConjuntaModelo(int typeOrToken, int preposicion, int sustantivo, int articulo, int verbo, int ininteligible, int adjetivo, int pronombre, int adverbio, int conjuncion, int interjeccion, int fkBebe, int fkCuidador) {
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

    public int getIdLecturaConjunta() {
        return idLecturaConjunta;
    }

    public void setIdLecturaConjunta(int idLecturaConjunta) {
        this.idLecturaConjunta = idLecturaConjunta;
    }

    public int getTypeOrToken() {
        return typeOrToken;
    }

    public void setTypeOrToken(int typeOrToken) {
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
    
    public void createLecturaConjunta() throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        String query;
        query = "INSERT INTO `babywizard`.`lecturaconjunta` (`typeOrToken`, `preposicion`, `sustantivo`, `articulo`, `verbo`, `ininteligible`, `adjetivo`, `pronombre`, `adverbio`, `conjuncion`, `interjeccion`, `fkBebe`, `fkCuidador`) "
                + "VALUES ('"+this.getTypeOrToken()+"', '"+this.getPreposicion()+"', '"+this.getSustantivo()+"', '"+this.getArticulo()+"', '"+this.getVerbo()+"', '"+this.getIninteligible()+"', '"+this.getAdjetivo()+"', '"+this.getPronombre()+"', '"+this.getAdverbio()+"', '"+this.getConjuncion()+"', '"+this.getInterjeccion()+"', '"+this.getFkBebe()+"', '"+this.getFkCuidador()+"');";
        Statement stmt = con.createStatement();
        int executeUpdate = stmt.executeUpdate(query,Statement.RETURN_GENERATED_KEYS);
        
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()){
            idLecturaConjunta=rs.getInt(1);
        }
        rs.close();
        con.close();
    }
    
    public LinkedList<LecturaConjuntaModelo> readLecturaConjunta(int idLecturaConjunta, int typeOrToken, int preposicion, int sustantivo, int articulo, int verbo, int ininteligible, int adjetivo, int pronombre, int adverbio, int conjuncion, int interjeccion, int fkBebe, int fkCuidador) throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        LinkedList<String> toRead = new LinkedList<>();
        if(idLecturaConjunta>-1) toRead.add("idLecturaConjunta = '"+idLecturaConjunta+"'");
        if(typeOrToken == 1 || typeOrToken == 0) toRead.add("typeOrToken = '"+typeOrToken+"'");
        if(preposicion>-1) toRead.add("preposicion = '"+preposicion+"'");
        if(sustantivo>-1) toRead.add("sustantivo = '"+sustantivo+"'");
        if(articulo>-1) toRead.add("articulo = '"+articulo+"'");
        if(verbo>-1) toRead.add("verbo = '"+verbo+"'");
        if(ininteligible>-1) toRead.add("ininteligible = '"+ininteligible+"'");
        if(adjetivo>-1) toRead.add("adjetivo = '"+adjetivo+"'");
        if(pronombre>-1) toRead.add("pronombre = '"+pronombre+"'");
        if(adverbio>-1) toRead.add("adverbio = '"+adverbio+"'");
        if(conjuncion>-1) toRead.add("conjuncion = '"+conjuncion+"'");
        if(interjeccion>-1) toRead.add("interjeccion = '"+interjeccion+"'");
        if(fkBebe>-1) toRead.add("fkBebe = '"+fkBebe+"'");
        if(fkCuidador>-1) toRead.add("fkCuidador = '"+fkCuidador+"'");
        
        String query1 = "SELECT * FROM babywizard.lecturaconjunta WHERE ";
        String query2 = "";
        for(int i = 0; i<toRead.size()-1;i++){
            query2 = query2+toRead.get(i)+" AND ";
        }
        String query3="";
        if(toRead.size()>0) query3 = toRead.getLast()+";";
        Statement stmt = con.createStatement();
        ResultSet rs;
        if (toRead.size()>0) {
        rs = stmt.executeQuery(query1+query2+query3);
        } else {
        rs = stmt.executeQuery("SELECT * FROM babywizard.lecturaconjunta;");
        }
        LinkedList<LecturaConjuntaModelo> lecturasconjuntas = new LinkedList<>();
        while(rs.next()){
            LecturaConjuntaModelo lcm = new LecturaConjuntaModelo();
            lcm.setIdLecturaConjunta(rs.getInt("idLecturaConjunta"));
            lcm.setTypeOrToken(rs.getInt("typeOrToken"));
            lcm.setAdjetivo(rs.getInt("adjetivo"));
            lcm.setAdverbio(rs.getInt("adverbio"));
            lcm.setArticulo(rs.getInt("articulo"));
            lcm.setConjuncion(rs.getInt("conjuncion"));
            lcm.setFkBebe(rs.getInt("fkBebe"));
            lcm.setFkCuidador(rs.getInt("fkCuidador"));
            lcm.setIninteligible(rs.getInt("ininteligible"));
            lcm.setInterjeccion(rs.getInt("interjeccion"));
            lcm.setPreposicion(rs.getInt("preposicion"));
            lcm.setPronombre(rs.getInt("pronombre"));
            lcm.setSustantivo(rs.getInt("sustantivo"));
            lcm.setVerbo(rs.getInt("verbo"));
            lecturasconjuntas.add(lcm);
        }
        con.close();
        return lecturasconjuntas;
    }
    
    public void updateLecturaConjunta(int idLecturaConjuntaActualizar, int idLecturaConjunta, int typeOrToken, int preposicion, int sustantivo, int articulo, int verbo, int ininteligible, int adjetivo, int pronombre, int adverbio, int conjuncion, int interjeccion, int fkBebe, int fkCuidador) throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        LinkedList<String> toUpdate = new LinkedList<>();
        if (idLecturaConjunta > -1) {
           String idLecturaConjuntaQ = "`idLecturaConjunta` = '"+idLecturaConjunta+"'";
           toUpdate.add(idLecturaConjuntaQ);
        }
        if (typeOrToken == 0 || typeOrToken == 1) {
           String typeOrTokenQ = "`typeOrToken` = '"+typeOrToken+"'";
           toUpdate.add(typeOrTokenQ);
        }
        if (preposicion > -1) {
           String preposicionQ = "`preposicion` = '"+preposicion+"'";
           toUpdate.add(preposicionQ);
        }
        if (sustantivo > -1) {
           String sustantivoQ = "`sustantivo` = '"+sustantivo+"'";
           toUpdate.add(sustantivoQ);
        }
        if (articulo > -1) {
           String articuloQ = "`articulo` = '"+articulo+"'";
           toUpdate.add(articuloQ);
        }
        if (verbo > -1) {
           String verboQ = "`verbo` = '"+verbo+"'";
           toUpdate.add(verboQ);
        }
        if (ininteligible > -1) {
           String ininteligibleQ = "`ininteligible` = '"+ininteligible+"'";
           toUpdate.add(ininteligibleQ);
        }
        if (adjetivo > -1) {
           String adjetivoQ = "`adjetivo` = '"+adjetivo+"'";
           toUpdate.add(adjetivoQ);
        }
        if (pronombre > -1) {
           String pronombreQ = "`pronombre` = '"+pronombre+"'";
           toUpdate.add(pronombreQ);
        }
        if (adverbio > -1) {
           String adverbioQ = "`adverbio` = '"+adverbio+"'";
           toUpdate.add(adverbioQ);
        }
        if (conjuncion > -1) {
           String conjuncionQ = "`conjuncion` = '"+conjuncion+"'";
           toUpdate.add(conjuncionQ);
        }
        if (interjeccion > -1) {
           String interjeccionQ = "`interjeccion` = '"+interjeccion+"'";
           toUpdate.add(interjeccionQ);
        }
        if (fkBebe > -1) {
           String fkBebeQ = "`fkBebe` = '"+fkBebe+"'";
           toUpdate.add(fkBebeQ);
        }
        if (fkCuidador > -1) {
           String fkCuidadorQ = "`fkCuidador` = '"+fkCuidador+"'";
           toUpdate.add(fkCuidadorQ);
        }
        String query1 = "UPDATE `babywizard`.`lecturaconjunta` SET ";
        String query2 = "";
        for(int i = 0; i<toUpdate.size()-1;i++){
            query2 = query2+toUpdate.get(i)+", ";
        }
        String query3 = toUpdate.getLast()+" WHERE (`idLecturaConjunta` = '"+idLecturaConjuntaActualizar+"');";
        Statement stmt = con.createStatement();
        System.out.println(query1+query2+query3);
        if(toUpdate.size() > 0) stmt.executeUpdate(query1+query2+query3);
        con.close();
    }
    
    public void deleteLecturaConjunta(int idLecturaConjunta) throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        Statement stmt = con.createStatement();
        stmt.executeUpdate("DELETE FROM `babywizard`.`lecturaconjunta` WHERE (`idLecturaConjunta` = '"+idLecturaConjunta+"');");
        con.close();
    }
}
