package toys.Models;

import componentfactories.ComponentFactory_v8;
import componentfactories.regionalcomponentfactories.AmericanComponentFactory_v8;
import components.Engine_v8;
import components.RotorBlade_v8;
import toys.Toy_v8;

public class AmericanSubmarineToy_v8 implements Toy_v8{
    
    private final int serialNumber;
    private final String type;

    private final ComponentFactory_v8 factory;
    
    private Engine_v8 engine;
    
    public AmericanSubmarineToy_v8(int serialNumber, String type) {
        this.serialNumber = serialNumber;
        this.type = type;        
        this.factory = new AmericanComponentFactory_v8();
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
        return "AmericanSubmarineToy{" + serialNumber + '}';
    }

    @Override
    public void prepare() {
        engine = factory.createEngine();
    }      
}