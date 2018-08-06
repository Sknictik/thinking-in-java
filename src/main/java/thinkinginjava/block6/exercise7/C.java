package thinkinginjava.block6.exercise7;

import static net.mindview.util.Print.print;

class C extends A {

    private B b;

    C() {
        super("123");
        print("Inside constructor C");
        b = new B("123");
    }
}
