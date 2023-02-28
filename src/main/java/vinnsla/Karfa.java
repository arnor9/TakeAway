package vinnsla;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Karfa extends Matsedill {
    private static IntegerProperty heildarverd = new SimpleIntegerProperty(0);

    public Integer reiknaHeildarverd() {
        int h = 0;
        for (int i = 0; i < veitingar.size(); i++) {
            h += veitingar.get(i).getVerd().getValue();
        }
        heildarverd.set(h);
        return heildarverd.getValue();
    }


    public IntegerProperty getHeildarverd() {
        return heildarverd;
    }

    //public ObservableList<Veitingar> clearfxkarfa() {
    //  veitingar.removeAll(veitingar);
    //return veitingar;
//}


    public static void main(String[] args) {
        Karfa karfa = new Karfa();
        karfa.setjaGogn();


        int totalCost = karfa.reiknaHeildarverd();
        System.out.println("Heildarverð total: " + karfa.getHeildarverd().getValue());

    }

}
