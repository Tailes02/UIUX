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
    private TableColumn<Manager_HoaDonThuController.Household, String> ThoiHanColumn;

    @FXML
    private TableColumn<Manager_HoaDonThuController.Household, Integer> TinhTrangColumn;
    @FXML
    private TableColumn<Manager_HoaDonThuController.Household, String> ThongTinChiTietColumn;

    @FXML
    public void initialize() {
        // Initialize your columns here
        IdColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getId()));
        TenColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getCanHo()));
        SoTienColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getSoTien()));
        ThoiHanColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getDienthoai()));
        TinhTrangColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getSoThanhVien()));
        ThongTinChiTietColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getChiTiet()));


        // Create and add data to the table
        ObservableList<Manager_HoaDonThuController.Household> data = FXCollections.observableArrayList(
                new Manager_HoaDonThuController.Household(1, "101", "Nguyễn Thị Hằng", "0989958699",2,"..."),
                new Manager_HoaDonThuController.Household(2, "102", "Hoàng Thị Minh Nguyệt", "0912738073",3,"..."),
                new Manager_HoaDonThuController.Household(2, "103", "Nguyễn Thanh Mai", "09112345678",3,"..."),
                new Manager_HoaDonThuController.Household(2, "104", "Trần Ngọc Linh", "09198765432",1,"..."),
                new Manager_HoaDonThuController.Household(2, "105", "Nguyễn Ngọc Khánh", "09123456789",2,"..."),
                new Manager_HoaDonThuController.Household(2, "106", "Nguyễn Tiến Dũng", "09187654321",4,"..."),
                new Manager_HoaDonThuController.Household(2, "107", "Mai Ngọc Linh", "09134567890",3,"..."),
                new Manager_HoaDonThuController.Household(2, "108", "Phạm Ngọc Ngà", "09176543210",2,"..."),
                new Manager_HoaDonThuController.Household(2, "201", "Trần Phương Anh", "09154321098",2,"..."),
                new Manager_HoaDonThuController.Household(2, "202", "Lương Thanh Hà", "09189012345",3,"...")

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

        SoTienColumn.setCellFactory(column -> new TableCell<Household, Integer>() {
            @Override
            protected void updateItem(Integer item, boolean empty) {
                super.updateItem(item, empty);
                if (item == null || empty) {
                    setText(null);
                    setStyle("");
                } else {
                    // Format cell
                    setText(item.toString()); // Convert integer to String
                    getStyleClass().add("right-center-aligned-cell"); // apply the CSS class
                }
            }
        });
        tableView.setItems(data);
    }

    // ... other methods as needed
    public class Household {
        private int id;
        private int SoTien;
        private String ten;
        private String thoiHan;
        private String tinhTrang;
        private String chiTiet;

        public Household(int id, String canHo, int soTien, String dienthoai,int soThanhVien,String chiTietq) {
            this.id = id;
            this.soTien = soTien;
            this.ten = ten;
            this.thoiHan = thoiHan;
            this.tinhTrang = tinhTrang;
            this.chiTiet = chiTiet;
        }

        // Getters and setters for each property
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCanHo() {
            return canHo;
        }

        public void setCanHo(String canHo) {
            this.canHo = canHo;
        }

        public String getThoiHan() {
            return thoiHan;
        }

        public void setThoiHan(String thoiHan) {
            this.thoiHan = thoiHan;
        }

        public String getChiTiet() {
            return chiTiet;
        }

        public void setChiTiet(String chiTiet) {
            this.chiTiet = chiTiet;
        }
    }

    public TableColumn<Household, String> getSoTienColumn() {
        return SoTienColumn;
    }

    public void setSoTienColumn(TableColumn<Household, String> soTienColumn) {
        SoTienColumn = soTienColumn;
    }
}



