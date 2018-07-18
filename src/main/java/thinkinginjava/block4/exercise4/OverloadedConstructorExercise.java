package thinkinginjava.block4.exercise4;

import thinkinginjava.Exercise;

public class OverloadedConstructorExercise extends Exercise {
    @Override
    public String getId() {
        return "4";
    }

    @Override
    public String getName() {
        return "Overloaded constructor";
    }

    @Override
    public String getDescription() {
        return "Add an overloaded constructor to the previous exercise that" +
                " takes a String argument and prints it along with your message.";
    }

    @Override
    public int getDifficulty() {
        return 1;
    }

    @Override
    protected void run() {
        new OverloadedConstructorTest("This is an overloaded constructor");
    }
}
