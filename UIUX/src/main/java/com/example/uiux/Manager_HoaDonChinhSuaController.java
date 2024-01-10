package com.example.uiux;

import javafx.fxml.FXML;
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
        Main.loadScene("Manager_HoaDonChiTietSauChinhSua.fxml");
    }
    @FXML
    public void initialize() {
        // Initialize the toggle group
        toggleGroup = new ToggleGroup();


    }

    // ... other methods as needed ...
}