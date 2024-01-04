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
    private Label role;
    @FXML
    private Text preview;
    @FXML
    private Pane pane;

    private String u;
    private String p;
    private String r;
    private boolean h;

    public ChatUserController(String p, String u, String r, boolean h){
        this.u=u;
        this.p=p;
        this.r=r;
        this.h=h;
    }
    @FXML
    public void initialize(){
        this.username.setText(u);
        if (p.length()>22)
            this.preview.setText(p.substring(0,22)+"...");
        else
            this.preview.setText(p);
        this.role.setText(r);
        if (h){
            pane.setStyle("-fx-background-color: #0B8C56 ; -fx-background-radius: 20");

            role.setTextFill(Color.rgb(200,200,200));
            preview.setFill(Color.rgb(255,255,255));
            username.setFill(Color.rgb(255,255,255));
        }

    }
}
