package Controllers;

import DataTypes.Vacation;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Node;
import javafx.scene.control.Separator;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ResultSceneController {

    private final List<Vacation> valuesOfProbability = new ArrayList<>();

    @FXML
    private AnchorPane anchorPane;
    @FXML
    private VBox vBox;

    @FXML
    private void initialize() {
        LinearGradient linearGradient = new LinearGradient(0,0,1,1, true, CycleMethod.NO_CYCLE,
                new Stop(0, Color.web("#3391d1")), new Stop(1, Color.web("#2c4053")));
        BackgroundFill backgroundFill = new BackgroundFill(linearGradient, CornerRadii.EMPTY, Insets.EMPTY);
        anchorPane.setBackground(new Background(backgroundFill));

    }

    public void setValuesOfProbability(List<Vacation> valuesOfProbability) throws IOException {
        this.valuesOfProbability.addAll(valuesOfProbability);

        Node[] nodes = new Node[valuesOfProbability.size()];
        for(int i=0; i< nodes.length; i++){
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getClassLoader().getResource("vacation-item.fxml"));
            nodes[i] = loader.load();
            final int j=i;
            nodes[i].setOnMouseEntered(mouseEvent -> {
                nodes[j].setStyle("-fx-background-color : #B3B1B1");
            });
            nodes[i].setOnMouseExited(mouseEvent -> {
                nodes[j].setStyle("-fx-background-color : #FFFFFF");
            });

            VacationItemController vacationItemController = loader.getController();
            vacationItemController.getNameText().setText("Locatie: " + valuesOfProbability.get(i).getName());
            vacationItemController.getDescriptionText().setText("Descriere: " + valuesOfProbability.get(i).getDescription());

            vBox.getChildren().add(nodes[i]);
            vBox.getChildren().add(new Separator(Orientation.HORIZONTAL));
        }
    }
}
