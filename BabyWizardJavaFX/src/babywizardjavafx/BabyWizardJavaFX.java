/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx;

import babywizardjavafx.controlador.Wppsi303642Controller;
import babywizardjavafx.controlador.Wppsi48Controller;
import babywizardjavafx.modelo.BebeModelo;
import babywizardjavafx.modelo.JdbConnection;
import babywizardjavafx.modelo.UsuarioModelo;
import java.sql.Connection;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.util.Locale;

/**
 *
 * @author Vicaris
 */
public class BabyWizardJavaFX extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Locale.setDefault(new Locale("es"));
        Parent root = FXMLLoader.load(getClass().getResource("/babywizardjavafx/vista/InicioSesion.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setTitle("BabyWizard");
        stage.setResizable(false);
        
        //BebeModelo bm = new BebeModelo("Bebe","De","Juguete",1,"2020-05-05","Vene");
        //bm.createBebe();
        
        //UsuarioModelo um = new UsuarioModelo("Vene","Victor","El","Admin","funciona",1);
        //um.createUsuario();
        
        //CuidadorModelo cm = new CuidadorModelo("pruebamadre@cuidadora.com","1990-01-12","Cuidadora","Cuidadorcina","Cuidadorzona","Escritora","5544332222","5566778800",16);
        //cm.createCuidador();
        //System.out.println(cm.readCuidador(-1, "", "", "", "", "", "", "", "", -1).get(0).getIdCuidador());
        //cm.updateCuidador(3, -1, "", "", "CuidadorActualizado", "", "", "", "", "", -1);
        //cm.deleteCuidador(3);
        //CuidarModelo cm = new CuidarModelo(6,6,"Madre");
        //cm.createCuidar();
        //ExperimentoCabinaModelo ecm = new ExperimentoCabinaModelo("Alguntipo",1,0.2,2.5,5.8,3.0,2,6);
        //ecm.createExperimentoCabina();
        //System.out.println(ecm.readExperimentoCabina(-1, "", -1, -1, -1, -1, -1, -1, -1).get(0).getIdExperimentoCabina());
        //ecm.updateExperimentoCabina(2, -1, "", -1, -1, -1, -1, -1, -1, 9);
        //LecturaConjuntaModelo lcm = new LecturaConjuntaModelo(0,10,20,30,20,35,20,15,27,50,2,6,5);
        //lcm.createLecturaConjunta();
        //System.out.println(lcm.readLecturaConjunta(-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1).size());
        //lcm.updateLecturaConjunta(1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 6);
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
