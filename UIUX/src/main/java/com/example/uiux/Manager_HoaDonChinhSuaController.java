package com.example.uiux;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class Manager_HoaDonChinhSuaController extends Manager_ChuyenTrangController{

    @FXML
    private RadioButton ButtonChuaDong;

    @FXML
    private RadioButton ButtonDaDong;

    private ToggleGroup toggleGroup;

    @FXML
    public void handleQuayLai() {
        Main.loadScene("Manager_HoaDonThuChiTiet.fxml");
    }

    @FXML
    public void handleChinhSua() {
        Main.loadScene("Manager_HoaDonChiTietSauChinhSua.fxml");
    }
    @FXML
    public void initialize() {
        // Initialize the toggle group
        toggleGroup = new ToggleGroup();

        // Add the radio buttons to the toggle group
        ButtonChuaDong.setToggleGroup(toggleGroup);
        ButtonDaDong.setToggleGroup(toggleGroup);

        // Set the default selected radio button
        ButtonChuaDong.setSelected(true);

        // You can add listeners to your radio buttons if you want to  some action when they are selected
        ButtonChuaDong.selectedProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue) {
            }
        });

        ButtonDaDong.selectedProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue) {
                // Code to execute when ButtonDaDong is selected
            }
        });


    }

    // ... other methods as needed ...
}
