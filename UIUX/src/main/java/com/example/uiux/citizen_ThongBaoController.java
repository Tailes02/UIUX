package com.example.uiux;

import javafx.fxml.FXML;
import javafx.stage.Stage;
import javafx.scene.control.Button;


public class citizen_ThongBaoController extends citizen_ChuyenTrangController {

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
}
