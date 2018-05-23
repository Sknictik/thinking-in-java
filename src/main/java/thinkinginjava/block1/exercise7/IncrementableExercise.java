package thinkinginjava.block1.exercise7;

import thinkinginjava.Exercise;

public class IncrementableExercise extends Exercise {

    @Override
    public String getId() {
        return "7";
    }

    @Override
    public String getName() {
        return "Incrementable exercise";
    }

    @Override
    public String getDescription() {
        return "Turn the Incrementable code fragments into a working program.";
    }

    @Override
    public int getDifficulty() {
        return 1;
    }

    @Override
    protected void run() {
        System.out.println("Starting value for i is " + StaticTest.i);

        Incrementable sf = new Incrementable();
        sf.increment();
        Incrementable.increment();

        System.out.println("After executing exercise, value of i changed to " + StaticTest.i);
    }
}
