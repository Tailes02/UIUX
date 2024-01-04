package com.example.uiux;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class ChatUserController {

    @FXML
    private Text username;
    @FXML
    private Text preview;
    @FXML
    private Pane pane;

    private String u;
    private String p;
    private boolean h;

    public ChatUserController(String p, String u, boolean h){
        this.u=u;
        this.p=p;
        this.h=h;
    }
    @FXML
    public void initialize(){
        this.username.setText(u);
        if (p.length()>32)
            this.preview.setText(p.substring(0,32)+"...");
        else
            this.preview.setText(p);
        if (h){
            pane.setStyle("-fx-background-color: #0B8C56 ; -fx-background-radius: 20");
            preview.setFill(Color.rgb(255,255,255));
            username.setFill(Color.rgb(255,255,255));
        }

    }
}
