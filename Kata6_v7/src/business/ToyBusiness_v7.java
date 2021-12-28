package business;

import factories.SerialNumberGenerator_v7;
import factories.ToyFactory_v7;
import java.util.HashMap;
import java.util.Map;
import toyproduct.Toy_v7;

public class ToyBusiness_v7 {
    
    private final Map<String, ToyFactory_v7> toyFactories = new HashMap<>();
    private final SerialNumberGenerator_v7 generator =  new SerialNumberGenerator_v7();
        
    public void add(String name, ToyFactory_v7 toyFactory){
        this.toyFactories.put(name, toyFactory);
    }
    
    public Toy_v7 produceToy(String type){
        return this.toyFactories.get(type).produceToy(generator.next());
    }    
}