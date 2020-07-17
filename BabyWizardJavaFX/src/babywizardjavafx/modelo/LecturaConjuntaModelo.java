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
    int typeC;
    int sustantivoC;
    int verboC;
    int adjetivoC;
    int adverbioC;
    int articuloC;
    int pronombreC;
    int preposicionC;
    int conjuncionC;
    int interjeccionC;
    int ininteligibleC;
    int typeCT;
    int sustantivoCT;
    int verboCT;
    int adjetivoCT;
    int adverbioCT;
    int articuloCT;
    int pronombreCT;
    int preposicionCT;
    int conjuncionCT;
    int interjeccionCT;
    int ininteligibleCT;
    int typeBB;
    int sustantivoBB;
    int verboBB;
    int adjetivoBB;
    int adverbioBB;
    int articuloBB;
    int pronombreBB;
    int preposicionBB;
    int conjuncionBB;
    int interjeccionBB;
    int ininteligibleBB;
    int typeBBT;
    int sustantivoBBT;
    int verboBBT;
    int adjetivoBBT;
    int adverbioBBT;
    int articuloBBT;
    int pronombreBBT;
    int preposicionBBT;
    int conjuncionBBT;
    int interjeccionBBT;
    int ininteligibleBBT;
    int fkBebe;
    int fkCuidador;
    String fechaAplicacion;

    public LecturaConjuntaModelo() {
    }

    public LecturaConjuntaModelo(int typeC, int preposicionC, int sustantivoC, int articuloC, int verboC, int ininteligibleC, int adjetivoC, int pronombreC, int adverbioC, int conjuncionC, int interjeccionC,
            int typeCT, int preposicionCT, int sustantivoCT, int articuloCT, int verboCT, int ininteligibleCT, int adjetivoCT, int pronombreCT, int adverbioCT, int conjuncionCT, int interjeccionCT,
            int typeBB, int preposicionBB, int sustantivoBB, int articuloBB, int verboBB, int ininteligibleBB, int adjetivoBB, int pronombreBB, int adverbioBB, int conjuncionBB, int interjeccionBB,
            int typeBBT, int preposicionBBT, int sustantivoBBT, int articuloBBT, int verboBBT, int ininteligibleBBT, int adjetivoBBT, int pronombreBBT, int adverbioBBT, int conjuncionBBT, int interjeccionBBT, int fkCuidador, String fechaAplicacion, int fkBebe) {
        this.typeC=typeC;
        this.sustantivoC=sustantivoC;
        this.verboC=verboC;
        this.adjetivoC=adjetivoC;
        this.adverbioC=adverbioC;
        this.articuloC=articuloC;
        this.pronombreC=pronombreC;
        this.preposicionC=preposicionC;
        this.conjuncionC=conjuncionC;
        this.interjeccionC=interjeccionC;
        this.ininteligibleC=ininteligibleC;
        
        this.typeCT=typeCT;
        this.sustantivoCT=sustantivoCT;
        this.verboCT=verboCT;
        this.adjetivoCT=adjetivoCT;
        this.adverbioCT=adverbioCT;
        this.articuloCT=articuloCT;
        this.pronombreCT=pronombreCT;
        this.preposicionCT=preposicionCT;
        this.conjuncionCT=conjuncionCT;
        this.interjeccionCT=interjeccionCT;
        this.ininteligibleCT=ininteligibleCT;
        
        this.typeBB=typeBB;
        this.sustantivoBB=sustantivoBB;
        this.verboBB=verboBB;
        this.adjetivoBB=adjetivoBB;
        this.adverbioBB=adverbioBB;
        this.articuloBB=articuloBB;
        this.pronombreBB=pronombreBB;
        this.preposicionBB=preposicionBB;
        this.conjuncionBB=conjuncionBB;
        this.interjeccionBB=interjeccionBB;
        this.ininteligibleBB=ininteligibleBB;
        
        this.typeBBT=typeBBT;
        this.sustantivoBBT=sustantivoBBT;
        this.verboBBT=verboBBT;
        this.adjetivoBBT=adjetivoBBT;
        this.adverbioBBT=adverbioBBT;
        this.articuloBBT=articuloBBT;
        this.pronombreBBT=pronombreBBT;
        this.preposicionBBT=preposicionBBT;
        this.conjuncionBBT=conjuncionBBT;
        this.interjeccionBBT=interjeccionBBT;
        this.ininteligibleBBT=ininteligibleBBT;
        this.fkBebe = fkBebe;
        this.fkCuidador = fkCuidador;
        this.fechaAplicacion = fechaAplicacion;

    }

    public int getIdLecturaConjunta() {
        return idLecturaConjunta;
    }

    public void setIdLecturaConjunta(int idLecturaConjunta) {
        this.idLecturaConjunta = idLecturaConjunta;
    }

    public int getTypeC() {
        return typeC;
    }

    public void setTypeC(int typeC) {
        this.typeC = typeC;
    }

    public int getSustantivoC() {
        return sustantivoC;
    }

    public void setSustantivoC(int sustantivoC) {
        this.sustantivoC = sustantivoC;
    }

    public int getVerboC() {
        return verboC;
    }

    public void setVerboC(int verboC) {
        this.verboC = verboC;
    }

    public int getAdjetivoC() {
        return adjetivoC;
    }

    public void setAdjetivoC(int adjetivoC) {
        this.adjetivoC = adjetivoC;
    }

    public int getAdverbioC() {
        return adverbioC;
    }

    public void setAdverbioC(int adverbioC) {
        this.adverbioC = adverbioC;
    }

    public int getArticuloC() {
        return articuloC;
    }

    public void setArticuloC(int articuloC) {
        this.articuloC = articuloC;
    }

    public int getPronombreC() {
        return pronombreC;
    }

    public void setPronombreC(int pronombreC) {
        this.pronombreC = pronombreC;
    }

    public int getPreposicionC() {
        return preposicionC;
    }

    public void setPreposicionC(int preposicionC) {
        this.preposicionC = preposicionC;
    }

    public int getConjuncionC() {
        return conjuncionC;
    }

    public void setConjuncionC(int conjuncionC) {
        this.conjuncionC = conjuncionC;
    }

    public int getInterjeccionC() {
        return interjeccionC;
    }

    public void setInterjeccionC(int interjeccionC) {
        this.interjeccionC = interjeccionC;
    }

    public int getIninteligibleC() {
        return ininteligibleC;
    }

    public void setIninteligibleC(int ininteligibleC) {
        this.ininteligibleC = ininteligibleC;
    }

    public int getTypeCT() {
        return typeCT;
    }

    public void setTypeCT(int typeCT) {
        this.typeCT = typeCT;
    }

    public int getSustantivoCT() {
        return sustantivoCT;
    }

    public void setSustantivoCT(int sustantivoCT) {
        this.sustantivoCT = sustantivoCT;
    }

    public int getVerboCT() {
        return verboCT;
    }

    public void setVerboCT(int verboCT) {
        this.verboCT = verboCT;
    }

    public int getAdjetivoCT() {
        return adjetivoCT;
    }

    public void setAdjetivoCT(int adjetivoCT) {
        this.adjetivoCT = adjetivoCT;
    }

    public int getAdverbioCT() {
        return adverbioCT;
    }

    public void setAdverbioCT(int adverbioCT) {
        this.adverbioCT = adverbioCT;
    }

    public int getArticuloCT() {
        return articuloCT;
    }

    public void setArticuloCT(int articuloCT) {
        this.articuloCT = articuloCT;
    }

    public int getPronombreCT() {
        return pronombreCT;
    }

    public void setPronombreCT(int pronombreCT) {
        this.pronombreCT = pronombreCT;
    }

    public int getPreposicionCT() {
        return preposicionCT;
    }

    public void setPreposicionCT(int preposicionCT) {
        this.preposicionCT = preposicionCT;
    }

    public int getConjuncionCT() {
        return conjuncionCT;
    }

    public void setConjuncionCT(int conjuncionCT) {
        this.conjuncionCT = conjuncionCT;
    }

    public int getInterjeccionCT() {
        return interjeccionCT;
    }

    public void setInterjeccionCT(int interjeccionCT) {
        this.interjeccionCT = interjeccionCT;
    }

    public int getIninteligibleCT() {
        return ininteligibleCT;
    }

    public void setIninteligibleCT(int ininteligibleCT) {
        this.ininteligibleCT = ininteligibleCT;
    }

    public int getTypeBB() {
        return typeBB;
    }

    public void setTypeBB(int typeBB) {
        this.typeBB = typeBB;
    }

    public int getSustantivoBB() {
        return sustantivoBB;
    }

    public void setSustantivoBB(int sustantivoBB) {
        this.sustantivoBB = sustantivoBB;
    }

    public int getVerboBB() {
        return verboBB;
    }

    public void setVerboBB(int verboBB) {
        this.verboBB = verboBB;
    }

    public int getAdjetivoBB() {
        return adjetivoBB;
    }

    public void setAdjetivoBB(int adjetivoBB) {
        this.adjetivoBB = adjetivoBB;
    }

    public int getAdverbioBB() {
        return adverbioBB;
    }

    public void setAdverbioBB(int adverbioBB) {
        this.adverbioBB = adverbioBB;
    }

    public int getArticuloBB() {
        return articuloBB;
    }

    public void setArticuloBB(int articuloBB) {
        this.articuloBB = articuloBB;
    }

    public int getPronombreBB() {
        return pronombreBB;
    }

    public void setPronombreBB(int pronombreBB) {
        this.pronombreBB = pronombreBB;
    }

    public int getPreposicionBB() {
        return preposicionBB;
    }

    public void setPreposicionBB(int preposicionBB) {
        this.preposicionBB = preposicionBB;
    }

    public int getConjuncionBB() {
        return conjuncionBB;
    }

    public void setConjuncionBB(int conjuncionBB) {
        this.conjuncionBB = conjuncionBB;
    }

    public int getInterjeccionBB() {
        return interjeccionBB;
    }

    public void setInterjeccionBB(int interjeccionBB) {
        this.interjeccionBB = interjeccionBB;
    }

    public int getIninteligibleBB() {
        return ininteligibleBB;
    }

    public void setIninteligibleBB(int ininteligibleBB) {
        this.ininteligibleBB = ininteligibleBB;
    }

    public int getTypeBBT() {
        return typeBBT;
    }

    public void setTypeBBT(int typeBBT) {
        this.typeBBT = typeBBT;
    }

    public int getSustantivoBBT() {
        return sustantivoBBT;
    }

    public void setSustantivoBBT(int sustantivoBBT) {
        this.sustantivoBBT = sustantivoBBT;
    }

    public int getVerboBBT() {
        return verboBBT;
    }

    public void setVerboBBT(int verboBBT) {
        this.verboBBT = verboBBT;
    }

    public int getAdjetivoBBT() {
        return adjetivoBBT;
    }

    public void setAdjetivoBBT(int adjetivoBBT) {
        this.adjetivoBBT = adjetivoBBT;
    }

    public int getAdverbioBBT() {
        return adverbioBBT;
    }

    public void setAdverbioBBT(int adverbioBBT) {
        this.adverbioBBT = adverbioBBT;
    }

    public int getArticuloBBT() {
        return articuloBBT;
    }

    public void setArticuloBBT(int articuloBBT) {
        this.articuloBBT = articuloBBT;
    }

    public int getPronombreBBT() {
        return pronombreBBT;
    }

    public void setPronombreBBT(int pronombreBBT) {
        this.pronombreBBT = pronombreBBT;
    }

    public int getPreposicionBBT() {
        return preposicionBBT;
    }

    public void setPreposicionBBT(int preposicionBBT) {
        this.preposicionBBT = preposicionBBT;
    }

    public int getConjuncionBBT() {
        return conjuncionBBT;
    }

    public void setConjuncionBBT(int conjuncionBBT) {
        this.conjuncionBBT = conjuncionBBT;
    }

    public int getInterjeccionBBT() {
        return interjeccionBBT;
    }

    public void setInterjeccionBBT(int interjeccionBBT) {
        this.interjeccionBBT = interjeccionBBT;
    }

    public int getIninteligibleBBT() {
        return ininteligibleBBT;
    }

    public void setIninteligibleBBT(int ininteligibleBBT) {
        this.ininteligibleBBT = ininteligibleBBT;
    }

    public int getFkCuidador() {
        return fkCuidador;
    }

    public void setFkCuidador(int fkCuidador) {
        this.fkCuidador = fkCuidador;
    }

    public String getFechaAplicacion() {
        return fechaAplicacion;
    }

    public void setFechaAplicacion(String fechaAplicacion) {
        this.fechaAplicacion = fechaAplicacion;
    }

    


    public int getFkBebe() {
        return fkBebe;
    }

    public void setFkBebe(int fkBebe) {
        this.fkBebe = fkBebe;
    }
    
    public void createLecturaConjunta() throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        String query;
                query = "INSERT INTO `babywizard`.`lecturaconjunta` (`typeC`, `sustantivoC`, `verboC`, `adjetivoC`, `adverbioC`, `articuloC`, `pronombreC`, `preposicionC`, `conjuncionC`, `interjeccionC`, `ininteligibleC`, `typeCT`, `sustantivoCT`, `verboCT`, `adjetivoCT`, `adverbioCT`, `articuloCT`, `pronombreCT`, `preposicionCT`, `conjuncionCT`, `interjeccionCT`, `ininteligibleCT`, `typeBB`, `sustantivoBB`, `verboBB`, `adjetivoBB`, `adverbioBB`, `articuloBB`, `pronombreBB`, `preposicionBB`, `conjuncionBB`, `interjeccionBB`, `ininteligibleBB`, `typeBBT`, `sustantivoBBT`, `verboBBT`, `adjetivoBBT`, `adverbioBBT`, `articuloBBT`, `pronombreBBT`, `preposicionBBT`, `conjuncionBBT`, `interjeccionBBT`, `ininteligibleBBT`, `fkBebe`, `fkCuidador`, `fechaAplicacion`) "
                + "VALUES ('"+this.getTypeC()+"', '"+this.getSustantivoC()+"', '"+this.getVerboC()+"', '"+this.getAdjetivoC()+"', '"+this.getAdverbioC()+"', '"+this.getArticuloC()+"', '"+this.getPronombreC()+"', '"+this.getPreposicionC()+"', '"+this.getConjuncionC()+"', '"+this.getInterjeccionC()+"', '"+this.getIninteligibleC()+"', '"+this.getTypeCT()+"', '"+this.getSustantivoCT()+"', '"+this.getVerboCT()+"', '"+this.getAdjetivoCT()+"', '"+this.getAdverbioCT()+"', '"+this.getArticuloCT()+"', '"+this.getPronombreCT()+"', '"+this.getPreposicionCT()+"', '"+this.getConjuncionCT()+"', '"+this.getInterjeccionCT()+"', '"+this.getIninteligibleCT()+"', '"+this.getTypeBB()+"', '"+this.getSustantivoBB()+"', '"+this.getVerboBB()+"', '"+this.getAdjetivoBB()+"', '"+this.getAdverbioBB()+"', '"+this.getArticuloBB()+"', '"+this.getPronombreBB()+"', '"+this.getPreposicionBB()+"', '"+this.getConjuncionBB()+"', '"+this.getInterjeccionBB()+"', '"+this.getIninteligibleBB()+"', '"+this.getTypeBBT()+"', '"+this.getSustantivoBBT()+"', '"+this.getVerboBBT()+"', '"+this.getAdjetivoBBT()+"', '"+this.getAdverbioBBT()+"', '"+this.getArticuloBBT()+"', '"+this.getPronombreBBT()+"', '"+this.getPreposicionBBT()+"', '"+this.getConjuncionBBT()+"', '"+this.getInterjeccionBBT()+"', '"+this.getIninteligibleBBT()+"', "
                        + " '"+this.getFkBebe()+"', '"+this.getFkCuidador()+"', '"+this.getFechaAplicacion()+"');";
        Statement stmt = con.createStatement();
        int executeUpdate = stmt.executeUpdate(query,Statement.RETURN_GENERATED_KEYS);
        
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()){
            idLecturaConjunta=rs.getInt(1);
        }
        rs.close();
        con.close();
    }
    
   public LinkedList<LecturaConjuntaModelo> readLecturaConjunta(int idLecturaConjunta, int typeC, int preposicionC, int sustantivoC, int articuloC, int verboC, int ininteligibleC, int adjetivoC, int pronombreC, int adverbioC, int conjuncionC, int interjeccionC,
            int typeCT, int preposicionCT, int sustantivoCT, int articuloCT, int verboCT, int ininteligibleCT, int adjetivoCT, int pronombreCT, int adverbioCT, int conjuncionCT, int interjeccionCT,
            int typeBB, int preposicionBB, int sustantivoBB, int articuloBB, int verboBB, int ininteligibleBB, int adjetivoBB, int pronombreBB, int adverbioBB, int conjuncionBB, int interjeccionBB,
            int typeBBT, int preposicionBBT, int sustantivoBBT, int articuloBBT, int verboBBT, int ininteligibleBBT, int adjetivoBBT, int pronombreBBT, int adverbioBBT, int conjuncionBBT, int interjeccionBBT, int fkCuidador, String fechaAplicacion, int fkBebe) throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        LinkedList<String> toRead = new LinkedList<>();
        if(idLecturaConjunta>-1) toRead.add("idLecturaConjunta = '"+idLecturaConjunta+"'");
        if(typeC > -1) toRead.add("typeC = '"+typeC+"'");
        if(preposicionC>-1) toRead.add("preposicionC = '"+preposicionC+"'");
        if(sustantivoC>-1) toRead.add("sustantivoC = '"+sustantivoC+"'");
        if(articuloC>-1) toRead.add("articuloC = '"+articuloC+"'");
        if(verboC>-1) toRead.add("verboC = '"+verboC+"'");
        if(ininteligibleC>-1) toRead.add("ininteligibleC = '"+ininteligibleC+"'");
        if(adjetivoC>-1) toRead.add("adjetivoC = '"+adjetivoC+"'");
        if(pronombreC>-1) toRead.add("pronombreC = '"+pronombreC+"'");
        if(adverbioC>-1) toRead.add("adverbioC = '"+adverbioC+"'");
        if(conjuncionC>-1) toRead.add("conjuncionC = '"+conjuncionC+"'");
        if(interjeccionC>-1) toRead.add("interjeccionC = '"+interjeccionC+"'");
        if(typeCT > -1) toRead.add("typeCT = '"+typeCT+"'");
        if(preposicionCT>-1) toRead.add("preposicionCT = '"+preposicionCT+"'");
        if(sustantivoCT>-1) toRead.add("sustantivoCT = '"+sustantivoCT+"'");
        if(articuloCT>-1) toRead.add("articuloCT = '"+articuloCT+"'");
        if(verboCT>-1) toRead.add("verboCT = '"+verboCT+"'");
        if(ininteligibleCT>-1) toRead.add("ininteligibleCT = '"+ininteligibleCT+"'");
        if(adjetivoCT>-1) toRead.add("adjetivoCT = '"+adjetivoCT+"'");
        if(pronombreCT>-1) toRead.add("pronombreCT = '"+pronombreCT+"'");
        if(adverbioCT>-1) toRead.add("adverbioCT = '"+adverbioCT+"'");
        if(conjuncionCT>-1) toRead.add("conjuncionCT = '"+conjuncionCT+"'");
        if(interjeccionCT>-1) toRead.add("interjeccionCT = '"+interjeccionCT+"'");
        if(typeBB > -1) toRead.add("typeBB = '"+typeBB+"'");
        if(preposicionBB>-1) toRead.add("preposicionBB = '"+preposicionBB+"'");
        if(sustantivoBB>-1) toRead.add("sustantivoBB = '"+sustantivoBB+"'");
        if(articuloBB>-1) toRead.add("articuloBB = '"+articuloBB+"'");
        if(verboBB>-1) toRead.add("verboBB = '"+verboBB+"'");
        if(ininteligibleBB>-1) toRead.add("ininteligibleBB = '"+ininteligibleBB+"'");
        if(adjetivoBB>-1) toRead.add("adjetivoBB = '"+adjetivoBB+"'");
        if(pronombreBB>-1) toRead.add("pronombreBB = '"+pronombreBB+"'");
        if(adverbioBB>-1) toRead.add("adverbioBB = '"+adverbioBB+"'");
        if(conjuncionBB>-1) toRead.add("conjuncionBB = '"+conjuncionBB+"'");
        if(interjeccionBB>-1) toRead.add("interjeccionBB = '"+interjeccionBB+"'");
        if(typeBBT > -1) toRead.add("typeBBT = '"+typeBBT+"'");
        if(preposicionBBT>-1) toRead.add("preposicionBBT = '"+preposicionBBT+"'");
        if(sustantivoBBT>-1) toRead.add("sustantivoBBT = '"+sustantivoBBT+"'");
        if(articuloBBT>-1) toRead.add("articuloBBT = '"+articuloBBT+"'");
        if(verboBBT>-1) toRead.add("verboBBT = '"+verboBBT+"'");
        if(ininteligibleBBT>-1) toRead.add("ininteligibleBBT = '"+ininteligibleBBT+"'");
        if(adjetivoBBT>-1) toRead.add("adjetivoBBT = '"+adjetivoBBT+"'");
        if(pronombreBBT>-1) toRead.add("pronombreBBT = '"+pronombreBBT+"'");
        if(adverbioBBT>-1) toRead.add("adverbioBBT = '"+adverbioBBT+"'");
        if(conjuncionBBT>-1) toRead.add("conjuncionBBT = '"+conjuncionBBT+"'");
        if(interjeccionBBT>-1) toRead.add("interjeccionBBT = '"+interjeccionBBT+"'");
        if(fkCuidador>-1) toRead.add("fkCuidador = '"+fkCuidador+"'");
        if(!(fechaAplicacion.equals(""))) toRead.add("fechaAplicacion = '"+fechaAplicacion+"'");
        if(fkBebe>-1) toRead.add("fkBebe = '"+fkBebe+"'");

        
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
            lcm.setTypeC(rs.getInt("typeC"));
            lcm.setAdjetivoC(rs.getInt("adjetivoC"));
            lcm.setAdverbioC(rs.getInt("adverbioC"));
            lcm.setArticuloC(rs.getInt("articuloC"));
            lcm.setConjuncionC(rs.getInt("conjuncionC"));
            lcm.setIninteligibleC(rs.getInt("ininteligibleC"));
            lcm.setInterjeccionC(rs.getInt("interjeccionC"));
            lcm.setPreposicionC(rs.getInt("preposicionC"));
            lcm.setPronombreC(rs.getInt("pronombreC"));
            lcm.setSustantivoC(rs.getInt("sustantivoC"));
            lcm.setVerboC(rs.getInt("verboC"));
            lcm.setTypeCT(rs.getInt("typeCT"));
            lcm.setAdjetivoCT(rs.getInt("adjetivoCT"));
            lcm.setAdverbioCT(rs.getInt("adverbioCT"));
            lcm.setArticuloCT(rs.getInt("articuloCT"));
            lcm.setConjuncionCT(rs.getInt("conjuncionCT"));
            lcm.setIninteligibleCT(rs.getInt("ininteligibleCT"));
            lcm.setInterjeccionCT(rs.getInt("interjeccionCT"));
            lcm.setPreposicionCT(rs.getInt("preposicionCT"));
            lcm.setPronombreCT(rs.getInt("pronombreCT"));
            lcm.setSustantivoCT(rs.getInt("sustantivoCT"));
            lcm.setVerboCT(rs.getInt("verboCT"));
            lcm.setTypeBB(rs.getInt("typeBB"));
            lcm.setAdjetivoBB(rs.getInt("adjetivoBB"));
            lcm.setAdverbioBB(rs.getInt("adverbioBB"));
            lcm.setArticuloBB(rs.getInt("articuloBB"));
            lcm.setConjuncionBB(rs.getInt("conjuncionBB"));
            lcm.setIninteligibleBB(rs.getInt("ininteligibleBB"));
            lcm.setInterjeccionBB(rs.getInt("interjeccionBB"));
            lcm.setPreposicionBB(rs.getInt("preposicionBB"));
            lcm.setPronombreBB(rs.getInt("pronombreBB"));
            lcm.setSustantivoBB(rs.getInt("sustantivoBB"));
            lcm.setVerboBB(rs.getInt("verboBB"));
            lcm.setTypeBBT(rs.getInt("typeBBT"));
            lcm.setAdjetivoBBT(rs.getInt("adjetivoBBT"));
            lcm.setAdverbioBBT(rs.getInt("adverbioBBT"));
            lcm.setArticuloBBT(rs.getInt("articuloBBT"));
            lcm.setConjuncionBBT(rs.getInt("conjuncionBBT"));
            lcm.setIninteligibleBBT(rs.getInt("ininteligibleBBT"));
            lcm.setInterjeccionBBT(rs.getInt("interjeccionBBT"));
            lcm.setPreposicionBBT(rs.getInt("preposicionBBT"));
            lcm.setPronombreBBT(rs.getInt("pronombreBBT"));
            lcm.setSustantivoBBT(rs.getInt("sustantivoBBT"));
            lcm.setVerboBBT(rs.getInt("verboBBT"));
            lcm.setFkCuidador(rs.getInt("fkCuidador"));
            lcm.setFkBebe(rs.getInt("fkBebe"));
            lcm.setFechaAplicacion(rs.getString("fechaAplicacion"));
            lecturasconjuntas.add(lcm);
        }
        con.close();
        return lecturasconjuntas;
    }
    
    public void updateLecturaConjunta(int idLecturaConjuntaActualizar, int idLecturaConjunta, int typeC, int preposicionC, int sustantivoC, int articuloC, int verboC, int ininteligibleC, int adjetivoC, int pronombreC, int adverbioC, int conjuncionC, int interjeccionC,
            int typeCT, int preposicionCT, int sustantivoCT, int articuloCT, int verboCT, int ininteligibleCT, int adjetivoCT, int pronombreCT, int adverbioCT, int conjuncionCT, int interjeccionCT,
            int typeBB, int preposicionBB, int sustantivoBB, int articuloBB, int verboBB, int ininteligibleBB, int adjetivoBB, int pronombreBB, int adverbioBB, int conjuncionBB, int interjeccionBB,
            int typeBBT, int preposicionBBT, int sustantivoBBT, int articuloBBT, int verboBBT, int ininteligibleBBT, int adjetivoBBT, int pronombreBBT, int adverbioBBT, int conjuncionBBT, int interjeccionBBT, int fkCuidador, String fechaAplicacion, int fkBebe) throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        LinkedList<String> toUpdate = new LinkedList<>();
        if (idLecturaConjunta > -1) {
           String idLecturaConjuntaQ = "`idLecturaConjunta` = '"+idLecturaConjunta+"'";
           toUpdate.add(idLecturaConjuntaQ);
        }
        if (typeC>-1) {
           String typeCQ = "`typeC` = '"+typeC+"'";
           toUpdate.add(typeCQ);
        }
        if (preposicionC > -1) {
           String preposicionCQ = "`preposicionC` = '"+preposicionC+"'";
           toUpdate.add(preposicionCQ);
        }
        if (sustantivoC > -1) {
           String sustantivoCQ = "`sustantivoC` = '"+sustantivoC+"'";
           toUpdate.add(sustantivoCQ);
        }
        if (articuloC > -1) {
           String articuloCQ = "`articuloC` = '"+articuloC+"'";
           toUpdate.add(articuloCQ);
        }
        if (verboC > -1) {
           String verboCQ = "`verboC` = '"+verboC+"'";
           toUpdate.add(verboCQ);
        }
        if (ininteligibleC > -1) {
           String ininteligibleCQ = "`ininteligibleC` = '"+ininteligibleC+"'";
           toUpdate.add(ininteligibleCQ);
        }
        if (adjetivoC > -1) {
           String adjetivoCQ = "`adjetivoC` = '"+adjetivoC+"'";
           toUpdate.add(adjetivoCQ);
        }
        if (pronombreC > -1) {
           String pronombreCQ = "`pronombreC` = '"+pronombreC+"'";
           toUpdate.add(pronombreCQ);
        }
        if (adverbioC > -1) {
           String adverbioCQ = "`adverbioC` = '"+adverbioC+"'";
           toUpdate.add(adverbioCQ);
        }
        if (conjuncionC > -1) {
           String conjuncionCQ = "`conjuncionC` = '"+conjuncionC+"'";
           toUpdate.add(conjuncionCQ);
        }
        if (interjeccionC > -1) {
           String interjeccionCQ = "`interjeccionC` = '"+interjeccionC+"'";
           toUpdate.add(interjeccionCQ);
        }
        if (typeCT>-1) {
           String typeCTQ = "`typeCT` = '"+typeCT+"'";
           toUpdate.add(typeCTQ);
        }
        if (preposicionCT > -1) {
           String preposicionCTQ = "`preposicionCT` = '"+preposicionCT+"'";
           toUpdate.add(preposicionCTQ);
        }
        if (sustantivoCT > -1) {
           String sustantivoCTQ = "`sustantivoCT` = '"+sustantivoCT+"'";
           toUpdate.add(sustantivoCTQ);
        }
        if (articuloCT > -1) {
           String articuloCTQ = "`articuloCT` = '"+articuloCT+"'";
           toUpdate.add(articuloCTQ);
        }
        if (verboCT > -1) {
           String verboCTQ = "`verboCT` = '"+verboCT+"'";
           toUpdate.add(verboCTQ);
        }
        if (ininteligibleCT > -1) {
           String ininteligibleCTQ = "`ininteligibleCT` = '"+ininteligibleCT+"'";
           toUpdate.add(ininteligibleCTQ);
        }
        if (adjetivoCT > -1) {
           String adjetivoCTQ = "`adjetivoCT` = '"+adjetivoCT+"'";
           toUpdate.add(adjetivoCTQ);
        }
        if (pronombreCT > -1) {
           String pronombreCTQ = "`pronombreCT` = '"+pronombreCT+"'";
           toUpdate.add(pronombreCTQ);
        }
        if (adverbioCT > -1) {
           String adverbioCTQ = "`adverbioCT` = '"+adverbioCT+"'";
           toUpdate.add(adverbioCTQ);
        }
        if (conjuncionCT > -1) {
           String conjuncionCTQ = "`conjuncionCT` = '"+conjuncionCT+"'";
           toUpdate.add(conjuncionCTQ);
        }
        if (interjeccionCT > -1) {
           String interjeccionCTQ = "`interjeccionCT` = '"+interjeccionCT+"'";
           toUpdate.add(interjeccionCTQ);
        }
        if (typeBB>-1) {
           String typeBBQ = "`typeBB` = '"+typeBB+"'";
           toUpdate.add(typeBBQ);
        }
        if (preposicionBB > -1) {
           String preposicionBBQ = "`preposicionBB` = '"+preposicionBB+"'";
           toUpdate.add(preposicionBBQ);
        }
        if (sustantivoBB > -1) {
           String sustantivoBBQ = "`sustantivoBB` = '"+sustantivoBB+"'";
           toUpdate.add(sustantivoBBQ);
        }
        if (articuloBB > -1) {
           String articuloBBQ = "`articuloBB` = '"+articuloBB+"'";
           toUpdate.add(articuloBBQ);
        }
        if (verboBB > -1) {
           String verboBBQ = "`verboBB` = '"+verboBB+"'";
           toUpdate.add(verboBBQ);
        }
        if (ininteligibleBB > -1) {
           String ininteligibleBBQ = "`ininteligibleBB` = '"+ininteligibleBB+"'";
           toUpdate.add(ininteligibleBBQ);
        }
        if (adjetivoBB > -1) {
           String adjetivoBBQ = "`adjetivoBB` = '"+adjetivoBB+"'";
           toUpdate.add(adjetivoBBQ);
        }
        if (pronombreBB > -1) {
           String pronombreBBQ = "`pronombreBB` = '"+pronombreBB+"'";
           toUpdate.add(pronombreBBQ);
        }
        if (adverbioBB > -1) {
           String adverbioBBQ = "`adverbioBB` = '"+adverbioBB+"'";
           toUpdate.add(adverbioBBQ);
        }
        if (conjuncionBB > -1) {
           String conjuncionBBQ = "`conjuncionBB` = '"+conjuncionBB+"'";
           toUpdate.add(conjuncionBBQ);
        }
        if (interjeccionBB > -1) {
           String interjeccionBBQ = "`interjeccionBB` = '"+interjeccionBB+"'";
           toUpdate.add(interjeccionBBQ);
        }
        if (typeBBT>-1) {
           String typeBBTQ = "`typeBBT` = '"+typeBBT+"'";
           toUpdate.add(typeBBTQ);
        }
        if (preposicionBBT > -1) {
           String preposicionBBTQ = "`preposicionBBT` = '"+preposicionBBT+"'";
           toUpdate.add(preposicionBBTQ);
        }
        if (sustantivoBBT > -1) {
           String sustantivoBBTQ = "`sustantivoBBT` = '"+sustantivoBBT+"'";
           toUpdate.add(sustantivoBBTQ);
        }
        if (articuloBBT > -1) {
           String articuloBBTQ = "`articuloBBT` = '"+articuloBBT+"'";
           toUpdate.add(articuloBBTQ);
        }
        if (verboBBT > -1) {
           String verboBBTQ = "`verboBBT` = '"+verboBBT+"'";
           toUpdate.add(verboBBTQ);
        }
        if (ininteligibleBBT > -1) {
           String ininteligibleBBTQ = "`ininteligibleBBT` = '"+ininteligibleBBT+"'";
           toUpdate.add(ininteligibleBBTQ);
        }
        if (adjetivoBBT > -1) {
           String adjetivoBBTQ = "`adjetivoBBT` = '"+adjetivoBBT+"'";
           toUpdate.add(adjetivoBBTQ);
        }
        if (pronombreBBT > -1) {
           String pronombreBBTQ = "`pronombreBBT` = '"+pronombreBBT+"'";
           toUpdate.add(pronombreBBTQ);
        }
        if (adverbioBBT > -1) {
           String adverbioBBTQ = "`adverbioBBT` = '"+adverbioBBT+"'";
           toUpdate.add(adverbioBBTQ);
        }
        if (conjuncionBBT > -1) {
           String conjuncionBBTQ = "`conjuncionBBT` = '"+conjuncionBBT+"'";
           toUpdate.add(conjuncionBBTQ);
        }
        if (interjeccionBBT > -1) {
           String interjeccionBBTQ = "`interjeccionBBT` = '"+interjeccionBBT+"'";
           toUpdate.add(interjeccionBBTQ);
        }
        if (fkCuidador > -1) {
           String fkCuidadorQ = "`fkCuidador` = '"+fkCuidador+"'";
           toUpdate.add(fkCuidadorQ);
        }
        if (!(fechaAplicacion.equals(""))) {
           String fechaAplicacionQ = "`fechaAplicacion` = '"+fechaAplicacion+"'";
           toUpdate.add(fechaAplicacionQ);
        }
        if (fkBebe > -1) {
           String fkBebeQ = "`fkBebe` = '"+fkBebe+"'";
           toUpdate.add(fkBebeQ);
        }

        
        String query1 = "UPDATE `babywizard`.`lecturaconjunta` SET ";
        String query2 = "";
        for(int i = 0; i<toUpdate.size()-1;i++){
            query2 = query2+toUpdate.get(i)+", ";
        }
        String query3 = toUpdate.getLast()+" WHERE (`idLecturaConjunta` = '"+idLecturaConjuntaActualizar+"');";
        Statement stmt = con.createStatement();
        //System.out.println(query1+query2+query3);
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

    public LinkedList<LecturaConjuntaModelo> readLecturaConjuntaPorIds(LinkedList<Integer> ids) throws SQLException {
        LinkedList<LecturaConjuntaModelo> lecturas = new LinkedList<LecturaConjuntaModelo>();
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        String query;
        String abuscar = "(";
        int size = ids.size();
        for(int i = 0; i < size-1; i++) abuscar += ids.get(i)+",";
        abuscar+=ids.get(size-1)+")";
        
        query = "select * FROM lecturaconjunta where fkBebe in "+abuscar+";";
        //System.out.print(con);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        
        while(rs.next()){
            LecturaConjuntaModelo lcm = new LecturaConjuntaModelo();
            lcm.setIdLecturaConjunta(rs.getInt("idLecturaConjunta"));
            lcm.setTypeC(rs.getInt("typeC"));
            lcm.setAdjetivoC(rs.getInt("adjetivoC"));
            lcm.setAdverbioC(rs.getInt("adverbioC"));
            lcm.setArticuloC(rs.getInt("articuloC"));
            lcm.setConjuncionC(rs.getInt("conjuncionC"));
            lcm.setIninteligibleC(rs.getInt("ininteligibleC"));
            lcm.setInterjeccionC(rs.getInt("interjeccionC"));
            lcm.setPreposicionC(rs.getInt("preposicionC"));
            lcm.setPronombreC(rs.getInt("pronombreC"));
            lcm.setSustantivoC(rs.getInt("sustantivoC"));
            lcm.setVerboC(rs.getInt("verboC"));
            lcm.setTypeCT(rs.getInt("typeCT"));
            lcm.setAdjetivoCT(rs.getInt("adjetivoCT"));
            lcm.setAdverbioCT(rs.getInt("adverbioCT"));
            lcm.setArticuloCT(rs.getInt("articuloCT"));
            lcm.setConjuncionCT(rs.getInt("conjuncionCT"));
            lcm.setIninteligibleCT(rs.getInt("ininteligibleCT"));
            lcm.setInterjeccionCT(rs.getInt("interjeccionCT"));
            lcm.setPreposicionCT(rs.getInt("preposicionCT"));
            lcm.setPronombreCT(rs.getInt("pronombreCT"));
            lcm.setSustantivoCT(rs.getInt("sustantivoCT"));
            lcm.setVerboCT(rs.getInt("verboCT"));
            lcm.setTypeCT(rs.getInt("typeBB"));
            lcm.setAdjetivoBB(rs.getInt("adjetivoBB"));
            lcm.setAdverbioBB(rs.getInt("adverbioBB"));
            lcm.setArticuloBB(rs.getInt("articuloBB"));
            lcm.setConjuncionBB(rs.getInt("conjuncionBB"));
            lcm.setIninteligibleBB(rs.getInt("ininteligibleBB"));
            lcm.setInterjeccionBB(rs.getInt("interjeccionBB"));
            lcm.setPreposicionBB(rs.getInt("preposicionBB"));
            lcm.setPronombreBB(rs.getInt("pronombreBB"));
            lcm.setSustantivoBB(rs.getInt("sustantivoBB"));
            lcm.setVerboBB(rs.getInt("verboBB"));
            lcm.setTypeBBT(rs.getInt("typeBBT"));
            lcm.setAdjetivoBBT(rs.getInt("adjetivoBBT"));
            lcm.setAdverbioBBT(rs.getInt("adverbioBBT"));
            lcm.setArticuloBBT(rs.getInt("articuloBBT"));
            lcm.setConjuncionBBT(rs.getInt("conjuncionBBT"));
            lcm.setIninteligibleBBT(rs.getInt("ininteligibleBBT"));
            lcm.setInterjeccionBBT(rs.getInt("interjeccionBBT"));
            lcm.setPreposicionBBT(rs.getInt("preposicionBBT"));
            lcm.setPronombreBBT(rs.getInt("pronombreBBT"));
            lcm.setSustantivoBBT(rs.getInt("sustantivoBBT"));
            lcm.setVerboBBT(rs.getInt("verboBBT"));
            lcm.setFkCuidador(rs.getInt("fkCuidador"));
            lcm.setFkBebe(rs.getInt("fkBebe"));
            lecturas.add(lcm);
        }
        con.close();
        return lecturas;
    }
}
