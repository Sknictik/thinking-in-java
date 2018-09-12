package thinkinginjava.block6.exercise15;

import thinkinginjava.Exercise;
import thinkinginjava.block6.exercise15.out.ClassWithProtectedMethod;

public class ProtectedExercise extends Exercise {
    @Override
    public String getId() {
        return "15";
    }

    @Override
    public String getName() {
        return "Protected exercise";
    }

    @Override
    public String getDescription() {
        return "Create a class inside a pack age. Your class should contain a protected method." +
                " Outside of the package, try to call the protected method and explain the results." +
                " Now inherit from your class and call the protected method from inside " +
                "a method of your derived class. ";
    }

    @Override
    public int getDifficulty() {
        return 2;
    }

    @Override
    protected void run() {
        ClassWithProtectedMethod classWithProtectedMethod = new ClassWithProtectedMethod();
        //Can't call protected method from outside of package.
        //classWithProtectedMethod.protectedMethod();
        ChildOfClassWithProtectedMethod childOfClassWithProtectedMethod = new ChildOfClassWithProtectedMethod();
        //This works fine though
        childOfClassWithProtectedMethod.publicProtectedMethod();
    }
}
