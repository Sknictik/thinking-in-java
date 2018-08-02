package thinkinginjava.block6.exercise2;

import thinkinginjava.Exercise;

public class SimpleInheritanceExercise extends Exercise {
    @Override
    public String getId() {
        return "2";
    }

    @Override
    public String getName() {
        return "Simple inheritance example";
    }

    @Override
    public String getDescription() {
        return "Inherit a new class from class Detergent." +
                " Override scrub( ) and add a new method called sterilize( ).";
    }

    @Override
    public int getDifficulty() {
        return 2;
    }

    @Override
    protected void run() {
        DetergentChild detergentChild = new DetergentChild();
        detergentChild.scrub();
        detergentChild.sterilize();
    }
}
