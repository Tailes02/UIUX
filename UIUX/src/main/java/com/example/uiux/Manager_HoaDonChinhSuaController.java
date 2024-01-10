package com.example.uiux;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class Manager_HoaDonChinhSuaController extends Manager_ChuyenTrangController{

    private ToggleGroup toggleGroup;

    @FXML
    public void handleQuayLai() {
        Main.loadScene("Manager_HoaDonChiTiet.fxml");
    }

    @FXML
    public void handleChinhSua() {
        Main.showAlert("Chỉnh sửa thông tin hóa đơn thành công", "xác nhận", Alert.AlertType.ERROR);
        Main.loadScene("Manager_HoaDonChiTietSauChinhSua.fxml");
    }
    @FXML
    public void initialize() {
        // Initialize the toggle group
        toggleGroup = new ToggleGroup();


    }

    // ... other methods as needed ...
}