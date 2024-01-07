package com.example.uiux;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

public class HeadLineController {
    @FXML
    private Label headline;
    @FXML
    private Text news;

    private String h;
    private String n;

    public HeadLineController(String h, String n){
        this.h=h;
        this.n=n;
    }
    @FXML
    public void initialize(){
        headline.setText(h);
        news.setText(n);
        }

    }



