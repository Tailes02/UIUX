package com.example.uiux;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

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



