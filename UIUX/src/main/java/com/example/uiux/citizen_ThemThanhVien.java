package com.example.uiux;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class citizen_ThemThanhVien extends citizen_ChuyenTrangController{
    @FXML
    private void XacNhan(){
        Main.showAlert("Gửi yêu cầu thành công !","Thành công", Alert.AlertType.INFORMATION);
    }
    @FXML
    private void QuayLai(){
        Main.loadScene("citizen_ThongTinCanHo.fxml");
    }

}
