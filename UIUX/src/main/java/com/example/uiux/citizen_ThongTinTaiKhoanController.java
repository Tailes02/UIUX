package com.example.uiux;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

public class citizen_ThongTinTaiKhoanController extends citizen_ChuyenTrangController {
    @FXML
    private HBox InformationHBox0;

    @FXML
    private HBox InformationHBox1;

    @FXML
    private HBox InformationHBox2;

    private HBox currentlyHighlighted = null;

    @FXML
    private void ThemThanhVien(){Main.loadScene("citizen_ThemThanhVien.fxml");}

    @FXML
    private void handledXoa() {
        Main.loadScene("citizen_ThongTinCanHo1.fxml");
    }

    @FXML
    private void handledButtonXacNhan() {
        Main.showAlert("Yêu cầu của bạn đã được gửi tới quản trị viên",null, Alert.AlertType.INFORMATION);
    }

    @FXML
    private void onInformationHBox0Clicked(MouseEvent event) {
        highlight(InformationHBox0);
    }

    @FXML
    private void onInformationHBox1Clicked(MouseEvent event) {
        highlight(InformationHBox1);
    }

    @FXML
    private void onInformationHBox2Clicked(MouseEvent event) {
        highlight(InformationHBox2);
    }

    private void highlight(HBox hbox) {
        if (currentlyHighlighted != null) {
            currentlyHighlighted.setStyle("");
        }
        hbox.setStyle("-fx-background-color: lightblue;");
        currentlyHighlighted = hbox;
    }
    @FXML
    private void LogoutButtonClicked(){
        Main.loadScene("login.fxml");
    }
}

