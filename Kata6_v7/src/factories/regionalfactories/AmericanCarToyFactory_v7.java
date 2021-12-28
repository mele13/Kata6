package factories.regionalfactories;

import factories.ToyFactory_v7;
import toyproduct.Toy_v7;
import toyproduct.models.AmericanCarToy_v7;

public class AmericanCarToyFactory_v7 extends ToyFactory_v7 {
    
    @Override
    public Toy_v7 createToy(Integer serialNumber){
        AmericanCarToy_v7 car = new AmericanCarToy_v7(serialNumber);
        return car;      
    }
}