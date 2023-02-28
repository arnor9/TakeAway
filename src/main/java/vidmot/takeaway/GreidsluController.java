package vidmot.takeaway;

import javafx.event.ActionEvent;

public class GreidsluController {
    public void clearKarfa() {
        PontunController pontunController = (PontunController) ViewSwitcher.lookup(View.MAIN);
        assert pontunController != null;
        pontunController.clearfxkarfa();
    }

    public void onBack(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.MAIN);
    }

    public void onForward() {
        ViewSwitcher.switchTo(View.MAIN);
        clearKarfa();

    }


}
