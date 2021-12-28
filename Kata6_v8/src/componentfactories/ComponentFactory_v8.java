package componentfactories;

import components.Engine_v8;
import components.Engine_v8;
import components.RotorBlade_v8;
import components.RotorBlade_v8;
import components.Wheel_v8;
import components.Wheel_v8;

public abstract class ComponentFactory_v8 {    
    public abstract Wheel_v8 createWheel();
    public abstract Engine_v8 createEngine();
    public abstract RotorBlade_v8 createRotorBlade();
}
