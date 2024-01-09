package com.example.uiux;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.util.Objects;

public class citizen_ChatController extends citizen_ChuyenTrangController {
    @FXML
    private void avatarClicked(){
        Main.loadScene("citizen_ThongTinTaiKhoan.fxml");
    }
    @FXML
    private VBox chatColumn;
    @FXML
    private VBox userColumn;
    @FXML
    private VBox adminColumn;
    @FXML
    private ScrollPane adminScroll;
    @FXML
    private ScrollPane chatScroll;
    @FXML
    private ScrollPane userScroll;
    @FXML
    private TextField textBos;
    @FXML
    public void initialize() {
        chatScroll.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        userScroll.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        adminScroll.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        loadUsers("Anh sẽ cử người xuống xem xét","Chu Hữu Phúc", "Quản trị",true);
        loadUsers("Bây giờ xe điện chỉ được sạc trước 22h thôi nhé  ","Nguyễn Thu Trang", "Quản lý",false);
        loadUsers("Nhà ông bà tắt nhạc đi được không? Ai mà ngủ được","Phòng 409","Cư dân", false);
        loadUsers("Sao khu nhà bà hôi thế?","Phòng 509","Cư dân",false);

        loadMessages("Tầng này có mùi hôi quá anh",0);
        loadMessages("Anh sẽ cử người xuống xem xét",1);


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
    @FXML
    private void sendMessage(){
        if (!(textBos.getText().isEmpty())) {
            loadMessages(textBos.getText(), 0);
            textBos.setText("");
        }
    }
}
