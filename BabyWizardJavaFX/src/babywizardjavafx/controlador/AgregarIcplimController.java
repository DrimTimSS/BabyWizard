/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx.controlador;

import babywizardjavafx.modelo.IcplimModelo;
import com.mysql.cj.util.StringUtils;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Valdovinos
 */
public class AgregarIcplimController implements Initializable {

    @FXML
    private TextField c;
    @FXML
    private TextField propc;
    @FXML
    private TextField cyd;
    @FXML
    private TextField propcyd;
    @FXML
    private TextField total;
    @FXML
    private TextField proptotal;
    @FXML
    private Button agregar;
    @FXML
    private Label label;
    @FXML
    private DatePicker fechaAplicacion;
    @FXML
    private Label titulo1;
    
    private int idbebe;
    private boolean editable;
    private int idBebeActualizar;
    private IcplimModelo icplimAEditar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        editable = false;
    }    

    @FXML
    private void agregar(ActionEvent event) {
        String fechan = "";
        if(!(isEmpty(c) || isEmpty(propc) || isEmpty(cyd) || isEmpty(propcyd) || isEmpty(total) || isEmpty(proptotal) || fechaAplicacion.getValue()==null)){
            try{
                fechan = fechaAplicacion.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                if(!editable){
                    System.out.println("oa k show");
                    IcplimModelo im = new IcplimModelo(Integer.parseInt(c.getText()), Float.parseFloat(propc.getText()), Integer.parseInt(cyd.getText()), Float.parseFloat(propcyd.getText()), Integer.parseInt(total.getText()), Float.parseFloat(proptotal.getText()), fechan, idbebe);
                    im.createIcplimModelo();
                    alertInformation("Éxito","","Icplim agregado de forma exitosa.");
                } else{
                    icplimAEditar.updateIcplim(icplimAEditar.getIdIcplim(), -1, Integer.parseInt(c.getText()), Float.parseFloat(propc.getText()), Integer.parseInt(cyd.getText()), Float.parseFloat(propcyd.getText()), Integer.parseInt(total.getText()), Float.parseFloat(proptotal.getText()), fechan, -1);
                    alertInformation("Éxito","","Icplim editado de forma exitosa.");
                }
            } catch(Exception e){
                return;
            }
        }
    }
    
    
    void setCampos() {
        try {
            fechaAplicacion.setValue(LocalDate.parse(icplimAEditar.getFechaAplicacion(), DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        } catch (Exception e) {
        
        }
        c.setText(icplimAEditar.getC()+"");
        propc.setText(icplimAEditar.getPropC()+"");
        cyd.setText(icplimAEditar.getCYd()+"");
        propcyd.setText(icplimAEditar.getPropCyD()+"");
        total.setText(icplimAEditar.getTotal()+"");
        proptotal.setText(icplimAEditar.getTotal()+"");
    }
    
    public boolean isEmpty(TextField textfield) {
        return StringUtils.isEmptyOrWhitespaceOnly(textfield.getText());
    }

    public void inicializarBebe(int idbebe){
        this.idbebe = idbebe;
    }
        
    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    public void setIdBebeActualizar(int idBebeActualizar) {
        this.idBebeActualizar = idBebeActualizar;
    }
    
    void setIcplimAEditar(IcplimModelo icplimm) {
        this.icplimAEditar = icplimm;
    }
    
    private void alertInformation(String titulo, String header, String contenido) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.initOwner(this.c.getParent().getScene().getWindow());
        alert.getDialogPane().getStylesheets().add("/babywizardjavafx/vista/EstiloGeneral.css");
        alert.setTitle(titulo);
        if (header.equals("")) {
            alert.setHeaderText(null);
        } else {
            alert.setHeaderText(header);
        }
        alert.setContentText(contenido);
        alert.showAndWait();
    }

    
}
