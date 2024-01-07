package com.example.uiux;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class admin_ChuyenTrangController {
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
