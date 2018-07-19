package thinkinginjava.block4.exercise9;

import thinkinginjava.Exercise;

import static net.mindview.util.Print.print;

public class ConstructorsCallingConstructorsExercise extends Exercise {
    @Override
    public String getId() {
        return "9";
    }

    @Override
    public String getName() {
        return "Overloaded constructors";
    }

    @Override
    public String getDescription() {
        return "Create a class with two (overloaded) constructors. Using this," +
                " call the second constructor inside the first one.";
    }

    @Override
    public int getDifficulty() {
        return 1;
    }

    @Override
    protected void run() {
        print("Calling overloaded constructors");
        new Test("123");
    }
}
