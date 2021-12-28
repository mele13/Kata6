package factories;

import toyproduct.Toy_v7;

public abstract class ToyFactory_v7 {    
    
    public Toy_v7 produceToy(Integer serialNumber) {
        Toy_v7 toy = this.createToy(serialNumber);
        toy.pack();
        toy.label();
        return toy;
    }
    
    protected abstract Toy_v7 createToy(Integer serialNumber);
}
