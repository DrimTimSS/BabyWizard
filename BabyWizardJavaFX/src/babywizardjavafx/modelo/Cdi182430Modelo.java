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
 * @author Valdovinos
 */
public class Cdi182430Modelo {

    int idCdi182430;
    int produccion;
    float propProduccion;
    int percProduccion;
    float p3lPalabras;
    int percP3lPalabras;
    int complejidadFrases;
    float propComplejidadFrases;
    int percComplejidadFrases;
    String fechaAplicacion;
    int fkBebe;

    public Cdi182430Modelo(int produccion, float propProduccion, int percProduccion, float p3lPalabras, int percP3lPalabras, int complejidadFrases, float propComplejidadFrases, int percComplejidadFrases, String fechaAplicacion, int fkBebe) {
        this.produccion = produccion;
        this.propProduccion = propProduccion;
        this.percProduccion = percProduccion;
        this.p3lPalabras = p3lPalabras;
        this.percP3lPalabras = percP3lPalabras;
        this.complejidadFrases = complejidadFrases;
        this.propComplejidadFrases = propComplejidadFrases;
        this.percComplejidadFrases = percComplejidadFrases;
        this.fechaAplicacion = fechaAplicacion;
        this.fkBebe = fkBebe;
    }

    public Cdi182430Modelo() {

    }

    public int getIdCdi182430() {
        return idCdi182430;
    }

