/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx;

import babywizardjavafx.controlador.BebeController;
import babywizardjavafx.modelo.BebeModelo;
import babywizardjavafx.modelo.JdbConnection;
import java.sql.Connection;
import java.util.LinkedList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author victo
 */
public class BabyWizardJavaFX extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("vista/InicioSesion.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setTitle("BabyWizard");
        stage.setScene(scene);
        stage.show();
        //Ejemplos de usar CRUD de bebe
        //BebeController bc = new BebeController();
        //BebeModelo bm = new BebeModelo("Valdin","Valdocin","Valdomero",0,"2020-01-01",1);
        //bc.insertBebe(bm);
        //bc.deleteBebe(2);
        //bc.updateBebe(2, -1, "", "", "apellidonson", 1, "", 1);
        //LinkedList<BebeModelo> busqueda = bc.selectBebe(-1, "Babi", "", "", -1, "", -1);
        /**Ejemplo de conexion a la db
        JdbConnection jdbc = new JdbConnection();
        Connection con = jdbc.getConnection();
        if (con != null) System.out.println("kul");
        **/
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
