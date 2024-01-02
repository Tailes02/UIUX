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
        loadScene("admin_ThongTinNhanKhau.fxml");
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

//     @FXML
//    private TextField usernameField;
//    @FXML
//    private PasswordField passwordField;
//
//    String QuanLyUsername = "QuanLy";
//    String QuanLyPassword = "123";
//    String QuanTriUsername = "QuanTri";
//    String QuanTriPassword = "123";
//    String CuDanUsername = "CuDan";
//    String CuDanPassword = "123";
//
//    @FXML
//    private void login(ActionEvent event) {
//        String username = usernameField.getText();
//        String password = passwordField.getText();
//
//        if (username.equals(QuanLyUsername) && password.equals(QuanLyPassword)) {
//            System.out.println("Đăng nhập thành công");
//        } else if (username.equals(QuanTriUsername) && password.equals(QuanTriPassword)) {
//            System.out.println("Đăng nhập thành công");
//        } else if (username.equals(CuDanUsername) && password.equals(CuDanPassword)) {
//            System.out.println("Đăng nhập thành công");
//        } else {
//            showAlert("Sai thông tin vui lòng thử lại!", "Login Error", Alert.AlertType.ERROR);
//        }
//    }

    public static void main(String[] args) {
        launch();
    }
}
