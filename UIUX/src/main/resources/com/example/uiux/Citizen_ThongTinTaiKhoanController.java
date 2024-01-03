package com.example.uiux;

import javafx.fxml.FXML;

public class Citizen_ThongTinTaiKhoanController extends citizen_ChuyenTrangController{
        @FXML
        private void LogoutButtonClicked(){
            Main.loadScene("login.fxml");
        }

}
