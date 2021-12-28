package factories.regionalfactories;

import factories.ToyFactory_v8;
import toys.Models.AsianCarToy_v8;
import toys.Toy_v8;

public class AsianCarToyFactory_v8 extends ToyFactory_v8 {

    @Override
    public Toy_v8 createToy(Integer argument) {
        AsianCarToy_v8 car = new AsianCarToy_v8(argument,"");
        return car;
    }    
}