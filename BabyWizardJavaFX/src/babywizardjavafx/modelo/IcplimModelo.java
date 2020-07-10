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
public class IcplimModelo {

    int idIcplim;
    int c;
    float propC;
    int cYd;
    float propCyD;
    int total;
    float propTotal;
    String fechaAplicacion;
    int fkBebe;

    public IcplimModelo(int c, float propC, int cYd, float propCyD, int total, float propTotal, String fechaAplicacion, int fkBebe) {
        this.c = c;
        this.propC = propC;
        this.cYd = cYd;
        this.propCyD = propCyD;
        this.total = total;
        this.propTotal = propTotal;
        this.fechaAplicacion = fechaAplicacion;
        this.fkBebe = fkBebe;
    }

    public IcplimModelo() {

    }

    public int getIdIcplim() {
        return idIcplim;
    }

    public void setIdIcplim(int idIcplim) {
        this.idIcplim = idIcplim;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public float getPropC() {
        return propC;
    }

    public void setPropC(float propC) {
        this.propC = propC;
    }

    public int getCYd() {
        return cYd;
    }

    public void setCYd(int cYd) {
        this.cYd = cYd;
    }

    public float getPropCyD() {
        return propCyD;
    }

    public void setPropCyD(float propCyD) {
        this.propCyD = propCyD;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public float getPropTotal() {
        return propTotal;
    }

    public void setPropTotal(float propTotal) {
        this.propTotal = propTotal;
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
    public void createIcplimModelo() throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        String query;
        query = "INSERT INTO `babywizard`.`icplim` (`C`, `propC`, `CyD`, `propCyD`, `total`, `propTotal`, `fechaAplicacion`, `fkBebe`) "
                + "VALUES ('" + this.getC() + "', '" + this.getPropC() + "', '" + this.getCYd() + "', '" + this.getPropCyD() + "', '" + this.getTotal() + "', '" + this.getPropTotal() + "', '" + this.getFechaAplicacion() + "', '" + this.getFkBebe() + "');";
        Statement stmt = con.createStatement();
        int executeUpdate = stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);

        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()) {
            idIcplim = rs.getInt(1);
        }
        rs.close();
        con.close();
    }

    public LinkedList<IcplimModelo> readIcplimPorIds(LinkedList<Integer> ids) throws SQLException {
        LinkedList<IcplimModelo> icplims = new LinkedList<IcplimModelo>();
        if (!(ids.size() > 0)) {
            return icplims;
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
        query = "select * FROM babywizard.icplim where fkbebe in " + abuscar + ";";
        //System.out.print(con);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            IcplimModelo icplim = new IcplimModelo();
            icplim.setIdIcplim(rs.getInt("idIcplim"));
            icplim.setC(rs.getInt("C"));
            icplim.setPropC(rs.getFloat("propC"));

            icplim.setCYd(rs.getInt("CyD"));
            icplim.setPropCyD(rs.getFloat("propCyD"));

            icplim.setTotal(rs.getInt("total"));
            icplim.setPropTotal(rs.getFloat("propTotal"));

            icplim.setFechaAplicacion(rs.getString("fechaAplicacion"));
            icplims.add(icplim);
        }
        con.close();
        return icplims;
    }

    public LinkedList<IcplimModelo> readIcplim(int idIcplim, int c, float propC, int cYd, float propCyD, int total, float propTotal, String fechaAplicacion, int fkBebe) throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        LinkedList<String> toRead = new LinkedList<>();

