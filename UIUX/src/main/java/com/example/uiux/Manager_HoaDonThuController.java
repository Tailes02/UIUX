package com.example.uiux;

import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class Manager_HoaDonThuController extends Manager_ChuyenTrangController{

    @FXML
    private TableView<HoaDon> tableView;

    @FXML
    private TableColumn<HoaDon, String> IdColumn;

    @FXML
    private TableColumn<HoaDon, String> TenColumn;

    @FXML
    private TableColumn<HoaDon, String> ThoiGianColumn;

    @FXML
    private TableColumn<HoaDon, String> TinhTrangColumn;
    @FXML
    private CheckBox chiCheckBox;

    public void initialize() {
        // Initialize your columns here
        IdColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getId()));
        TenColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getTen()));
        ThoiGianColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getThoiGian()));
        TinhTrangColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getTinhTrang()));
        chiCheckBox.selectedProperty().addListener((observable, oldValue, newValue) -> {
                    if (newValue) {
                        navigateToHoaDonChi();
                    }
                });

        // Create and add data to the table
        ObservableList<HoaDon> data = FXCollections.observableArrayList(
                new HoaDon("00003546", "Danh sách thu tiền điện tháng 9", "01/10/23 - 31/10/23","Đang thu"),
                new HoaDon("00003545", "Danh sách thu tiền nước tháng 9", "01/10/23 - 31/10/23", "Đang thu"),
                new HoaDon("00003544", "Danh sách thu phí vệ sinh 2023", "15/09/23 - 31/09/23", "Đã đóng")
//                new HoaDon("00003543", 450000, "Trần Ngọc Linh", "09198765432","Đang thu"),
//                new HoaDon("00003542", 205000, "Nguyễn Ngọc Khánh", "09123456789","Đang thu"),
//                new HoaDon("00003541", 201000, "Nguyễn Tiến Dũng", "09187654321","Đã đóng"),
//                new HoaDon("00003540", 206000, "Mai Ngọc Linh", "09134567890","Đang thu"),
//                new HoaDon("00003539", 200000, "Hoàng Thị Minh Nguyệt", "0912738073","Đã đóng"),
//                new HoaDon("00003538", 340000, "Nguyễn Thanh Mai", "09112345678","Đã đóng"),
//                new HoaDon("00003537", 450000, "Trần Ngọc Linh", "09198765432","Đang thu"),
//                new HoaDon("00003536", 205000, "Nguyễn Ngọc Khánh", "09123456789","Đang thu"),
//                new HoaDon("00003535", 201000, "Nguyễn Tiến Dũng", "09187654321","Đã đóng"),
//                new HoaDon("00003534", 206000, "Mai Ngọc Linh", "09134567890","Đang thu")

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

    private void navigateToHoaDonChi() {
        try {
            // Load HoaDonChi.fxml
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Manager_HoaDonChi.fxml"));
            Parent hoaDonChiRoot = loader.load();

            // Get the current stage from the event source
            Stage stage = (Stage) chiCheckBox.getScene().getWindow();

            // Set the new scene
            stage.setScene(new Scene(hoaDonChiRoot));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            // Handle exceptions here
        }

    }

    // ... other methods as needed
    public class HoaDon {
        private String id;
        private String ten;
        private String thoiGian;
        private String tinhTrang;

        public HoaDon(String id, String ten, String thoiGian,String tinhTrang) {
            this.id = id;
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



