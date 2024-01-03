package com.example.uiux;

import javafx.fxml.FXML;

public class Manager_ChuyenTrangController {
    @FXML
    private void TrangChu(){
        Main.loadScene("Manager_TrangChu.fxml");
    }
    @FXML
    private void ThongTinTaiKhoan(){
        Main.loadScene("Manager_ThongTinTaiKhoan.fxml");
    }
    @FXML
    private void ThongTinNhanKhau(){
        Main.loadScene("Manager_ThongTinNhanKhau.fxml");
    }
    @FXML
    private void HoaDon(){
        Main.loadScene("Manager_HoaDonThu.fxml");
    }
    @FXML
    private void TinNhan(){
        Main.loadScene("Chat_old.fxml");
    }
}
