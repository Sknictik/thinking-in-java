package thinkinginjava.block6.exercise12;

import static net.mindview.util.Print.print;

public class DisposableComponent3 {

    DisposableComponent3() {
        print("Default DisposableComponent3 constructor");
    }

    void dispose() {
        print("Disposing of component3");
    }

}
