package com.example.uiux;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.util.Optional;

public class admin_ThongTinChiTietCanHoController extends admin_ChuyenTrangController{

    @FXML
    private void handleButtonThayDoiThongTin(){
        Main.loadScene("admin_ThongTinCanHoSuu.fxml");
    }

    @FXML
    private void handleButtonHuy(){
        Main.loadScene("admin_ThongTinCanHo.fxml");
    }

    @FXML
    private void handleButtonXacNhan(){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText("Xác nhận thay đổi thông tin ?");

        ButtonType buttonTypeConfirm = new ButtonType("Xác nhận");
        ButtonType buttonTypeCancel = new ButtonType("Hủy");
        alert.getButtonTypes().setAll(buttonTypeConfirm, buttonTypeCancel);
        Optional<ButtonType> result = alert.showAndWait();

        if (result.isPresent() && result.get() == buttonTypeConfirm) {
            Main.showAlert("Thay đổi thông tin thành công",null, Alert.AlertType.INFORMATION);
            Main.loadScene("admin_ThongTinChiTietCanHoSauXacNhan.fxml");
        }

    }
}
