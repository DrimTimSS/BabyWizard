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
    int edad;
    String fkUsuario;

    //Contructores
    public BebeModelo() {
    }

    public BebeModelo(String nombre, String primerMaterno, String segundoPaterno, int sexo, String fechaNacimiento, String fkUsuario) {
        this.nombre = nombre;
        this.apellidoMaterno = primerMaterno;
        this.apellidoPaterno = segundoPaterno;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.fkUsuario = fkUsuario;
        edad = 0;
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

    public String getSexo() {
        return sexo==0?"M":"F";
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

    public String getFkUsuario() {
        return fkUsuario;
    }

    public void setFkUsuario(String fkUsuario) {
        this.fkUsuario = fkUsuario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //CRUD
    //Create
    public void createBebe() throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        String query;
        query = "INSERT INTO `babywizard`.`bebe` (`nombre`, `apellidoMaterno`, `apellidoPaterno`, `sexo`, `fechaNacimientoBb`, `fkUsuario`) "
                + "VALUES ('"+nombre.replace("'","''")+"', '"+apellidoMaterno.replace("'","''")+"', '"+apellidoPaterno.replace("'","''")+"', '"+sexo+"', '"+fechaNacimiento+"', '"+fkUsuario.replace("'","''")+"');";
        Statement stmt = con.createStatement();
        int executeUpdate = stmt.executeUpdate(query,Statement.RETURN_GENERATED_KEYS);
        
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()){
            idBebe=rs.getInt(1);
        }
        rs.close();
        con.close();
    }
    
    public LinkedList<BebeModelo> readBebePorIds(LinkedList<Integer> ids) throws SQLException {
        if(!(ids.size()>0)) return null;
        LinkedList<BebeModelo> bebes = new LinkedList<BebeModelo>();
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        String query;
        String abuscar = "(";
        int size = ids.size();
        for(int i = 0; i < size-1; i++) abuscar += ids.get(i)+",";
        abuscar+=ids.get(size-1)+")";
        //System.out.println(abuscar);
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        query = "select * FROM (SELECT *,TIMESTAMPDIFF(MONTH, fechaNacimientoBb,'"+dateFormat.format(date)+"') as meses FROM babywizard.bebe) as bebes where idBebe in "+abuscar+";";
        //System.out.print(con);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while(rs.next()){
            BebeModelo bm = new BebeModelo();
            bm.setIdBebe(rs.getInt("idBebe"));
            bm.setNombre(rs.getString("nombre"));
            bm.setApellidoMaterno(rs.getString("apellidoMaterno"));
            bm.setApellidoPaterno(rs.getString("apellidoPaterno"));
            bm.setSexo(rs.getInt("sexo"));
            bm.setFechaNacimiento(rs.getString("fechaNacimientoBb"));
            bm.setFkUsuario(rs.getString("fkUsuario"));
            bm.setEdad(rs.getInt("meses"));
            bebes.add(bm);
        }
        con.close();
        return bebes;
    }
    
    public LinkedList<BebeModelo> readBebe(int idBebe, String nombre, String apellidoMaterno, String apellidoPaterno, int sexo, String fechaNacimiento, int mesesmin, int mesesmax, String fkUsuario) throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        LinkedList<String> toRead = new LinkedList<>();
        if(idBebe>-1) toRead.add("idBebe = '"+idBebe+"'");
        if(!"".equals(nombre)) toRead.add("nombre = '"+nombre+"'");
        if(!"".equals(apellidoMaterno)) toRead.add("apellidoMaterno = '"+apellidoMaterno+"'");
        if(!"".equals(apellidoPaterno)) toRead.add("apellidoPaterno = '"+apellidoPaterno+"'");
        if(sexo == 0 || sexo == 1) toRead.add("sexo = '"+sexo+"'");
        if(!"".equals(fechaNacimiento)) toRead.add("fechaNacimientoBb = '"+fechaNacimiento+"'");
        if(!"".equals(fkUsuario)) toRead.add("fkUsuario = '"+fkUsuario+"'");
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        if(mesesmin>-1) toRead.add("meses >= '"+mesesmin+"'");
        if(mesesmax>-1 && mesesmax>=mesesmin) toRead.add("meses <= '"+mesesmax+"'");
        Date date = new Date();
        String query1 = "SELECT * FROM (SELECT *,TIMESTAMPDIFF(MONTH, fechaNacimientoBb,'"+dateFormat.format(date)+"') as meses FROM babywizard.bebe) as bebes WHERE ";
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
        rs = stmt.executeQuery("SELECT * FROM (SELECT *,TIMESTAMPDIFF(MONTH, fechaNacimientoBb,'"+dateFormat.format(date)+"') as meses FROM babywizard.bebe) as bebes");
        }
        LinkedList<BebeModelo> bebes = new LinkedList<>();
        while(rs.next()){
            BebeModelo bm = new BebeModelo();
            bm.setIdBebe(rs.getInt("idBebe"));
            bm.setNombre(rs.getString("nombre"));
            bm.setApellidoMaterno(rs.getString("apellidoMaterno"));
            bm.setApellidoPaterno(rs.getString("apellidoPaterno"));
            bm.setSexo(rs.getInt("sexo"));
            bm.setFechaNacimiento(rs.getString("fechaNacimientoBb"));
            bm.setFkUsuario(rs.getString("fkUsuario"));
            bm.setEdad(rs.getInt("meses"));
            bebes.add(bm);
        }
        con.close();
        return bebes;
    }
    
    public void updateBebe(int idBebeActualizar,int idBebe, String nombre, String apellidoMaterno, String apellidoPaterno, int sexo, String fechaNacimiento, String fkUsuario) throws SQLException {
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        LinkedList<String> toUpdate = new LinkedList<>();
        if (idBebe > -1) {
           String idBebeQ = "`idBebe` = '"+idBebe+"'";
           toUpdate.add(idBebeQ);
        }
        if (!"".equals(nombre)) {
            String nombreQ = "`nombre` = '"+nombre.replace("'","''")+"'";
            toUpdate.add(nombreQ);
        }
        if (!"".equals(apellidoMaterno)) {
            String apellidoMaternoQ = "`apellidoMaterno` = '"+apellidoMaterno.replace("'","''")+"'";
            toUpdate.add(apellidoMaternoQ);
        }
        if (!"".equals(apellidoPaterno)) {
            String apellidoPaternoQ = "`apellidoPaterno` = '"+apellidoPaterno.replace("'","''")+"'";
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
        if (!"".equals(fkUsuario)) {
            String fkUsuarioQ = "`fkUsuario` = '"+fkUsuario.replace("'","''")+"'";
            toUpdate.add(fkUsuarioQ);
        }
        String query1 = "UPDATE `babywizard`.`bebe` SET ";
        String query2 = "";
        for(int i = 0; i<toUpdate.size()-1;i++){
            query2 = query2+toUpdate.get(i)+", ";
        }
        String query3 = toUpdate.getLast()+" WHERE (`idBebe` = '"+idBebeActualizar+"');";
        Statement stmt = con.createStatement();
        //System.out.println(query1+query2+query3);
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
