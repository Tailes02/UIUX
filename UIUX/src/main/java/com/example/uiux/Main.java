package com.example.uiux;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    private static Stage primaryStage;


    @Override
    public void start(Stage primaryStage) {
        com.example.uiux.Main.primaryStage = primaryStage; // Assign the primaryStage to the static field
<<<<<<< HEAD
        loadScene("login.fxml");
=======
        loadScene("mangager_TrangChu.fxml");
>>>>>>> 1acbac1de00b43da7f22e06c842d2a600b1c18a5
    }

    public static void showAlert(String message, String title, Alert.AlertType type) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void loadScene(String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader(com.example.uiux.Main.class.getResource(fxmlFile));
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
