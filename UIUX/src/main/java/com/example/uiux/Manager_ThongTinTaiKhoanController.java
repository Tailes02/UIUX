package com.example.uiux;

import javafx.fxml.FXML;

public class Manager_ThongTinTaiKhoanController extends Manager_ChuyenTrangController {
    @FXML
    private void LogoutButtonClicked(){
        Main.loadScene("login.fxml");
    }
    @FXML
    private void handleYeuCau(){
        Main.loadScene("Manager_YeuCauChinhSua.fxml");
    }

}
