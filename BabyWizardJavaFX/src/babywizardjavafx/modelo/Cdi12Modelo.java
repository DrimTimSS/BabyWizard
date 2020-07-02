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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author victo
 */
public class Cdi12Modelo {
    
    //Atributos sacados de las columnas de la base de datos
    int idCdi12;
    int primerasFrases;
    float propPrimerasFrases;
    int percPrimerasFrases;
    int comprension;
    float propComprension;
    int percComprension;
    int produccion;
    float propProduccion;
    int percProduccion;
    int totalGestos;
    float propTotalGestos;
    int percTotalGestos;
    int gestosTempranos;
    float propGestosTempranos;
    int percGestosTempranos;
    int gestosTardios;
    float propGestosTardios;
    int percGestosTardios;
    String fechaAplicacion;
    int fkBebe;

    public Cdi12Modelo() {
    }

    
    
    public Cdi12Modelo(int primerasFrases, float propPrimerasFrases, int percPrimerasFrases, int comprension, float propComprension, int percComprension, int produccion, float propProduccion, int percProduccion, int totalGestos, float propTotalGestos, int percTotalGestos, int gestosTempranos, float propGestosTempranos, int percGestosTempranos, int gestosTardios, float propGestosTardios, int percGestosTardios, String fechaAplicacion, int fkBebe) {
        this.primerasFrases = primerasFrases;
        this.propPrimerasFrases = propPrimerasFrases;
        this.percPrimerasFrases = percPrimerasFrases;
        this.comprension = comprension;
        this.propComprension = propComprension;
        this.percComprension = percComprension;
        this.produccion = produccion;
        this.propProduccion = propProduccion;
        this.percProduccion = percProduccion;
        this.totalGestos = totalGestos;
        this.propTotalGestos = propTotalGestos;
        this.percTotalGestos = percTotalGestos;
        this.gestosTempranos = gestosTempranos;
        this.propGestosTempranos = propGestosTempranos;
        this.percGestosTempranos = percGestosTempranos;
        this.gestosTardios = gestosTardios;
        this.propGestosTardios = propGestosTardios;
        this.percGestosTardios = percGestosTardios;
        this.fechaAplicacion = fechaAplicacion;
        this.fkBebe = fkBebe;
    }

    
    
    //Getters y setters (los puedes crear con alt+insert)
    public int getIdCdi12() {
        return idCdi12;
    }

    public void setIdCdi12(int idCdi12) {
        this.idCdi12 = idCdi12;
    }

    public int getPrimerasFrases() {
        return primerasFrases;
    }

    public void setPrimerasFrases(int primerasFrases) {
        this.primerasFrases = primerasFrases;
    }

    public float getPropPrimerasFrases() {
        return propPrimerasFrases;
    }

    public void setPropPrimerasFrases(float propPrimerasFrases) {
        this.propPrimerasFrases = propPrimerasFrases;
    }

    public int getPercPrimerasFrases() {
        return percPrimerasFrases;
    }

    public void setPercPrimerasFrases(int percPrimerasFrases) {
        this.percPrimerasFrases = percPrimerasFrases;
    }

    public int getComprension() {
        return comprension;
    }

    public void setComprension(int comprension) {
        this.comprension = comprension;
    }

    public float getPropComprension() {
        return propComprension;
    }

    public void setPropComprension(float propComprension) {
        this.propComprension = propComprension;
    }

    public int getPercComprension() {
        return percComprension;
    }

    public void setPercComprension(int percComprension) {
        this.percComprension = percComprension;
    }

    public int getProduccion() {
        return produccion;
    }

    public void setProduccion(int produccion) {
        this.produccion = produccion;
    }

    public float getPropProduccion() {
        return propProduccion;
    }

    public void setPropProduccion(float propProduccion) {
        this.propProduccion = propProduccion;
    }

    public int getPercProduccion() {
        return percProduccion;
    }

    public void setPercProduccion(int percProduccion) {
        this.percProduccion = percProduccion;
    }

    public int getTotalGestos() {
        return totalGestos;
    }

