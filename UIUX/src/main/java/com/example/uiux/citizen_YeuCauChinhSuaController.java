package com.example.uiux;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class citizen_YeuCauChinhSuaController extends citizen_ChuyenTrangController {
    @FXML
    private void avatarClicked(){
        Main.loadScene("citizen_ThongTinTaiKhoan.fxml");
    }
    @FXML
    private void Huy(){
        Main.loadScene("citizen_TrangChu.fxml");
    }
    @FXML
    private void XacNhan(){
        Main.showAlert("Chỉnh sửa thông tin thành công","Thành công !", Alert.AlertType.INFORMATION);
        Main.loadScene("citizen_TrangChu.fxml");
    }
}
