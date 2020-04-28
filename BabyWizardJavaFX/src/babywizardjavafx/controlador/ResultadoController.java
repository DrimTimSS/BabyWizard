/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx.controlador;

import babywizardjavafx.modelo.BebeModelo;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBoxTreeItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.CheckBoxTreeCell;
import javafx.scene.layout.GridPane;

/**
 * FXML Controller class
 *
 * @author Vicaris
 */
public class ResultadoController implements Initializable {

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
    
    private TreeView<String> tree;
    @FXML
    private GridPane grid;
    
    @FXML
    private TableView<?> resultadoscuidador;
    @FXML
    private TableColumn<?, ?> residc;
    @FXML
    private TableColumn<?, ?> rescorreoc;
    @FXML
    private TableColumn<?, ?> resnombrec;
    @FXML
    private TableColumn<?, ?> resapellidopc;
    @FXML
    private TableColumn<?, ?> resapellidomc;
    @FXML
    private TableColumn<?, ?> resocupacion;
    @FXML
    private TableColumn<?, ?> restelefono1;
    @FXML
    private TableColumn<?, ?> restelefono2;
    @FXML
    private TableColumn<?, ?> resfechanc;
    @FXML
    private TableColumn<?, ?> resid111;

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
    
}
