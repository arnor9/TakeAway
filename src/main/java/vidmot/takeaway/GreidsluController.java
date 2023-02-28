package vidmot.takeaway;

import javafx.event.ActionEvent;

public class GreidsluController {
    public void onBack(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.MAIN);
    }

    public void onForward() {
        ViewSwitcher.switchTo(View.MAIN);
        
    }
}
