package vidmot.takeaway;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class PontunController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button fxInnskra;


    public void fxInnskra(ActionEvent event) {
        String daemi;
        daemi = (((Button) event.getSource()).getText());
    }


    public void initialize() {

    }
}
