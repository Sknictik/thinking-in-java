package thinkinginjava.block4.exercise12;

import thinkinginjava.Exercise;

import static net.mindview.util.Print.print;

public class FinalizeLoggingExercise extends Exercise {
    @Override
    public String getId() {
        return "12";
    }

    @Override
    public String getName() {
        return "Logging with finalize";
    }

    @Override
    public String getDescription() {
        return "Create a class called Tank that can be filled and emptied, and has a termination condition " +
                "that it must be empty when the object is cleaned up. Write a finalize( ) " +
                "that verifies this termination condition. In main( ), test the possible scenarios that can occur when your Tank is used.";
    }

    @Override
    public int getDifficulty() {
        return 4;
    }

    @Override
    protected void run() {
        print("Attempting to gc with one filled and one empty tank");
        new Tank().fill();
        //By default tank starts as empty but empty() it anyway just to be clear.
        new Tank().empty();

        System.gc();
    }
}
