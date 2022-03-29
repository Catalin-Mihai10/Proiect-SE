package Controllers;

import DataTypes.Vacation;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

public class VacationCellFactory implements Callback<ListView<Vacation>, ListCell<Vacation>> {

    @Override
    public ListCell<Vacation> call(ListView<Vacation> vacationListView) {
        return new VacationCellController();
    }
}
