package business;

import factories.ToyFactory_v8;
import java.util.HashMap;
import java.util.Map;
import toys.Toy_v8;

public class ToyBuisness_v8 {    
    private final Map<String, ToyFactory_v8> toyFactories = new HashMap<>();
    
   
    public void add(String name, ToyFactory_v8 toyFactory){
            this.toyFactories.put(name, toyFactory);
    }
    
    public Toy_v8 produceToy(String type){
        return this.toyFactories.get(type).produceToy();
    }
}