package vinnsla;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListView;

public class MatsedillView extends ListView<Veitingar> {
    private Matsedill matsedill;

    public MatsedillView() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("matsedill-view.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        matsedill = new Matsedill();
        matsedill.setjaGogn();
        setItems(matsedill.getVeitingar());

    }
    
    public Matsedill getMatsedill() {
        return matsedill;
    }

}