        if (idIcplim >= 0) {
            toRead.add("idIcplim = '" + idIcplim + "'");
        }
        if (c >= 0) {
            toRead.add("C = '" + c + "'");
        }
        if (propC >= 0) {
            toRead.add("propC = '" + propC + "'");
        }
        if (cYd >= 0) {
            toRead.add("CyD = '" + cYd + "'");
        }
        if (propCyD >= 0) {
            toRead.add("propCyD = '" + propCyD + "'");
        }
        if (total >= 0) {
            toRead.add("total = '" + total + "'");
        }
        if (propTotal >= 0) {
            toRead.add("propTotal = '" + propTotal + "'");
        }
        if (!(fechaAplicacion.equals(""))) {
            toRead.add("fechaAplicacion = '" + fechaAplicacion + "'");
        }
        if (fkBebe >= 0) {
            toRead.add("fkBebe = '" + fkBebe + "'");
        }

        String query1 = "SELECT * FROM babywizard.icplim WHERE ";
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
            rs = stmt.executeQuery("SELECT * FROM babywizard.icplim");
        }
        LinkedList<IcplimModelo> icplims = new LinkedList<>();
        while (rs.next()) {
            IcplimModelo icplim = new IcplimModelo();
            icplim.setIdIcplim(rs.getInt("idIcplim"));
            icplim.setC(rs.getInt("C"));
            icplim.setPropC(rs.getFloat("propC"));

            icplim.setCYd(rs.getInt("CyD"));
            icplim.setPropCyD(rs.getFloat("propCyD"));

            icplim.setTotal(rs.getInt("total"));
            icplim.setPropTotal(rs.getFloat("propTotal"));

            icplim.setFechaAplicacion(rs.getString("fechaAplicacion"));
            icplims.add(icplim);
        }
        con.close();
        return icplims;
    }

    public void updateIcplim(int idIcplimActualizar, int idIcplim, int c, float propC, int cYd, float propCyD, int total, float propTotal, String fechaAplicacion, int fkBebe) throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        LinkedList<String> toUpdate = new LinkedList<>();

        if (idIcplim >= 0) {
            String idIcplimQ = "`idIcplim` = '" + idIcplim + "'";
            toUpdate.add(idIcplimQ);
        }

        if (c >= 0) {
            String cQ = "`C` = '" + c + "'";
            toUpdate.add(cQ);
        }
        if (propC >= 0) {
            String propCQ = "`propC` = '" + propC + "'";
            toUpdate.add(propCQ);
        }
        if (cYd >= 0) {
            String cYdQ = "`CyD` = '" + cYd + "'";
            toUpdate.add(cYdQ);
        }
        if (propCyD >= 0) {
            String propCyDQ = "`propCyD` = '" + propCyD + "'";
            toUpdate.add(propCyDQ);
        }
        if (total >= 0) {
            String totalQ = "`total` = '" + total + "'";
            toUpdate.add(totalQ);
        }
        if (propTotal >= 0) {
            String propTotalQ = "`propTotal` = '" + propTotal + "'";
            toUpdate.add(propTotalQ);
        }
        if (!(fechaAplicacion.equals(""))) {
            String fechaAplicacionQ = "`fechaAplicacion` = '" + fechaAplicacion + "'";
            toUpdate.add(fechaAplicacionQ);
        }
        if (fkBebe >= 0) {
            String fkBebeQ = "`fkBebe` = '" + fkBebe + "'";
            toUpdate.add(fkBebeQ);
        }
        String query1 = "UPDATE `babywizard`.`icplim` SET ";
        String query2 = "";
        for (int i = 0; i < toUpdate.size() - 1; i++) {
            query2 = query2 + toUpdate.get(i) + ", ";
        }
        String query3 = toUpdate.getLast() + " WHERE (`idIcplim` = '" + idIcplimActualizar + "');";
        Statement stmt = con.createStatement();
        //System.out.println(query1+query2+query3);
        if (toUpdate.size() > 0) {
            stmt.executeUpdate(query1 + query2 + query3);
        }
        con.close();
    }

    public void deleteIcplim(int idIcplim) throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        Statement stmt = con.createStatement();
        stmt.executeUpdate("DELETE FROM `babywizard`.`icplim` WHERE (`idIcplim` = '" + idIcplim + "');");
        con.close();
    }
}
