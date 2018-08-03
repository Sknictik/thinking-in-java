package thinkinginjava.block6.exercise5;

import thinkinginjava.Exercise;

public class ExperimentsWithInheritanceAndCompositionExercise extends Exercise {
    @Override
    public String getId() {
        return "5";
    }

    @Override
    public String getName() {
        return "Experiments with inheritance and composition";
    }

    @Override
    public String getDescription() {
        return "Create two classes, A and B, with default constructors " +
                "(empty argument lists) that announce themselves. " +
                "Inherit a new class called C from A, and create a " +
                "member of class B inside C. Do not create a constructor for C." +
                " Create an object of class C and observe the results.";
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
