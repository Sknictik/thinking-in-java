package thinkinginjava.block6.exercise9;

import static net.mindview.util.Print.print;

class Root {

    private Component1 component1;
    private Component2 component2;
    private Component3 component3;

    Root() {
        print("Default root constructor");
        component1 = new Component1();
        component2 = new Component2();
        component3 = new Component3();
    }

}
