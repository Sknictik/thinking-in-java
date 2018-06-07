package thinkinginjava.block3.exercise1;

import thinkinginjava.Exercise;

import static net.mindview.util.Print.print;

public class BasicLoopExercise extends Exercise {
    @Override
    public String getId() {
        return "1";
    }

    @Override
    public String getName() {
        return "Basic loop";
    }

    @Override
    public String getDescription() {
        return "Write a program that prints values from 1 to 100.";
    }

    @Override
    public int getDifficulty() {
        return 1;
    }

    @Override
    protected void run() {
        for (int i = 1; i <=100; i++) {
            print(i);
        }
    }
}
