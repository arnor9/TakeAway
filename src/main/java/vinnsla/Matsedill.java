package vinnsla;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Matsedill {
    protected ObservableList<Veitingar> veitingar = FXCollections.observableArrayList();

    public Matsedill() {

    }

    public void setjaGogn() {
        veitingar.add(new Veitingar("Margarita pizza", 2990));
        veitingar.add(new Veitingar("Brauðstangir", 1990));
    }

    public ObservableList<Veitingar> getVeitingar() {
        return veitingar;
    }

    public void setVeitingar(ObservableList<Veitingar> veitingar) {
        this.veitingar = veitingar;
    }
}
