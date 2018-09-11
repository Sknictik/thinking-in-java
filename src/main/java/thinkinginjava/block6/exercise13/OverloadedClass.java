package thinkinginjava.block6.exercise13;

import static net.mindview.util.Print.print;

public class OverloadedClass {

    public void overloadedMethod() {
        print("Base method no params");
    }

    public void overloadedMethod(String a) {
        print("Overloaded method with string argument");
    }

    public void overloadedMethod(int a) {
        print("Overloaded method with int argument");
    }

}
