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
    
    String usuario;
    String nombreU;
    String apellidoPaternoU;
    String apellidoMaternoU;
    String contrasenia;
    int administrador;

    public UsuarioModelo() {
    }

    public UsuarioModelo(String usuario, String nombreU, String apellidoPaternoU, String apellidoMaternoU, String contrasenia, int administrador) {
        this.usuario = usuario;
        this.nombreU = nombreU;
        this.apellidoPaternoU = apellidoPaternoU;
        this.apellidoMaternoU = apellidoMaternoU;
        this.contrasenia = contrasenia;
        this.administrador = administrador;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
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
        query = "INSERT INTO `babywizard`.`usuario` (`usuario`, `nombreU`, `apellidoMaternoU`, `apellidoPaternoU`, `contrasenia`, `administrador`) "
                + "VALUES ('"+usuario+"', '"+nombreU+"', '"+apellidoMaternoU+"', '"+apellidoPaternoU+"', AES_ENCRYPT('"+contrasenia+"','babywizard'), '"+administrador+"');";
        Statement stmt = con.createStatement();
        int executeUpdate = stmt.executeUpdate(query);
        con.close();
    }
    
    public LinkedList<UsuarioModelo> readUsuario(String usuario, String nombreU, String apellidoMaternoU, String apellidoPaternoU, int administrador) throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        LinkedList<String> toRead = new LinkedList<>();
        if(!"".equals(usuario)) toRead.add("usuario = BINARY '"+usuario+"'");
        if(!"".equals(nombreU)) toRead.add("nombreU = '"+nombreU+"'");
        if(!"".equals(apellidoMaternoU)) toRead.add("apellidoMaternoU = '"+apellidoMaternoU+"'");
        if(!"".equals(apellidoPaternoU)) toRead.add("apellidoPaternoU = '"+apellidoPaternoU+"'");
        if(administrador == 0 || administrador == 1) toRead.add("administrador = '"+administrador+"'");
        String query1 = "select usuario, cast(aes_decrypt(contrasenia,'babywizard') as char), administrador, nombreU, apellidoMaternoU, apellidoPaternoU from babywizard.usuario where ";
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
        rs = stmt.executeQuery("select usuario, cast(aes_decrypt(contrasenia,'babywizard') as char), administrador, nombreU, apellidoMaternoU, apellidoPaternoU from babywizard.usuario");
        }
        LinkedList<UsuarioModelo> usuarios = new LinkedList<>();
        while(rs.next()){
            UsuarioModelo um = new UsuarioModelo();
            um.setUsuario(rs.getString("usuario"));
            um.setNombreU(rs.getString("nombreU"));
            um.setApellidoMaternoU(rs.getString("apellidoMaternoU"));
            um.setApellidoPaternoU(rs.getString("apellidoPaternoU"));
            um.setAdministrador(rs.getInt("administrador"));
            um.setContrasenia(rs.getString(2));
            usuarios.add(um);
        }
        con.close();
        return usuarios;
    }
    
    public void updateUsuario(String usuarioActualizar,String usuario, String nombreU, String apellidoMaternoU, String apellidoPaternoU, int administrador, String contrasenia) throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        LinkedList<String> toUpdate = new LinkedList<>();
        if (!"".equals(usuario)) {
           String idUsuarioQ = "`usuario` = '"+usuario+"'";
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
        String query3 = toUpdate.getLast()+" WHERE (`usuario` = '"+usuarioActualizar+"');";
        Statement stmt = con.createStatement();
        //System.out.println(query1+query2+query3);
        if(toUpdate.size() > 0) stmt.executeUpdate(query1+query2+query3);
        con.close();
    }
    
    public void deleteUsuario(String usuario) throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        Statement stmt = con.createStatement();
        stmt.executeUpdate("DELETE FROM `babywizard`.`usuario` WHERE (`usuario` = '"+usuario+"');");
        con.close();
    }
}
