package com.example.uiux;

import javafx.fxml.FXML;

public class admin_ThongTinTaiKhoanController extends admin_ChuyenTrangController {
    @FXML
    private void LogoutButtonClicked(){
        Main.loadScene("login.fxml");
    }
}
