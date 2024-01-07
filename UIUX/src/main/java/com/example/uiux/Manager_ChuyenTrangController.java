package com.example.uiux;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Manager_ChuyenTrangController {
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
    private void TrangChu(){
        Main.loadScene("Manager_TrangChu.fxml");
    }
    @FXML
    private void ThongTinTaiKhoan(){
        Main.loadScene("Manager_ThongTinTaiKhoan.fxml");
    }
    @FXML
    private void ThongTinCanHo(){
        Main.loadScene("Manager_ThongTinCanHo.fxml");
    }
    @FXML
    private void TaoThongBao(){
        Main.loadScene("Manager_TaoThongBao.fxml");
    }
    @FXML
    private void HoaDon(){
        Main.loadScene("Manager_HoaDonThu.fxml");
    }
    @FXML
    private void TinNhan(){
        Main.loadScene("Manager_Chat.fxml");
    }
}
