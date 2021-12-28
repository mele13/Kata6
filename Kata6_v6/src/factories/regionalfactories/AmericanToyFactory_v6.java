package factories.regionalfactories;

import factories.ToyFactory_v6;
import toyproduct.Toy_v6;
import toyproduct.models.AmericanCarToy_v6;
import toyproduct.models.AmericanHelicopterToy_v6;

public class AmericanToyFactory_v6 extends ToyFactory_v6 {
    
    @Override
    public Toy_v6 createToy(String type){
        switch(type){
            case "car":
                AmericanCarToy_v6 car = new AmericanCarToy_v6(this.generator.next());
                return car;
            case "helicopter":
                AmericanHelicopterToy_v6 helicopter = new AmericanHelicopterToy_v6(this.generator.next());
                return helicopter;
            default:
                return null;   
        }        
    }
}