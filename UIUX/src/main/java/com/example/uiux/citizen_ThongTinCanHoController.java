package com.example.uiux;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class citizen_ThongTinCanHoController extends citizen_ChuyenTrangController {
    @FXML
    private void LogoutButtonClicked(){
        Main.loadScene("login.fxml");
    }

    @FXML
    private void ThayDoiThongTin(){Main.loadScene("citizen_YeuCauChinhSua.fxml");}
    
    @FXML
    private void avatarClicked(){
        Main.loadScene("citizen_ThongTinTaiKhoan.fxml");
    }
}
