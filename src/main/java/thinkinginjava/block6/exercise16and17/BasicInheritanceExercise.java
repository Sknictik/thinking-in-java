package thinkinginjava.block6.exercise16and17;

import thinkinginjava.Exercise;

public class BasicInheritanceExercise extends Exercise {
    @Override
    public String getId() {
        return "16";
    }

    @Override
    public String getName() {
        return "Basic inheritance";
    }

    @Override
    public String getDescription() {
        return "Create a class called Amphibian. " +
                "From this, inherit a class called Frog. " +
                "Put appropriate methods in the base class. In main( ), create a Frog and upcast" +
                " it to Amphibian and demonstrate that all the methods still work.";
    }

    @Override
    public int getDifficulty() {
        return 2;
    }

    @Override
    protected void run() {
        //Amphibian coldBlood method is used.
        Amphibian amphibian = new Frog();
        amphibian.coldBlood();
    }
}
