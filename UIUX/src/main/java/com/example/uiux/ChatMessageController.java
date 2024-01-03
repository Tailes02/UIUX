package com.example.uiux;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class ChatMessageController {
    @FXML
    private Text username;
    @FXML
    private Text message;

    private String u;
    private String m;
    private int t;

    public ChatMessageController(String m, String u, int t){
        this.u=u;
        this.m=m;
        this.t=t;
    }
    @FXML
    public void initialize(){
        message.setText(m);
        if (t!=0)
            username.setText(u);
    }
}
