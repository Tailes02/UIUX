package com.example.uiux;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.util.Optional;

public class NewsDetailController {

    @FXML
    private Button ButtonDelete;

    @FXML
    private Button ButtonOK;

    @FXML
    private void initialize() {

    }
    @FXML
    private void OK() {

        // Close and return to current scene
        Stage currentStage = (Stage) ButtonOK.getScene().getWindow();
        currentStage.close();
    }

    @FXML
    private void handleButtonDeleteClicked(){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText("Xác nhận xóa tin");
        ButtonType ButtonTypeConfirm = new ButtonType("Xác Nhận");
        ButtonType ButtonTypeCancel = new ButtonType("Hủy");
        alert.getButtonTypes().setAll(ButtonTypeConfirm,ButtonTypeCancel);
        Optional<ButtonType> result = alert.showAndWait();

        if (result.isPresent() && result.get() == ButtonTypeConfirm){
            Main.showAlert("Xóa tin thành công",null,Alert.AlertType.INFORMATION);
            Stage currentStage = (Stage) ButtonDelete.getScene().getWindow();
            currentStage.close();
        }
    }
}
