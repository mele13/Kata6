package factories.regionalfactories;

import factories.ToyFactory_v8;
import toys.Models.AmericanHelicopterToy_v8;
import toys.Toy_v8;

public class AmericanHelicopterToyFactory_v8 extends ToyFactory_v8 {

    @Override
    public Toy_v8 createToy(Integer argument) {
        AmericanHelicopterToy_v8 toy = new AmericanHelicopterToy_v8(argument,"");
        return toy;
    }
}    