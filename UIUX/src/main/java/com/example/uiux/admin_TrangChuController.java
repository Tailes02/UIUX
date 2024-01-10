package com.example.uiux;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.image.ImageView;
import javafx.geometry.Insets;
import java.io.IOException;
import javafx.scene.text.Font;
import javafx.scene.image.Image;
import javafx.stage.FileChooser;
import java.io.File;


import java.io.IOException;

public class admin_TrangChuController extends admin_ChuyenTrangController {
    @FXML
    private VBox newsColumn, headlineColumn;
    @FXML
    private ScrollPane newsScroll, headlineScroll;
    @FXML
    private Button ButtonThemSuKien;

    private void handleButtonThemSuKienAction() {
        Dialog<Void> dialog = new Dialog<>();
        dialog.setTitle("Tạo Sự Kiện");
        final String[] imageURL = {""};

        // Set the button types.
        ButtonType xacNhanButtonType = new ButtonType("Xác Nhận", ButtonBar.ButtonData.OK_DONE);
        ButtonType huyButtonType = new ButtonType("Hủy", ButtonBar.ButtonData.CANCEL_CLOSE);
        dialog.getDialogPane().getButtonTypes().addAll(xacNhanButtonType, huyButtonType);

        // Create the content for the dialog.
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20, 150, 10, 10));

        Text title = new Text("Tạo sự kiện");
        title.setFont(new Font(20));

        TextField tenSuKien = new TextField();
        tenSuKien.setPromptText("Tên sự kiện");
        tenSuKien.setPrefWidth(300);

        TextArea noiDung = new TextArea();
        noiDung.setPromptText("Nội dung");
        noiDung.setPrefWidth(300);

        ImageView hinhAnh = new ImageView();
        hinhAnh.setFitWidth(200);
        hinhAnh.setFitHeight(150);
        hinhAnh.setPreserveRatio(true);

        Button chooseImageButton = new Button("Chọn Hình Ảnh");
        chooseImageButton.setOnAction(e -> {
            // Create a FileChooser object
            FileChooser fileChooser = new FileChooser();

            // Set the title for the FileChooser dialog
            fileChooser.setTitle("Select Image File");

            // Set extension filter to select only image files
            fileChooser.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.jpeg", "*.gif")
            );

            // Show open file dialog and wait for the user to select a file
            File selectedFile = fileChooser.showOpenDialog(null);

            // Check if a file is selected
            if (selectedFile != null) {
                // Create an image from the file path and set it to the ImageView
                imageURL[0] = selectedFile.toURI().toString();
                System.out.println(imageURL[0]);
                Image image = new Image(imageURL[0]);
                hinhAnh.setImage(image);
            }

        });
        Button okButton = (Button) dialog.getDialogPane().lookupButton(xacNhanButtonType);
        okButton.setOnAction(event -> {
            loadNews(noiDung.getText(),tenSuKien.getText(), false);
            loadHeadlines(tenSuKien.getText(),noiDung.getText(), imageURL[0], false,false);
        });

        grid.add(title, 0, 0, 2, 1);
        grid.add(new Text("Tên sự kiện:"), 0, 1);
        grid.add(tenSuKien, 1, 1);
        grid.add(new Text("Nội dung:"), 0, 2);
        grid.add(noiDung, 1, 2);
        grid.add(new Text("Hình ảnh:"), 0, 3);
        grid.add(hinhAnh, 1, 3);
        grid.add(chooseImageButton, 1, 4);

        dialog.getDialogPane().setContent(grid);
        dialog.showAndWait();

    }

    @FXML
    private void initialize(){
        newsScroll.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        headlineScroll.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        loadNews("Chung cư iHopT tổ chức lễ giáng sinh","Giáng sinh 2023", false);
        loadNews("Ban quản lý tổ chức khen thưởng cho học sinh xuất sắc","Tổng kết học kì 1 2023", false);
        loadNews("Yêu cầu mỗi hộ cử 1 người tham gia","Họp tổ dân phố 12/2023", false);
        loadNews("Hóa đơn đã được gửi đến từng hộ","Hóa đơn tháng 12/2023", false);
        loadHeadlines("Giáng sinh 2023","Không khí Giáng Sinh đang tràn ngập trên khắp phố phường và len lỏi trong từng con ngõ nhỏ. Tại mỗi quốc gia, mỗi khu vực trên thế giới lại có những phong tục độc đáo riêng để đón chào ngày lễ. Chúng ta đã chiêm ngưỡng cây thông Noel với ánh đèn rực rỡ muôn màu, Ngày của người lớn, của trẻ thơ với các ước nguyện hồn nhiên, trong trẻo","/icon/Giang-Sinh.jpg",true, true);
        loadHeadlines("Tổng kết học kì 1 2023-2024","Chung cư iHopT tổ chức trao thưởng cho học sinh xuất sắc học kì 1 năm học 2023-2024","/icon/1_1.jpg", false, true);
        loadHeadlines("Trung thu 2023","Chung cư iHopT tổ chức lễ trung thu cho toàn bộ trẻ em thuộc địa bàn chung cư iHopT","/icon/2022_09_10_22_16_301.jpg", false, true);
        ButtonThemSuKien.setOnAction(e -> handleButtonThemSuKienAction());


    }

    private void loadNews(String preview, String user, Boolean highlight){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Chat_user.fxml"));
            ChatUserController chatUserController = new ChatUserController(preview, user, highlight);
            loader.setController(chatUserController);
            loader.load();
            newsColumn.getChildren().add(loader.getRoot());

        }catch (IOException e){
            e.printStackTrace();
        }
    }
    private void loadHeadlines(String headline, String content, String thumbnail, boolean largePhoto, boolean resource) {
        try {
            FXMLLoader loader = new FXMLLoader();
            if (largePhoto)
                loader = new FXMLLoader(getClass().getResource("TinTuc_headline.fxml"));
            else
                loader = new FXMLLoader(getClass().getResource("TinTuc_news.fxml"));
            HeadLineController headlineController = new HeadLineController(headline, content,thumbnail, resource);
            loader.setController(headlineController);
            loader.load();
            headlineColumn.getChildren().add(loader.getRoot());

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
