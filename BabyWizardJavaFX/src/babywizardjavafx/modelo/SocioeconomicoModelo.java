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
    
    public void createSocioeconomico() throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        String query;
        query = "INSERT INTO `babywizard`.`socioeconomico` (`puntajeCrudo`, `nse`, `fkSociodemografico`) "
                + "VALUES ('"+this.getPuntajeCrudo()+"', '"+this.getNse()+"', '"+this.getFkSociodemografico()+"');";
        Statement stmt = con.createStatement();
        int executeUpdate = stmt.executeUpdate(query);
        con.close();
    }
    
    public LinkedList<SocioeconomicoModelo> readSocioeconomico(int idSocioeconomico, int puntajeCrudo, String nse, int fkSociodemografico) throws SQLException{
    JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        LinkedList<String> toRead = new LinkedList<>();
        if(idSocioeconomico>-1) toRead.add("idSocioeconomico = '"+idSocioeconomico+"'");
        if(!"".equals(nse)) toRead.add("nse = '"+nse+"'");
        if(puntajeCrudo>-1) toRead.add("puntajeCrudo = '"+puntajeCrudo+"'");
        if(fkSociodemografico>-1) toRead.add("fkSociodemografico = '"+fkSociodemografico+"'");
        
        String query1 = "SELECT * FROM babywizard.socioeconomico WHERE ";
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
        rs = stmt.executeQuery("SELECT * FROM babywizard.socioeconomico;");
        }
        LinkedList<SocioeconomicoModelo> sms = new LinkedList<>();
        while(rs.next()){
            SocioeconomicoModelo sm = new SocioeconomicoModelo();
            sm.setFkSociodemografico(rs.getInt("fkSociodemografico"));
            sm.setIdSocioeconomico(rs.getInt("idSocioeconomico"));
            sm.setNse(rs.getString("nse"));
            sm.setPuntajeCrudo(rs.getInt("puntajeCrudo"));
            sms.add(sm);
        }
        con.close();
        return sms;
    }
    
    public void updateSocioeconomico(int idSocioeconomicoActualizar, int idSocioeconomico, int puntajeCrudo, String nse, int fkSociodemografico) throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        LinkedList<String> toUpdate = new LinkedList<>();
        if (idSocioeconomico > -1) {
           String idSocioeconomicoQ = "`idSocioeconomico` = '"+idSocioeconomico+"'";
           toUpdate.add(idSocioeconomicoQ);
        }
        if (!"".equals(nse)) {
            String nseQ = "`nse` = '"+nse+"'";
            toUpdate.add(nseQ);
        }
        if (puntajeCrudo > -1) {
           String puntajeCrudoQ = "`puntajeCrudo` = '"+puntajeCrudo+"'";
           toUpdate.add(puntajeCrudoQ);
        }
        if (fkSociodemografico > -1) {
           String fkSociodemograficoQ = "`fkSociodemografico` = '"+fkSociodemografico+"'";
           toUpdate.add(fkSociodemograficoQ);
        }
        
        String query1 = "UPDATE `babywizard`.`socioeconomico` SET ";
        String query2 = "";
        for(int i = 0; i<toUpdate.size()-1;i++){
            query2 = query2+toUpdate.get(i)+", ";
        }
        String query3 = toUpdate.getLast()+" WHERE (`idSocioeconomico` = '"+idSocioeconomicoActualizar+"');";
        Statement stmt = con.createStatement();
        System.out.println(query1+query2+query3);
        if(toUpdate.size() > 0) stmt.executeUpdate(query1+query2+query3);
        con.close();
    }
    
    public void deleteSocioeconomico(int idSocioeconomico) throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        Statement stmt = con.createStatement();
        stmt.executeUpdate("DELETE FROM `babywizard`.`socioeconomico` WHERE (`idSocioeconomico` = '"+idSocioeconomico+"');");
        con.close();
    }
}


