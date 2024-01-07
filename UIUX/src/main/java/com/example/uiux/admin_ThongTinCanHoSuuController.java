package com.example.uiux;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

public class admin_ThongTinCanHoSuuController extends admin_ChuyenTrangController {
    @FXML
    private HBox InformationHBox0;

    @FXML
    private HBox InformationHBox1;

    @FXML
    private HBox InformationHBox2;

    private HBox currentlyHighlighted = null;

    @FXML
    private void handledButtonHuy() {
        Main.loadScene("admin_ThongTinChiTietCanHo.fxml");
    }

    @FXML
    private void handledButtonXacNhan() {
        Main.loadScene("admin_ThongTinChiTietCanHoSauXacNhan.fxml");
    }

    @FXML
    private void onInformationHBox0Clicked(MouseEvent event) {
        highlight(InformationHBox0);
    }

    @FXML
    private void onInformationHBox1Clicked(MouseEvent event) {
        highlight(InformationHBox1);
    }

    @FXML
    private void onInformationHBox2Clicked(MouseEvent event) {
        highlight(InformationHBox2);
    }

    private void highlight(HBox hbox) {
        if (currentlyHighlighted != null) {
            currentlyHighlighted.setStyle("");
        }
        hbox.setStyle("-fx-background-color: lightblue;");
        currentlyHighlighted = hbox;
    }
}

