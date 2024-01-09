package com.example.uiux;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

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
    private boolean r;

    public HeadLineController(String h, String n, String t, boolean r){
        this.h=h;
        this.n=n;
        this.t=t;
        this.r=r;
    }
    @FXML
    public void initialize() throws URISyntaxException {
        headline.setText(h);
        news.setText(n);
        if (r)
            thumbnail.setImage((new Image(getClass().getResource(t).toURI().toString())));
        else
            thumbnail.setImage(new Image(t));
        }
    @FXML
    public void newsDetail() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("TinTuc_detail.fxml"));
            Parent root = loader.load();

            Stage popupStage = new Stage();
            popupStage.initModality(Modality.APPLICATION_MODAL);
            popupStage.setTitle("Chung cư iHopT tổ chức lễ giáng sinh");

            Scene scene = new Scene(root);
            popupStage.setScene(scene);


            popupStage.setOnCloseRequest(event -> {
                event.consume();

                popupStage.close();
            });

            // Show the popup
            popupStage.showAndWait();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}



