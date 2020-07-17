/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx.controlador;

import babywizardjavafx.modelo.LecturaConjuntaModelo;
import com.mysql.cj.util.StringUtils;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import jfxtras.styles.jmetro.JMetro;
import jfxtras.styles.jmetro.Style;

/**
 * FXML Controller class
 *
 * @author Vicaris
 */
public class LecturaConjuntaController implements Initializable {

    int idbebe;
    @FXML
    private Button btnagregartlc;
    @FXML
    private Label label;
    @FXML
    private TextField inputprepC;
    @FXML
    private TextField inputsustC;
    @FXML
    private TextField inputartC;
    @FXML
    private TextField inputverbC;
    @FXML
    private TextField inputinintC;
    @FXML
    private TextField inputadjC;
    @FXML
    private TextField inputpronC;
    @FXML
    private TextField inputadverC;
    @FXML
    private TextField inputconjC;
    @FXML
    private TextField inputinterC;
    @FXML
    private TextField inputtypeC;
    @FXML
    private TextField inputtypeCT;
    @FXML
    private TextField inputprepCT;
    @FXML
    private TextField inputsustCT;
    @FXML
    private TextField inputartCT;
    @FXML
    private TextField inputverbCT;
    @FXML
    private TextField inputinintCT;
    @FXML
    private TextField inputadjCT;
    @FXML
    private TextField inputpronCT;
    @FXML
    private TextField inputadverCT;
    @FXML
    private TextField inputconjCT;
    @FXML
    private TextField inputinterCT;
    @FXML
    private TextField inputtypeBB;
    @FXML
    private TextField inputtypeBBT;
    @FXML
    private TextField inputprepBB;
    @FXML
    private TextField inputprepBBT;
    @FXML
    private TextField inputsustBB;
    @FXML
    private TextField inputsustBBT;
    @FXML
    private TextField inputartBB;
    @FXML
    private TextField inputartBBT;
    @FXML
    private TextField inputverbBB;
    @FXML
    private TextField inputverbBBT;
    @FXML
    private TextField inputinintBB;
    @FXML
    private TextField inputinintBBT;
    @FXML
    private TextField inputadjBB;
    @FXML
    private TextField inputadjBBT;
    @FXML
    private TextField inputpronBB;
    @FXML
    private TextField inputpronBBT;
    @FXML
    private TextField inputadverBB;
    @FXML
    private TextField inputadverBBT;
    @FXML
    private TextField inputconjBB;
    @FXML
    private TextField inputconjBBT;
    @FXML
    private TextField inputinterBB;
    @FXML
    private TextField inputinterBBT;
    
    private int fkCuidador = -1;
    
