package com.example.uiux;

import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class Manager_HoaDonChiTietController extends Manager_ChuyenTrangController{

    @FXML
    private TableView<HoaDonChiTiet> tableView;

    @FXML
    private TableColumn<HoaDonChiTiet, String> IdColumn;

    @FXML
    private TableColumn<HoaDonChiTiet, Integer> PhongColumn;

    @FXML
    private TableColumn<HoaDonChiTiet, Integer> SoTienColumn;

    @FXML
    private TableColumn<HoaDonChiTiet, String> ThoiGianColumn;

    @FXML
    private TableColumn<HoaDonChiTiet, String> TinhTrangColumn;

    @FXML
    private TableColumn<HoaDonChiTiet, String> GhiChuColumn;


    public void initialize() {
        // Initialize your columns here
        IdColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getId()));
        PhongColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getPhong()));
        SoTienColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getSoTien()));
        ThoiGianColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getThoiGian()));
        TinhTrangColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getTinhTrang()));
        GhiChuColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getGhiChu()));


        // Create and add data to the table
        ObservableList<HoaDonChiTiet> data = FXCollections.observableArrayList(
                new HoaDonChiTiet("PD30000043546", 101, 284068,"20/09/2023","đã đóng", ""),
                new HoaDonChiTiet("PD30000043546", 101, 284068,"20/09/2023","đã đóng", ""),
                new HoaDonChiTiet("PD30000043546", 101, 284068,"20/09/2023","đã đóng", ""),
                new HoaDonChiTiet("PD30000043546", 101, 284068,"20/09/2023","đã đóng", ""),
                new HoaDonChiTiet("PD30000043546", 101, 284068,"20/09/2023","đã đóng", ""),
                new HoaDonChiTiet("PD30000043546", 101, 284068,"20/09/2023","đã đóng", "")

//                new HoaDonChiTiet("00003545", "Danh sách thu tiền nước tháng 9", "01/10/23 - 31/10/23", "Đang thu"),
//                new HoaDonChiTiet("00003544", "Danh sách thu phí vệ sinh 2023", "15/09/23 - 31/09/23", "Đã đóng")
//                new HoaDonChiTiet("00003543", 450000, "Trần Ngọc Linh", "09198765432","Đang thu"),
//                new HoaDonChiTiet("00003542", 205000, "Nguyễn Ngọc Khánh", "09123456789","Đang thu"),
//                new HoaDonChiTiet("00003541", 201000, "Nguyễn Tiến Dũng", "09187654321","Đã đóng"),
//                new HoaDonChiTiet("00003540", 206000, "Mai Ngọc Linh", "09134567890","Đang thu"),
//                new HoaDonChiTiet("00003539", 200000, "Hoàng Thị Minh Nguyệt", "0912738073","Đã đóng"),
//                new HoaDonChiTiet("00003538", 340000, "Nguyễn Thanh Mai", "09112345678","Đã đóng"),
//                new HoaDonChiTiet("00003537", 450000, "Trần Ngọc Linh", "09198765432","Đang thu"),
//                new HoaDonChiTiet("00003536", 205000, "Nguyễn Ngọc Khánh", "09123456789","Đang thu"),
//                new HoaDonChiTiet("00003535", 201000, "Nguyễn Tiến Dũng", "09187654321","Đã đóng"),
//                new HoaDonChiTiet("00003534", 206000, "Mai Ngọc Linh", "09134567890","Đang thu")

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

    // ... other methods as needed
    public class HoaDonChiTiet {
        private String id;
        private int phong;
        private int soTien;
        private String thoiGian;
        private String tinhTrang;
        private String ghiChu;

        public HoaDonChiTiet(String id, int phong, int soTien, String thoiGian,String tinhTrang,String ghiChu) {
            this.id = id;
            this.phong = phong;
            this.soTien = soTien;
            this.thoiGian = thoiGian;
            this.tinhTrang = tinhTrang;
            this.ghiChu = ghiChu;
        }

        // Getters and setters for each property
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
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

        public int getPhong() {
            return phong;
        }

        public void setPhong(int phong) {
            this.phong = phong;
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
        public void setGhiChu(String tinhTrang) {
            this.ghiChu = ghiChu;
        }


    }

}



