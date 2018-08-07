package thinkinginjava.block6.exercise12;

import static net.mindview.util.Print.print;

public class DisposableRoot {

    private DisposableComponent1 component1;
    private DisposableComponent2 component2;
    private DisposableComponent3 component3;

    DisposableRoot() {
        print("Default DisposableRoot constructor");
        component1 = new DisposableComponent1();
        component2 = new DisposableComponent2();
        component3 = new DisposableComponent3();
    }

    void dispose() {
        component3.dispose();
        component2.dispose();
        component1.dispose();
        print("Disposing of root");
    }

}
