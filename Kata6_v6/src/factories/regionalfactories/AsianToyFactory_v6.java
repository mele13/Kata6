package factories.regionalfactories;

import factories.ToyFactory_v6;
import toyproduct.Toy_v6;
import toyproduct.models.AsianCarToy_v6;
import toyproduct.models.AsianHelicopterToy_v6;

public class AsianToyFactory_v6 extends ToyFactory_v6 {
    
    @Override
    public Toy_v6 createToy(String type){
        switch(type){
            case "car":
                AsianCarToy_v6 car = new AsianCarToy_v6(this.generator.next());
                return car;
            case "helicopter":
                AsianHelicopterToy_v6 helicopter = new AsianHelicopterToy_v6(this.generator.next());
                return helicopter;
            default:
                return null;   
        }        
    }
}