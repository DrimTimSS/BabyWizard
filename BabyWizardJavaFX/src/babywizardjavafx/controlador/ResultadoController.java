/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx.controlador;

import babywizardjavafx.modelo.BebeModelo;
import babywizardjavafx.modelo.CuidadorModelo;
import java.net.URL;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBoxTreeItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.CheckBoxTreeCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;

/**
 * FXML Controller class
 *
 * @author Vicaris
 */
public class ResultadoController implements Initializable {
    
    //Arbol para creacion de tablas
    private TreeView<String> tree;
    //Ids bebes que entran por la busqueda
    LinkedList<Integer> ids;
    
    //Tabla para bebes
    @FXML
    private TableView<BebeModelo> resultadosbebe;
    @FXML
    private TableColumn<BebeModelo, String> resid;
    @FXML
    private TableColumn<BebeModelo, String> resnombre;
    @FXML
    private TableColumn<BebeModelo, String> resapellidop;
    @FXML
    private TableColumn<BebeModelo, String> resapellidom;
    @FXML
    private TableColumn<BebeModelo, Integer> ressexo;
    @FXML
    private TableColumn<BebeModelo, String> resfechan;
    @FXML
    private TableColumn<BebeModelo, Integer> resmeses;
    @FXML
    private TableColumn<BebeModelo, Integer> resusuario;
    ObservableList<BebeModelo> listaBebes = FXCollections.observableArrayList();
    
    @FXML
    private GridPane grid;
    
    //Tabla para cuidador
    @FXML
    private TableView<CuidadorModelo> resultadoscuidador;
    @FXML
    private TableColumn<CuidadorModelo, Integer> residc;
    @FXML
    private TableColumn<CuidadorModelo, String> rescorreoc;
    @FXML
    private TableColumn<CuidadorModelo, String> resnombrec;
    @FXML
    private TableColumn<CuidadorModelo, String> resapellidopc;
    @FXML
    private TableColumn<CuidadorModelo, String> resapellidomc;
    @FXML
    private TableColumn<CuidadorModelo, String> resocupacion;
    @FXML
    private TableColumn<CuidadorModelo, String> restelefono1;
    @FXML
    private TableColumn<CuidadorModelo, String> restelefono2;
    @FXML
    private TableColumn<CuidadorModelo, String> resfechanc;
    @FXML
    private TableColumn<CuidadorModelo, Integer> resaniosestudio;
    @FXML
    private TableColumn<CuidadorModelo, Integer> residbebec;
    ObservableList<CuidadorModelo> listaCuidadores = FXCollections.observableArrayList();
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb){
        CheckBoxTreeItem root = new CheckBoxTreeItem<>("Todo");
        
        CheckBoxTreeItem infante = new CheckBoxTreeItem<>("Infante");
        CheckBoxTreeItem cuidador = new CheckBoxTreeItem<>("Cuidador");
        CheckBoxTreeItem sociodemografico = new CheckBoxTreeItem<>("Sociodemográfico");
        CheckBoxTreeItem socioeconomico = new CheckBoxTreeItem<>("Socioeconómico");
        CheckBoxTreeItem pruebas = new CheckBoxTreeItem<>("Pruebas");
        
        tree = new TreeView<>();
        root.getChildren().addAll(infante,cuidador,sociodemografico,socioeconomico,pruebas);
        tree.setRoot(root);
        root.setExpanded(true);
        
        tree.setCellFactory(CheckBoxTreeCell.<String>forTreeView());
        
        grid.getChildren().add(tree);
        
        resultadosbebe.setTableMenuButtonVisible(true);
        resultadoscuidador.setTableMenuButtonVisible(true);
        
        
    }    

    @FXML
    private void exportar(ActionEvent event) {
    }

    @FXML
    private void crearTablas(ActionEvent event) {
        //Infante
        try {
            BebeModelo bm = new BebeModelo();
            LinkedList<BebeModelo> resultados = new LinkedList<BebeModelo>();
            for(int i:ids){
            resultados.add(bm.readBebe(i, "", "", "", -1, "",-1,-1, "").getFirst());
            }
            for(BebeModelo b:resultados) listaBebes.add(b);
            resid.setCellValueFactory(new PropertyValueFactory<>("idBebe"));
            resnombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
            resapellidop.setCellValueFactory(new PropertyValueFactory<>("apellidoPaterno"));
            resapellidom.setCellValueFactory(new PropertyValueFactory<>("apellidoMaterno"));
            ressexo.setCellValueFactory(new PropertyValueFactory<>("sexo"));
            resfechan.setCellValueFactory(new PropertyValueFactory<>("fechaNacimiento"));
            resmeses.setCellValueFactory(new PropertyValueFactory<>("edad"));
            resusuario.setCellValueFactory(new PropertyValueFactory<>("fkUsuario"));
            resultadosbebe.setItems(listaBebes);
            //tablaBebes.getColumns().addAll(idBebe,nombre,apellidoPaterno,apellidoMaterno,sexo,fechaNacimiento,fkUsuario);
        } catch (SQLException ex) {
            Logger.getLogger(BorrarController.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Cuidador
        try {
            CuidadorModelo cm = new CuidadorModelo();
            LinkedList<CuidadorModelo> resultados = new LinkedList<CuidadorModelo>();
            for(int i:ids){
            resultados.add(cm.readCuidador(-1, "", "", "", "", "", "", "", "", -1, i).getFirst());
            }
            for(CuidadorModelo c:resultados) listaCuidadores.add(c);
            residc.setCellValueFactory(new PropertyValueFactory<>("idCuidador"));
            rescorreoc.setCellValueFactory(new PropertyValueFactory<>("correoElectronico"));
            resnombrec.setCellValueFactory(new PropertyValueFactory<>("nombreC"));
            resapellidopc.setCellValueFactory(new PropertyValueFactory<>("primerApellidoC"));
            resapellidomc.setCellValueFactory(new PropertyValueFactory<>("segundoApellidoC"));
            resocupacion.setCellValueFactory(new PropertyValueFactory<>("ocupacion"));
            resfechanc.setCellValueFactory(new PropertyValueFactory<>("fechaDeNacimiento"));
            restelefono1.setCellValueFactory(new PropertyValueFactory<>("primerTelefono"));
            restelefono2.setCellValueFactory(new PropertyValueFactory<>("segundoTelefono"));
            resaniosestudio.setCellValueFactory(new PropertyValueFactory<>("aniosEstudio"));
            residbebec.setCellValueFactory(new PropertyValueFactory<>("fkBebe"));
            resultadoscuidador.setItems(listaCuidadores);
            //tablaBebes.getColumns().addAll(idBebe,nombre,apellidoPaterno,apellidoMaterno,sexo,fechaNacimiento,fkUsuario);
        } catch (SQLException ex) {
            Logger.getLogger(BorrarController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void showInfante(ActionEvent event) {
        resultadosbebe.toFront();
    }

    @FXML
    private void showCuidador(ActionEvent event) {
        resultadoscuidador.toFront();
    }

    @FXML
    private void showSociode(ActionEvent event) {
    }

    @FXML
    private void showExpCab(ActionEvent event) {
    }

    @FXML
    private void showLectCab(ActionEvent event) {
    }

    @FXML
    private void showWppsi30(ActionEvent event) {
    }

    @FXML
    private void showWppsi48(ActionEvent event) {
    }
    
    public void meterIds(LinkedList<Integer> ids){
        this.ids = ids;
    }
    
}
