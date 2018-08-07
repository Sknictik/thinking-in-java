package thinkinginjava.block6.exercise12;

import static net.mindview.util.Print.print;

public class DisposableStem extends DisposableRoot {

    //There are actually 6 instances of component in this class.
    //Three in this class and other three in root.
    //It's just that root ones are hidden behind stem components.
    private DisposableComponent1 component1;
    private DisposableComponent2 component2;
    private DisposableComponent3 component3;

    DisposableStem() {
        print("Default DisposableStem constructor");
        component1 = new DisposableComponent1();
        component2 = new DisposableComponent2();
        component3 = new DisposableComponent3();
    }

    @Override
    void dispose() {
        component3.dispose();
        component2.dispose();
        component1.dispose();
        print("Disposing of stem");
        super.dispose();
    }

}