    public void setTotalGestos(int totalGestos) {
        this.totalGestos = totalGestos;
    }

    public float getPropTotalGestos() {
        return propTotalGestos;
    }

    public void setPropTotalGestos(float propTotalGestos) {
        this.propTotalGestos = propTotalGestos;
    }

    public int getPercTotalGestos() {
        return percTotalGestos;
    }

    public void setPercTotalGestos(int percTotalGestos) {
        this.percTotalGestos = percTotalGestos;
    }

    public int getGestosTempranos() {
        return gestosTempranos;
    }

    public void setGestosTempranos(int gestosTempranos) {
        this.gestosTempranos = gestosTempranos;
    }

    public float getPropGestosTempranos() {
        return propGestosTempranos;
    }

    public void setPropGestosTempranos(float propGestosTempranos) {
        this.propGestosTempranos = propGestosTempranos;
    }

    public int getPercGestosTempranos() {
        return percGestosTempranos;
    }

    public void setPercGestosTempranos(int percGestosTempranos) {
        this.percGestosTempranos = percGestosTempranos;
    }

    public int getGestosTardios() {
        return gestosTardios;
    }

    public void setGestosTardios(int gestosTardios) {
        this.gestosTardios = gestosTardios;
    }

    public float getPropGestosTardios() {
        return propGestosTardios;
    }

    public void setPropGestosTardios(float propGestosTardios) {
        this.propGestosTardios = propGestosTardios;
    }

    public int getPercGestosTardios() {
        return percGestosTardios;
    }

