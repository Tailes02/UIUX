package com.example.uiux;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

import java.io.IOException;

public class citizen_TrangChuController extends citizen_ChuyenTrangController{
    @FXML
    private void avatarClicked(){
        Main.loadScene("citizen_ThongTinTaiKhoan.fxml");
    }
    @FXML
    private VBox newsColumn;
    @FXML
    private ScrollPane newsScroll;
    @FXML
    private ScrollPane headlineScroll;
    @FXML
    private Label headline;
    @FXML
    private TextFlow newsContent;
    @FXML
    private Text news;
    @FXML
    private VBox headlineColumn;
    @FXML
    private void initialize(){
        newsScroll.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        headlineScroll.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        loadNews("Chung cư iHopT tổ chức lễ giáng sinh","Giáng sinh 2023", false);
        loadNews("Ban quản lý tổ chức khen thưởng cho học sinh xuất sắc","Tổng kết học kì 1 2023", false);
        loadHeadlines("Giáng sinh 2023","Không khí Giáng Sinh đang tràn ngập trên khắp phố phường và len lỏi trong từng con ngõ nhỏ. Tại mỗi quốc gia, mỗi khu vực trên thế giới lại có những phong tục độc đáo riêng để đón chào ngày lễ. Chúng ta đã chiêm ngưỡng cây thông Noel với ánh đèn rực rỡ muôn màu, Ngày của người lớn, của trẻ thơ với các ước nguyện hồn nhiên, trong trẻo",true);
        loadHeadlines("Tổng kết học kì 1 2023-2024","Chung cư iHopT tổ chức trao thưởng cho học sinh xuất sắc học kì 1 năm học 2023-2024", false);
        loadHeadlines("Trung thu 2023","Chung cư iHopT tổ chức lễ trung thu cho toàn bộ trẻ em thuộc địa bàn chung cư iHopT", false);


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
    private void loadHeadlines(String headline, String content, boolean largePhoto) {
        try {
            FXMLLoader loader = new FXMLLoader();
            if (largePhoto)
                loader = new FXMLLoader(getClass().getResource("TinTuc_headline.fxml"));
            else
                loader = new FXMLLoader(getClass().getResource("TinTuc_news.fxml"));
            HeadLineController headlineController = new HeadLineController(headline, content);
            loader.setController(headlineController);
            loader.load();
            headlineColumn.getChildren().add(loader.getRoot());

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
