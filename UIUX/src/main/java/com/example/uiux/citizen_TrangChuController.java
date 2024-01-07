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
        loadHeadlines("Giáng sinh 2023","Chung cư iHopT tô chức lễ giáng sinh cho toàn bộ trẻ em trong khu chung cư. Địa điểm diễn ra ở sảnh chung cư");
        loadNewsContent("Trung thu 2023","Quyên góp ủng hộ","Trao trưởng","Chung cư iHoptT tổ chức trung thu cho toàn bộ trẻ em trong khu chung cư","Chung cư iHopT tổ chức quyên góp ủng hộ nạn nhân vụ cháy chung cư Khương Hạ","Tuyên dương các em học sinh xuất sắc học kì 1 năm học 2023-2024");
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
    private void loadNewsContent(String headline1, String headline2, String headline3, String newscontent1, String newscontent2, String newscontent3){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("TinTuc_news.fxml"));
            NewsController newsController = new NewsController(headline1, headline2, headline3, newscontent1, newscontent2, newscontent3);
            loader.setController(newsController);
            loader.load();
            headlineColumn.getChildren().add(loader.getRoot());

        }catch (IOException e){
            e.printStackTrace();
        }
    }
    private void loadHeadlines(String headline, String content) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("TinTuc_headline.fxml"));
            HeadLineController headlineController = new HeadLineController(headline, content);
            loader.setController(headlineController);
            loader.load();
            headlineColumn.getChildren().add(loader.getRoot());

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
