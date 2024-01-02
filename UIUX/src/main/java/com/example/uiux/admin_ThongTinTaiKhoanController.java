package com.example.uiux;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class admin_ThongTinTaiKhoanController extends admin_ChuyenTrangController {
    @FXML
    private void LogoutButtonClicked(){
        Main.loadScene("login.fxml");
    }

    @FXML
    private Button XacNhanButton;

    @FXML
    private Button DoiMatKhauButton;

    @FXML
    private TextField PasswordTextField;

    @FXML
    private Text PasswordText;


    public void initialize() {
        // Set XacNhanButton initially invisible
        XacNhanButton.setVisible(false);
    }

    @FXML
    private void handleDoiMatKhauButtonClicked() {
        // Hide the PasswordText
        PasswordText.setVisible(false);

        // Show the PasswordTextField
        PasswordTextField.setVisible(true);
        XacNhanButton.setVisible(true);

        // Set focus to the PasswordTextField
        PasswordTextField.requestFocus();
    }

    @FXML
    private void handleXacNhanButtonClicked() {
        // Handle the action when XacNhanButton is clicked
        // You can add your custom logic here
    }

}
