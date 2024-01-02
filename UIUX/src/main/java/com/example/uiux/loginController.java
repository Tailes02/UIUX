package com.example.uiux;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class loginController {

    @FXML
    private TextField UsernameTextField;

    @FXML
    private TextField PasswordTextField;

    @FXML
    private void onLoginButtonClicked() {
        String username = UsernameTextField.getText();
        String password = PasswordTextField.getText();

        if (username.equals("admin") && password.equals("1234")) {
            // Navigate to the admin scene using a function like Main.loadScene
            Main.loadScene("admin_TrangChu.fxml"); // Replace with your actual navigation code
        } else {
            // Handle incorrect credentials (e.g., show an error message)
            System.out.println("Invalid credentials");
        }
    }
}
