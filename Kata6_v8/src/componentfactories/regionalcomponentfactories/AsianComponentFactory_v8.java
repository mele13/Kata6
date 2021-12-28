package componentfactories.regionalcomponentfactories;

import componentfactories.ComponentFactory_v8;
import components.asian.AsianEngine_v8;
import components.asian.AsianRotorBlade_v8;
import components.asian.AsianWheel_v8;
import components.Engine_v8;
import components.RotorBlade_v8;
import components.Wheel_v8;

public class AsianComponentFactory_v8 extends ComponentFactory_v8{

    @Override
    public Wheel_v8 createWheel() {
        return new AsianWheel_v8();
    }

    @Override
    public Engine_v8 createEngine() {
        return new AsianEngine_v8();
    }

    @Override
    public RotorBlade_v8 createRotorBlade() {
        return new AsianRotorBlade_v8();
    }    
}