package thinkinginjava.block6.exercise10;

import static net.mindview.util.Print.print;

class Root {

    private Component1 component1;
    private Component2 component2;
    private Component3 component3;

    Root(String arg) {
        print("Non-default root constructor");
        component1 = new Component1(arg);
        component2 = new Component2(arg);
        component3 = new Component3(arg);
    }

}
