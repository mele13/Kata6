package business;

import factories.ToyFactory_v6;
import toyproduct.Toy_v6;

public class ToyBusiness_v6 {
    
    private final ToyFactory_v6 toyFactory;

    public ToyBusiness_v6(ToyFactory_v6 toyFactory) {
        this.toyFactory = toyFactory;
    }
    
    public Toy_v6 produceToy(String type){
        return this.toyFactory.produceToy(type);
    }  
}