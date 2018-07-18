package thinkinginjava.block4.exercise8;

import thinkinginjava.Exercise;

public class ThisKeywordExercise extends Exercise {
    @Override
    public String getId() {
        return "8";
    }

    @Override
    public String getName() {
        return "This keyword";
    }

    @Override
    public String getDescription() {
        return "Create a class with two methods. Within the first method, call the second " +
                "method twice: the first time without using this, and the second time using this" +
                "— just to see it working; you should not use this form in practice.";
    }

    @Override
    public int getDifficulty() {
        return 1;
    }

    @Override
    protected void run() {
        new Test().firstMethod();
    }
}
