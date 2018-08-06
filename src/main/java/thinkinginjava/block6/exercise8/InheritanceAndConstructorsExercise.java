package thinkinginjava.block6.exercise8;

import thinkinginjava.Exercise;

public class InheritanceAndConstructorsExercise extends Exercise {
    @Override
    public String getId() {
        return "8";
    }

    @Override
    public String getName() {
        return "Inheritance and Constructors";
    }

    @Override
    public String getDescription() {
        return "Create a base class with only a non-default constructor, and a derived " +
                "class with both a default (no-arg) and non-default constructor. " +
                "In the derived-class constructors, call the base-class constructor. ";
    }

    @Override
    public int getDifficulty() {
        return 1;
    }

    @Override
    protected void run() {
        new Child();
    }
}
