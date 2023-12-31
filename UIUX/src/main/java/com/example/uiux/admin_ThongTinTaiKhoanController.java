package com.example.uiux;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;

import java.util.Optional;

public class admin_ThongTinTaiKhoanController extends admin_ChuyenTrangController {
    @FXML
    private void LogoutButtonClicked(){
        Main.loadScene("login.fxml");
    }

    @FXML
    private Button ButtonXacNhan;

    @FXML
    private TextField PasswordTextField;

    @FXML
    private Text PasswordText;


    public void initialize() {
        // Set ButtonXacNhan initially invisible
        ButtonXacNhan.setVisible(false);
    }

    @FXML
    private void handleDoiMatKhauButtonClicked() {
        // Hide the PasswordText
        PasswordText.setVisible(false);

        // Show the PasswordTextField
        PasswordTextField.setVisible(true);
        ButtonXacNhan.setVisible(true);

        // Set focus to the PasswordTextField
        PasswordTextField.requestFocus();
    }

    @FXML
    private void handleButtonXacNhanClicked() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText("Xác nhận đổi mật khẩu ?");

        ButtonType buttonTypeConfirm = new ButtonType("Xác nhận");
        ButtonType buttonTypeCancel = new ButtonType("Hủy");
        alert.getButtonTypes().setAll(buttonTypeConfirm, buttonTypeCancel);
        Optional<ButtonType> result = alert.showAndWait();

        if (result.isPresent() && result.get() == buttonTypeConfirm) {
            Main.showAlert("Thay đổi mật khẩu thành công",null, Alert.AlertType.INFORMATION);
            handleConfirmAction();
        } else {
            handleConfirmAction();
        }
    }

    private void handleConfirmAction() {
        PasswordTextField.setVisible(false);
        PasswordText.setVisible(true);
        ButtonXacNhan.setVisible(false);
    }

}


