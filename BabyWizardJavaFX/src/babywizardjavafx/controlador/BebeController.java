/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx.controlador;

import babywizardjavafx.modelo.BebeModelo;
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
public class BebeController implements Initializable {

    @FXML
    private TableView<BebeModelo> tablaBebes;
    @FXML
    private TableColumn<BebeModelo, Integer> idBebe;
    @FXML
    private TableColumn<BebeModelo, String> nombre;
    @FXML
    private TableColumn<BebeModelo, String> apellidoPaterno;
    @FXML
    private TableColumn<BebeModelo, String> apellidoMaterno;
    @FXML
    private TableColumn<BebeModelo, Integer> sexo;
    @FXML
    private TableColumn<BebeModelo, String> fechaNacimiento;
    @FXML
    private TableColumn<BebeModelo, Integer> fkUsuario;
    
    ObservableList<BebeModelo> listaBebes = FXCollections.observableArrayList();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            BebeModelo bm = new BebeModelo();
            LinkedList<BebeModelo> resultados = bm.readBebe(-1, "", "", "", -1, "", -1);
            for(BebeModelo b:resultados) listaBebes.add(b);
            idBebe.setCellValueFactory(new PropertyValueFactory<>("idBebe"));
            nombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
            apellidoPaterno.setCellValueFactory(new PropertyValueFactory<>("apellidoPaterno"));
            apellidoMaterno.setCellValueFactory(new PropertyValueFactory<>("apellidoMaterno"));
            sexo.setCellValueFactory(new PropertyValueFactory<>("sexo"));
            fechaNacimiento.setCellValueFactory(new PropertyValueFactory<>("fechaNacimiento"));
            fkUsuario.setCellValueFactory(new PropertyValueFactory<>("fkUsuario"));
            tablaBebes.setItems(listaBebes);
            //tablaBebes.getColumns().addAll(idBebe,nombre,apellidoPaterno,apellidoMaterno,sexo,fechaNacimiento,fkUsuario);
        } catch (SQLException ex) {
            Logger.getLogger(BebeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
    public void insertBebe(BebeModelo bm) throws SQLException{
        //BebeModelo b = new BebeModelo("BebeEjemplo","ApellidoEjemplo","ApellidoDos",0,"2020-01-02",1);
        bm.createBebe();
    }
    
    public LinkedList<BebeModelo> selectBebe(int idBebe, String nombre, String apellidoMaterno, String apellidoPaterno, int sexo, String fechaNacimiento, int fkUsuario) throws SQLException{
        LinkedList<BebeModelo> bebes = new LinkedList<>();
        BebeModelo bm = new BebeModelo();
        bebes = bm.readBebe(idBebe, nombre, apellidoMaterno, apellidoPaterno, sexo, fechaNacimiento, fkUsuario);
        return bebes;
    }
    
    public void updateBebe(int idBebeActualizar,int idBebe, String nombre, String apellidoMaterno, String apellidoPaterno, int sexo, String fechaNacimiento, int fkUsuario) throws SQLException {
        BebeModelo bm = new BebeModelo();
        bm.updateBebe(idBebeActualizar, idBebe, nombre, apellidoMaterno, apellidoPaterno, sexo, fechaNacimiento, fkUsuario);
    }
    
    public void deleteBebe(int idBebe) throws SQLException {
        BebeModelo bm = new BebeModelo();
        bm.deleteBebe(idBebe);
    }
}
