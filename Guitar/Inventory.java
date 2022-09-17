package Guitar;
import java.util.ArrayList;
import java.util.LinkedList;

public class Inventory {

    LinkedList<Guitar> guitars;

    public Inventory() {
       guitars = new LinkedList<Guitar>();
    }

    public void add(Guitar guitar) {
        guitars.add(guitar);
    }

    public ArrayList<Guitar> find(GuitarSpec spec) {
        ArrayList<Guitar> matches = new ArrayList<>();
        for (Guitar guitar: guitars) {
            if (guitar.getSpec().matches(spec)) {
                matches.add(guitar);
            }
        }
        return matches;
    }
    
}