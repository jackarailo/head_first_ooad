package Guitar;
public class Guitar {
    GuitarSpec spec;
    float price;

    public Guitar(GuitarSpec spec, float price) {
        this.spec = spec;
        this.price = price;
    }

    public GuitarSpec getSpec() {
        return this.spec;
    }
    
}
