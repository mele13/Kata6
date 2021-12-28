package factories.regionalfactories;

import factories.ToyFactory_v8;
import toys.Models.AmericanSubmarineToy_v8;
import toys.Toy_v8;

public class AmericanSubmarineToyFactory_v8 extends ToyFactory_v8 {

    @Override
    public Toy_v8 createToy(Integer argument) {
        AmericanSubmarineToy_v8 toy = new AmericanSubmarineToy_v8(argument,"");
        return toy;
    }
}