package com.example.uiux;

import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class admin_ThongTinCanHoController extends admin_ChuyenTrangController {
    @FXML
    Button ButtonTimKiem;
    @FXML
    private TextField searchTextField;
    @FXML
    private void handleTimKiem(ActionEvent event){
        String keyword = searchTextField.getText().toLowerCase();
        FilteredList<Household> filteredData = new FilteredList<>(tableView.getItems(), p -> true);

        filteredData.setPredicate(household -> {
            return keyword.isEmpty() ||
                    household.getCanHo().toLowerCase().contains(keyword) ||
                    household.getChuHo().toLowerCase().contains(keyword) ||
                    household.getDienthoai().toLowerCase().contains(keyword) ||
                    String.valueOf(household.getId()).toLowerCase().contains(keyword) ||
                    String.valueOf(household.getSoThanhVien()).toLowerCase().contains(keyword);
        });


        if (!filteredData.isEmpty()) {
            tableView.setItems(filteredData);
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Thông báo");
            alert.setHeaderText(null);
            alert.setContentText("Không tìm thấy thông tin phù hợp!");
            alert.showAndWait();
        }

    }

    @FXML
    private TableView<admin_ThongTinCanHoController.Household> tableView;

    @FXML
    private TableColumn<admin_ThongTinCanHoController.Household, Integer> IdColumn;

    @FXML
    private TableColumn<admin_ThongTinCanHoController.Household, String> CanHoColumn;

    @FXML
    private TableColumn<admin_ThongTinCanHoController.Household, String> ChuHoColumn;

    @FXML
    private TableColumn<admin_ThongTinCanHoController.Household, String> DienThoaiColumn;

    @FXML
    private TableColumn<admin_ThongTinCanHoController.Household, Integer> SoThanhVienColumn;

    @FXML
    private Button ButtonXemChiTiet;

    @FXML
    public void handleXemChiTietButton(){
        Main.loadScene("admin_ThongTinChiTietCanHo.fxml");
    }

    public void handleThemTaiKhoanButton(){
        Main.loadScene("admin_ThemTaiKhoan.fxml");
    }


    public void initialize() {
        // Initialize your columns here
        IdColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getId()));
        CanHoColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getCanHo()));
        ChuHoColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getChuHo()));
        DienThoaiColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getDienthoai()));
        SoThanhVienColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getSoThanhVien()));

        CanHoColumn.setCellFactory(column -> new TableCell<Household, String>() {
            @Override
            protected void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                if (item == null || empty) {
                    setText(null);
                    setStyle("");
                } else {
                    setText(item); // Set the text of the cell to the value of the item

                    if ("101".equals(item)) {
                        setStyle("-fx-text-fill: red;");
                    } else {
                        setStyle("-fx-text-fill: black;");
                    }
                }
            }
        });

        // Create and add data to the table
        ObservableList<admin_ThongTinCanHoController.Household> data = FXCollections.observableArrayList(
                new admin_ThongTinCanHoController.Household(1, "101", "Nguyễn Thị Hằng", "0989958699",2),
                new admin_ThongTinCanHoController.Household(2, "102", "Hoàng Thị Minh Nguyệt", "0912738073",3),
                new admin_ThongTinCanHoController.Household(2, "103", "Nguyễn Thanh Mai", "09112345678",3),
                new admin_ThongTinCanHoController.Household(2, "104", "Trần Ngọc Linh", "09198765432",1),
                new admin_ThongTinCanHoController.Household(2, "105", "Nguyễn Ngọc Khánh", "09123456789",2),
                new admin_ThongTinCanHoController.Household(2, "106", "Nguyễn Tiến Dũng", "09187654321",4),
                new admin_ThongTinCanHoController.Household(2, "107", "Mai Ngọc Linh", "09134567890",3),
                new admin_ThongTinCanHoController.Household(2, "108", "Phạm Ngọc Ngà", "09176543210",2),
                new admin_ThongTinCanHoController.Household(2, "202", "Lương Thanh Hà", "09189012345",3)

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

                    setText(item.toString()); // Convert integer to String
                    getStyleClass().add("center-aligned-cell"); // apply the CSS class
                }
            }
        });
        tableView.setItems(data);

        tableView.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            if (newSelection == null) {
                // No row selected, disable the button and reset style
                ButtonXemChiTiet.setDisable(true);
                ButtonXemChiTiet.setStyle("-fx-background-radius: 20; -fx-background-color: #c4c2c2; -fx-border-radius: 20;");
            } else {
                // A row is selected, enable the button and change style
                ButtonXemChiTiet.setDisable(false);
                ButtonXemChiTiet.setStyle("-fx-background-radius: 20; -fx-background-color: #ffffff; -fx-border-radius: 20; -fx-border-color: #0B8C56;");
            }
        });

        // Initialize the button as disabled since initially no row is selected
        ButtonXemChiTiet.setDisable(true);
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



