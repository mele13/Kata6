package factories.regionalfactories;

import factories.ToyFactory_v8;
import toys.Models.AmericanCarToy_v8;
import toys.Toy_v8;

public class AmericanCarToyFactory_v8 extends ToyFactory_v8 {

    @Override
    public Toy_v8 createToy(Integer num) {
        AmericanCarToy_v8 car = new AmericanCarToy_v8(num,"");
        return car;
    }
}