package thinkinginjava.block4.exercise8;

import static net.mindview.util.Print.print;

public class Test {

    void firstMethod() {
        print("Method 1 is called");
        secondMethod();
        this.secondMethod();
    }

    void secondMethod() {
        print("Method 2 is called");
    }

}
