package thinkinginjava.block6.exercise10;

import static net.mindview.util.Print.print;

class Stem extends Root {

    //There are actually 6 instances of component in this class.
    //Three is this class and other three in root.
    //It's just that root ones are hidden behind stem components.
    private Component1 component1;
    private Component2 component2;
    private Component3 component3;

    Stem(String arg) {
        super(arg);
        print("Non-default stem constructor");
        component1 = new Component1(arg);
        component2 = new Component2(arg);
        component3 = new Component3(arg);
    }
}
