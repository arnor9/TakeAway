package vidmot.takeaway;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class VidskiptavinurController {
    @FXML
    private Button fxInnskra;
    @FXML
    private TextField fxNafn;
    @FXML
    private TextField fxHeimilisfang;


    public void fxInnskra(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.MAIN);
    }


    public void fxHaetta(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.MAIN);
    }

}
