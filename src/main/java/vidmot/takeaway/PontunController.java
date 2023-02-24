package vidmot.takeaway;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import vinnsla.Karfa;
import vinnsla.Veitingar;

public class PontunController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button fxInnskra;

    private PontunController c1;
    private PontunController c2;
    private Karfa karfa;


    public void fxInnskra(ActionEvent event, PontunController c2) {
        String daemi;
        daemi = (((Button) event.getSource()).getText());
    }


    public void initialize() {
        Karfa karfa = new Karfa();
        heildarverd.textProperty().addListener((observable, Veitingar)) ->
        {
            heildarverd.setText(String.valueOf(Integer.parseInt(get.verd())));
        }

    }
}
