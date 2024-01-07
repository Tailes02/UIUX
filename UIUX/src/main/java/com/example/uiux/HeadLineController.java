package com.example.uiux;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.net.URISyntaxException;

public class HeadLineController {
    @FXML
    private Label headline;
    @FXML
    private ImageView thumbnail;
    @FXML
    private Text news;

    private String h;
    private String n;
    private String t;

    public HeadLineController(String h, String n, String t){
        this.h=h;
        this.n=n;
        this.t=t;
    }
    @FXML
    public void initialize() throws URISyntaxException {
        headline.setText(h);
        news.setText(n);
        thumbnail.setImage((new Image(getClass().getResource(t).toURI().toString())));
        }

    }



