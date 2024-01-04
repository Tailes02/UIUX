package com.example.uiux;

import javafx.beans.binding.BooleanExpression;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class Manager_HoaDonChiTietController extends Manager_ChuyenTrangController{

    @FXML
    private TableView<HoaDonChiTiet> tableView;

    @FXML
    private TableColumn<HoaDonChiTiet, Integer> IdColumn;

    @FXML
    private TableColumn<HoaDonChiTiet, String> TenColumn;

    @FXML
    private TableColumn<HoaDonChiTiet, Integer> SoTienColumn;
    
    @FXML
    private TableColumn<HoaDonChiTiet, String> ThoiGianColumn;

    @FXML
    private TableColumn<HoaDonChiTiet, Boolean> TinhTrangColumn;


    public void initialize() {
        // Initialize your columns here
        IdColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getId()));
        SoTienColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getSoTien()));
        TenColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getTen()));
        ThoiGianColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getThoiGian()));


        // Create and add data to the table
        ObservableList<HoaDonChiTiet> data = FXCollections.observableArrayList(
                new HoaDonChiTiet(101, 1000000, "Nguyễn Thị Hằng", "0989958699",true),
                new HoaDonChiTiet(102, 200000, "Hoàng Thị Minh Nguyệt", "0912738073",false),
                new HoaDonChiTiet(103, 340000, "Nguyễn Thanh Mai", "09112345678",true),
                new HoaDonChiTiet(104, 450000, "Trần Ngọc Linh", "09198765432",false),
                new HoaDonChiTiet(105, 205000, "Nguyễn Ngọc Khánh", "09123456789",false),
                new HoaDonChiTiet(106, 201000, "Nguyễn Tiến Dũng", "09187654321",true),
                new HoaDonChiTiet(107, 206000, "Mai Ngọc Linh", "09134567890",true)
//                new Manager_HoaDonThuController.HoaDonChiTiet(2, "108", "Phạm Ngọc Ngà", "09176543210",2),
//                new Manager_HoaDonThuController.HoaDonChiTiet(2, "201", "Trần Phương Anh", "09154321098",2),
//                new Manager_HoaDonThuController.HoaDonChiTiet(2, "202", "Lương Thanh Hà", "09189012345",3)

            /* dự phòng
                new admin_ThongTinNhanKhauController.HoaDonChiTiet(1, "203", "Lương Văn Đức", "0989958699",2,"..."),
                new admin_ThongTinNhanKhauController.HoaDonChiTiet(2, "204", "Trần Ngọc An", "0912738073",3,"..."),
                new admin_ThongTinNhanKhauController.HoaDonChiTiet(2, "205", "Trần Trọng Hoàng", "09112345678",3,"..."),
                new admin_ThongTinNhanKhauController.HoaDonChiTiet(2, "206", "Trần Ngọc Linh", "09198765432",3,"..."),
                new admin_ThongTinNhanKhauController.HoaDonChiTiet(2, "207", "Nguyễn Ngọc Khánh", "09123456789",3,"..."),
                new admin_ThongTinNhanKhauController.HoaDonChiTiet(2, "208", "Nguyễn Tiến Dũng", "09187654321",3,"..."),
                new admin_ThongTinNhanKhauController.HoaDonChiTiet(2, "301", "Mai Ngọc Linh", "09134567890",3,"..."),
                new admin_ThongTinNhanKhauController.HoaDonChiTiet(2, "302", "Phạm Ngọc Ngà", "09176543210",3,"..."),
                new admin_ThongTinNhanKhauController.HoaDonChiTiet(2, "303", "Trần Phương Anh", "09154321098",3,"...")
                new admin_ThongTinNhanKhauController.HoaDonChiTiet(2, "304", "Lương Thanh Hà", "09189012345",3,"...")
            */
        );

        tableView.setItems(data);
    }
    //id = so phong
    // ... other methods as needed
    public class HoaDonChiTiet {
        private int id;
        private int soTien;
        private String ten;
        private String thoiGian;
        private boolean tinhTrang;

        public HoaDonChiTiet(int id, int soTien, String ten, String thoiGian,boolean tinhTrang) {
            this.id = id;
            this.soTien = soTien;
            this.ten = ten;
            this.thoiGian = thoiGian;
            this.tinhTrang = tinhTrang;
        }

        // Getters and setters for each property
        public int getId() {
            return id;
        }

        public void setId(int id) {
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

        public boolean isTinhTrang() {
            return tinhTrang;
        }

        public void setTinhTrang(boolean tinhTrang) {
            this.tinhTrang = tinhTrang;
        }
    }

}



