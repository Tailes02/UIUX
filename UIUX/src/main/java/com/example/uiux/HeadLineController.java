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
    private TextFlow newsContent;
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
        if (h.length()>15)
            this.headline.setText(h.substring(0,15)+"...");
        else
            this.headline.setText(h);
        news.setText(n);
        news.setFont(Font.font("Helvetica", FontWeight.NORMAL, 18));
        newsContent.getChildren().add(news);
        }

    }



