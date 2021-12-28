package factories;

import toyproduct.Toy_v6;

public abstract class ToyFactory_v6 {
    protected final SerialNumberGenerator_v6 generator = new SerialNumberGenerator_v6();
    
    public Toy_v6 produceToy(String type) {
        Toy_v6 toy = this.createToy(type);
        toy.pack();
        toy.label();
        return toy;
    }
    
    protected abstract Toy_v6 createToy(String type);
}
