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
public class ExperimentoCabinaModelo {
    int idExperimentoCabina;
    String tipoExperimento;
    int entrenamientoOPrueba;
    double protarPre;
    double protarPos;
    double llkdifPre;
    double llkdifPos;
    double tr;
    int fkBebe;

    //Constructores
    public ExperimentoCabinaModelo() {
    }

    public ExperimentoCabinaModelo(String tipoExperimento, int entrenamientoOPrueba, double protarPre, double protarPos, double llkdifPre, double llkdifPos, double tr, int fkBebe) {
        this.tipoExperimento = tipoExperimento;
        this.entrenamientoOPrueba = entrenamientoOPrueba;
        this.protarPre = protarPre;
        this.protarPos = protarPos;
        this.llkdifPre = llkdifPre;
        this.llkdifPos = llkdifPos;
        this.tr = tr;
        this.fkBebe = fkBebe;
    }

    //Getters y setters
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

    public int getEntrenamientoOPrueba() {
        return entrenamientoOPrueba;
    }

    public void setEntrenamientoOPrueba(int entrenamientoOPrueba) {
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
    
    //Metodo para comunicarse con la base y agregar un experimento de cabina
    public void createExperimentoCabina() throws SQLException {
        //Crea la conexion con la clase que ya creada llamada JdbConnection
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        //Se empieza a crear el query de insercion de datos
        String query;
        query = "INSERT INTO `babywizard`.`experimentocabina` (`tipoExperimento`, `entrenamientoOPrueba`, `protarPre`, `protarPos`, `llkdifpre`, `llkdifpos`, `tr`, `fkBebe`) "
                + "VALUES ('"+this.getTipoExperimento()+"', '"+this.getEntrenamientoOPrueba()+"', '"+this.getProtarPre()+"', '"+this.getProtarPos()+"', '"+this.getLlkdifPre()+"', '"+this.getLlkdifPos()+"', '"+this.getTr()+"', '"+this.getFkBebe()+"');";
        //Se crea un statement que sera quien ejecute el query
        Statement stmt = con.createStatement();
        int executeUpdate = stmt.executeUpdate(query);
        //se cierra la conexion a la base
        con.close();
    }
    
    //Metodo que lee datos de la base para experimentos de cabina
    public LinkedList<ExperimentoCabinaModelo> readExperimentoCabina(int idExperimentoCabina, String tipoExperimento, int entrenamientoOPrueba, double protarPre, double protarPos, double llkdifPre, double llkdifPos, double tr, int fkBebe) throws SQLException {
        //Crea conexion a la base de datos
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        //Creamos una lista y agregamos los parametros que queremos como requisitos
        //Si un parametro es un numero menor a cero o si es un string es vacio no buscamos en su campo.
        LinkedList<String> toRead = new LinkedList<>();
        if(idExperimentoCabina>-1) toRead.add("idExperimentoCabina = '"+idExperimentoCabina+"'");
        if(!"".equals(tipoExperimento)) toRead.add("tipoExperimento = '"+tipoExperimento+"'");
        if(entrenamientoOPrueba>-1) toRead.add("entrenamientoOPrueba = '"+entrenamientoOPrueba+"'");
        if(protarPre>=0) toRead.add("protarPre = '"+protarPre+"'");
        if(protarPos>=0) toRead.add("protarPos = '"+protarPos+"'");
        if(llkdifPre>=0) toRead.add("llkdifpre = '"+llkdifPre+"'");
        if(llkdifPos>=0) toRead.add("llkdifpos = '"+llkdifPos+"'");
        if(tr>=0) toRead.add("tr = '"+tr+"'");
        if(fkBebe>-1) toRead.add("fkBebe = '"+fkBebe+"'");
        //query inicial
        String query1 = "SELECT * FROM babywizard.experimentocabina WHERE ";
        //query en el que se van agregando los parametros a buscar
        String query2 = "";
        for(int i = 0; i<toRead.size()-1;i++){
            query2 = query2+toRead.get(i)+" AND ";
        }
        //query final en el que se agrega el ultimo parametro a buscar
        String query3="";
        if(toRead.size()>0) query3 = toRead.getLast()+";";
        //Se crea el statement que ejecutara el query y el ResultSet donde se guardaran los resultados
        Statement stmt = con.createStatement();
        ResultSet rs;
        //Si no se pidieron parametros se ejecuta un query que devuelve toda la tabla de la base
        if (toRead.size()>0) {
        rs = stmt.executeQuery(query1+query2+query3);
        } else {
        rs = stmt.executeQuery("SELECT * FROM babywizard.experimentocabina");
        }
        //Se crea una lista donde se agregan los objetos creados con los datos de la base.
        LinkedList<ExperimentoCabinaModelo> experimentosc = new LinkedList<>();
        while(rs.next()){
            ExperimentoCabinaModelo ecm= new ExperimentoCabinaModelo();
            ecm.setIdExperimentoCabina(rs.getInt("idExperimentoCabina"));
            ecm.setTipoExperimento(rs.getString("tipoExperimento"));
            ecm.setEntrenamientoOPrueba(rs.getInt("entrenamientoOPrueba"));
            ecm.setProtarPre(rs.getDouble("protarPre"));
            ecm.setProtarPos(rs.getDouble("protarPos"));
            ecm.setLlkdifPre(rs.getDouble("llkdifpre"));
            ecm.setLlkdifPos(rs.getDouble("llkdifpos"));
            ecm.setTr(rs.getDouble("tr"));
            ecm.setFkBebe(rs.getInt("fkBebe"));
            experimentosc.add(ecm);
        }
        //Se cierra la conexion y se devuelve la lista con los objetos.
        con.close();
        return experimentosc;
    }
    
    public void updateExperimentoCabina(int idExperimentoCabinaActualizar, int idExperimentoCabina, String tipoExperimento, int entrenamientoOPrueba, double protarPre, double protarPos, double llkdifPre, double llkdifPos, double tr, int fkBebe) throws SQLException{
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        LinkedList<String> toUpdate = new LinkedList<>();
        if(idExperimentoCabina>-1) {
           String idExperimentoCabinaQ = "`idExperimentoCabina` = '"+idExperimentoCabina+"'";
           toUpdate.add(idExperimentoCabinaQ);
        }
        if (!"".equals(tipoExperimento)) {
            String tipoExperimentoQ = "`tipoExperimento` = '"+tipoExperimento+"'";
            toUpdate.add(tipoExperimentoQ);
        }
        if(entrenamientoOPrueba>-1) {
           String entrenamientoOPruebaQ = "`entrenamientoOPrueba` = '"+entrenamientoOPrueba+"'";
           toUpdate.add(entrenamientoOPruebaQ);
        }
        if(protarPre>=0) {
            String protarPreQ = "`protarPre` = '"+protarPre+"'";
            toUpdate.add(protarPreQ);
        }
        if(protarPos>=0) {
            String protarPosQ = "`protarPos` = '"+protarPos+"'";
            toUpdate.add(protarPosQ);
        }
        if(llkdifPre>=0) {
            String llkdifPreQ = "`llkdifpre` = '"+llkdifPre+"'";
            toUpdate.add(llkdifPreQ);
        }
        if(llkdifPos>=0) {
            String llkdifPosQ = "`llkdifpos` = '"+llkdifPos+"'";
            toUpdate.add(llkdifPosQ);
        }
        if(tr>=0) {
            String trQ = "`tr` = '"+tr+"'";
            toUpdate.add(trQ);
        }
        if(fkBebe>-1) {
           String fkBebeQ = "`fkBebe` = '"+fkBebe+"'";
           toUpdate.add(fkBebeQ);
        }
        
        String query1 = "UPDATE `babywizard`.`experimentocabina` SET ";
        String query2 = "";
        for(int i = 0; i<toUpdate.size()-1;i++){
            query2 = query2+toUpdate.get(i)+", ";
        }
        String query3 = toUpdate.getLast()+" WHERE (`idExperimentoCabina` = '"+idExperimentoCabinaActualizar+"');";
        Statement stmt = con.createStatement();
        //System.out.println(query1+query2+query3);
        if(toUpdate.size() > 0) stmt.executeUpdate(query1+query2+query3);
        con.close();
    }
    
    public void deleteExperimentoCabina(int idExperimentoCabina) throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        Statement stmt = con.createStatement();
        stmt.executeUpdate("DELETE FROM `babywizard`.`experimentocabina` WHERE (`idExperimentoCabina` = '"+idExperimentoCabina+"');");
        con.close();
    }
    
}
