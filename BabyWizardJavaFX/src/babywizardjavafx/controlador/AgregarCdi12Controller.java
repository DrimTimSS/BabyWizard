/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx.controlador;

import babywizardjavafx.modelo.Cdi12Modelo;
import com.mysql.cj.util.StringUtils;
import java.net.URL;
import java.sql.SQLException;
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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author victo
 */
public class AgregarCdi12Controller implements Initializable {

    @FXML
    private TextField cmp;
    @FXML
    private TextField propcmp;
    @FXML
    private TextField perccmp;
    @FXML
    private TextField prod;
    @FXML
    private TextField propprod;
    @FXML
    private TextField percprod;
    @FXML
    private TextField gt;
    @FXML
    private TextField propgt;
    @FXML
    private TextField percgt;
    @FXML
    private TextField pf;
    @FXML
    private TextField proppf;
    @FXML
    private TextField percpf;
    @FXML
    private TextField gta;
    @FXML
    private TextField propgta;
    @FXML
    private TextField percgta;
    @FXML
    private TextField gtot;
    @FXML
    private TextField propgtot;
    @FXML
    private TextField percgtot;
    @FXML
    private Button agregar;
    @FXML
    private Label titulo;
    @FXML
    private Label label;
    @FXML
    private DatePicker fechaAplicacion;

    private int idbebe;
    private boolean editable;
    private int idBebeActualizar;
    private Cdi12Modelo cdimactualizar;
    Alertas alerta;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        editable = false;
    }

    @FXML
    private void agregar(ActionEvent event) throws SQLException {
        String fechan = "";
        boolean c = true;
        alerta = new Alertas(titulo.getParent().getScene().getWindow());
        if (isEmpty(cmp) || isEmpty(propcmp) || isEmpty(perccmp) || isEmpty(prod) || isEmpty(propprod) || isEmpty(percprod) || isEmpty(gt) || isEmpty(propgt) || isEmpty(percgt) || isEmpty(pf) || isEmpty(proppf) || isEmpty(percpf) || isEmpty(gta) || isEmpty(propgta) || isEmpty(percgta) || isEmpty(gtot) || isEmpty(propgtot) || isEmpty(percgtot) || fechaAplicacion.getValue() == null) {
            c = alerta.confirmation();
        }
        
        if (!c) return;
        int prfr = (isEmpty(pf)) ? -1 : Integer.parseInt(pf.getText());
        float prfrprop = (isEmpty(proppf)) ? -1 : Float.parseFloat(proppf.getText());
        int prfrperc = (isEmpty(percpf)) ? -1 : Integer.parseInt(percpf.getText());
        int comp = (isEmpty(cmp)) ? -1 : Integer.parseInt(cmp.getText());
        float compprop = (isEmpty(propcmp)) ? -1 : Float.parseFloat(propcmp.getText());
        int compperc = (isEmpty(perccmp)) ? -1 : Integer.parseInt(perccmp.getText());
        int produ = (isEmpty(prod)) ? -1 : Integer.parseInt(prod.getText());
        float produprop = (isEmpty(propprod)) ? -1 : Float.parseFloat(propprod.getText());
        int produperc = (isEmpty(percprod)) ? -1 : Integer.parseInt(percprod.getText());
        int gesttot = (isEmpty(gtot)) ? -1 : Integer.parseInt(gtot.getText());
        float gesttotprop = (isEmpty(propgtot)) ? -1 : Float.parseFloat(propgtot.getText());
        int gesttotperc = (isEmpty(percgtot)) ? -1 : Integer.parseInt(percgtot.getText());
        int gtemp = (isEmpty(gt)) ? -1 : Integer.parseInt(gt.getText());
        float gtempprop = (isEmpty(propgt)) ? -1 : Float.parseFloat(propgt.getText());
        int gtempperc = (isEmpty(percgt)) ? -1 : Integer.parseInt(percgt.getText());
        int gtard = (isEmpty(gta)) ? -1 : Integer.parseInt(gta.getText());
        float gtardprop = (isEmpty(propgta)) ? -1 : Float.parseFloat(propgta.getText());
        int gtardperc = (isEmpty(percgta)) ? -1 : Integer.parseInt(percgta.getText());
        
        try {

            if (!editable) {
                fechan = fechaAplicacion.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                Cdi12Modelo cdim = new Cdi12Modelo(prfr,prfrprop ,prfrperc,comp,compprop,compperc,produ,produprop,produperc,gesttot,gesttotprop,gesttotperc,gtemp,gtempprop,gtempperc,gtard,gtardprop,gtardperc, fechan, idbebe);
                cdim.createCdi12();
                alerta.alertInformation("Éxito", "", "CDI 12 agregado de forma exitosa.");
            } else {
                fechan = fechaAplicacion.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                cdimactualizar.updateCdi12(cdimactualizar.getIdCdi12(), -1, prfr,prfrprop ,prfrperc,comp,compprop,compperc,produ,produprop,produperc,gesttot,gesttotprop,gesttotperc,gtemp,gtempprop,gtempperc,gtard,gtardprop,gtardperc, fechan, -1);
                alerta.alertInformation("Éxito", "", "CDI 12 editado de forma exitosa.");
            }
        } catch (Exception e) {
            alerta.alertInformation("Error en los datos", "Datos inválidos.", "Los datos proporcionados no permiten ingresar en la base."
                    + "\n Compruebe que la fecha de la cita encaje con la fecha de nacimiento para que el infante tenga una edad válida para aplicar CDI12.");
            return;
        }

        Stage actualWindow = (Stage) label.getScene().getWindow();
        actualWindow.close();
    }

    public boolean isEmpty(TextField textfield) {
        return StringUtils.isEmptyOrWhitespaceOnly(textfield.getText());
    }

    public void inicializarBebe(int idbebe) {
        this.idbebe = idbebe;
    }

    void setEditable(boolean b) {
        this.editable = b;
    }

    void setIdBebeActualizar(int id) {
        this.idBebeActualizar = id;
    }

    void setCdi12AEditar(Cdi12Modelo cdimactualizar) {
        this.cdimactualizar = cdimactualizar;
    }

    void setCampos() {
        try {
            fechaAplicacion.setValue(LocalDate.parse(cdimactualizar.getFechaAplicacion(), DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        } catch (Exception e) {

        }
        cmp.setText(cdimactualizar.getComprension() + "");
        propcmp.setText(cdimactualizar.getPropComprension() + "");
        perccmp.setText(cdimactualizar.getPercComprension() + "");

        prod.setText(cdimactualizar.getProduccion() + "");
        propprod.setText(cdimactualizar.getPropProduccion() + "");
        percprod.setText(cdimactualizar.getPercProduccion() + "");

        gt.setText(cdimactualizar.getGestosTempranos() + "");
        propgt.setText(cdimactualizar.getPropGestosTempranos() + "");
        percgt.setText(cdimactualizar.getPercGestosTempranos() + "");

        pf.setText(cdimactualizar.getPrimerasFrases() + "");
        proppf.setText(cdimactualizar.getPropPrimerasFrases() + "");
        percpf.setText(cdimactualizar.getPercPrimerasFrases() + "");

        gta.setText(cdimactualizar.getGestosTardios() + "");
        propgta.setText(cdimactualizar.getPropGestosTardios() + "");
        percgta.setText(cdimactualizar.getPercGestosTardios() + "");

        gtot.setText(cdimactualizar.getTotalGestos() + "");
        propgtot.setText(cdimactualizar.getPropTotalGestos() + "");
        percgtot.setText(cdimactualizar.getPercTotalGestos() + "");
    }
}
