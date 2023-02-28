package vidmot.takeaway;

import javafx.event.ActionEvent;


public class GreidsluController {
    private PontunController p;

    public GreidsluController(PontunController p) {
        this.p = p;
    }

    public void onBack(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.MAIN);
    }


    public void onForward(ActionEvent actionEvent) {
        p
        ViewSwitcher.switchTo(View.MAIN);


    }


}
