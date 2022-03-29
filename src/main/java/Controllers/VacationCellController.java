package Controllers;

import DataTypes.Vacation;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;

import java.io.IOException;

public class VacationCellController extends ListCell<Vacation> {

    @FXML
    private Label vacationName;
    @FXML
    private Label vacationLocation;
    @FXML
    private Label vacationDescription;

    public VacationCellController(){
        loadFXML();
    }

    private void loadFXML(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("vacation_cell.fxml"));
            loader.setController(this);
            loader.setRoot(this);
            loader.load();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    protected void updateItem(Vacation vacation, boolean empty){
        super.updateItem(vacation, empty);

        if(empty || vacation == null){
            setText(null);
            setContentDisplay(ContentDisplay.TEXT_ONLY);
        }else{
            vacationName.setText("vacation.getName()");
            vacationLocation.setText(vacation.getLocation().toString());
            vacationDescription.setText(vacation.getDescription());

            setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
        }
    }
}
