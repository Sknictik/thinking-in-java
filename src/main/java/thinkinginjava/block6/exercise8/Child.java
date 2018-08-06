package thinkinginjava.block6.exercise8;

import static net.mindview.util.Print.print;

class Child extends Base {

    Child() {
        super("123");
        print("Child default constructor");
    }

    Child(String arg) {
        super(arg);
        print("Child non-default constructor");
    }

}
