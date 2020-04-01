/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx;

import babywizardjavafx.modelo.CuidadorModelo;
import babywizardjavafx.modelo.CuidarModelo;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author Vicaris
 */
public class BabyWizardJavaFX extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/babywizardjavafx/vista/Resultado.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setTitle("BabyWizard");
        stage.setResizable(false);
        
        //CuidadorModelo cm = new CuidadorModelo("prueba@cuidador.com","1990-01-12","Cuidador","Cuidadorcin","Cuidadorzon","Escritor","5544332211","5566778899",16);
        //cm.createCuidador();
        //System.out.println(cm.readCuidador(-1, "", "", "", "", "", "", "", "", -1).get(0).getIdCuidador());
        //cm.updateCuidador(3, -1, "", "", "CuidadorActualizado", "", "", "", "", "", -1);
        //cm.deleteCuidador(3);
        CuidarModelo cm = new CuidarModelo(5,6,"Padre");
        cm.createCuidar();
        
        Image image = new Image("/babywizardjavafx/vista/imagenes/bwlogo.jpg");
        stage.getIcons().add(image);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
