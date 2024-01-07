package com.example.uiux;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class Manager_TaoHoaDonController extends Manager_ChuyenTrangController{
    @FXML
    public void handleQuayLai() {
        Main.loadScene("Manager_HoaDonThu.fxml");
    }
    @FXML
    public void handleXacNhan() {
        Main.showAlert("Thêm hóa đơn thành công",null, Alert.AlertType.INFORMATION);
        Main.loadScene("Manager_HoaDonThu.fxml");

    }
}
