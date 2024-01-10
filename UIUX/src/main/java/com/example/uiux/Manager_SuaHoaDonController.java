package com.example.uiux;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class Manager_SuaHoaDonController {

    @FXML
    public void handleQuayLai() {
        Main.loadScene("Manager_HoaDonThuChiTiet.fxml");
    }
    @FXML
    public void handleXacNhan() {
        Main.showAlert("Sửa hóa đơn thành công",null, Alert.AlertType.INFORMATION);
        Main.loadScene("Manager_HoaDonThuChiTiet.fxml");

    }
}
