package com.example.uiux;

import javafx.fxml.FXML;
import javafx.stage.Stage;
import javafx.scene.control.Button;


public class citizen_ThongBaoController extends citizen_ChuyenTrangController {

    @FXML
    private Button ButtonOK;

    @FXML
    private void initialize() {
        // Perform additional initialization if needed
    }
    @FXML
    private void OK() {
        citizen_ChuyenTrangController mainApp = new citizen_ChuyenTrangController();
        mainApp.showThongBaoPopup();

        // Close the current ThongBao scene's stage
        Stage currentStage = (Stage) ButtonOK.getScene().getWindow();
        currentStage.close();
    }
}
