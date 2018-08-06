package thinkinginjava.block6.exercise10;

import thinkinginjava.Exercise;

public class InheritanceWithNonDefaultConstructorsExercise extends Exercise {
    @Override
    public String getId() {
        return "10";
    }

    @Override
    public String getName() {
        return "Inheritance with non-default constructors";
    }

    @Override
    public String getDescription() {
        return "Modify the previous exercise so that each class only has non-default constructors.";
    }

    @Override
    public int getDifficulty() {
        return 1;
    }

    @Override
    protected void run() {
        new Stem("123");
    }
}
