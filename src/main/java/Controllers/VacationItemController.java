package Controllers;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.text.Text;

public class VacationItemController {

    @FXML
    private Text nameText;

    @FXML
    private Text descriptionText;

    public Text getNameText(){
        return nameText;
    }

    public Text getDescriptionText(){
        return descriptionText;
    }
}
