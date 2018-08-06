package thinkinginjava.block6.exercise9;

import thinkinginjava.Exercise;

public class InheritanceExercise extends Exercise {
    @Override
    public String getId() {
        return "9";
    }

    @Override
    public String getName() {
        return "Inheritance";
    }

    @Override
    public String getDescription() {
        return "Create a class called Root that contains an instance " +
                "of each of the classes (that you also create) named " +
                "Component1, Component2, and Component3. " +
                "Derive a class Stem from Root that also contains an instance " +
                "of each “component.” " +
                "All classes should have default constructors that print a message about that class.";
    }

    @Override
    public int getDifficulty() {
        return 2;
    }

    @Override
    protected void run() {
        new Stem();
    }
}
