package branches;

import business.ToyBusiness_v5;
import toyproduct.Toy_v5;
import toyproduct.models.AmericanCarToy_v5;
import toyproduct.models.AmericanHelicopterToy_v5;

public class AmericanToyBusiness_v5 extends ToyBusiness_v5 {
    
    @Override
    public Toy_v5 createToy(String type){
        switch(type){
            case "car":
                AmericanCarToy_v5 car = new AmericanCarToy_v5(this.generator.next());
                car.pack();
                car.label();
                return car;
            case "helicopter":
                AmericanHelicopterToy_v5 helicopter = new AmericanHelicopterToy_v5(this.generator.next());
                helicopter.pack();
                helicopter.label();
                return helicopter;
            default:
                return null;   
        }        
    }
}