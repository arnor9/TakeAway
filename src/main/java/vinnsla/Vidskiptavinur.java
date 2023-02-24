package vinnsla;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Vidskiptavinur {
    private StringProperty nafn = new SimpleStringProperty();

    public Vidskiptavinur(StringProperty nafn) {
        this.nafn = nafn;
    }

    public String getNafn() {
        return nafn.get();
    }

    public StringProperty nafnProperty() {
        return nafn;
    }
}
