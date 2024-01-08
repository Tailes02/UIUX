package com.example.uiux;

import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class citizen_HoaDonController extends citizen_ChuyenTrangController{

    @FXML
    private TableView<citizenHoaDon> TableHoaDon;
    @FXML
    private TableColumn<citizenHoaDon, String> MaHoaDonColumn;
    @FXML
    private TableColumn<citizenHoaDon, String> SoTienColumn;
    @FXML
    private TableColumn<citizenHoaDon, String> ThoiGianColumn;
    @FXML
    private TableColumn<citizenHoaDon, String> TinhTrangColumn;
    @FXML
    private TableColumn<citizenHoaDon, String> GhiChuColumn;

    public void initialize() {
        MaHoaDonColumn.setCellValueFactory(cellDataFeatures -> new ReadOnlyObjectWrapper<>(cellDataFeatures.getValue().getMaHoaDon()));
        SoTienColumn.setCellValueFactory(cellDataFeatures -> new ReadOnlyObjectWrapper<>(cellDataFeatures.getValue().getSoTien()));
        ThoiGianColumn.setCellValueFactory(cellDataFeatures -> new ReadOnlyObjectWrapper<>(cellDataFeatures.getValue().getThoiGian()));
        TinhTrangColumn.setCellValueFactory(cellDataFeatures -> new ReadOnlyObjectWrapper<>(cellDataFeatures.getValue().getTinhTrang()));
        GhiChuColumn.setCellValueFactory(cellDataFeatures -> new ReadOnlyObjectWrapper<>(cellDataFeatures.getValue().getGhiChu()));

        ObservableList<citizenHoaDon> data = FXCollections.observableArrayList(
                new citizenHoaDon("120720", "Đang Thu", "01/09/2023 - 15/09/2023", "187362", ""),
                new citizenHoaDon("120719", "Đang Thu", "01/09/2023 - 15/09/2023", "324975", ""),
                new citizenHoaDon("120718", "Đang Thu", "01/08/2023 - 15/08/2023", "256841", "Chi trả chậm"),
                new citizenHoaDon("120717", "Đã Thu", "01/08/2023 - 15/08/2023", "139567", ""),
                new citizenHoaDon("120716", "Đã Thu", "01/07/2023 - 15/07/2023", "312489", ""),
                new citizenHoaDon("120715", "Đã Thu", "01/07/2023 - 15/07/2023", "208754", ""),
                new citizenHoaDon("120714", "Đã Thu", "01/06/2023 - 15/06/2023", "176543", ""),
                new citizenHoaDon("120713", "Đã Thu", "01/06/2023 - 15/06/2023", "397652", ""),
                new citizenHoaDon("120712", "Đã Thu", "01/05/2023 - 15/05/2023", "153726", ""),
                new citizenHoaDon("120711", "Đã Thu", "01/05/2023 - 15/05/2023", "324857", ""),
                new citizenHoaDon("120710", "Đã Thu", "01/05/2023 - 15/05/2023", "256841", ""),
                new citizenHoaDon("120709", "Đã Thu", "01/04/2023 - 15/04/2023", "139567", ""),
                new citizenHoaDon("120708", "Đã Thu", "01/04/2023 - 15/04/2023", "219634", ""),
                new citizenHoaDon("120707", "Đã Thu", "01/03/2023 - 15/03/2023", "208754", ""),
                new citizenHoaDon("120706", "Đã Thu", "01/03/2023 - 15/03/2023", "132874", ""),
                new citizenHoaDon("120705", "Đã Thu", "01/02/2023 - 15/02/2023", "397652", "")
        );
        TableHoaDon.setItems(data);
    }


    public class citizenHoaDon {
        private String MaHoaDon;
        private String SoTien;
        private String TinhTrang;
        private String ThoiGian;
        private String GhiChu;


        public citizenHoaDon(String MaHoaDon, String TinhTrang, String ThoiGian,String SoTien, String GhiChu) {
            this.MaHoaDon = MaHoaDon;
            this.TinhTrang = TinhTrang;
            this.ThoiGian = ThoiGian;
            this.SoTien = SoTien;
            this.GhiChu = GhiChu;
        }

        public String getMaHoaDon() {return MaHoaDon; }

        public void setMaHoaDon(String MaHoaDon) {this.MaHoaDon = MaHoaDon; }

        public String getTinhTrang() {
            return TinhTrang;
        }

        public void setTinhTrang(){
            this.TinhTrang = TinhTrang;
        }

        public String getThoiGian() {
            return ThoiGian;
        }

        public void setThoiGian(String ThoiGian) {
            this.ThoiGian = ThoiGian;
        }

        public String getSoTien() {
            return SoTien;
        }

        public void setSoTien(int soTien) {
            this.SoTien = SoTien;
        }

        public String getGhiChu() {
            return GhiChu;
        }

        public void setGhiChu(String GhiChu) {
            this.GhiChu = GhiChu;
        }
    }

    @FXML
    private void avatarClicked(){
        Main.loadScene("citizen_ThongTinTaiKhoan.fxml");
    }
}
