package com.example.uiux;

import javafx.fxml.FXML;

public class admin_ChuyenTrangController {
    @FXML
    private void TrangChu(){
        Main.loadScene("admin_TrangChu.fxml");
    }

    @FXML
    private void ThongTinTaiKhoan(){
        Main.loadScene("admin_ThongTinTaiKhoan.fxml");
    }

    @FXML
    private void ThongTinNhanKhau(){
        Main.loadScene("admin_ThongTinNhanKhau.fxml");
    }

    @FXML
    private void TaoThongBao(){
        Main.loadScene("TaoThongBao.fxml");
    }

    @FXML
    private void QuanLiSuKien(){
        Main.loadScene("QuanLiSuKien.fxml");
    }
    
    @FXML
    private void TinNhan(){
        Main.loadScene("Chat.fxml");
    }
}
