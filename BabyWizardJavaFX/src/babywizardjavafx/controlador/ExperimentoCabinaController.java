/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx.controlador;

import com.mysql.cj.util.StringUtils;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
public class ExperimentoCabinaController implements Initializable {
    
    int idbebe;
    @FXML
    private RadioButton isEntren;
    @FXML
    private ToggleGroup entOpru;
    @FXML
    private RadioButton isPrueba;
    @FXML
    private TextField inputtipoExp;
    @FXML
    private TextField inputprotarpre;
    @FXML
    private TextField inputprotarpos;
    @FXML
    private TextField inputLLkDifPre;
    @FXML
    private TextField inputLLkDifPos;
    @FXML
    private TextField inputTr;
    @FXML
    private Button btnagregarpl;
    @FXML
    private Label label;
    
    /**
     * Initializes the controller class.
     */
    
    private boolean isEmpty(TextField textfield){
      return StringUtils.isEmptyOrWhitespaceOnly(textfield.getText());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void inicializarBebe(int idbebe){
        this.idbebe = idbebe;
    }
    
    private void agregar(ActionEvent event) throws IOException {
        
        int eOp = -1;
        if (isEntren.isSelected()) {
            eOp = 0;
        } else if (isPrueba.isSelected()) {
            eOp = 1;
        }
       
      if(!(isEmpty(inputtipoExp) || isEmpty(inputprotarpre) || isEmpty(inputprotarpos) || isEmpty(inputLLkDifPre) || isEmpty(inputLLkDifPos) || isEmpty(inputTr))){
        
        String tipoExp = inputtipoExp.getText();
        double protarpre = Double.parseDouble(inputprotarpre.getText());
        double protarpos = Double.parseDouble(inputprotarpos.getText());
        double llkdifpre = Double.parseDouble(inputLLkDifPre.getText());
        double llkdifpos = Double.parseDouble(inputLLkDifPos.getText());
        double tr = Double.parseDouble(inputTr.getText());
        
      } else{
          label.setVisible(true);
      }
        
        
        Stage actualWindow = (Stage) inputtipoExp.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/babywizardjavafx/vista/CreadoExitosamente.fxml"));
        Parent root = (Parent) loader.load();
        JMetro jmetro = new JMetro(Style.LIGHT);
        jmetro.setParent(root);
        CreadoExitosamenteController cec = loader.getController();
        cec.queEsCreado("Prueba de laboratorio agregada exitosamente.");
        Scene exito = new Scene(root);
        actualWindow.setScene(exito);
        Image image = new Image("/babywizardjavafx/vista/imagenes/bwlogo.jpg");
        actualWindow.getIcons().add(image);
        actualWindow.setTitle("Exito");
        actualWindow.show();
        actualWindow.centerOnScreen();
    }

    
}
