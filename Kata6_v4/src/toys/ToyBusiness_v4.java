package toys;

import toyproduct.Toy_v4;
import toyproduct.models.CarToy_v4;
import toyproduct.models.HelicopterToy_v4;

public class ToyBusiness_v4 {
    private final SerialNumberGenerator_v4 generator = new SerialNumberGenerator_v4();
    
    /**
     * Método al que se le pasa una String que refiere al tipo del juguete creado
     * como parámetro.
     * 
     * @param type tipo de juguete
     * @return car | helicopter | null (juguete)
     */
    public Toy_v4 createToy(String type){
        switch(type){
            case "car":
                CarToy_v4 car = new CarToy_v4(this.generator.next());
                car.pack();
                car.label();
                return car;
            case "helicopter":
                HelicopterToy_v4 helicopter = new HelicopterToy_v4(this.generator.next());
                helicopter.pack();
                helicopter.label();
                return helicopter;
            default:
                return null;   
        }        
    }    
}