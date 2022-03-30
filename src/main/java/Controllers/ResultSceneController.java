package Controllers;

import DataTypes.Vacation;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

import java.util.ArrayList;
import java.util.List;

public class ResultSceneController {

    private List<Vacation> valuesOfProbability = new ArrayList<>();

    @FXML
    private ListView<Vacation> vacationListView;

    @FXML
    private void initialize(){
       // vacationListView.getItems().add(valuesOfProbability.keySet().iterator().next());
    }

    public void setValuesOfProbability(List<Vacation> valuesOfProbability){
        this.valuesOfProbability.addAll(valuesOfProbability);
    }
}
