package thinkinginjava.exercise4;

import thinkinginjava.Exercise;

public class DataOnlyExercise extends Exercise {

    @Override
    public String getId() {
        return "1.4";
    }

    @Override
    public String getName() {
        return "DataOnly exercise";
    }

    @Override
    public String getDescription() {
        return "Turn the DataOnly code fragments into a program that compiles and runs.";
    }

    @Override
    public int getDifficulty() {
        return 1;
    }

    @Override
    protected void run() {
        DataOnly data = new DataOnly();
        data.i = 47;
        data.d = 1.1;
        data.b = false;
    }
}
