package com.example.uiux;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class citizen_HoaDonPopUpController extends citizen_ChuyenTrangController {

        @FXML
        private Button ButtonOK;

        @FXML
        private void initialize() {
            // Perform additional initialization if needed
        }
        @FXML
        private void OK() {

            Stage currentStage = (Stage) ButtonOK.getScene().getWindow();
            currentStage.close();
        }
    }


