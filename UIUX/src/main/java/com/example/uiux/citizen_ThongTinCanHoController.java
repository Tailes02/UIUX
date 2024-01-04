package com.example.uiux;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class citizen_ThongTinCanHoController extends citizen_ChuyenTrangController {
    @FXML
    private void avatarClicked(){
        Main.loadScene("citizen_ThongTinTaiKhoan.fxml");
    }
}
