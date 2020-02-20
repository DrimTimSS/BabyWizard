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
public class UsuarioModelo {
    
    int idUsuario;
    String nombreU;
    String apellidoPaternoU;
    String apellidoMaternoU;
    String contrasenia;
    int administrador;

    public UsuarioModelo() {
    }

    public UsuarioModelo(String nombreU, String apellidoPaternoU, String apellidoMaternoU, String contrasenia, int administrador) {
        this.nombreU = nombreU;
        this.apellidoPaternoU = apellidoPaternoU;
        this.apellidoMaternoU = apellidoMaternoU;
        this.contrasenia = contrasenia;
        this.administrador = administrador;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreU() {
        return nombreU;
    }

    public void setNombreU(String nombreU) {
        this.nombreU = nombreU;
    }

    public String getApellidoPaternoU() {
        return apellidoPaternoU;
    }

    public void setApellidoPaternoU(String apellidoPaternoU) {
        this.apellidoPaternoU = apellidoPaternoU;
    }

    public String getApellidoMaternoU() {
        return apellidoMaternoU;
    }

    public void setApellidoMaternoU(String apellidoMaternoU) {
        this.apellidoMaternoU = apellidoMaternoU;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getAdministrador() {
        return administrador;
    }

    public void setAdministrador(int administrador) {
        this.administrador = administrador;
    }
    
    //CRUD
    //Create
    public void createUsuario() throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        String query;
        query = "INSERT INTO `babywizard`.`usuario` (`nombreU`, `apellidoMaternoU`, `apellidoPaternoU`, `contrasenia`, `administrador`) "
                + "VALUES ('"+nombreU+"', '"+apellidoMaternoU+"', '"+apellidoPaternoU+"', AES_ENCRYPT('"+contrasenia+"','babywizard'), '"+administrador+"');";
        Statement stmt = con.createStatement();
        int executeUpdate = stmt.executeUpdate(query);
        con.close();
    }
    
    public LinkedList<UsuarioModelo> readUsuario(int idUsuario, String nombreU, String apellidoMaternoU, String apellidoPaternoU, int administrador) throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        LinkedList<String> toRead = new LinkedList<>();
        if(idUsuario>-1) toRead.add("idUsuario = '"+idUsuario+"'");
        if(!"".equals(nombreU)) toRead.add("nombreU = '"+nombreU+"'");
        if(!"".equals(apellidoMaternoU)) toRead.add("apellidoMaternoU = '"+apellidoMaternoU+"'");
        if(!"".equals(apellidoPaternoU)) toRead.add("apellidoPaternoU = '"+apellidoPaternoU+"'");
        if(administrador == 0 || administrador == 1) toRead.add("administrador = '"+administrador+"'");
        String query1 = "SELECT * FROM babywizard.usuario WHERE ";
        String query2 = "";
        for(int i = 0; i<toRead.size()-1;i++){
            query2 = query2+toRead.get(i)+", ";
        }
        String query3 = toRead.getLast()+";";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query1+query2+query3);
        LinkedList<UsuarioModelo> usuarios = new LinkedList<>();
        while(rs.next()){
            UsuarioModelo um = new UsuarioModelo();
            um.setIdUsuario(rs.getInt("idUsuario"));
            um.setNombreU(rs.getString("nombreU"));
            um.setApellidoMaternoU(rs.getString("apellidoMaternoU"));
            um.setApellidoPaternoU(rs.getString("apellidoPaternoU"));
            um.setAdministrador(rs.getInt("administrador"));
            um.setContrasenia(rs.getString("contrasenia"));
            usuarios.add(um);
        }
        con.close();
        return usuarios;
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
