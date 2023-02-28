package vinnsla;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Karfa extends Matsedill {
    private IntegerProperty heildarverd = new SimpleIntegerProperty(0);

    public Integer reiknaHeildarverd() {
        int h = 0;
        for (int i = 0; i < veitingar.size(); i++) {
            h += veitingar.get(i).getVerd().getValue();
        }
        getHeildarverd().set(h);
        return getHeildarverd().getValue();
    }


    public IntegerProperty getHeildarverd() {
        return heildarverd;
    }

    public static void main(String[] args) {
        Karfa b = new Karfa();
        b.setjaGogn();
        //     System.out.println(b.reiknaHeildarverd());
    }
}
