package thinkinginjava.block6.exercise13;

import thinkinginjava.Exercise;

import static net.mindview.util.Print.print;

public class OverloadingExercise extends Exercise {
    @Override
    public String getId() {
        return "13";
    }

    @Override
    public String getName() {
        return "Overloading exercise";
    }

    @Override
    public String getDescription() {
        return "Create a class with a method that is overloaded three times. " +
                "Inherit a new class, add a new overloading of the method, " +
                "and show that all four methods are available in the derived class.";
    }

    @Override
    public int getDifficulty() {
        return 2;
    }

    @Override
    protected void run() {
        OverloadedClassChild overloadedClassChild = new OverloadedClassChild();
        print("Call to float");
        overloadedClassChild.overloadedMethod(1.0f);
        print("Call to int");
        overloadedClassChild.overloadedMethod(1);
        print("Call to string");
        overloadedClassChild.overloadedMethod("1");
        print("Call no arg");
        //Narrowing conversions for method arguments are not allowed!
        //overloadedClassChild.overloadedMethod((double) 1);
    }
}
