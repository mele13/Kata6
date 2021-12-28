package factories.regionalfactories;

import factories.ToyFactory_v7;
import toyproduct.Toy_v7;
import toyproduct.models.AsianCarToy_v7;

public class AsianCarToyFactory_v7 extends ToyFactory_v7 {
    
    @Override
    public Toy_v7 createToy(Integer serialNumber){
        AsianCarToy_v7 car = new AsianCarToy_v7(serialNumber);
        return car;        
    }
}