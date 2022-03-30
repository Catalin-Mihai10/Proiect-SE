package Controllers;

import Bayes.BayesInference;
import Bayes.ValueAssignment;
import DataTypes.Constants;
import DataTypes.Offers;
import DataTypes.Vacation;
import Handlers.ConversionHandler;
import Handlers.DataHandler;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

    public void submit(ActionEvent actionEvent) throws IOException {
        String age = (String) ageChoiceBox.getSelectionModel().getSelectedItem();
        String temperature = (String) tempChoiceBox.getSelectionModel().getSelectedItem();
        String activity = (String) activChoiseBox.getSelectionModel().getSelectedItem();
        String budget = bugetTextField.getText();
        String location = (String) locationChoiseBox.getSelectionModel().getSelectedItem();

        List<Vacation> valuesOfProbability;

        ConversionHandler conversionHandler = new ConversionHandler();
        Vacation vacation = conversionHandler.convertFromUserInput("","",age,temperature,activity,budget,location);
        ValueAssignment valueAssignment = new ValueAssignment();
        valueAssignment.assingValues(vacation);

        BayesInference bayesInference = new BayesInference(valueAssignment);
        Offers offers = DataHandler.readFromFile(Constants.DATABASE_PATH);
        bayesInference.createInference(offers.getOffers());
        valuesOfProbability = bayesInference.getValuesOfProbability();

        openWindow(actionEvent, valuesOfProbability);
    }

    private void openWindow(ActionEvent actionEvent, List<Vacation> valuesOfProbability) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("resultscene-view.fxml"));
        AnchorPane anchorPane = loader.load();

        ResultSceneController resultSceneController = loader.getController();
        resultSceneController.setValuesOfProbability(valuesOfProbability);

        Scene scene = new Scene(anchorPane);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        ((Node) actionEvent.getSource()).getScene().getWindow().hide();
    }
}