    private boolean editable;
    private int idBebeActualizar;
    private LecturaConjuntaModelo lecturaAEditar;
    @FXML
    private DatePicker fechaaplicacion;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb){
        inputprepC.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, 
            String newValue) {
                if (!newValue.matches("\\d*")) {
                    inputprepC.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
            
        });
        
        inputsustC.textProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
            if (!newValue.matches("\\d*")) {
                inputsustC.setText(newValue.replaceAll("[^\\d]", ""));
            }
        });
        inputartC.textProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
            if (!newValue.matches("\\d*")) {
                inputartC.setText(newValue.replaceAll("[^\\d]", ""));
            }
        });
        inputverbC.textProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
            if (!newValue.matches("\\d*")) {
                inputverbC.setText(newValue.replaceAll("[^\\d]", ""));
            }
        });
        inputinintC.textProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
            if (!newValue.matches("\\d*")) {
                inputinintC.setText(newValue.replaceAll("[^\\d]", ""));
            }
        });
        inputadjC.textProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
            if (!newValue.matches("\\d*")) {
                inputadjC.setText(newValue.replaceAll("[^\\d]", ""));
            }
        });
        inputpronC.textProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
            if (!newValue.matches("\\d*")) {
                inputpronC.setText(newValue.replaceAll("[^\\d]", ""));
            }
        });
        inputadverC.textProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
            if (!newValue.matches("\\d*")) {
                inputadverC.setText(newValue.replaceAll("[^\\d]", ""));
            }
        });
        
        inputconjC.textProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
            if (!newValue.matches("\\d*")) {
                inputconjC.setText(newValue.replaceAll("[^\\d]", ""));
            }
        });
        inputinterC.textProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
            if (!newValue.matches("\\d*")) {
                inputinterC.setText(newValue.replaceAll("[^\\d]", ""));
            }
        });
    }
    
    public void inicializarBebe(int idbebe){
        this.idbebe = idbebe;
    }

    @FXML
    private void agregar(ActionEvent event) throws IOException, SQLException {
        String fechan = "";
        
        String typeC = inputtypeC.getText();
        String prepC = inputprepC.getText();
        String sustC = inputsustC.getText();
        String artC = inputartC.getText();
        String verbC = inputverbC.getText();
        String inintC = inputinintC.getText();
        String adjC = inputadjC.getText();
        String pronC = inputpronC.getText();
        String adverC = inputadverC.getText();
        String conjC = inputconjC.getText();
        String interC = inputinterC.getText();
        
        String typeCT = inputtypeCT.getText();
        String prepCT = inputprepCT.getText();
        String sustCT = inputsustCT.getText();
        String artCT = inputartCT.getText();
        String verbCT = inputverbCT.getText();
        String inintCT = inputinintCT.getText();
        String adjCT = inputadjCT.getText();
        String pronCT = inputpronCT.getText();
        String adverCT = inputadverCT.getText();
        String conjCT = inputconjCT.getText();
        String interCT = inputinterCT.getText();
        
        String typeBB = inputtypeBB.getText();
        String prepBB = inputprepBB.getText();
        String sustBB = inputsustBB.getText();
        String artBB = inputartBB.getText();
        String verbBB = inputverbBB.getText();
        String inintBB = inputinintBB.getText();
        String adjBB = inputadjBB.getText();
        String pronBB = inputpronBB.getText();
        String adverBB = inputadverBB.getText();
        String conjBB = inputconjBB.getText();
        String interBB = inputinterBB.getText();
        
        String typeBBT = inputtypeBBT.getText();
        String prepBBT = inputprepBBT.getText();
        String sustBBT = inputsustBBT.getText();
        String artBBT = inputartBBT.getText();
        String verbBBT = inputverbBBT.getText();
        String inintBBT = inputinintBBT.getText();
        String adjBBT = inputadjBBT.getText();
        String pronBBT = inputpronBBT.getText();
        String adverBBT = inputadverBBT.getText();
        String conjBBT = inputconjBBT.getText();
        String interBBT = inputinterBBT.getText();
        
        if (!editable) {
            try {
                fechan = fechaaplicacion.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                
                LecturaConjuntaModelo lcm = new LecturaConjuntaModelo(validInput(typeC), validInput(prepC), validInput(sustC), validInput(artC), validInput(verbC), validInput(inintC), validInput(adjC), validInput(pronC), validInput(adverC), validInput(conjC), validInput(interC),
                        validInput(typeCT), validInput(prepCT), validInput(sustCT), validInput(artCT), validInput(verbCT), validInput(inintCT), validInput(adjCT), validInput(pronCT), validInput(adverCT), validInput(conjCT), validInput(interCT),
                        validInput(typeBB), validInput(prepBB), validInput(sustBB), validInput(artBB), validInput(verbBB), validInput(inintBB), validInput(adjBB), validInput(pronBB), validInput(adverBB), validInput(conjBB), validInput(interBB),
                        validInput(typeBBT), validInput(prepBBT), validInput(sustBBT), validInput(artBBT), validInput(verbBBT), validInput(inintBBT), validInput(adjBBT), validInput(pronBBT), validInput(adverBBT), validInput(conjBBT), validInput(interBBT), fkCuidador, fechan, idbebe);
                lcm.createLecturaConjunta();
                alertInformation("Éxito", "", "Lectura Conjunta agregada de forma exitosa.");
                Stage actualWindow = (Stage) label.getScene().getWindow();
                actualWindow.close();
            } catch (Exception e) {
                label.setVisible(true);
                alertInformation("Error", "Datos inválidos.", "No se pudo agregar la lectura conjunta.");
            }

        } else {
            lecturaAEditar.updateLecturaConjunta(lecturaAEditar.getIdLecturaConjunta(), -1, validInput(typeC), validInput(prepC), validInput(sustC), validInput(artC), validInput(verbC), validInput(inintC), validInput(adjC), validInput(pronC), validInput(adverC), validInput(conjC), validInput(interC),
                    validInput(typeCT), validInput(prepCT), validInput(sustCT), validInput(artCT), validInput(verbCT), validInput(inintCT), validInput(adjCT), validInput(pronCT), validInput(adverCT), validInput(conjCT), validInput(interCT),
                    validInput(typeBB), validInput(prepBB), validInput(sustBB), validInput(artBB), validInput(verbBB), validInput(inintBB), validInput(adjBB), validInput(pronBB), validInput(adverBB), validInput(conjBB), validInput(interBB),
                    validInput(typeBBT), validInput(prepBBT), validInput(sustBBT), validInput(artBBT), validInput(verbBBT), validInput(inintBBT), validInput(adjBBT), validInput(pronBBT), validInput(adverBBT), validInput(conjBBT), validInput(interBBT), fkCuidador, fechan, idBebeActualizar);
        }
    }

    void setEditable(boolean b) {
        this.editable = b;
    }

    void setIdBebeActualizar(int id) {
        this.idBebeActualizar = id;
    }

    void setCampos() {
        inputtypeC.setText(lecturaAEditar.getTypeC()+"");
        inputprepC.setText(lecturaAEditar.getPreposicionC()+"");
        inputsustC.setText(lecturaAEditar.getSustantivoC()+"");
        inputartC.setText(lecturaAEditar.getArticuloC()+"");
        inputverbC.setText(lecturaAEditar.getVerboC()+"");
        inputinintC.setText(lecturaAEditar.getIninteligibleC()+"");
        inputadjC.setText(lecturaAEditar.getAdjetivoC()+"");
        inputpronC.setText(lecturaAEditar.getPronombreC()+"");
        inputadverC.setText(lecturaAEditar.getAdverbioC()+"");
        inputconjC.setText(lecturaAEditar.getConjuncionC()+"");
        inputinterC.setText(lecturaAEditar.getInterjeccionC()+"");
        
        inputtypeCT.setText(lecturaAEditar.getTypeCT()+"");
        inputprepCT.setText(lecturaAEditar.getPreposicionCT()+"");
        inputsustCT.setText(lecturaAEditar.getSustantivoCT()+"");
        inputartCT.setText(lecturaAEditar.getArticuloCT()+"");
        inputverbCT.setText(lecturaAEditar.getVerboCT()+"");
        inputinintCT.setText(lecturaAEditar.getIninteligibleCT()+"");
        inputadjCT.setText(lecturaAEditar.getAdjetivoCT()+"");
        inputpronCT.setText(lecturaAEditar.getPronombreCT()+"");
        inputadverCT.setText(lecturaAEditar.getAdverbioCT()+"");
        inputconjCT.setText(lecturaAEditar.getConjuncionCT()+"");
        inputinterCT.setText(lecturaAEditar.getInterjeccionCT()+"");
        
        inputtypeBB.setText(lecturaAEditar.getTypeBB()+"");
        inputprepBB.setText(lecturaAEditar.getPreposicionBB()+"");
        inputsustBB.setText(lecturaAEditar.getSustantivoBB()+"");
        inputartBB.setText(lecturaAEditar.getArticuloBB()+"");
        inputverbBB.setText(lecturaAEditar.getVerboBB()+"");
        inputinintBB.setText(lecturaAEditar.getIninteligibleBB()+"");
        inputadjBB.setText(lecturaAEditar.getAdjetivoBB()+"");
        inputpronBB.setText(lecturaAEditar.getPronombreBB()+"");
        inputadverBB.setText(lecturaAEditar.getAdverbioBB()+"");
        inputconjBB.setText(lecturaAEditar.getConjuncionBB()+"");
        inputinterBB.setText(lecturaAEditar.getInterjeccionBB()+"");
        
        inputtypeBBT.setText(lecturaAEditar.getTypeBBT()+"");
        inputprepBBT.setText(lecturaAEditar.getPreposicionBBT()+"");
        inputsustBBT.setText(lecturaAEditar.getSustantivoBBT()+"");
        inputartBBT.setText(lecturaAEditar.getArticuloBBT()+"");
        inputverbBBT.setText(lecturaAEditar.getVerboBBT()+"");
        inputinintBBT.setText(lecturaAEditar.getIninteligibleBBT()+"");
        inputadjBBT.setText(lecturaAEditar.getAdjetivoBBT()+"");
        inputpronBBT.setText(lecturaAEditar.getPronombreBBT()+"");
        inputadverBBT.setText(lecturaAEditar.getAdverbioBBT()+"");
        inputconjBBT.setText(lecturaAEditar.getConjuncionBBT()+"");
        inputinterBBT.setText(lecturaAEditar.getInterjeccionBBT()+"");
        try {
            fechaaplicacion.setValue(LocalDate.parse(lecturaAEditar.getFechaAplicacion(), DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        } catch (Exception e) {
        
        }
    }

    void setLecturaAEditar(LecturaConjuntaModelo lcm) {
        this.lecturaAEditar = lcm;
    }
    
    private void alertInformation(String titulo, String header, String contenido) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.initOwner(label.getParent().getScene().getWindow());
        alert.getDialogPane().getStylesheets().add("/babywizardjavafx/vista/EstiloGeneral.css");
        alert.setTitle(titulo);
        if(header.equals("")) {
            alert.setHeaderText(null);
        } else {alert.setHeaderText(header);}
        alert.setContentText(contenido);
        alert.showAndWait();
    }
    
    public boolean isEmpty(String textfield) {
        return StringUtils.isEmptyOrWhitespaceOnly(textfield);
    }
    
    public int validInput(String input) {
        if(isEmpty(input)) {
            return -1;
        }
        return Integer.parseInt(input);
    }

    void inicializarCuidador(int fkCuidador) {
        this.fkCuidador = fkCuidador;
    }
}
