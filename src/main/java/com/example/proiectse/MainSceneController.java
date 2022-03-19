package com.example.proiectse;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.*;

public class MainSceneController {

    ObservableList<String> ageList = FXCollections.observableArrayList("18 - 35","36 - 50", "51+");
    ObservableList<String> tempList = FXCollections.observableArrayList("Warm","Cold","Temperate","Irrelevant");
    ObservableList<String> activList = FXCollections.observableArrayList("Relaxing","Recreative","Sport","Irrelevant");
    ObservableList<String> budgetList = FXCollections.observableArrayList("Low","Medium","High");
    ObservableList<String> locationList = FXCollections
            .observableArrayList("Inside the country","Inside the continent","Everywhere in the world");

    @FXML
    private AnchorPane anchorPane;
    @FXML
    private ChoiceBox ageChoiceBox;
    @FXML
    private ChoiceBox tempChoiceBox;
    @FXML
    private ChoiceBox activChoiseBox;
    @FXML
    private ChoiceBox budgetChoiseBox;
    @FXML
    private ChoiceBox locationChoiseBox;
    @FXML
    private Button submitButton;

    @FXML
    private void initialize(){
        ageChoiceBox.setItems(ageList);
        tempChoiceBox.setItems(tempList);
        activChoiseBox.setItems(activList);
        budgetChoiseBox.setItems(budgetList);
        locationChoiseBox.setItems(locationList);

        LinearGradient linearGradient = new LinearGradient(0,0,1,1, true, CycleMethod.NO_CYCLE,
                new Stop(0, Color.web("#3391d1")), new Stop(1, Color.web("#2c4053")));
        BackgroundFill backgroundFill = new BackgroundFill(linearGradient, CornerRadii.EMPTY, Insets.EMPTY);
        anchorPane.setBackground(new Background(backgroundFill));
    }

}