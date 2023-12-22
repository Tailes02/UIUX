package com.example.uiux;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    private static Stage primaryStage;


    @Override
    public void start(Stage primaryStage) {
        Main.primaryStage = primaryStage; // Assign the primaryStage to the static field
        loadScene("HomeLayoutRemake.fxml");
    }

    public static void loadScene(String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource(fxmlFile));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}