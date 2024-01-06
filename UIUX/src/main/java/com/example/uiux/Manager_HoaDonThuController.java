package com.example.uiux;

import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class Manager_HoaDonThuController extends Manager_ChuyenTrangController{

    @FXML
    private TableView<HoaDon> tableView;

    @FXML
    private TableColumn<HoaDon, String> IdColumn;

    @FXML
    private TableColumn<HoaDon, String> TenColumn;

    @FXML
    private TableColumn<HoaDon, Integer> SoTienColumn;
    
    @FXML
    private TableColumn<HoaDon, String> ThoiGianColumn;

    @FXML
    private TableColumn<HoaDon, String> TinhTrangColumn;


    public void initialize() {
        // Initialize your columns here
        IdColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getId()));
        SoTienColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getSoTien()));
        TenColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getTen()));
        ThoiGianColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getThoiGian()));
        TinhTrangColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getTinhTrang()));


        // Create and add data to the table
        ObservableList<HoaDon> data = FXCollections.observableArrayList(
                new HoaDon("PA1234567890", 1000000, "Nguyễn Thị Hằng", "20/07/20 - 23/12/22","Đã đóng"),
                new HoaDon("PA1234567890", 200000, "Hoàng Thị Minh Nguyệt", "0912738073","Đã đóng"),
                new HoaDon("PA1234567890", 340000, "Nguyễn Thanh Mai", "09112345678","Đã đóng"),
                new HoaDon("PA1234567890", 450000, "Trần Ngọc Linh", "09198765432","Đang thu"),
                new HoaDon("PA1234567890", 205000, "Nguyễn Ngọc Khánh", "09123456789","Đang thu"),
                new HoaDon("PA1234567890", 201000, "Nguyễn Tiến Dũng", "09187654321","Đã đóng"),
                new HoaDon("PA1234567890", 206000, "Mai Ngọc Linh", "09134567890","Đang thu")
//                new Manager_HoaDonThuController.HoaDon(2, "108", "Phạm Ngọc Ngà", "09176543210",2),
//                new Manager_HoaDonThuController.HoaDon(2, "201", "Trần Phương Anh", "09154321098",2),
//                new Manager_HoaDonThuController.HoaDon(2, "202", "Lương Thanh Hà", "09189012345",3)

            /* dự phòng
                new admin_ThongTinNhanKhauController.HoaDon(1, "203", "Lương Văn Đức", "0989958699",2,"..."),
                new admin_ThongTinNhanKhauController.HoaDon(2, "204", "Trần Ngọc An", "0912738073",3,"..."),
                new admin_ThongTinNhanKhauController.HoaDon(2, "205", "Trần Trọng Hoàng", "09112345678",3,"..."),
                new admin_ThongTinNhanKhauController.HoaDon(2, "206", "Trần Ngọc Linh", "09198765432",3,"..."),
                new admin_ThongTinNhanKhauController.HoaDon(2, "207", "Nguyễn Ngọc Khánh", "09123456789",3,"..."),
                new admin_ThongTinNhanKhauController.HoaDon(2, "208", "Nguyễn Tiến Dũng", "09187654321",3,"..."),
                new admin_ThongTinNhanKhauController.HoaDon(2, "301", "Mai Ngọc Linh", "09134567890",3,"..."),
                new admin_ThongTinNhanKhauController.HoaDon(2, "302", "Phạm Ngọc Ngà", "09176543210",3,"..."),
                new admin_ThongTinNhanKhauController.HoaDon(2, "303", "Trần Phương Anh", "09154321098",3,"...")
                new admin_ThongTinNhanKhauController.HoaDon(2, "304", "Lương Thanh Hà", "09189012345",3,"...")
            */
        );

        tableView.setItems(data);
    }

    // ... other methods as needed
    public class HoaDon {
        private String id;
        private int soTien;
        private String ten;
        private String thoiGian;
        private String tinhTrang;

        public HoaDon(String id, int soTien, String ten, String thoiGian,String tinhTrang) {
            this.id = id;
            this.soTien = soTien;
            this.ten = ten;
            this.thoiGian = thoiGian;
            this.tinhTrang = tinhTrang;
        }

        // Getters and setters for each property
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getSoTien() {
            return soTien;
        }

        public void setSoTien(int soTien) {
            this.soTien = soTien;
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

        public String getTinhTrang() {
            return tinhTrang;
        }

        public void setTinhTrang(String tinhTrang) {
            this.tinhTrang = tinhTrang;
        }


    }

}



