package com.example.uiux;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class Manager_ChatController extends Manager_ChuyenTrangController{
    @FXML
    private VBox chatColumn;

    @FXML
    private VBox userColumn;
    @FXML
    private VBox adminColumn;
    @FXML
    private ScrollPane chatScroll;
    @FXML
    private ScrollPane userScroll;
    @FXML
    private ScrollPane adminScroll;
    @FXML
    public void initialize() {
        chatScroll.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        userScroll.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        adminScroll.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);

        loadUsers("Em đi thu tiền đến đâu rồi?","Nguyễn Thu Trang", "Quản lý",false);
        loadUsers("Check phòng 306 nhé em, người ta đang phàn nàn","Chu Hữu Phức","Quản trị", false);
        loadUsers("Anh ơi bể nước nhà em gặp vấn đề","Phòng 409","Cư dân", false);
        loadUsers("Anh ơi nhà em mất điện rồi, anh giúp em với","Phòng 309", "Cư dân",true);
        loadUsers("Bây giờ em sạc xe điện ở đâu đây anh?","Phòng 509","Cư dân",false);

        loadMessages("Anh ơi nhà em mất điện rồi, anh giúp em với",1);
        loadMessages("Sao thế em? Em trình bày cụ thể đi",0);


    }
    private void loadUsers(String preview, String user, String role, Boolean highlight){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Chat_user.fxml"));
            ChatUserController chatUserController = new ChatUserController(preview, user, highlight);
            loader.setController(chatUserController);
            loader.load();
            if (role.contains("Cư dân"))
                userColumn.getChildren().add(loader.getRoot());
            else adminColumn.getChildren().add(loader.getRoot());

        }catch (IOException e){
            e.printStackTrace();
        }
    }
    private void loadMessages(String message, int type){
        //type = 0 là tin nhắn của mình, type = 1 là tin nhắn của đối phương
        try {
            FXMLLoader loader = new FXMLLoader();
            if (type==0)
                loader = new FXMLLoader(getClass().getResource("Chat_you.fxml"));
            else
                loader = new FXMLLoader(getClass().getResource("Chat_opponent.fxml"));
            ChatMessageController chatMessageController = new ChatMessageController(message, type);
            loader.setController(chatMessageController);
            loader.load();
            chatColumn.getChildren().add(loader.getRoot());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
