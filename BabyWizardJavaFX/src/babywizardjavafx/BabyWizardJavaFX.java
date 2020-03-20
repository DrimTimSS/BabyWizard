/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx;

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
        Parent root = FXMLLoader.load(getClass().getResource("/babywizardjavafx/vista/MenuPrincipal.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setTitle("BabyWizard");
        stage.setResizable(false);
        
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
