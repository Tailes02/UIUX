package com.example.uiux;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
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
    private Label headline;
    @FXML
    private TextFlow newsContent;
    @FXML
    private Text news;
    @FXML
    private void initialize(){
        newsScroll.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        loadNews("Chung cư iHopT tổ chức lễ giáng sinh","Giáng sinh 2023", false);
        loadNews("Ban quản lý tổ chức khen thưởng cho học sinh xuất sắc","Tổng kết học kì 1 2023", false);
        news.setText("Chung cư iHopT tô chức lễ giáng sinh cho toàn bộ trẻ em trong khu chung cư. Địa điểm diễn ra ở sảnh chung cư");
        news.setFont(Font.font("Helvetica", FontWeight.NORMAL, 18));
        newsContent.getChildren().add(news);
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
    private void loadHeadlines(String headline, String content) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Chat_user.fxml"));
            //ChatUserController chatUserController = new ChatUserController(preview, user, highlight);
            //loader.setController(chatUserController);
            loader.load();
            newsColumn.getChildren().add(loader.getRoot());

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
