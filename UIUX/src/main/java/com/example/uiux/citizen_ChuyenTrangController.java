package com.example.uiux;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class citizen_ChuyenTrangController {

    public void showThongBaoPopup() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("citizen_ThongBao.fxml"));
            Parent root = loader.load();

            Stage popupStage = new Stage();
            popupStage.initModality(Modality.APPLICATION_MODAL);
            popupStage.setTitle("Thông Báo");

            Scene scene = new Scene(root);
            popupStage.setScene(scene);


            popupStage.setOnCloseRequest(event -> {
                event.consume();

                popupStage.close();
            });

            // Show the popup
            popupStage.showAndWait();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void ThongBao(){Main.loadScene("citizen_ThongBao.fxml");}
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
    @FXML
    private void ThongTinTaiKhoan(){
        Main.loadScene("citizen_ThongTinTaiKhoan.fxml");
    }
    @FXML
    private void TinNhan(){
        Main.loadScene("citizen_Chat.fxml");
    }
    @FXML
    private void YeuCauChinhSua(){
        Main.loadScene("citizen_YeuCauChinhSua.fxml");
    }
}
