package Guitar;
public class GuitarSpec {
    int numChords;
    Builder builder;
    Wood topWood;
    Wood backWood;

    public GuitarSpec(int numChords, Builder builder, Wood topWood, Wood backWood) {
        this.numChords = numChords;
        this.builder = builder;
        this.topWood = topWood;
        this.backWood = backWood;
    }

    public boolean matches(GuitarSpec spec) {
        if (spec.backWood != this.backWood) {
            return false;
        } else if (spec.topWood != this.topWood) {
            return false;
        } else if (spec.builder != this.builder) {
            return false;
        } else if (spec.numChords != this.numChords) {
            return false;
        }
        return true;
    }

}
