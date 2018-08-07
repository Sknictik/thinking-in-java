package thinkinginjava.block6.exercise11;

import thinkinginjava.Exercise;

public class DelegationExercise extends Exercise {
    @Override
    public String getId() {
        return "11";
    }

    @Override
    public String getName() {
        return "Delegation exercise";
    }

    @Override
    public String getDescription() {
        return "Modify Detergent.java so that it uses delegation.";
    }

    @Override
    public int getDifficulty() {
        return 3;
    }

    @Override
    protected void run() {
        new Detergent().execute();
    }
}
