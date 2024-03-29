package com.example.uiux;

import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
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
    private CheckBox chiCheckBox;
    @FXML
    public void handleThemMoi() {
        Main.loadScene("Manager_TaoDanhSachThu.fxml");
    }
    @FXML
    public void handleXemChiTiet(){
        Main.loadScene("Manager_HoaDonChiTiet.fxml");
    }
    public void initialize() {
        // Initialize your columns here
        IdColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getId()));
        TenColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getTen()));
        ThoiGianColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getThoiGian()));
        chiCheckBox.selectedProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue) {
                navigateToHoaDonChi();
            }
        });


        // Create and add data to the table
        ObservableList<HoaDon> data = FXCollections.observableArrayList(
                new HoaDon("00003546", "Danh sách thu tiền điện tháng 9", "01/10/23 - 31/10/23"),
                new HoaDon("00003545", "Danh sách thu tiền nước tháng 9", "01/10/23 - 31/10/23"),
                new HoaDon("00003543", "Danh sách thu phí vệ sinh 2023", "15/09/23 - 31/09/23"),
                new HoaDon("00003542", "Danh sách thu tiền điện tháng 8", "01/09/23 - 31/09/23"),
                new HoaDon("00003541", "Danh sách thu tiền nước tháng 8", "01/09/23 - 31/09/23"),
                new HoaDon("00003540", "Danh sách thu tiền điện tháng 7", "01/08/23 - 31/08/23"),
                new HoaDon("00003539", "Danh sách thu tiền nước tháng 7", "01/08/23 - 31/08/23"),
                new HoaDon("00003537", "Danh sách thu tiền điện tháng 6", "01/07/23 - 31/07/23"),
                new HoaDon("00003536", "Danh sách thu tiền nước tháng 6", "01/07/23 - 31/07/23"),
                new HoaDon("00003535", "Danh sách thu tiền ủng hộ vùng cao 2023", "16/07/23 - 31/07/23"),
                new HoaDon("00003534", "Danh sách thu tiền quỹ du lịch hè 2023", "01/07/23 - 15/07/23"),
                new HoaDon("00003533", "Danh sách thu tiền điện tháng 5", "01/06/23 - 31/06/23"),
                new HoaDon("00003532", "Danh sách thu tiền nước tháng 5", "01/06/23 - 31/06/23"),
                new HoaDon("00003531", "Danh sách thu tiền điện tháng 4 ", "01/05/23 - 31/05/23")






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
        public HoaDon(String id, String ten, String thoiGian) {
            this.id = id;
            this.ten = ten;
            this.thoiGian = thoiGian;
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



    }

}



