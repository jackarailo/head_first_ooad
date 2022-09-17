package Guitar;
import java.util.ArrayList;

public class GuitarTester {

    private static Inventory initializeInventory() {
        Inventory inventory = new Inventory();
        GuitarSpec guitarSpec1 = new GuitarSpec(10, Builder.FENDER, Wood.BRAZILIAN_ROSEWOOD, Wood.BRAZILIAN_ROSEWOOD);
        Guitar guitar1 = new Guitar(guitarSpec1, 1000);
        inventory.add(guitar1);
        GuitarSpec guitarSpec2 = new GuitarSpec(10, Builder.FENDER, Wood.BRAZILIAN_ROSEWOOD, Wood.BRAZILIAN_ROSEWOOD);
        Guitar guitar2 = new Guitar(guitarSpec2, 2000);
        inventory.add(guitar2);
        GuitarSpec guitarSpec3 = new GuitarSpec(6, Builder.GIBSON, Wood.BRAZILIAN_ROSEWOOD, Wood.BRAZILIAN_ROSEWOOD);
        Guitar guitar3 = new Guitar(guitarSpec3, 2000);
        inventory.add(guitar3);
        return inventory;
    }

    public static void main(String[] args) {
        final Inventory inventory = initializeInventory();
        GuitarSpec spec = new GuitarSpec(10, Builder.FENDER, Wood.BRAZILIAN_ROSEWOOD, Wood.BRAZILIAN_ROSEWOOD);
        ArrayList<Guitar> matches = inventory.find(spec);
        System.out.println("Found: " + matches.size() + " matches.");
    }
    
}
