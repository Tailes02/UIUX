package com.example.uiux;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

public class ChatMessageController {
    @FXML
    private Label message;
    private String m;
    private int t;

    public ChatMessageController(String m, int t){
        this.m=m;
        this.t=t;
    }
    @FXML
    public void initialize(){
        message.setText(m);
    }
}
