package com.example.uiux;

import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class Manager_HoaDonChiController extends Manager_ChuyenTrangController{

    @FXML
    private TableView<HoaDonChi> tableView;

    @FXML
    private TableColumn<HoaDonChi, String> IdColumn;

    @FXML
    private TableColumn<HoaDonChi, String> TenColumn;
    @FXML
    private TableColumn<HoaDonChi, Integer> SoTienColumn;
    @FXML
    private TableColumn<HoaDonChi, String> ThoiGianColumn;


    @FXML
    private TableColumn<HoaDonChi, String> GhiChuColumn;

    public void initialize() {
        // Initialize your columns here
        IdColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getId()));
        TenColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getTen()));
        ThoiGianColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getThoiGian()));
        SoTienColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getSoTien()));
        GhiChuColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getGhiChu()));


        // Create and add data to the table
        ObservableList<HoaDonChi> data = FXCollections.observableArrayList(
                new HoaDonChi("00003546", "Danh sách thu tiền điện tháng 9", "01/10/23",240282,""),
                new HoaDonChi("00003545", "Danh sách thu tiền nước tháng 9", "01/10/23", 323932,""),
                new HoaDonChi("00003544", "Danh sách thu phí vệ sinh 2023", "15/09/23", 323082,"")
//                new HoaDonChi("00003543", 450000, "Trần Ngọc Linh", "09198765432","Đang thu"),
//                new HoaDonChi("00003542", 205000, "Nguyễn Ngọc Khánh", "09123456789","Đang thu"),
//                new HoaDonChi("00003541", 201000, "Nguyễn Tiến Dũng", "09187654321","Đã đóng"),
//                new HoaDonChi("00003540", 206000, "Mai Ngọc Linh", "09134567890","Đang thu"),
//                new HoaDonChi("00003539", 200000, "Hoàng Thị Minh Nguyệt", "0912738073","Đã đóng"),
//                new HoaDonChi("00003538", 340000, "Nguyễn Thanh Mai", "09112345678","Đã đóng"),
//                new HoaDonChi("00003537", 450000, "Trần Ngọc Linh", "09198765432","Đang thu"),
//                new HoaDonChi("00003536", 205000, "Nguyễn Ngọc Khánh", "09123456789","Đang thu"),
//                new HoaDonChi("00003535", 201000, "Nguyễn Tiến Dũng", "09187654321","Đã đóng"),
//                new HoaDonChi("00003534", 206000, "Mai Ngọc Linh", "09134567890","Đang thu")

            /* dự phòng
                new admin_ThongTinNhanKhauController.HoaDonChi(1, "203", "Lương Văn Đức", "0989958699",2,"..."),
                new admin_ThongTinNhanKhauController.HoaDonChi(2, "204", "Trần Ngọc An", "0912738073",3,"..."),
                new admin_ThongTinNhanKhauController.HoaDonChi(2, "205", "Trần Trọng Hoàng", "09112345678",3,"..."),
                new admin_ThongTinNhanKhauController.HoaDonChi(2, "206", "Trần Ngọc Linh", "09198765432",3,"..."),
                new admin_ThongTinNhanKhauController.HoaDonChi(2, "207", "Nguyễn Ngọc Khánh", "09123456789",3,"..."),
                new admin_ThongTinNhanKhauController.HoaDonChi(2, "208", "Nguyễn Tiến Dũng", "09187654321",3,"..."),
                new admin_ThongTinNhanKhauController.HoaDonChi(2, "301", "Mai Ngọc Linh", "09134567890",3,"..."),
                new admin_ThongTinNhanKhauController.HoaDonChi(2, "302", "Phạm Ngọc Ngà", "09176543210",3,"..."),
                new admin_ThongTinNhanKhauController.HoaDonChi(2, "303", "Trần Phương Anh", "09154321098",3,"...")
                new admin_ThongTinNhanKhauController.HoaDonChi(2, "304", "Lương Thanh Hà", "09189012345",3,"...")
            */
        );

        tableView.setItems(data);
    }

    // ... other methods as needed
    public class HoaDonChi {
        private String id;
        private String ten;
        private String thoiGian;
        private int soTien;
        private String ghiChu;


        public HoaDonChi(String id, String ten, String thoiGian,int soTien, String ghiChu) {
            this.id = id;
            this.ten = ten;
            this.thoiGian = thoiGian;
            this.soTien = soTien;
            this.ghiChu = ghiChu;

        }

        // Getters and setters for each property
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTen() {
            return ten;
        }

        public void setTen(String ten) {
            this.ten = ten;
        }

        public String getThoiGian() {
            return thoiGian;
        }

        public void setThoiGian(String thoiGian) {
            this.thoiGian = thoiGian;
        }

        public int getSoTien() {
            return soTien;
        }

        public void setSoTien(int soTien) {
            this.soTien = soTien;
        }

        public String getGhiChu() {
            return ghiChu;
        }

        public void setGhiChu(String ghiChu) {
            this.ghiChu = ghiChu;
        }
    }

}



