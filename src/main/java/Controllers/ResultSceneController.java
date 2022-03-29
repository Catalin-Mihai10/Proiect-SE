package Controllers;

import DataTypes.Vacation;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

import java.util.HashMap;
import java.util.Map;

public class ResultSceneController {

    private Map<Vacation, Double> valuesOfProbability = new HashMap<>();

    @FXML
    private ListView<Vacation> vacationListView;

    @FXML
    private void initialize(){
       // vacationListView.getItems().add(valuesOfProbability.keySet().iterator().next());
    }

    public void setValuesOfProbability(Map<Vacation, Double> valuesOfProbability){
        this.valuesOfProbability.putAll(valuesOfProbability);
    }
}
