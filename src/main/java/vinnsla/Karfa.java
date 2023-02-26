package vinnsla;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Karfa extends Matsedill {
    private IntegerProperty heildarverd = new SimpleIntegerProperty();


    public IntegerProperty getHeildarverd() {
        return heildarverd;
    }

    public static void main(String[] args) {
        Karfa b = new Karfa();
        b.setjaGogn();
        //     System.out.println(b.reiknaHeildarverd());
    }
}
