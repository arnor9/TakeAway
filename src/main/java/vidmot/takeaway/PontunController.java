package vidmot.takeaway;

import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import vinnsla.Karfa;
import vinnsla.MatsedillView;
import vinnsla.Veitingar;

public class PontunController {
    @FXML
    private Button fxInnskraning;
    @FXML
    private Button fxGreida;

    @FXML
    ListView<Veitingar> fxkarfa;

    @FXML
    private ListView<Veitingar> fxmsedill;

    @FXML
    private Button baeta;

    @FXML
    private Button eyda;
    @FXML
    private Label fxInnskradurNafn;

    @FXML
    private Label heildarVerdLabel;

    Karfa karfa = new Karfa();


    public void fxSetjaIKorfu(ActionEvent event) {
        Veitingar voldVeiting = fxmsedill.getSelectionModel().getSelectedItem();
        fxkarfa.getItems().addAll(voldVeiting);
        karfa.getHeildarverd().set(karfa.getHeildarverd().get() + voldVeiting.getVerd().get());
        heildarVerdLabel.setText(karfa.getHeildarverd().get() + "kr");

    }


    public void fxTakaUrKorfu() {
        Veitingar selectedVeiting = fxkarfa.getSelectionModel().getSelectedItem();
        if (selectedVeiting != null) {
            fxkarfa.getItems().remove(selectedVeiting);
            karfa.getHeildarverd().set(karfa.getHeildarverd().get() - selectedVeiting.getVerd().get());
            heildarVerdLabel.setText(karfa.getHeildarverd().get() + "kr");
        }

    }

    public void fxInnskraning() {
        ViewSwitcher.switchTo(View.LOGIN);
    }

    public void fxInnskradurNafn(String username) {
        fxInnskradurNafn.setText(username);
    }

    public void fxGreida() {
        ViewSwitcher.switchTo(View.ABOUT);
    }

    public void initialize() {
        baeta.disableProperty().bind(Bindings.isEmpty(fxmsedill.getSelectionModel().getSelectedItems()));
        eyda.disableProperty().bind(Bindings.isEmpty(fxkarfa.getSelectionModel().getSelectedItems()));
        MatsedillView matsedillView = new MatsedillView();
        ObservableList<Veitingar> veitingar = FXCollections.observableArrayList(matsedillView.getMatsedill().getVeitingar());
        fxmsedill.setItems(veitingar);
    }

    public ListView<Veitingar> getKarfaListView() {
        return fxkarfa;
    }


}



