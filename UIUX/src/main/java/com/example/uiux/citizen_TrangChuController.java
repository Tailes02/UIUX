package com.example.uiux;

import javafx.fxml.FXML;

public class citizen_TrangChuController extends citizen_ChuyenTrangController{
    @FXML
    private void avatarClicked(){
        Main.loadScene("citizen_ThongTinTaiKhoan.fxml");
    }
}
