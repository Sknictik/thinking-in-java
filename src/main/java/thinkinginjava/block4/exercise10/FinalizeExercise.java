package thinkinginjava.block4.exercise10;

import thinkinginjava.Exercise;

import static net.mindview.util.Print.print;

public class FinalizeExercise extends Exercise {
    @Override
    public String getId() {
        return "10";
    }

    @Override
    public String getName() {
        return "Finalize";
    }

    @Override
    public String getDescription() {
        return "Create a class with a finalize( ) method that prints a message. " +
                "In main( ), create an object of your class. Explain the behavior of your program.";
    }

    @Override
    public int getDifficulty() {
        return 2;
    }

    @Override
    protected void run() {
        print("Creating an object of class with overriden finalize()");
        new FinalizedClass();
        print("Calling force gc");
        System.gc();
        print("Object should be garbage collected soon...");
    }
}
