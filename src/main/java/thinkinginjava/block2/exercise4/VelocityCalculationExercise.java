package thinkinginjava.block2.exercise4;

import thinkinginjava.Exercise;

import static net.mindview.util.Print.print;

public class VelocityCalculationExercise extends Exercise {

    @Override
    public String getId() {
        return "4";
    }

    @Override
    public String getName() {
        return "Velocity calculation";
    }

    @Override
    public String getDescription() {
        return "Write a program that calculates velocity using a constant distance and a constant time";
    }

    @Override
    public int getDifficulty() {
        return 2;
    }

    @Override
    protected void run() {
        int distance = 50;
        int time = 2;
        print("Let person run distance of " + distance + " meters in " + time + " seconds");
        print("Then calculated velocity is " + distance / time + " m/s");
    }
}
