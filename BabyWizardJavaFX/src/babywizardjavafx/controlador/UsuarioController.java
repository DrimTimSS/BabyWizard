/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx.controlador;

import babywizardjavafx.modelo.BebeModelo;
import babywizardjavafx.modelo.UsuarioModelo;
import java.net.URL;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Vicaris
 */
public class UsuarioController implements Initializable {

    @FXML
    private TableView<UsuarioModelo> tablaUsuarios; 
    @FXML
    private TableColumn<UsuarioModelo,Integer> idUsuario;
    @FXML
    private TableColumn<UsuarioModelo,Integer> administrador;
    @FXML
    private TableColumn<UsuarioModelo,String> nombreU;
    @FXML
    private TableColumn<UsuarioModelo,String> apellidoMaterno;
    @FXML
    private TableColumn<UsuarioModelo,String> apellidoPaterno;
    
    ObservableList<UsuarioModelo> listaUsuarios = FXCollections.observableArrayList();
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            UsuarioModelo um = new UsuarioModelo();
            LinkedList<UsuarioModelo> resultados = um.readUsuario(-1, "", "", "", -1);
            for(UsuarioModelo u:resultados) listaUsuarios.add(u);
            idUsuario.setCellValueFactory(new PropertyValueFactory<>("idUsuario"));
            nombreU.setCellValueFactory(new PropertyValueFactory<>("nombreU"));
            apellidoPaterno.setCellValueFactory(new PropertyValueFactory<>("apellidoPaternoU"));
            apellidoMaterno.setCellValueFactory(new PropertyValueFactory<>("apellidoMaternoU"));
            administrador.setCellValueFactory(new PropertyValueFactory<>("administrador"));
            tablaUsuarios.setItems(listaUsuarios);
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
    public void createUsuario(UsuarioModelo um) throws SQLException {
        um.createUsuario();
    }
    
    public LinkedList<UsuarioModelo> selectUsuario(int idUsuario, String nombreU, String apellidoMaternoU, String apellidoPaternoU, int administrador) throws SQLException{
        LinkedList<UsuarioModelo> usuarios = new LinkedList<>();
        UsuarioModelo um = new UsuarioModelo();
        usuarios = um.readUsuario(idUsuario, nombreU, apellidoMaternoU, apellidoPaternoU, administrador);
        return usuarios;
    }
    
    public void updateUsuario(int idUsuarioActualizar,int idUsuario, String nombreU, String apellidoMaternoU, String apellidoPaternoU, int administrador, String contrasenia) throws SQLException {
        UsuarioModelo um = new UsuarioModelo();
        um.updateUsuario(idUsuarioActualizar, idUsuario, nombreU, apellidoMaternoU, apellidoPaternoU, administrador, contrasenia);
    }
    
    public void deleteUsuario(int idUsuario) throws SQLException {
        UsuarioModelo um = new UsuarioModelo();
        um.deleteUsuario(idUsuario);
    }
}
