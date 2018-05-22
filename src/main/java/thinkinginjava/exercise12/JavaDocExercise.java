package thinkinginjava.exercise12;

import thinkinginjava.Exercise;

public class JavaDocExercise extends Exercise {
    @Override
    public String getId() {
        return "1.12";
    }

    @Override
    public String getName() {
        return "Java doc exercise";
    }

    @Override
    public String getDescription() {
        return "Turn the AllTheColorsOfTheRainbow example into a program that compiles and runs.";
    }

    @Override
    public int getDifficulty() {
        return 1;
    }

    @Override
    protected void run() {
        System.out.println("No code required to complete this exercise.");
    }
}
