package thinkinginjava.exercise13;

import thinkinginjava.Exercise;

public class JavaDocContinuedExercise extends Exercise {
    @Override
    public String getId() {
        return "1.13";
    }

    @Override
    public String getName() {
        return "Javadoc continued exercise";
    }

    @Override
    public String getDescription() {
        return "Run Documentation1.java, Documentation2.java, and Documentation3.java through Javadoc." +
                " Verify the resulting documentation with your Web browser.";
    }

    @Override
    public int getDifficulty() {
        return 1;
    }

    @Override
    protected void run() {
        System.out.println("No code required to complete this exercise");
    }
}
