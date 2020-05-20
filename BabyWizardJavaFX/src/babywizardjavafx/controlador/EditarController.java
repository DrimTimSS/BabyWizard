/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx.controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author valdo
 */
public class EditarController implements Initializable {

    @FXML
    private TextField idbebebusqueda;
    @FXML
    private TextField nombrebusqueda;
    @FXML
    private TextField apellidopbusqueda;
    @FXML
    private TextField apellidombusqueda;
    @FXML
    private TextField edadbusquedamin;
    @FXML
    private TextField edadbusquedamax;
    @FXML
    private RadioButton mbusqueda;
    @FXML
    private ToggleGroup sexotoggle;
    @FXML
    private RadioButton fbusqueda;
    @FXML
    private Button buscarbebes;
    @FXML
    private TableView<?> tablabebes;
    @FXML
    private TableColumn<?, ?> idBebe;
    @FXML
    private TableColumn<?, ?> nombre;
    @FXML
    private TableColumn<?, ?> apellidoPaterno;
    @FXML
    private TableColumn<?, ?> apellidoMaterno;
    @FXML
    private TableColumn<?, ?> meses;
    @FXML
    private TableColumn<?, ?> fechaNacimiento;
    @FXML
    private TableColumn<?, ?> sexo;
    @FXML
    private TableColumn<?, ?> fkUsuario;
    @FXML
    private RadioButton w303642;
    @FXML
    private ToggleGroup pruebas;
    @FXML
    private RadioButton w48;
    @FXML
    private RadioButton expcab;
    @FXML
    private RadioButton lectconj;
    @FXML
    private RadioButton cuidador;
    @FXML
    private ToggleGroup pruebas1;
    @FXML
    private RadioButton sociodem;
    @FXML
    private ToggleGroup pruebas11;
    @FXML
    private RadioButton socioeco;
    @FXML
    private ToggleGroup pruebas111;
    @FXML
    private RadioButton infante;
    @FXML
    private ToggleGroup pruebas1111;
    @FXML
    private Label idbebeprueba;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void buscarbebes(ActionEvent event) {
    }

    @FXML
    private void irAPrueba(ActionEvent event) {
    }
    
}
