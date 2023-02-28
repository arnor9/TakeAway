package vidmot.takeaway;

import javafx.event.ActionEvent;


public class GreidsluController {

    public void onBack(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.MAIN);
    }


    public void onForward(ActionEvent actionEvent) {
        //p.karfa.cleatfxkarfa.clear();
        //  p.fxkarfa.getItems().clear();
        ViewSwitcher.switchTo(View.MAIN);


    }


}
