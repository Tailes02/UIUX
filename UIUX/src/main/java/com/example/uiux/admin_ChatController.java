package com.example.uiux;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class admin_ChatController extends admin_ChuyenTrangController {
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

        loadUsers("Tháng này có sự kiện gì không anh?","Nguyễn Thu Trang", "Quản lý",false);
        loadUsers("oke anh","Chu Hữu Phúc","Quản trị", true);
        loadUsers("Anh ơi phòng bên cạnh ồn quá","Phòng 305","Cư dân", false);
        loadUsers("Chó phòng bên mới phóng uế trước cửa nhà em anh ạ","Phòng 309", "Cư dân",false);
        loadUsers("Tầng này có mùi hôi quá anh","Phòng 509","Cư dân",false);

        loadMessages("Check phòng 306 nhé em, người ta đang phàn nàn đấy",0);
        loadMessages("Có việc gì thế anh?",1);
        loadMessages("12h đêm rồi vẫn còn bật nhạc nhẽo, đi check xem có gì phạm pháp không",0);
        loadMessages("Có thì nhớ lập biên bản nhé",0);
        loadMessages("oke anh",1);


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
