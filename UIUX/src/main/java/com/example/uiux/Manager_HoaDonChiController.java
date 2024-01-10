package com.example.uiux;

import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class Manager_HoaDonChiController extends Manager_ChuyenTrangController{

    @FXML
    private TableView<HoaDonChi> tableView;

    @FXML
    private TableColumn<HoaDonChi, String> IdColumn;

    @FXML
    private TableColumn<HoaDonChi, String> TenColumn;
    @FXML
    private TableColumn<HoaDonChi, Integer> SoTienColumn;
    @FXML
    private TableColumn<HoaDonChi, String> ThoiGianColumn;


    @FXML
    private TableColumn<HoaDonChi, String> GhiChuColumn;
    public void handleThemMoi() {
        Main.loadScene("Manager_TaoHoaDonChi.fxml");
    }

    @FXML
    private CheckBox thuCheckBox;

    public void initialize() {
        // Initialize your columns here
        IdColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getId()));
        TenColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getTen()));
        ThoiGianColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getThoiGian()));
        SoTienColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getSoTien()));
        GhiChuColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getGhiChu()));
        thuCheckBox.selectedProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue) {
                navigateToHoaDonThu();
            }
        });
        SoTienColumn.setCellFactory(column -> {
            return new TableCell<HoaDonChi, Integer>() {
                @Override
                protected void updateItem(Integer item, boolean empty) {
                    super.updateItem(item, empty);

                    if (item == null || empty) {
                        setText(null);
                        setStyle("");
                    } else {
                        // Right align the text in the cell
                        setText(item.toString());
                        setAlignment(Pos.CENTER_RIGHT); // Align to right
                    }
                }
            };
        });
        ThoiGianColumn.setCellFactory(column -> {
            return new TableCell<HoaDonChi, String>() {
                @Override
                protected void updateItem(String item, boolean empty) {
                    super.updateItem(item, empty);

                    if (item == null || empty) {
                        setText(null);
                        setStyle("");
                    } else {
                        // Center align the text in the cell
                        setText(item);
                        setAlignment(Pos.CENTER); // Align to center
                    }
                }
            };
        });

        // Create and add data to the table
        ObservableList<HoaDonChi> data = FXCollections.observableArrayList(
                new HoaDonChi("00002601", "Chi tiền tu sửa tháng 10", "15/10/23",240282,""),
                new HoaDonChi("00002600", "Chi tiền sự kiện Trung Thu 2023", "01/10/23", 323932,""),
                new HoaDonChi("00002599", "Chi tiền tu sửa nhà xe tháng 9", "15/09/23", 203000,""),
                new HoaDonChi("00002598", "Chi tiền đi du lịch hè 2023", "23/08/23", 43520000,"Du lịch Đà Lạt"),
                new HoaDonChi("00002597", "Chi tiền tu sửa tháng 8", "15/08/23", 190000,""),
                new HoaDonChi("00002596", "Chi tiền thay mới bàn ghế ở sảnh", "02/05/23", 1800000,"Đổi sang sofa"),
                new HoaDonChi("00002595", "Chi tiền phí vệ sinh 2023", "31/04/23", 15000000,""),
                new HoaDonChi("00002594", "Chi tiền lắp đặt hệ thống camera", "30/04/23", 20000000,""),
                new HoaDonChi("00002593", "Chi tiền mua cây", "27/04/23", 2400000,""),
                new HoaDonChi("00002592", "Chi tiền đồng phục nhân viên", "20/04/23", 1600000,""),
                new HoaDonChi("00002591", "Chi tiền nâng cấp đường truyền mạng", "02/05/23", 1500000,""),
                new HoaDonChi("00002590", "Chi tiền nâng cấp đường truyền mạng", "02/05/23", 1500000,"")



            /* dự phòng
                new admin_ThongTinNhanKhauController.HoaDonChi(1, "203", "Lương Văn Đức", "0989958699",2,"..."),
                new admin_ThongTinNhanKhauController.HoaDonChi(2, "204", "Trần Ngọc An", "0912738073",3,"..."),
                new admin_ThongTinNhanKhauController.HoaDonChi(2, "205", "Trần Trọng Hoàng", "09112345678",3,"..."),
                new admin_ThongTinNhanKhauController.HoaDonChi(2, "206", "Trần Ngọc Linh", "09198765432",3,"..."),
                new admin_ThongTinNhanKhauController.HoaDonChi(2, "207", "Nguyễn Ngọc Khánh", "09123456789",3,"..."),
                new admin_ThongTinNhanKhauController.HoaDonChi(2, "208", "Nguyễn Tiến Dũng", "09187654321",3,"..."),
                new admin_ThongTinNhanKhauController.HoaDonChi(2, "301", "Mai Ngọc Linh", "09134567890",3,"..."),
                new admin_ThongTinNhanKhauController.HoaDonChi(2, "302", "Phạm Ngọc Ngà", "09176543210",3,"..."),
                new admin_ThongTinNhanKhauController.HoaDonChi(2, "303", "Trần Phương Anh", "09154321098",3,"...")
                new admin_ThongTinNhanKhauController.HoaDonChi(2, "304", "Lương Thanh Hà", "09189012345",3,"...")
            */
        );

        tableView.setItems(data);
    }
    private void navigateToHoaDonThu() {
        try {
            // Load HoaDonChi.fxml
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Manager_HoaDonThu.fxml"));
            Parent hoaDonChiRoot = loader.load();

            // Get the current stage from the event source
            Stage stage = (Stage) thuCheckBox.getScene().getWindow();

            // Set the new scene
            stage.setScene(new Scene(hoaDonChiRoot));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            // Handle exceptions here
        }

    }
    // ... other methods as needed
    public class HoaDonChi {
        private String id;
        private String ten;
        private String thoiGian;
        private int soTien;
        private String ghiChu;


        public HoaDonChi(String id, String ten, String thoiGian,int soTien, String ghiChu) {
            this.id = id;
            this.ten = ten;
            this.thoiGian = thoiGian;
            this.soTien = soTien;
            this.ghiChu = ghiChu;

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

        public int getSoTien() {
            return soTien;
        }

        public void setSoTien(int soTien) {
            this.soTien = soTien;
        }

        public String getGhiChu() {
            return ghiChu;
        }

        public void setGhiChu(String ghiChu) {
            this.ghiChu = ghiChu;
        }
    }

}



