package thinkinginjava.block4.exercise10and11;

import thinkinginjava.Exercise;

import static net.mindview.util.Print.print;

public class AlwaysFinializeExercise extends Exercise {
    @Override
    public String getId() {
        return "11";
    }

    @Override
    public String getName() {
        return "Always finalize";
    }

    @Override
    public String getDescription() {
        return "\nExercise 10: Create a class with a finalize( ) method that prints a message. " +
                "In main( ), create an object of your class. Explain the behavior of your program.\n" +
                "Exercise 11: Modify the previous exercise so that your finalize( ) will always be called.";
    }

    @Override
    public int getDifficulty() {
        return 4;
    }

    @Override
    protected void run() {
        print("Creating an object of class with overriden finalize()");
        new FinalizedClass();
        print("Calling force gc");
        System.gc();
        print("Object will be finalized soon");
    }
}
