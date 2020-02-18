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
public class BebeModelo {
    
    //Atributos
    int idBebe;
    String nombre;
    String apellidoMaterno;
    String apellidoPaterno;
    int sexo;
    String fechaNacimiento;
    int fkUsuario;

    //Contructores
    public BebeModelo() {
    }

    public BebeModelo(String nombre, String primerMaterno, String segundoPaterno, int sexo, String fechaNacimiento, int fkUsuario) {
        this.nombre = nombre;
        this.apellidoMaterno = primerMaterno;
        this.apellidoPaterno = segundoPaterno;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.fkUsuario = fkUsuario;
    }
    
    //Getters and Setters
    public int getIdBebe() {
        return idBebe;
    }

    public void setIdBebe(int idBebe) {
        this.idBebe = idBebe;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getFkUsuario() {
        return fkUsuario;
    }

    public void setFkUsuario(int fkUsuario) {
        this.fkUsuario = fkUsuario;
    }
    
    //CRUD
    //Create
    public void createBebe() throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        String query;
        query = "INSERT INTO `babywizard`.`bebe` (`nombre`, `apellidoMaterno`, `apellidoPaterno`, `sexo`, `fechaNacimientoBb`, `fkUsuario`) "
                + "VALUES ('"+nombre+"', '"+apellidoMaterno+"', '"+apellidoPaterno+"', '"+sexo+"', '"+fechaNacimiento+"', '"+fkUsuario+"');";
        Statement stmt = con.createStatement();
        int executeUpdate = stmt.executeUpdate(query);
        con.close();
    }
    
    public LinkedList<BebeModelo> readBebe(int idBebe, String nombre, String apellidoMaterno, String apellidoPaterno, int sexo, String fechaNacimiento, int fkUsuario) throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        LinkedList<String> toRead = new LinkedList<>();
        if(idBebe>-1) toRead.add("idBebe = '"+idBebe+"'");
        if(!"".equals(nombre)) toRead.add("nombre = '"+nombre+"'");
        if(!"".equals(apellidoMaterno)) toRead.add("apellidoMaterno = '"+apellidoMaterno+"'");
        if(!"".equals(apellidoPaterno)) toRead.add("apellidoPaterno = '"+apellidoPaterno+"'");
        if(sexo == 0 || sexo == 1) toRead.add("sexo = '"+sexo+"'");
        if(!"".equals(fechaNacimiento)) toRead.add("fechaNacimientoBb = '"+fechaNacimiento+"'");
        if(fkUsuario>-1) toRead.add("fkUsuario = '"+fkUsuario+"'");
        String query1 = "SELECT * FROM babywizard.bebe WHERE ";
        String query2 = "";
        for(int i = 0; i<toRead.size()-1;i++){
            query2 = query2+toRead.get(i)+", ";
        }
        String query3 = toRead.getLast()+";";
        Statement stmt = con.createStatement();
        System.out.println(query1+query2+query3);
        ResultSet rs = stmt.executeQuery(query1+query2+query3);
        LinkedList<BebeModelo> bebes = new LinkedList<>();
        while(rs.next()){
            BebeModelo bm = new BebeModelo();
            bm.setIdBebe(rs.getInt("idBebe"));
            bm.setNombre(rs.getString("nombre"));
            bm.setApellidoMaterno(rs.getString("apellidoMaterno"));
            bm.setApellidoPaterno(rs.getString("apellidoPaterno"));
            bm.setSexo(rs.getInt("sexo"));
            bm.setFechaNacimiento(rs.getString("fechaNacimientoBb"));
            bm.setFkUsuario(rs.getInt("fkUsuario"));
            bebes.add(bm);
        }
        con.close();
        return bebes;
    }
    
    public void updateBebe(int idBebeActualizar,int idBebe, String nombre, String apellidoMaterno, String apellidoPaterno, int sexo, String fechaNacimiento, int fkUsuario) throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        LinkedList<String> toUpdate = new LinkedList<>();
        if (idBebe > -1) {
           String idBebeQ = "`idBebe` = '"+idBebe+"'";
           toUpdate.add(idBebeQ);
        }
        if (!"".equals(nombre)) {
            String nombreQ = "`nombre` = '"+nombre+"'";
            toUpdate.add(nombreQ);
        }
        if (!"".equals(apellidoMaterno)) {
            String apellidoMaternoQ = "`apellidoMaterno` = '"+apellidoMaterno+"'";
            toUpdate.add(apellidoMaternoQ);
        }
        if (!"".equals(apellidoPaterno)) {
            String apellidoPaternoQ = "`apellidoPaterno` = '"+apellidoPaterno+"'";
            toUpdate.add(apellidoPaternoQ);
        }
        if (sexo == 0 || sexo == 1) {
            String sexoQ = "`sexo` = '"+sexo+"'";
            toUpdate.add(sexoQ);
        }
        if (!"".equals(fechaNacimiento)) {
            String fechaNacimientoQ = "`fechaNacimientoBb` = '"+fechaNacimiento+"'";
            toUpdate.add(fechaNacimientoQ);
        }
        if (fkUsuario > -1) {
            String fkUsuarioQ = "`fkUsuario` = '"+fkUsuario+"'";
            toUpdate.add(fkUsuarioQ);
        }
        String query1 = "UPDATE `babywizard`.`bebe` SET ";
        String query2 = "";
        for(int i = 0; i<toUpdate.size()-1;i++){
            query2 = query2+toUpdate.get(i)+", ";
        }
        String query3 = toUpdate.getLast()+" WHERE (`idBebe` = '"+idBebeActualizar+"');";
        Statement stmt = con.createStatement();
        System.out.println(query1+query2+query3);
        if(toUpdate.size() > 0) stmt.executeUpdate(query1+query2+query3);
        con.close();
    }
    
    public void deleteBebe(int idBebe) throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        Statement stmt = con.createStatement();
        stmt.executeUpdate("DELETE FROM `babywizard`.`bebe` WHERE (`idBebe` = '"+idBebe+"');");
        con.close();
    }
}
