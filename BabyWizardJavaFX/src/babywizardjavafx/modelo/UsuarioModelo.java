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
    
    public void updateUsuario(int idUsuarioActualizar,int idUsuario, String nombreU, String apellidoMaternoU, String apellidoPaternoU, int administrador, String contrasenia) throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        LinkedList<String> toUpdate = new LinkedList<>();
        if (idUsuario > -1) {
           String idUsuarioQ = "`idUsuario` = '"+idUsuario+"'";
           toUpdate.add(idUsuarioQ);
        }
        if (!"".equals(nombreU)) {
            String nombreUQ = "`nombreU` = '"+nombreU+"'";
            toUpdate.add(nombreUQ);
        }
        if (!"".equals(apellidoMaternoU)) {
            String apellidoMaternoUQ = "`apellidoMaternoU` = '"+apellidoMaternoU+"'";
            toUpdate.add(apellidoMaternoUQ);
        }
        if (!"".equals(apellidoPaternoU)) {
            String apellidoPaternoUQ = "`apellidoPaternoU` = '"+apellidoPaternoU+"'";
            toUpdate.add(apellidoPaternoUQ);
        }
        if (administrador == 0 || administrador == 1) {
            String administradorQ = "`administrador` = '"+administrador+"'";
            toUpdate.add(administradorQ);
        }
        if (!"".equals(contrasenia)) {
            String contraseniaQ = "`contrasenia` = AES_ENCRYPT('"+contrasenia+"','babywizard')";
            toUpdate.add(contraseniaQ);
        }
        String query1 = "UPDATE `babywizard`.`usuario` SET ";
        String query2 = "";
        for(int i = 0; i<toUpdate.size()-1;i++){
            query2 = query2+toUpdate.get(i)+", ";
        }
        String query3 = toUpdate.getLast()+" WHERE (`idUsuario` = '"+idUsuarioActualizar+"');";
        Statement stmt = con.createStatement();
        System.out.println(query1+query2+query3);
        if(toUpdate.size() > 0) stmt.executeUpdate(query1+query2+query3);
        con.close();
    }
    
    public void deleteUsuario(int idUsuario) throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        Statement stmt = con.createStatement();
        stmt.executeUpdate("DELETE FROM `babywizard`.`usuario` WHERE (`idUsuario` = '"+idUsuario+"');");
        con.close();
    }
}
