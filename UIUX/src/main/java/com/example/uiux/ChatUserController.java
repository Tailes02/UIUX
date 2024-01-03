package com.example.uiux;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class ChatUserController {

    @FXML
    private Text username;

    @FXML
    private Text preview;

    private String u;
    private String p;

    public ChatUserController(String p, String u){
        this.u=u;
        this.p=p;
    }
    @FXML
    public void initialize(){
        this.username.setText(u);
        if (p.length()>26)
            this.preview.setText(p.substring(0,26)+"...");
        else
            this.preview.setText(p);
    }
}
