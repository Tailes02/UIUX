package com.example.uiux;

import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;

import java.net.URL;
import java.util.ResourceBundle;

public class HomeLayoutRemakeController implements Initializable {

    @FXML
    private GridPane LeftSideGrid;

    @FXML
    private GridPane HeaderGrid;

    @FXML
    private GridPane InformationGrid;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Set constraints for LeftSideGrid
        ColumnConstraints leftColumn1 = new ColumnConstraints();
        leftColumn1.setHgrow(Priority.SOMETIMES);
        leftColumn1.setMinWidth(64.0);
        leftColumn1.setPrefWidth(64.0);

        ColumnConstraints leftColumn2 = new ColumnConstraints();
        leftColumn2.setHgrow(Priority.SOMETIMES);
        leftColumn2.setMinWidth(64.0);
        leftColumn2.setPrefWidth(64.0);

        RowConstraints leftRow1 = new RowConstraints();
        leftRow1.setMinHeight(36.0);
        leftRow1.setPrefHeight(36.0);
        leftRow1.setVgrow(Priority.SOMETIMES);

        RowConstraints leftRow2 = new RowConstraints();
        leftRow2.setMinHeight(36.0);
        leftRow2.setPrefHeight(36.0);
        leftRow2.setVgrow(Priority.SOMETIMES);

        LeftSideGrid.getColumnConstraints().addAll(leftColumn1, leftColumn2);
        LeftSideGrid.getRowConstraints().addAll(leftRow1, leftRow2);
    }
}


