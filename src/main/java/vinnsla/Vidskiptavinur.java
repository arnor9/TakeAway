package vinnsla;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Vidskiptavinur {
    private StringProperty nafn = new SimpleStringProperty();
    private StringProperty kennitala = new SimpleStringProperty();

    public Vidskiptavinur(StringProperty nafn, StringProperty kennitala) {
        this.nafn = nafn;
        this.kennitala = kennitala;
    }

    public StringProperty getKennitala() {
        return kennitala;
    }

    public StringProperty kennitalaProperty() {
        return kennitala;
    }

    public StringProperty getNafn() {
        return nafn;
    }

    public StringProperty nafnProperty() {
        return nafn;
    }
}
