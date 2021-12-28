package factories.regionalfactories;

import factories.ToyFactory_v7;
import toyproduct.Toy_v7;
import toyproduct.models.AmericanHelicopterToy_v7;

public class AmericanHelicopterToyFactory_v7 extends ToyFactory_v7 {
    
    @Override
    public Toy_v7 createToy(Integer serialNumber){
        AmericanHelicopterToy_v7 helicopter = new AmericanHelicopterToy_v7(serialNumber);
        return helicopter;
    }
}