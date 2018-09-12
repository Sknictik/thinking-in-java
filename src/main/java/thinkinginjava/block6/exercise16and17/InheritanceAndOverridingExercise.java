package thinkinginjava.block6.exercise16and17;

import thinkinginjava.Exercise;

public class InheritanceAndOverridingExercise extends Exercise {
    @Override
    public String getId() {
        return "17";
    }

    @Override
    public String getName() {
        return "Inheritance and overriding exercise";
    }

    @Override
    public String getDescription() {
        return "Modify Exercise 16 so that Frog overrides the method definitions " +
                "from the base class (provides new definitions using the same method" +
                " signatures). Note what happens in main( ).";
    }

    @Override
    public int getDifficulty() {
        return 1;
    }

    @Override
    protected void run() {
        //Amphibian uses implementation of overridden frog here.
        Amphibian amphibian = new FrogWithOverride();
        amphibian.coldBlood();
    }
}
