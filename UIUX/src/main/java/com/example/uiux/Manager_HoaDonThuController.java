package com.example.uiux;

import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class Manager_HoaDonThuController extends admin_ChuyenTrangController {

    @FXML
    private TableView<Manager_HoaDonThuController.Household> tableView;

    @FXML
    private TableColumn<Manager_HoaDonThuController.Household, Integer> IdColumn;

    @FXML
    private TableColumn<Manager_HoaDonThuController.Household, String> SoTienColumn;

    @FXML
    private TableColumn<Manager_HoaDonThuController.Household, String> TenColumn;

    @FXML
    private TableColumn<Manager_HoaDonThuController.Household, String> DienThoaiColumn;

    @FXML
    private TableColumn<Manager_HoaDonThuController.Household, Integer> SoThanhVienColumn;


    public void initialize() {
        // Initialize your columns here
        IdColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getId()));
        SoTienColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getSoTien()));
        TenColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getTen()));
        DienThoaiColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getDienthoai()));
        SoThanhVienColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getSoThanhVien()));


        // Create and add data to the table
        ObservableList<Manager_HoaDonThuController.Household> data = FXCollections.observableArrayList(
                new Manager_HoaDonThuController.Household(1, 1.000.000, "Nguyễn Thị Hằng", "0989958699",2),
                new Manager_HoaDonThuController.Household(2, 200.000, "Hoàng Thị Minh Nguyệt", "0912738073",3),
                new Manager_HoaDonThuController.Household(2, 340.000, "Nguyễn Thanh Mai", "09112345678",3),
                new Manager_HoaDonThuController.Household(2, 450.000, "Trần Ngọc Linh", "09198765432",1),
                new Manager_HoaDonThuController.Household(2, 205.000, "Nguyễn Ngọc Khánh", "09123456789",2),
                new Manager_HoaDonThuController.Household(2, 201.000, "Nguyễn Tiến Dũng", "09187654321",4),
                new Manager_HoaDonThuController.Household(2, 206.000, "Mai Ngọc Linh", "09134567890",3),
//                new Manager_HoaDonThuController.Household(2, "108", "Phạm Ngọc Ngà", "09176543210",2),
//                new Manager_HoaDonThuController.Household(2, "201", "Trần Phương Anh", "09154321098",2),
//                new Manager_HoaDonThuController.Household(2, "202", "Lương Thanh Hà", "09189012345",3)

            /* dự phòng
                new admin_ThongTinNhanKhauController.Household(1, "203", "Lương Văn Đức", "0989958699",2,"..."),
                new admin_ThongTinNhanKhauController.Household(2, "204", "Trần Ngọc An", "0912738073",3,"..."),
                new admin_ThongTinNhanKhauController.Household(2, "205", "Trần Trọng Hoàng", "09112345678",3,"..."),
                new admin_ThongTinNhanKhauController.Household(2, "206", "Trần Ngọc Linh", "09198765432",3,"..."),
                new admin_ThongTinNhanKhauController.Household(2, "207", "Nguyễn Ngọc Khánh", "09123456789",3,"..."),
                new admin_ThongTinNhanKhauController.Household(2, "208", "Nguyễn Tiến Dũng", "09187654321",3,"..."),
                new admin_ThongTinNhanKhauController.Household(2, "301", "Mai Ngọc Linh", "09134567890",3,"..."),
                new admin_ThongTinNhanKhauController.Household(2, "302", "Phạm Ngọc Ngà", "09176543210",3,"..."),
                new admin_ThongTinNhanKhauController.Household(2, "303", "Trần Phương Anh", "09154321098",3,"...")
                new admin_ThongTinNhanKhauController.Household(2, "304", "Lương Thanh Hà", "09189012345",3,"...")
            */
        );

        SoThanhVienColumn.setCellFactory(column -> new TableCell<Household, Integer>() {
            @Override
            protected void updateItem(Integer item, boolean empty) {
                super.updateItem(item, empty);
                if (item == null || empty) {
                    setText(null);
                    setStyle("");
                } else {
                    // Format cell
                    setText(item.toString()); // Convert integer to String
                    getStyleClass().add("center-aligned-cell"); // apply the CSS class
                }
            }
        });
        tableView.setItems(data);
    }

    // ... other methods as needed
    public class Household {
        private int id;
        private int soTien;
        private String chuHo;
        private String dienthoai;
        private int soThanhVien;

        public Household(int id, int soTien, String chuHo, String dienthoai,int soThanhVien) {
            this.id = id;
            this.soTien = soTien;
            this.chuHo = chuHo;
            this.dienthoai = dienthoai;
            this.soThanhVien = soThanhVien;
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
            return chuHo;
        }

        public void setTen(String chuHo) {
            this.chuHo = chuHo;
        }

        public String getDienthoai() {
            return dienthoai;
        }

        public void setDienthoai(String dienthoai) {
            this.dienthoai = dienthoai;
        }

        public int getSoThanhVien() {
            return soThanhVien;
        }

        public void setSoThanhVien(int soThanhVien) {
            this.soThanhVien = soThanhVien;
        }


    }

}



