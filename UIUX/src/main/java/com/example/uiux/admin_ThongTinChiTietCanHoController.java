package com.example.uiux;

import javafx.fxml.FXML;

public class admin_ThongTinChiTietCanHoController extends admin_ChuyenTrangController{

    @FXML
    private void handleButtonThayDoiThongTin(){
        Main.loadScene("admin_ThongTinCanHoSuu.fxml");
    }

    @FXML
    private void handleButtonHuy(){
        Main.loadScene("admin_ThongTinCanHo.fxml");
    }
}
