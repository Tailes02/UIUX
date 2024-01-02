package com.example.uiux;

import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class controller_ThongTinNhanKhauController extends admin_ChuyenTrangController {

    @FXML
    private TableView<controller_ThongTinNhanKhauController.Household> tableView;

    @FXML
    private TableColumn<controller_ThongTinNhanKhauController.Household, Integer> IdColumn;

    @FXML
    private TableColumn<controller_ThongTinNhanKhauController.Household, String> CanHoColumn;

    @FXML
    private TableColumn<controller_ThongTinNhanKhauController.Household, String> ChuHoColumn;

    @FXML
    private TableColumn<controller_ThongTinNhanKhauController.Household, String> DienThoaiColumn;

    @FXML
    private TableColumn<controller_ThongTinNhanKhauController.Household, Integer> SoThanhVienColumn;
    @FXML
    private TableColumn<controller_ThongTinNhanKhauController.Household, String> ThongTinChiTietColumn;

    @FXML
    public void initialize() {
        // Initialize your columns here
        IdColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getId()));
        CanHoColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getCanHo()));
        ChuHoColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getChuHo()));
        DienThoaiColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getDienthoai()));
        SoThanhVienColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getSoThanhVien()));
        ThongTinChiTietColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getChiTiet()));


        // Create and add data to the table
        ObservableList<controller_ThongTinNhanKhauController.Household> data = FXCollections.observableArrayList(
                new controller_ThongTinNhanKhauController.Household(1, "101", "Nguyễn Thị Hằng", "0989958699",2,"..."),
                new controller_ThongTinNhanKhauController.Household(2, "102", "Hoàng Thị Minh Nguyệt", "0912738073",3,"...")
                // Add other data here...
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
        private String chiTiet;

        public Household(int id, String canHo, String chuHo, String dienthoai,int soThanhVien,String chiTietq) {
            this.id = id;
            this.canHo = canHo;
            this.chuHo = chuHo;
            this.dienthoai = dienthoai;
            this.soThanhVien = soThanhVien;
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

        public String getChiTiet() {
            return chiTiet;
        }

        public void setChiTiet(String chiTiet) {
            this.chiTiet = chiTiet;
        }
    }

}



