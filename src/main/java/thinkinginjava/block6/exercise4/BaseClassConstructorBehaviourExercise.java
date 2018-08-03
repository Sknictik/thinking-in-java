package thinkinginjava.block6.exercise4;

import thinkinginjava.Exercise;

import static net.mindview.util.Print.print;

public class BaseClassConstructorBehaviourExercise extends Exercise {
    @Override
    public String getId() {
        return "4";
    }

    @Override
    public String getName() {
        return "Base Class Constructor Behaviour";
    }

    @Override
    public String getDescription() {
        return "Prove that the base-class constructors are " +
                "(a) always called and " +
                "(b) called before derived-class constructors.";
    }

    @Override
    public int getDifficulty() {
        return 2;
    }

    @Override
    protected void run() {
        print("Attempting to call different children constructors");
        print("Calling child constructor with no arguments");
        new Child();
        print("Calling child constructor with one argument");
        new Child("123");
        print("Calling child constructor with two arguments");
        new Child(1, "123");
    }
}
