package com.example.proiectse;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;

public class MainSceneController {

    ObservableList<String> ageList = FXCollections.observableArrayList("18 - 35","36 - 50", "51+");
    ObservableList<String> tempList = FXCollections.observableArrayList("Warm","Cold","Temperate","Irrelevant");
    ObservableList<String> activList = FXCollections.observableArrayList("Relaxing","Recreative","Sport","Irrelevant");
    ObservableList<String> budgetList = FXCollections.observableArrayList("Low","Medium","High");
    ObservableList<String> locationList = FXCollections
            .observableArrayList("Inside the country","Inside the continent","Everywhere in the world");

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
        budgetChoiseBox.setItems(budgetList);;
        locationChoiseBox.setItems(locationList);
    }

}
