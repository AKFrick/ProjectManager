package com.akf.pm.start;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class Main extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent panel = FXMLLoader.load(getClass().getResource("../scenes/sample.fxml"));

        Scene scene = new Scene(panel, 400,400);

        primaryStage.setTitle("dfsdf");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
