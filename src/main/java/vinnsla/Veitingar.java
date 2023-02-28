package vinnsla;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Veitingar {
    private StringProperty heiti = new SimpleStringProperty();
    private IntegerProperty verd = new SimpleIntegerProperty();

    public String getHeiti() {
        return heiti.get();
    }

    public StringProperty heitiProperty() {
        return heiti;
    }

    public IntegerProperty getVerd() {
        return verd;
    }

    public IntegerProperty verdProperty() {
        return verd;
    }

    public Veitingar(String heiti, int verd) {
        this.heiti.set(heiti);
        this.verd.set(verd);
    }

    public String toString() {
        return getHeiti() + "verð: " + getVerd().getValue();
    }
}
