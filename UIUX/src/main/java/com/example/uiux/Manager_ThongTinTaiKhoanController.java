package com.example.uiux;

import javafx.fxml.FXML;

public class Manager_ThongTinTaiKhoanController {
    @FXML
    private void LogoutButtonClicked(){
        Main.loadScene("login.fxml");
    }
}
