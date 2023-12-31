package com.example.uiux;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;

public class loginController {

    @FXML
    private TextField UsernameTextField;

    @FXML
    private TextField PasswordTextField;

    @FXML
    private void initialize() {
        // Add a key pressed event listener for the PasswordTextField
        PasswordTextField.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ENTER) {
                onLoginButtonClicked();
            }
        });
    }

    @FXML
    private void onLoginButtonClicked() {
        String username = UsernameTextField.getText();
        String password = PasswordTextField.getText();

        if (username.equals("admin") && password.equals("1")) {
            // Navigate to the admin scene using a function like Main.loadScene
            Main.loadScene("admin_TrangChu.fxml");
        } else if (username.equals("manager") && password.equals("1")) {
            Main.loadScene("Manager_TrangChu.fxml");
        } else if (username.equals("canho101") && password.equals("123456")) {
            Main.loadScene("citizen_TrangChu.fxml");
        } else{
            // Handle incorrect credentials (e.g., show an error message)
            Main.showAlert("Thông tin đăng nhập không hợp lệ","Lỗi đăng nhập", Alert.AlertType.ERROR);
        }
    }
}
