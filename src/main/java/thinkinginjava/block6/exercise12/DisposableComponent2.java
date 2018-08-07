package thinkinginjava.block6.exercise12;

import static net.mindview.util.Print.print;

public class DisposableComponent2 {

    DisposableComponent2() {
        print("Default DisposableComponent2 constructor");
    }

    void dispose() {
        print("Disposing of component2");
    }

}
