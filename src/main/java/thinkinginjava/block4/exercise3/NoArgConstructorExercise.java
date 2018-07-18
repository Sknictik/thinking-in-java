package thinkinginjava.block4.exercise3;

import thinkinginjava.Exercise;

public class NoArgConstructorExercise extends Exercise {
    @Override
    public String getId() {
        return "3";
    }

    @Override
    public String getName() {
        return "No arguments constructor";
    }

    @Override
    public String getDescription() {
        return "Create a class with a default constructor (one that takes no arguments) " +
                "that prints a message. Create an object of this class.";
    }

    @Override
    public int getDifficulty() {
        return 1;
    }

    @Override
    protected void run() {
        new DefaultConstructorTest();
    }
}
