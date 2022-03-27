package com.example.proiectse;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.*;

public class MainSceneController {

    ObservableList<String> ageList = FXCollections.observableArrayList("18 - 35","36 - 50", "51+");
    ObservableList<String> tempList = FXCollections.observableArrayList("Warm","Cold","Temperate","Irrelevant");
    ObservableList<String> activList = FXCollections.observableArrayList("Relaxing","Recreational","Sport","Irrelevant");
    ObservableList<String> locationList = FXCollections
            .observableArrayList("Inside the country","Inside Europe","Everywhere in the world","Irrelevant");

    @FXML
    private AnchorPane anchorPane;
    @FXML
    private ChoiceBox ageChoiceBox;
    @FXML
    private ChoiceBox tempChoiceBox;
    @FXML
    private ChoiceBox activChoiseBox;
    @FXML
    private TextField bugetTextField;
    @FXML
    private ChoiceBox locationChoiseBox;
    @FXML
    private Button submitButton;

    @FXML
    private void initialize(){
        ageChoiceBox.setItems(ageList);
        tempChoiceBox.setItems(tempList);
        activChoiseBox.setItems(activList);
        locationChoiseBox.setItems(locationList);

        LinearGradient linearGradient = new LinearGradient(0,0,1,1, true, CycleMethod.NO_CYCLE,
                new Stop(0, Color.web("#3391d1")), new Stop(1, Color.web("#2c4053")));
        BackgroundFill backgroundFill = new BackgroundFill(linearGradient, CornerRadii.EMPTY, Insets.EMPTY);
        anchorPane.setBackground(new Background(backgroundFill));
    }

    public void submit(ActionEvent actionEvent) {
        String age = (String) ageChoiceBox.getSelectionModel().getSelectedItem();
        String temperature = (String) tempChoiceBox.getSelectionModel().getSelectedItem();
        String activity = (String) activChoiseBox.getSelectionModel().getSelectedItem();
        String budget = bugetTextField.getText();
        String location = (String) locationChoiseBox.getSelectionModel().getSelectedItem();

        System.out.println(age);
        System.out.println(temperature);
        System.out.println(activity);
        System.out.println(budget);
        System.out.println(location);
    }
}