package factories;

import toys.Toy_v8;

public abstract class ToyFactory_v8 {
    
    
    public Toy_v8 produceToy(){
    
        Toy_v8 toy = this.createToy(SerialNumberGenerator_v8.getInstance().next());
        toy.prepare();
        toy.pack();
        toy.label();
        return toy;
    }
    
    protected abstract Toy_v8 createToy(Integer serialNumber);    
}