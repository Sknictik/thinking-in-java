package thinkinginjava.block4.exercise6;

import thinkinginjava.Exercise;

public class OverloadWithArgumentsOrderingExercise extends Exercise {
    @Override
    public String getId() {
        return "6";
    }

    @Override
    public String getName() {
        return "Overload with arguments ordering";
    }

    @Override
    public String getDescription() {
        return "Modify the previous exercise so that two of the overloaded methods have " +
                "two arguments (of two different types), but in reversed order relative " +
                "to each other. Verify that this works.";
    }

    @Override
    public int getDifficulty() {
        return 1;
    }

    @Override
    protected void run() {
        OverloadedDog dog = new OverloadedDog();
        dog.bark("1", 1);
        dog.bark(1, "1");
    }
}
