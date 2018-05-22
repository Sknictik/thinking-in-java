package thinkinginjava.exercise15;

import thinkinginjava.Exercise;

public class Exercise2JavaDocExercise extends Exercise {
    @Override
    public String getId() {
        return "1.15";
    }

    @Override
    public String getName() {
        return "Exercise 2 java doc exercise";
    }

    @Override
    public String getDescription() {
        return "Take the program in Exercise 2 and add comment documentation to it. " +
                "Extract this comment documentation into an HTML file using Javadoc " +
                "and view it with your Web browser.";
    }

    @Override
    public int getDifficulty() {
        return 1;
    }

    @Override
    protected void run() {
        System.out.println("No code is required to run in this exercise");
    }
}
