package toys.Models;

import componentfactories.ComponentFactory_v8;
import componentfactories.regionalcomponentfactories.AsianComponentFactory_v8;
import components.Engine_v8;
import components.RotorBlade_v8;
import toys.Toy_v8;

public class AsianHelicopterToy_v8 implements Toy_v8 {
    
    private final int serialNumber;
    private final String type;
    
    private final ComponentFactory_v8 factory;
    
    private Engine_v8 engine;
    private RotorBlade_v8 rotorBlade;

    public AsianHelicopterToy_v8(int serialNumber, String type) {
        this.serialNumber = serialNumber;
        this.type = type;        
        this.factory = new AsianComponentFactory_v8();
    }

    public String gettype() {
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
        return "AsianHelicopterToy{" + serialNumber + '}';
    }
    
    @Override
    public void prepare() {
        engine = factory.createEngine();
        rotorBlade = factory.createRotorBlade();
    }    
}