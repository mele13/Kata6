package business;

import toyproduct.Toy_v5;

public abstract class ToyBusiness_v5 {
    protected final SerialNumberGenerator_v5 generator = new SerialNumberGenerator_v5();
    public abstract Toy_v5 createToy(String type);
}