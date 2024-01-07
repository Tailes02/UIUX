package com.example.uiux;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class admin_ThemTaiKhoanController extends admin_ChuyenTrangController{
    @FXML
    TextField textFieldTaiKhoan;
    @FXML
    TextField textFieldHoTen;
    @FXML
    TextField textFieldCCCD;
    @FXML
    TextField textFieldMatKhau;
    @FXML
    TextField textFieldCanHo;
    @FXML
    TextField textFieldSoDienThoai;

    public void handleXacNhanButton() {
        String taiKhoan = textFieldTaiKhoan.getText();
        String hoTen = textFieldHoTen.getText();
        String cccd = textFieldCCCD.getText();
        String matKhau = textFieldMatKhau.getText();
        String CanHo = textFieldCanHo.getText();
        String SoDienThoai = textFieldSoDienThoai.getText();

        if (taiKhoan.isEmpty() || hoTen.isEmpty() || cccd.isEmpty() || matKhau.isEmpty() || CanHo.isEmpty() || SoDienThoai.isEmpty()) {
            showRequiredFieldsAlert(); // Hiển thị cảnh báo nếu có trường chưa điền
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Thành công");
            alert.setHeaderText(null);
            alert.setContentText("Thêm tài khoản thành công !");
            alert.showAndWait();
        }
    }

    private void showRequiredFieldsAlert() {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Cảnh báo");
        alert.setHeaderText(null);
        alert.setContentText("Vui lòng điền đầy đủ các trường bắt buộc (*)!");

        alert.showAndWait();
    }


    public void handleHuyButton(){
        Main.loadScene("admin_ThongTinCanHo.fxml");
    }
}
