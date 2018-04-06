/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Path;
import javafx.stage.Stage;

/**
 *
 * @author mario
 */
public class Main extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group root=new Group();
            BorderPane principal=new BorderPane();
//-----------------------------------------------------------------------------------------------------------------------------------------------------//     
                BorderPane zonaDibujo=new BorderPane();
                    Group secondRoot=new Group();
                        Path path=new Path();            
                    secondRoot.getChildren().add(path);
                zonaDibujo.getChildren().addAll(secondRoot);
//-----------------------------------------------------------------------------------------------------------------------------------------------------//                
                Button boton0 = new Button("0");
                boton0.setMinWidth(50);
                boton0.setMaxWidth(50);
                boton0.setDisable(false);
//-----------------------------------------------------------------------------------------------------------------------------------------------------//
            principal.setCenter(zonaDibujo);
            principal.setBottom(boton0);
        root.getChildren().addAll(principal);
        Scene scene = new Scene(root, 700, 700);
        stage.setScene(scene);
        stage.show();
    }
    
}
