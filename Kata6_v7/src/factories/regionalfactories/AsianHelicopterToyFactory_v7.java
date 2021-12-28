package factories.regionalfactories;

import factories.ToyFactory_v7;
import toyproduct.Toy_v7;
import toyproduct.models.AsianHelicopterToy_v7;

public class AsianHelicopterToyFactory_v7 extends ToyFactory_v7 {
    
    @Override
    public Toy_v7 createToy(Integer serialNumber){
        AsianHelicopterToy_v7 helicopter = new AsianHelicopterToy_v7(serialNumber);
        return helicopter;
    }
}