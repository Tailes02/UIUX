package com.example.uiux;

import javafx.fxml.FXML;

public class citizen_ChuyenTrangController {
    @FXML
    private void TrangChu(){Main.loadScene("citizen_TrangChu.fxml"); }
    @FXML
    private void ThongTinCanHo(){
        Main.loadScene("citizen_ThongTinCanHo.fxml");
    }
    @FXML
    private void HoaDon(){
        Main.loadScene("citizen_HoaDon.fxml");
    }
    private void ThongTinTaiKhoan(){
        Main.loadScene("citizen_ThongTinTaiKhoan.fxml");
    }
    @FXML
    private void TinNhan(){
        Main.loadScene("citizen_Chat.fxml");
    }
    @FXML
    private void YeuCauChinhSua(){
        Main.loadScene("YeuCauChinhSua.fxml");
    }
}
