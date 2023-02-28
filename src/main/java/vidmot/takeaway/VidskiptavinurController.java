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
    // private Stage stage;
    // private Scene scene;
    // private Parent root;
    // private Label lesaVidskiptavin;
    

    public void fxInnskra(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.MAIN);
        //  stejaVidskiptavin()
        // String username = fxNafn.getText();

        // FXMLLoader loader = new FXMLLoader(getClass().getResource("pontun-view.fxml"));
        // PontunController pontunController = loader.getController();
        // pontunController.fxInnskradurNafn(username);

        //  stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        //  scene = new Scene(root);
        //  stage.setScene(scene);
        //  stage.show();
    }

    //  public String stejaVidskiptavin(String username) {
    //    PontunController leikmenn = new PontunController();
    //  leikmenn.fxInnskradurNafn.setText(fxNafn.getText());
    //}
    //   }

}