    public void setIdCdi182430(int idCdi182430) {
        this.idCdi182430 = idCdi182430;
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

    public float getP3lPalabras() {
        return p3lPalabras;
    }

    public void setP3lPalabras(float p3lPalabras) {
        this.p3lPalabras = p3lPalabras;
    }

    public int getPercP3lPalabras() {
        return percP3lPalabras;
    }

    public void setPercP3lPalabras(int percP3lPalabras) {
        this.percP3lPalabras = percP3lPalabras;
    }

    public int getComplejidadFrases() {
        return complejidadFrases;
    }

    public void setComplejidadFrases(int complejidadFrases) {
        this.complejidadFrases = complejidadFrases;
    }

    public float getPropComplejidadFrases() {
        return propComplejidadFrases;
    }

    public void setPropComplejidadFrases(float propComplejidadFrases) {
        this.propComplejidadFrases = propComplejidadFrases;
    }

    public int getPercComplejidadFrases() {
        return percComplejidadFrases;
    }

    public void setPercComplejidadFrases(int percComplejidadFrases) {
        this.percComplejidadFrases = percComplejidadFrases;
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
    public void createCdi182430Modelo() throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        String query;
        query = "INSERT INTO `babywizard`.`cdi182430` (`produccion`, `propProduccion`, `percProduccion`, `p3lPalabras`, `percP3lPalabras`, `complejidadFrases`, `propComplejidadFrases`, `percComplejidadFrases`, `fechaAplicacion`, `fkBebe`) "
                + "VALUES ('" + this.getProduccion() + "', '" + this.getPropProduccion() + "', '" + this.getPercProduccion() + "', '" + this.getP3lPalabras() + "', '" + this.getPercP3lPalabras() + "', '" + this.getComplejidadFrases() + "', '" + this.getPropComplejidadFrases() + "', '" + this.getPercComplejidadFrases() + "', '" + this.getFechaAplicacion() + "', '" + this.getFkBebe() + "');";
        Statement stmt = con.createStatement();
        int executeUpdate = stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);

        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()) {
            idCdi182430 = rs.getInt(1);
        }
        rs.close();
        con.close();
    }

    public LinkedList<Cdi182430Modelo> readCdi182430PorIds(LinkedList<Integer> ids) throws SQLException {
        LinkedList<Cdi182430Modelo> cdis = new LinkedList<Cdi182430Modelo>();
        if (!(ids.size() > 0)) {
            return cdis;
        }
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        String query;
        String abuscar = "(";
        int size = ids.size();
        for (int i = 0; i < size - 1; i++) {
            abuscar += ids.get(i) + ",";
        }
        abuscar += ids.get(size - 1) + ")";
        query = "select * FROM babywizard.cdi182430 where fkbebe in " + abuscar + ";";
        //System.out.print(con);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            Cdi182430Modelo cdi = new Cdi182430Modelo();
            cdi.setIdCdi182430(rs.getInt("idCdi182430"));
            cdi.setProduccion(rs.getInt("produccion"));
            cdi.setPropProduccion(rs.getFloat("propProduccion"));
            cdi.setPercProduccion(rs.getInt("percProduccion"));

            cdi.setP3lPalabras(rs.getFloat("p3lPalabras"));
            cdi.setPercP3lPalabras(rs.getInt("percP3lPalabras"));

            cdi.setComplejidadFrases(rs.getInt("complejidadFrases"));
            cdi.setPropComplejidadFrases(rs.getFloat("propComplejidadFrases"));
            cdi.setPercComplejidadFrases(rs.getInt("percComplejidadFrases"));

            cdi.setFechaAplicacion(rs.getString("fechaAplicacion"));
            cdis.add(cdi);
        }
        con.close();
        return cdis;
    }

    //checar parámetros
    public LinkedList<Cdi182430Modelo> readCdi182430(int idCdi182430, int produccion, float propProduccion, int percProduccion, float p3lPalabras, int percP3lPalabras, int complejidadFrases, float propComplejidadFrases, int percComplejidadFrases, String fechaAplicacion, int fkBebe) throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        LinkedList<String> toRead = new LinkedList<>();

        if (idCdi182430 >= 0) {
            toRead.add("idCdi182430 = '" + idCdi182430 + "'");
        }
        if (produccion >= 0) {
            toRead.add("produccion = '" + produccion + "'");
        }
        if (propProduccion >= 0) {
            toRead.add("propProduccion = '" + propProduccion + "'");
        }
        if (percProduccion >= 0) {
            toRead.add("percProduccion = '" + percProduccion + "'");
        }

        //parámetros if dudosos jejej
        if (p3lPalabras >= 0) {
            toRead.add("p3lPalabras = '" + p3lPalabras + "'");
        }
        if (percP3lPalabras >= 0) {
            toRead.add("percP3lPalabras = '" + percP3lPalabras + "'");
        }
        if (complejidadFrases >= 0) {
            toRead.add("complejidadFrases = '" + complejidadFrases + "'");
        }
        if (propComplejidadFrases >= 0) {
            toRead.add("propComplejidadFrases = '" + propComplejidadFrases + "'");
        }
        if (percComplejidadFrases >= 0) {
            toRead.add("percComplejidadFrases = '" + percComplejidadFrases + "'");
        }

        if (!(fechaAplicacion.equals(""))) {
            toRead.add("fechaAplicacion = '" + fechaAplicacion + "'");
        }
        if (fkBebe > -1) {
            toRead.add("fkBebe = '" + fkBebe + "'");
        }

        String query1 = "SELECT * FROM babywizard.cdi182430 WHERE ";
        String query2 = "";
        for (int i = 0; i < toRead.size() - 1; i++) {
            query2 = query2 + toRead.get(i) + " AND ";
        }
        String query3 = "";
        if (toRead.size() > 0) {
            query3 = toRead.getLast() + ";";
        }
        Statement stmt = con.createStatement();
        ResultSet rs;
        if (toRead.size() > 0) {
            rs = stmt.executeQuery(query1 + query2 + query3);
        } else {
            rs = stmt.executeQuery("SELECT * FROM babywizard.cdi182430");
        }
        LinkedList<Cdi182430Modelo> cdis = new LinkedList<>();
        while (rs.next()) {
            Cdi182430Modelo cdi = new Cdi182430Modelo();
            cdi.setIdCdi182430(rs.getInt("idCdi182430"));
            cdi.setProduccion(rs.getInt("produccion"));
            cdi.setPropProduccion(rs.getFloat("propProduccion"));
            cdi.setPercProduccion(rs.getInt("percProduccion"));

            cdi.setP3lPalabras(rs.getFloat("p3lPalabras"));
            cdi.setPercP3lPalabras(rs.getInt("percP3lPalabras"));

            cdi.setComplejidadFrases(rs.getInt("complejidadFrases"));
            cdi.setPropComplejidadFrases(rs.getFloat("propComplejidadFrases"));
            cdi.setPercComplejidadFrases(rs.getInt("percComplejidadFrases"));

            cdi.setFechaAplicacion(rs.getString("fechaAplicacion"));
            cdis.add(cdi);
        }
        con.close();
        return cdis;
    }

    public void updateCdi182430(int idCdi182430Actualizar, int idCdi182430, int produccion, float propProduccion, int percProduccion, float p3lPalabras, int percP3lPalabras, int complejidadFrases, float propComplejidadFrases, int percComplejidadFrases, String fechaAplicacion, int fkBebe) throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        LinkedList<String> toUpdate = new LinkedList<>();

        if (idCdi182430 >= 0) {
            String idCdi182430Q = "`idCdi182430` = '" + idCdi182430 + "'";
            toUpdate.add(idCdi182430Q);
        }

        if (produccion >= 0) {
            String produccionQ = "`produccion` = '" + produccion + "'";
            toUpdate.add(produccionQ);
        }
        if (propProduccion >= 0) {
            String propProduccionQ = "`propProduccion` = '" + propProduccion + "'";
            toUpdate.add(propProduccionQ);
        }
        if (percProduccion >= 0) {
            String percProduccionQ = "`percProduccion` = '" + percProduccion + "'";
            toUpdate.add(percProduccionQ);
        }
        if (p3lPalabras >= 0) {
            String p3lPalabrasQ = "`p3lPalabras` = '" + p3lPalabras + "'";
            toUpdate.add(p3lPalabrasQ);
        }
        if (percP3lPalabras >= 0) {
            String percP3lPalabrasQ = "`percP3lPalabras` = '" + percP3lPalabras + "'";
            toUpdate.add(percP3lPalabrasQ);
        }
        if (complejidadFrases >= 0) {
            String complejidadFrasesQ = "`complejidadFrases` = '" + complejidadFrases + "'";
            toUpdate.add(complejidadFrasesQ);
        }
        if (propComplejidadFrases >= 0) {
            String propComplejidadFrasesQ = "`propComplejidadFrases` = '" + propComplejidadFrases + "'";
            toUpdate.add(propComplejidadFrasesQ);
        }
        if (percComplejidadFrases >= 0) {
            String percComplejidadFrasesQ = "`percComplejidadFrases` = '" + percComplejidadFrases + "'";
            toUpdate.add(percComplejidadFrasesQ);
        }
        if (!(fechaAplicacion.equals(""))) {
            String fechaAplicacionQ = "`fechaAplicacion` = '" + fechaAplicacion + "'";
            toUpdate.add(fechaAplicacionQ);
        }
        if (fkBebe >= 0) {
            String fkBebeQ = "`fkBebe` = '" + fkBebe + "'";
            toUpdate.add(fkBebeQ);
        }
        String query1 = "UPDATE `babywizard`.`cdi182430` SET ";
        String query2 = "";
        for (int i = 0; i < toUpdate.size() - 1; i++) {
            query2 = query2 + toUpdate.get(i) + ", ";
        }
        String query3 = toUpdate.getLast() + " WHERE (`idCdi182430` = '" + idCdi182430Actualizar + "');";
        Statement stmt = con.createStatement();
        //System.out.println(query1+query2+query3);
        if (toUpdate.size() > 0) {
            stmt.executeUpdate(query1 + query2 + query3);
        }
        con.close();
    }

    public void deleteCdi182430(int idCdi182430) throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        Statement stmt = con.createStatement();
        stmt.executeUpdate("DELETE FROM `babywizard`.`cdi182430` WHERE (`idCdi182430` = '" + idCdi182430 + "');");
        con.close();
    }
}
