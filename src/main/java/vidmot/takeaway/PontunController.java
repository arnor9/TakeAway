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
    private ListView<Veitingar> fxkarfa;

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

    private Karfa karfa = new Karfa();


    public void fxSetjaIKorfu(ActionEvent event) {
        //bæta við vöru þegar ýtt er á "bæta" takkann
        Veitingar voldVeiting = fxmsedill.getSelectionModel().getSelectedItem();
        fxkarfa.getItems().addAll(voldVeiting);
        //þurfum að uppfæra heildarverð
        //þurfum að kalla á fallið hvert skipti
        // int totalVerd = karfa.reiknaHeildarverd(fxkarfa);
        //totalVerd += voldVeiting.get.getVerd().getValue();
        karfa.getHeildarverd().set(karfa.getHeildarverd().get() + voldVeiting.getVerd().get());
        heildarVerdLabel.setText(karfa.getHeildarverd().get() + "kr");

    }


    public void fxTakaUrKorfu() {
        //þegar ytt er á "eyða" þá eyðist vara úr körfunni
        Veitingar selectedVeiting = fxkarfa.getSelectionModel().getSelectedItem();
        if (selectedVeiting != null) {
            fxkarfa.getItems().remove(selectedVeiting);
            //þurfum að uppfæra heildarverð
            //þurfum að kalla á fallið hvert skipti
            //int totalVerd = karfa.reiknaHeildarverd(fxkarfa);
            //karfa.getHeildarverd().set(karfa.getHeildarverd().get() - selectedVeiting.getVerd().get());
            //heildarVerdLabel.setText(karfa.getHeildarverd().get() + "");
            //int totalVerd = karfa.reiknaHeildarverd();
            //heildarVerdLabel.setText(String.valueOf(totalVerd) + " kr");
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
        //notum bind til að tengja bæta takkann við körfuna (notum disableProperty þannig að hnappur sé óvirkur þegar
        //engin vara er valin
        baeta.disableProperty().bind(Bindings.isEmpty(fxmsedill.getSelectionModel().getSelectedItems()));
        //bind til að tengja eyda og msedill
        eyda.disableProperty().bind(Bindings.isEmpty(fxkarfa.getSelectionModel().getSelectedItems()));

        //birta vörur inn í matsedill listview (vinstra megin i scene)
        MatsedillView matsedillView = new MatsedillView();
        ObservableList<Veitingar> veitingar = FXCollections.observableArrayList(matsedillView.getMatsedill().getVeitingar());
        fxmsedill.setItems(veitingar);
    }

    public ListView<Veitingar> getKarfaListView() {
        return fxkarfa;
    }

    public void clearfxkarfa() {
        fxkarfa.getItems().clear();
    }
}



