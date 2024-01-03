package com.example.uiux;

import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class admin_ThongTinNhanKhauController extends admin_ChuyenTrangController {

    @FXML
    private TableView<admin_ThongTinNhanKhauController.Household> tableView;

    @FXML
    private TableColumn<admin_ThongTinNhanKhauController.Household, Integer> IdColumn;

    @FXML
    private TableColumn<admin_ThongTinNhanKhauController.Household, String> CanHoColumn;

    @FXML
    private TableColumn<admin_ThongTinNhanKhauController.Household, String> ChuHoColumn;

    @FXML
    private TableColumn<admin_ThongTinNhanKhauController.Household, String> DienThoaiColumn;

    @FXML
    private TableColumn<admin_ThongTinNhanKhauController.Household, Integer> SoThanhVienColumn;


    public void initialize() {
        // Initialize your columns here
        IdColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getId()));
        CanHoColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getCanHo()));
        ChuHoColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getChuHo()));
        DienThoaiColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getDienthoai()));
        SoThanhVienColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getSoThanhVien()));


        // Create and add data to the table
        ObservableList<admin_ThongTinNhanKhauController.Household> data = FXCollections.observableArrayList(
                new admin_ThongTinNhanKhauController.Household(1, "101", "Nguyễn Thị Hằng", "0989958699",2),
                new admin_ThongTinNhanKhauController.Household(2, "102", "Hoàng Thị Minh Nguyệt", "0912738073",3),
                new admin_ThongTinNhanKhauController.Household(2, "103", "Nguyễn Thanh Mai", "09112345678",3),
                new admin_ThongTinNhanKhauController.Household(2, "104", "Trần Ngọc Linh", "09198765432",1),
                new admin_ThongTinNhanKhauController.Household(2, "105", "Nguyễn Ngọc Khánh", "09123456789",2),
                new admin_ThongTinNhanKhauController.Household(2, "106", "Nguyễn Tiến Dũng", "09187654321",4),
                new admin_ThongTinNhanKhauController.Household(2, "107", "Mai Ngọc Linh", "09134567890",3),
                new admin_ThongTinNhanKhauController.Household(2, "108", "Phạm Ngọc Ngà", "09176543210",2),
                new admin_ThongTinNhanKhauController.Household(2, "201", "Trần Phương Anh", "09154321098",2),
                new admin_ThongTinNhanKhauController.Household(2, "202", "Lương Thanh Hà", "09189012345",3)

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
        private String canHo;
        private String chuHo;
        private String dienthoai;
        private int soThanhVien;

        public Household(int id, String canHo, String chuHo, String dienthoai,int soThanhVien) {
            this.id = id;
            this.canHo = canHo;
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

        public String getCanHo() {
            return canHo;
        }

        public void setCanHo(String canHo) {
            this.canHo = canHo;
        }

        public String getChuHo() {
            return chuHo;
        }

        public void setChuHo(String chuHo) {
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



