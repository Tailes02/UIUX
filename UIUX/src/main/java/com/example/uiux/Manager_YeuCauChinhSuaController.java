package com.example.uiux;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class Manager_YeuCauChinhSuaController extends citizen_ChuyenTrangController {
    @FXML
    private void Huy(){
        Main.loadScene("citizen_TrangChu.fxml");
    }
    @FXML
    private void XacNhan(){
        Main.showAlert("yêu cầu Chỉnh sửa thông tin thành công","Thành công !", Alert.AlertType.INFORMATION);
        Main.loadScene("Manager_ThongTinTaiKhoan.fxml");
    }
}
