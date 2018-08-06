package thinkinginjava.block6.exercise7;

import thinkinginjava.Exercise;

public class BaseClassConstructorsExercise extends Exercise {
    @Override
    public String getId() {
        return "7";
    }

    @Override
    public String getName() {
        return "Base Class Constructors";
    }

    @Override
    public String getDescription() {
        return " Modify Exercise 5 so that A and B have constructors " +
                "with arguments instead of default constructors. " +
                "Write a constructor for C and perform all initialization within C’s constructor.";
    }

    @Override
    public int getDifficulty() {
        return 1;
    }

    @Override
    protected void run() {
        new C();
    }
}
