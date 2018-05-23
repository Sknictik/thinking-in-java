package thinkinginjava.block1.exercise16;

import thinkinginjava.Exercise;

public class OverloadingJavaDocExercise extends Exercise {
    @Override
    public String getId() {
        return "16";
    }

    @Override
    public String getName() {
        return "Overloading javadoc exercise";
    }

    @Override
    public String getDescription() {
        return "In the Initialization & Cleanup chapter, locate the Overloading.java example and add Javadoc documentation." +
                " Extract this comment documentation into an HTML file using Javadoc and view it with your Web browser";
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
