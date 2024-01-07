package com.example.uiux;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.collections.FXCollections;

public class admin_ThemNhanKhauController extends admin_ChuyenTrangController {
    @FXML
    private ComboBox<String> roleComboBox; // Ensure this fx:id matches the one in your FXML

    @FXML
    private TextField hoTenTextField; // Example TextField, replace with actual fx:id from your FXML

    @FXML
    private void handleButtonQuayLai() {
        Main.loadScene("admin_ThongTinCanHoSua.fxml");
    }

    @FXML
    public void initialize() {
        roleComboBox.setItems(FXCollections.observableArrayList("Thành viên", "Tạm chú"));
        roleComboBox.setValue("Thành viên");
    }

    @FXML
    private void handleRoleComboBoxAction() {
        String selectedRole = roleComboBox.getValue();
        // Handle the selected value (e.g., update other UI components)
        System.out.println("Selected Role: " + selectedRole);
    }

    @FXML
    private void handleXacNhanButton() {
        // Check if the hoTenTextField is empty
        if (hoTenTextField.getText() == null || hoTenTextField.getText().trim().isEmpty()) {
            // Show an error alert if the field is empty
            Main.showAlert("Cần điền tên thành viên cần thêm", "Lỗi", Alert.AlertType.ERROR);
        } else {
            Main.loadScene("admin_ThongTinCanHoSua.fxml");
        }
    }
}
