package componentfactories.regionalcomponentfactories;

import componentfactories.ComponentFactory_v8;
import components.american.AmericanEngine_v8;
import components.american.AmericanRotorBlade_v8;
import components.american.AmericanWheel_v8;
import components.Engine_v8;
import components.RotorBlade_v8;
import components.Wheel_v8;

public class AmericanComponentFactory_v8 extends ComponentFactory_v8{

    @Override
    public Wheel_v8 createWheel() {
        return new AmericanWheel_v8();
    }

    @Override
    public Engine_v8 createEngine() {
        return new AmericanEngine_v8();
    }

    @Override
    public RotorBlade_v8 createRotorBlade() {
        return new AmericanRotorBlade_v8();
    }
}