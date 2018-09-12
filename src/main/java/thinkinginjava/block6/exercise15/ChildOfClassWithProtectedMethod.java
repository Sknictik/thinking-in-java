package thinkinginjava.block6.exercise15;

import thinkinginjava.block6.exercise15.out.ClassWithProtectedMethod;

public class ChildOfClassWithProtectedMethod extends ClassWithProtectedMethod {

    public void publicProtectedMethod() {
        protectedMethod();
    }

}
