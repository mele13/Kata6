package factories.regionalfactories;

import factories.ToyFactory_v8;
import toys.Models.AsianSubmarineToy_v8;
import toys.Toy_v8;

public class AsianSubmarineToyFactory_v8 extends ToyFactory_v8 {

    @Override
    public Toy_v8 createToy(Integer argument) {
        AsianSubmarineToy_v8 toy = new AsianSubmarineToy_v8(argument,"");
        return toy;
    }    
}