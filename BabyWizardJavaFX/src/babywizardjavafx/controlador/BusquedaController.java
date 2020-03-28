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
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author Vicaris
 */
public class BusquedaController implements Initializable {

    @FXML
    private ToggleGroup gestacion;
    @FXML
    private TextField idbebebusqueda;
    @FXML
    private TextField nombrebusqueda;
    @FXML
    private TextField apellidopbusqueda;
    @FXML
    private TextField apellidombusqueda;
    @FXML
    private RadioButton mbusqueda;
    @FXML
    private ToggleGroup sexotoggle;
    @FXML
    private RadioButton fbusqueda;
    @FXML
    private Button buscarbebes;
    @FXML
    private TextField edadbusquedamin;
    @FXML
    private TextField edadbusquedamax;
    @FXML
    private TextField pesobusqueda;
    @FXML
    private RadioButton prematurobusqueda;
    @FXML
    private RadioButton aterminobusqueda;
    @FXML
    private CheckBox palnacerbusqueda;
    @FXML
    private CheckBox pdesaludbusqueda;
    @FXML
    private CheckBox pdeaudicionbusqueda;
    @FXML
    private CheckBox pdevisionbusqueda;
    @FXML
    private CheckBox otroidiomabusqueda;
    @FXML
    private TextField adultosbusqueda;
    @FXML
    private ComboBox<?> cuidadorbusqueda;
    @FXML
    private CheckBox guarderiabusqueda;
    @FXML
    private CheckBox preescolarbusqueda;
    @FXML
    private TextField hermanosbusqueda;
    @FXML
    private TextField lugarbusqueda;
    @FXML
    private TextField niniosbusqueda;
    @FXML
    private TextField gtiempobusqueda;
    @FXML
    private TextField ptiempobusqueda;
    @FXML
    private TextField gasistenciabusqueda;
    @FXML
    private TextField pasistenciabusqueda;
    @FXML
    private ComboBox<?> apgar1busqueda;
    @FXML
    private ComboBox<?> apgar2busqueda;
    @FXML
    private Button buscarsociodemografico;
    @FXML
    private TextField pcbusqueda;
    @FXML
    private TextField nsebusqueda;
    @FXML
    private Button buscarsocioeconomico;
    @FXML
    private TextField usuariobusqueda;
    @FXML
    private Button buscarporusuario;

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
    
}
