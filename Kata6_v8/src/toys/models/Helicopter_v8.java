package toys.Models;

import toys.Toy_v8;

public class Helicopter_v8 implements Toy_v8{
    
    private final int serialNumber;
    private final String type;

    public Helicopter_v8(int serialNumber, String type) {
        this.serialNumber = serialNumber;
        this.type = type;
    }

    public String getType() {
        return type;
    }
    
    @Override
    public void pack(){
        System.out.print("Empaquetando: "+ serialNumber+"  " );
    }
    
    @Override
    public void label(){
        System.out.print("Estiquetando: "+ serialNumber + "  ");
    }

    @Override
    public String toString() {
        return "Helicopte{" + serialNumber + '}';
    }
    
    @Override
    public void prepare() {}
}