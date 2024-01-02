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
        // Create the confirmation dialog
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText("Xác nhận đổi mật khẩu ?");
//        alert.setContentText("Are you sure you want to perform this action?");

        // Add "Confirm" and "Cancel" buttons
        ButtonType buttonTypeConfirm = new ButtonType("Xác nhận");
        ButtonType buttonTypeCancel = new ButtonType("Hủy");
        alert.getButtonTypes().setAll(buttonTypeConfirm, buttonTypeCancel);

        // Show the dialog and wait for a result
        Optional<ButtonType> result = alert.showAndWait();

        // Handle the result based on the button clicked
        if (result.isPresent() && result.get() == buttonTypeConfirm) {
            // Handle Confirm button clicked
            Main.showAlert("Thay đổi mật khẩu thành công",null, Alert.AlertType.INFORMATION);
            handleConfirmAction();
        } else {
            handleConfirmAction();
        }
    }

    private void handleConfirmAction() {
        PasswordTextField.setVisible(false);
        PasswordText.setVisible(true);
        XacNhanButton.setVisible(false);
    }

    private void handleCancelAction() {
        // Handle the action when "Cancel" is clicked or the dialog is closed
        // You can add your custom logic here
    }
}


