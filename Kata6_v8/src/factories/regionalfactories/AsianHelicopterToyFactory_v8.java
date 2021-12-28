package factories.regionalfactories;

import factories.ToyFactory_v8;
import toys.Models.AsianHelicopterToy_v8;
import toys.Toy_v8;

public class AsianHelicopterToyFactory_v8 extends ToyFactory_v8 {

    @Override
    public Toy_v8 createToy(Integer argument) {
        AsianHelicopterToy_v8 toy = new AsianHelicopterToy_v8(argument,"");
        return toy;
    }
    
}