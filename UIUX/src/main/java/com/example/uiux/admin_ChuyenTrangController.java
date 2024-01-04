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
    private void ThongTinCanHo(){
        Main.loadScene("admin_ThongTinCanHo.fxml");
    }

    @FXML
    private void TaoThongBao(){
        Main.loadScene("admin_TaoThongBao.fxml");
    }

    @FXML
    private void QuanLiSuKien(){
        Main.loadScene("admin_QuanLiSuKien.fxml");
    }

    @FXML
    private void TinNhan(){
        Main.loadScene("admin_Chat.fxml");
    }
}