    public void setPercGestosTardios(int percGestosTardios) {
        this.percGestosTardios = percGestosTardios;
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
    
    //CRUD
    //Metodo para crear un cdi12
    public void createCdi12() throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        String query;
        query = "INSERT INTO `babywizard`.`cdi12` (`primerasFrases`, `propPrimerasFrases`, `percPrimerasFrases`, `comprension`, `propComprension`, `percComprension`, `produccion`, `propProduccion`, `percProduccion`, `totalGestos`, `propTotalGestos`, `percTotalGestos`, `gestosTempranos`, `propGestosTempranos`, `percGestosTempranos`, `gestosTardios`, `propGestosTardios`, `percGestosTardios`, `fechaAplicacion`, `fkBebe`) "
                + "VALUES ('"+this.getPrimerasFrases()+"', '"+this.getPropPrimerasFrases()+"', '"+this.getPercPrimerasFrases()+"', '"+this.getComprension()+"', '"+this.getPropComprension()+"', '"+this.getPercComprension()+"', '"+this.getProduccion()+"', '"+this.getPropProduccion()+"', '"+this.getPercProduccion()+"', '"+this.getTotalGestos()+"', '"+this.getPropTotalGestos()+"', '"+this.getPercTotalGestos()+"', '"+this.getGestosTempranos()+"', '"+this.getPropGestosTempranos()+"', '"+this.getPercGestosTempranos()+"', '"+this.getGestosTardios()+"', '"+this.getPropGestosTardios()+"', '"+this.getPercGestosTardios()+"', '"+this.getFechaAplicacion()+"', '"+this.getFkBebe()+"');";
        Statement stmt = con.createStatement();
        int executeUpdate = stmt.executeUpdate(query,Statement.RETURN_GENERATED_KEYS);
        
        //Le asigna a la variable idCdi12 el id del elemento que se acaba de crear en la base
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()){
            idCdi12=rs.getInt(1);
        }
        rs.close();
        con.close();
    }
    
    //Se le pasa una lista de ids de bebes y regresa todos los cdi12s de esos bebes (uso en el caso de uso de busqueda)
    public LinkedList<Cdi12Modelo> readCdi12PorIds(LinkedList<Integer> ids) throws SQLException {
        LinkedList<Cdi12Modelo> cdis = new LinkedList<Cdi12Modelo>();
        if(!(ids.size()>0)) return cdis;
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        String query;
        String abuscar = "(";
        int size = ids.size();
        for(int i = 0; i < size-1; i++) abuscar += ids.get(i)+",";
        abuscar+=ids.get(size-1)+")";
        query = "select * FROM babywizard.cdi12 where fkbebe in "+abuscar+";";
        //System.out.print(con);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while(rs.next()){
            Cdi12Modelo cdi = new Cdi12Modelo();
            cdi.setIdCdi12(rs.getInt("idCdi12"));
            cdi.setPrimerasFrases(rs.getInt("primerasFrases"));
            cdi.setPropPrimerasFrases(rs.getFloat("propPrimerasFrases"));
            cdi.setPercPrimerasFrases(rs.getInt("percPrimerasFrases"));
            
            cdi.setComprension(rs.getInt("comprension"));
            cdi.setPropComprension(rs.getFloat("propComprension"));
            cdi.setPercComprension(rs.getInt("percComprension"));
            
            cdi.setProduccion(rs.getInt("produccion"));
            cdi.setPropProduccion(rs.getFloat("propProduccion"));
            cdi.setPercProduccion(rs.getInt("percProduccion"));
            
            cdi.setTotalGestos(rs.getInt("totalGestos"));
            cdi.setPropTotalGestos(rs.getFloat("propTotalGestos"));
            cdi.setPercTotalGestos(rs.getInt("percTotalGestos"));
            
            cdi.setGestosTempranos(rs.getInt("gestosTempranos"));
            cdi.setPropGestosTempranos(rs.getFloat("propGestosTempranos"));
            cdi.setPercGestosTempranos(rs.getInt("percGestosTempranos"));
            
            cdi.setGestosTardios(rs.getInt("gestosTardios"));
            cdi.setPropGestosTardios(rs.getFloat("propGestosTardios"));
            cdi.setPercGestosTardios(rs.getInt("percGestosTardios"));
            
            cdi.setFechaAplicacion(rs.getString("fechaAplicacion"));
            cdis.add(cdi);
        }
        con.close();
        return cdis;
    }
    
    //Se le pasan los parametros que se desean buscar y te regresa todos los cdis que lo cumplen
    public LinkedList<Cdi12Modelo> readCdi12(int idCdi12, int primerasFrases, float propPrimerasFrases, int percPrimerasFrases, int comprension, float propComprension, int percComprension, int produccion, float propProduccion, int percProduccion, int totalGestos, float propTotalGestos, int percTotalGestos, int gestosTempranos, float propGestosTempranos, int percGestosTempranos, int gestosTardios, float propGestosTardios, int percGestosTardios, String fechaAplicacion, int fkBebe) throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        LinkedList<String> toRead = new LinkedList<>();
        
        if(idCdi12>-1) toRead.add("idCdi12 = '"+idCdi12+"'");
        if(primerasFrases>-1) toRead.add("primerasFrases = '"+primerasFrases+"'");
        if(propPrimerasFrases>=0) toRead.add("propPrimerasFrases = '"+propPrimerasFrases+"'");
        if(percPrimerasFrases>1) toRead.add("percPrimerasFrases = '"+percPrimerasFrases+"'");
        if(comprension>-1) toRead.add("comprension = '"+comprension+"'");
        if(propComprension>=0) toRead.add("propComprension = '"+propComprension+"'");
        if(percComprension>1) toRead.add("percComprension = '"+percComprension+"'");
        if(produccion>-1) toRead.add("produccion = '"+produccion+"'");
        if(propProduccion>=0) toRead.add("propProduccion = '"+propProduccion+"'");
        if(percProduccion>1) toRead.add("percProduccion = '"+percProduccion+"'");
        if(totalGestos>-1) toRead.add("totalGestos = '"+totalGestos+"'");
        if(propTotalGestos>=0) toRead.add("propTotalGestos = '"+propTotalGestos+"'");
        if(percTotalGestos>1) toRead.add("percTotalGestos = '"+percTotalGestos+"'");
        if(gestosTempranos>-1) toRead.add("gestosTempranos = '"+gestosTempranos+"'");
        if(propGestosTempranos>=0) toRead.add("propGestosTempranos = '"+propGestosTempranos+"'");
        if(percGestosTempranos>1) toRead.add("percGestosTempranos = '"+percGestosTempranos+"'");
        if(gestosTardios>-1) toRead.add("gestosTardios = '"+gestosTardios+"'");
        if(propGestosTardios>=0) toRead.add("propGestosTardios = '"+propGestosTardios+"'");
        if(percGestosTardios>1) toRead.add("percGestosTardios = '"+percGestosTardios+"'");
        if(!(fechaAplicacion.equals(""))) toRead.add("fechaAplicacion = '"+fechaAplicacion+"'");
        if(fkBebe>-1) toRead.add("fkBebe = '"+fkBebe+"'");
        
        String query1 = "SELECT * FROM babywizard.cdi12 WHERE ";
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
        rs = stmt.executeQuery("SELECT * FROM babywizard.cdi12");
        }
        LinkedList<Cdi12Modelo> cdis = new LinkedList<>();
        while(rs.next()){
            Cdi12Modelo cdi = new Cdi12Modelo();
            cdi.setIdCdi12(rs.getInt("idCdi12"));
            cdi.setPrimerasFrases(rs.getInt("primerasFrases"));
            cdi.setPropPrimerasFrases(rs.getFloat("propPrimerasFrases"));
            cdi.setPercPrimerasFrases(rs.getInt("percPrimerasFrases"));
            cdi.setComprension(rs.getInt("comprension"));
            cdi.setPropComprension(rs.getFloat("propComprension"));
            cdi.setPercComprension(rs.getInt("percComprension"));
            cdi.setProduccion(rs.getInt("produccion"));
            cdi.setPropProduccion(rs.getFloat("propProduccion"));
            cdi.setPercProduccion(rs.getInt("percProduccion"));
            cdi.setTotalGestos(rs.getInt("totalGestos"));
            cdi.setPropTotalGestos(rs.getFloat("propTotalGestos"));
            cdi.setPercTotalGestos(rs.getInt("percTotalGestos"));
            cdi.setGestosTempranos(rs.getInt("gestosTempranos"));
            cdi.setPropGestosTempranos(rs.getFloat("propGestosTempranos"));
            cdi.setPercGestosTempranos(rs.getInt("percGestosTempranos"));
            cdi.setGestosTardios(rs.getInt("gestosTardios"));
            cdi.setPropGestosTardios(rs.getFloat("propGestosTardios"));
            cdi.setPercGestosTardios(rs.getInt("percGestosTardios"));
            cdis.add(cdi);
        }
        con.close();
        return cdis;
    }
    
    //Le pasas el id del cdi a actualizar y los parametros que se quieren cambiar, si no se quieren cambiar se le pasa -1
    public void updateCdi12(int idCdi12Actualizar,int idCdi12, int primerasFrases, float propPrimerasFrases, int percPrimerasFrases, int comprension, float propComprension, int percComprension, int produccion, float propProduccion, int percProduccion, int totalGestos, float propTotalGestos, int percTotalGestos, int gestosTempranos, float propGestosTempranos, int percGestosTempranos, int gestosTardios, float propGestosTardios, int percGestosTardios, String fechaAplicacion, int fkBebe) throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        LinkedList<String> toUpdate = new LinkedList<>();
        
        if (idCdi12 > -1) {
           String idCdi12Q = "`idCdi12` = '"+idCdi12+"'";
           toUpdate.add(idCdi12Q);
        }
        
        if (primerasFrases > 1) {
           String primerasFrasesQ = "`primerasFrases` = '"+primerasFrases+"'";
           toUpdate.add(primerasFrasesQ);
        }
        if (propPrimerasFrases >= 0) {
           String propPrimerasFrasesQ = "`propPrimerasFrases` = '"+propPrimerasFrases+"'";
           toUpdate.add(propPrimerasFrasesQ);
        }
        if (percPrimerasFrases > 1) {
           String percPrimerasFrasesQ = "`percPrimerasFrases` = '"+percPrimerasFrases+"'";
           toUpdate.add(percPrimerasFrasesQ);
        }
        
        if (comprension > 1) {
           String comprensionQ = "`comprension` = '"+comprension+"'";
           toUpdate.add(comprensionQ);
        }
        if (propComprension >= 0) {
           String propComprensionQ = "`propComprension` = '"+propComprension+"'";
           toUpdate.add(propComprensionQ);
        }
        if (percComprension > 1) {
           String percComprensionQ = "`percComprension` = '"+percComprension+"'";
           toUpdate.add(percComprensionQ);
        }
        
        if (produccion > 1) {
           String produccionQ = "`produccion` = '"+produccion+"'";
           toUpdate.add(produccionQ);
        }
        if (propProduccion >= 0) {
           String propProduccionQ = "`propProduccion` = '"+propProduccion+"'";
           toUpdate.add(propProduccionQ);
        }
        if (percProduccion > 1) {
           String percProduccionQ = "`percProduccion` = '"+percProduccion+"'";
           toUpdate.add(percProduccionQ);
        }
        
        if (totalGestos > 1) {
           String totalGestosQ = "`totalGestos` = '"+totalGestos+"'";
           toUpdate.add(totalGestosQ);
        }
        if (propTotalGestos >= 0) {
           String propTotalGestosQ = "`propTotalGestos` = '"+propTotalGestos+"'";
           toUpdate.add(propTotalGestosQ);
        }
        if (percTotalGestos > 1) {
           String percTotalGestosQ = "`percTotalGestos` = '"+percTotalGestos+"'";
           toUpdate.add(percTotalGestosQ);
        }
        
        if (gestosTempranos > 1) {
           String gestosTempranosQ = "`gestosTempranos` = '"+gestosTempranos+"'";
           toUpdate.add(gestosTempranosQ);
        }
        if (propGestosTempranos >= 0) {
           String propGestosTempranosQ = "`propGestosTempranos` = '"+propGestosTempranos+"'";
           toUpdate.add(propGestosTempranosQ);
        }
        if (percGestosTempranos > 1) {
           String percGestosTempranosQ = "`percGestosTempranos` = '"+percGestosTempranos+"'";
           toUpdate.add(percGestosTempranosQ);
        }
        
        if (gestosTardios > 1) {
           String gestosTardiosQ = "`gestosTardios` = '"+gestosTardios+"'";
           toUpdate.add(gestosTardiosQ);
        }
        if (propGestosTardios >= 0) {
           String propGestosTardiosQ = "`propGestosTardios` = '"+propGestosTardios+"'";
           toUpdate.add(propGestosTardiosQ);
        }
        if (percGestosTardios > 1) {
           String percGestosTardiosQ = "`percGestosTardios` = '"+percGestosTardios+"'";
           toUpdate.add(percGestosTardiosQ);
        }
        
        if (!(fechaAplicacion.equals(""))) {
           String fechaAplicacionQ = "`fechaAplicacion` = '"+fechaAplicacion+"'";
           toUpdate.add(fechaAplicacionQ);
        }
        
        if (fkBebe > -1) {
           String fkBebeQ = "`fkBebe` = '"+fkBebe+"'";
           toUpdate.add(fkBebeQ);
        }
        String query1 = "UPDATE `babywizard`.`cdi12` SET ";
        String query2 = "";
        for(int i = 0; i<toUpdate.size()-1;i++){
            query2 = query2+toUpdate.get(i)+", ";
        }
        String query3 = toUpdate.getLast()+" WHERE (`idCdi12` = '"+idCdi12Actualizar+"');";
        Statement stmt = con.createStatement();
        //System.out.println(query1+query2+query3);
        if(toUpdate.size() > 0) stmt.executeUpdate(query1+query2+query3);
        con.close();
    }
    
    //Borrar un cdi con su id
    public void deleteCdi12(int idCdi12) throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        Statement stmt = con.createStatement();
        stmt.executeUpdate("DELETE FROM `babywizard`.`cdi12` WHERE (`idBebe` = '"+idCdi12+"');");
        con.close();
    }
}
