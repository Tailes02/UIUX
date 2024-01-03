package com.example.uiux;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class admin_ChatController extends admin_ChuyenTrangController {
    @FXML
    private VBox chatColumn;

    @FXML
    private VBox userColumn;

    @FXML
    public void initialize() {
        loadUsers("Anh ơi nhà em mất điện rồi, anh giúp em với","Le Ngoc Dang Khoa");
        loadUsers("Anh ơi nhà em mất điện rồi, anh giúp em với","Le Ngoc Dang Khoa");
        loadUsers("Anh ơi nhà em mất điện rồi, anh giúp em với","Le Ngoc Dang Khoa");
        loadUsers("Anh ơi nhà em mất điện rồi, anh giúp em với","Le Ngoc Dang Khoa");
        loadUsers("Anh ơi nhà em mất điện rồi, anh giúp em với","Le Ngoc Dang Khoa");
        loadUsers("Anh ơi nhà em mất điện rồi, anh giúp em với","Le Ngoc Dang Khoa");
        loadUsers("Anh ơi nhà em mất điện rồi, anh giúp em với","Le Ngoc Dang Khoa");
        loadUsers("Anh ơi nhà em mất điện rồi, anh giúp em với","Le Ngoc Dang Khoa");
        loadUsers("Anh ơi nhà em mất điện rồi, anh giúp em với","Le Ngoc Dang Khoa");
        loadUsers("Anh ơi nhà em mất điện rồi, anh giúp em với","Le Ngoc Dang Khoa");
        loadUsers("Anh ơi nhà em mất điện rồi, anh giúp em với","Le Ngoc Dang Khoa");
        loadUsers("Anh ơi nhà em mất điện rồi, anh giúp em với","Le Ngoc Dang Khoa");


        loadMessages("Anh ơi nhà em mất điện rồi, anh giúp em với","Le Ngoc Dang Khoa",1);
        loadMessages("Sao thế em?","Le Ngoc Dang Khoa",0);
        loadMessages("Anh ơi nhà em mất điện rồi, anh giúp em với","Le Ngoc Dang Khoa",1);
        loadMessages("Sao thế em?","Le Ngoc Dang Khoa",0);
        loadMessages("Anh ơi nhà em mất điện rồi, anh giúp em với","Le Ngoc Dang Khoa",1);
        loadMessages("Sao thế em?","Le Ngoc Dang Khoa",0);
        loadMessages("Anh ơi nhà em mất điện rồi, anh giúp em với","Le Ngoc Dang Khoa",1);
        loadMessages("Sao thế em?","Le Ngoc Dang Khoa",0);
        loadMessages("Anh ơi nhà em mất điện rồi, anh giúp em với","Le Ngoc Dang Khoa",1);
        loadMessages("Sao thế em?","Le Ngoc Dang Khoa",0);
        loadMessages("Anh ơi nhà em mất điện rồi, anh giúp em với","Le Ngoc Dang Khoa",1);
        loadMessages("Sao thế em?","Le Ngoc Dang Khoa",0);
        loadMessages("Anh ơi nhà em mất điện rồi, anh giúp em với","Le Ngoc Dang Khoa",1);
        loadMessages("Sao thế em?","Le Ngoc Dang Khoa",0);
    }
    private void loadUsers(String preview, String user){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Chat_user.fxml"));
            ChatUserController chatUserController = new ChatUserController(preview, user);
            loader.setController(chatUserController);
            loader.load();
            userColumn.getChildren().add(loader.getRoot());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    private void loadMessages(String message, String user, int type){
        //type = 0 là tin nhắn của mình, type = 1 là tin nhắn của đối phương
        try {
            FXMLLoader loader = new FXMLLoader();
            if (type==0)
                loader = new FXMLLoader(getClass().getResource("Chat_you.fxml"));
            else
                loader = new FXMLLoader(getClass().getResource("Chat_opponent.fxml"));
            ChatMessageController chatMessageController = new ChatMessageController(message, user, type);
            loader.setController(chatMessageController);
            loader.load();
            chatColumn.getChildren().add(loader.getRoot());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
