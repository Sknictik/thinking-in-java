package thinkinginjava.block6.exercise12;

import thinkinginjava.Exercise;

public class CleaningUpExercise extends Exercise {
    @Override
    public String getId() {
        return "12";
    }

    @Override
    public String getName() {
        return "Cleaning up";
    }

    @Override
    public String getDescription() {
        return "Add a proper hierarchy of dispose( ) methods to all the classes in Exercise 9.";
    }

    @Override
    public int getDifficulty() {
        return 3;
    }

    @Override
    protected void run() {
        //A good idea would be to create interface with dispose() method
        //and make everything (except this class) implement this interface.
        //But again, we are not supposed to know about interfaces here yet.
        DisposableStem stem = new DisposableStem();
        stem.dispose();
    }
}
