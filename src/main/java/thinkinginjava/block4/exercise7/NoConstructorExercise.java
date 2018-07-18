package thinkinginjava.block4.exercise7;

import thinkinginjava.Exercise;

import static net.mindview.util.Print.print;

public class NoConstructorExercise extends Exercise {
    @Override
    public String getId() {
        return "7";
    }

    @Override
    public String getName() {
        return "No constructor";
    }

    @Override
    public String getDescription() {
        return "Create a class without a constructor, and then create an object of that class in " +
                "main( ) to verify that the default constructor is automatically synthesized.";
    }

    @Override
    public int getDifficulty() {
        return 1;
    }

    @Override
    protected void run() {
        print("Attempting to create object of class with no constructor...");
        new NoConstructorClass();
        print("Object created successfully");
    }
}
