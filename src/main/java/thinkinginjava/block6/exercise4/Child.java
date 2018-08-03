package thinkinginjava.block6.exercise4;

import static net.mindview.util.Print.print;

public class Child extends Parent {

    public Child(String arg) {
        print("Inside child constructor with String argument");
    }

    public Child() {
        print("Inside child constructor with no arguments");
    }

    public Child(int a, String... args) {
        print("Inside child constructor with two arguments");
    }

}
