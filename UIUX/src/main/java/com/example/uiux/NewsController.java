package com.example.uiux;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

public class NewsController {
    @FXML
    private Label headline1;
    @FXML
    private Label headline2;
    @FXML
    private Label headline3;
    @FXML
    private TextFlow newsContent1;
    @FXML
    private TextFlow newsContent2;
    @FXML
    private TextFlow newsContent3;
    @FXML
    private Text news1;
    @FXML
    private Text news2;
    @FXML
    private Text news3;

    private String h1;
    private String h2;
    private String h3;
    private String n1;
    private String n2;
    private String n3;

    public NewsController(String h1, String h2, String h3, String n1, String n2, String n3){
        this.h1=h1;
        this.h2=h2;
        this.h3=h3;
        this.n1=n1;
        this.n2=n2;
        this.n3=n3;
    }
    @FXML
    public void initialize(){
        if (h1.length()>15)
            this.headline1.setText(h1.substring(0,15)+"...");
        else
            this.headline1.setText(h1);
        if (h2.length()>15)
            this.headline2.setText(h2.substring(0,15)+"...");
        else
            this.headline2.setText(h2);
        if (h3.length()>15)
            this.headline3.setText(h3.substring(0,15)+"...");
        else
            this.headline3.setText(h3);
        news1.setText(n1);
        news1.setFont(Font.font("Helvetica", FontWeight.NORMAL, 18));
        newsContent1.getChildren().add(news1);
        news2.setText(n2);
        news2.setFont(Font.font("Helvetica", FontWeight.NORMAL, 18));
        newsContent2.getChildren().add(news2);
        news3.setText(n3);
        news3.setFont(Font.font("Helvetica", FontWeight.NORMAL, 18));
        newsContent3.getChildren().add(news3);
        }

    }



