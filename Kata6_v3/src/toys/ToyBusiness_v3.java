package toys;

public class ToyBusiness_v3 {
    private final SerialNumberGenerator_v3 generator = new SerialNumberGenerator_v3();
    
    /**
     * Método de simplificación que se encarga de crear un coche.
     * 
     * @return car coche
     */
    public Car_v3 createCar() {
        Car_v3 car = new Car_v3(this.generator.next());
        car.pack();
        car.label();
        return car;
    }
    
    /**
     * Método de simplificación que se encarga de crear un helicóptero.
     * 
     * @return helicopter helicóptero
     */
    public Helicopter_v3 createHelicopter(){
        Helicopter_v3 helicopter = new Helicopter_v3(this.generator.next());
        helicopter.pack();
        helicopter.label();
        return helicopter;    
    }
    
}
