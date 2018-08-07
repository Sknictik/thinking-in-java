package thinkinginjava.block6.exercise12;

import static net.mindview.util.Print.print;

public class DisposableComponent1 {

    DisposableComponent1() {
        print("Default DisposableComponent1 constructor");
    }

    void dispose() {
        print("Disposing of component1");
    }

}
