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
import babywizardjavafx.modelo.SociodemograficoModelo;
import babywizardjavafx.modelo.UsuarioModelo;
import babywizardjavafx.modelo.Wppsi303642Modelo;
import babywizardjavafx.modelo.Wppsi48Modelo;
import java.lang.reflect.Array;
import java.sql.Connection;
import java.util.Arrays;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.util.Locale;
import javafx.scene.paint.Color;
import javafx.stage.StageStyle;
import jfxtras.styles.jmetro.JMetro;
import jfxtras.styles.jmetro.Style;

/**
 *
 * @author Vicaris
 */
public class BabyWizardJavaFX extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Locale.setDefault(new Locale("es"));
        Parent root = FXMLLoader.load(getClass().getResource("/babywizardjavafx/vista/InicioSesion.fxml"));
        JMetro jmetro = new JMetro(Style.LIGHT);
        jmetro.setParent(root);
        Scene scene = new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        //jmetro.setAutomaticallyColorPanes(true);
        
        //stage.initStyle(StageStyle.TRANSPARENT);
        stage.setTitle("BabyWizard");
        stage.setResizable(false);
        
        /**
        Wppsi48Modelo wm = new Wppsi48Modelo(10,10,10,10,10,10,10,10,10,10,10,10,10,10,"2020-05-14",23);
        System.out.println(Arrays.toString(wm.setEscalares()));
        System.out.println(Arrays.toString(wm.setEquivalentes(false,false,false,false,false,false,false,false,false,false,false,false,false)));
        System.out.println(Arrays.toString(wm.getEquivciv()));
        **/
        
        //Wppsi303642Controller w = new Wppsi303642Controller();
        
        //System.out.println(Arrays.toString(w.equivalentesCIT(70)));
        
        //Wppsi48Modelo wm48 = new Wppsi48Modelo(10,10,10,10,10,10,10,10,10,10,10,10,10,10,"2020-05-11",23);
        //System.out.println(Arrays.toString(wm48.setEscalares()));
        
        
        //SociodemograficoModelo sdm = new SociodemograficoModelo();
        //System.out.println(sdm.readSociodemografico(-1, "", -1, -1, -1, -1, 3.0, 4.0, -1, -1, -1, -1, -1, -1, -1, -1, -1, "", -1, -1, -1, -1, -1, -1, "", -1).get(0).getIdSociodemografico());
        
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
