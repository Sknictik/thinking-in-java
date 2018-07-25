package thinkinginjava.block4.exercise14;

import thinkinginjava.Exercise;

public class StaticStringExercise extends Exercise {
    @Override
    public String getId() {
        return "14";
    }

    @Override
    public String getName() {
        return "Static string initialization";
    }

    @Override
    public String getDescription() {
        return "Create a class with a static String field that is initialized at the point of " +
                "definition, and another one that is initialized by the static block. Add a " +
                "static method that prints both fields and demonstrates that they are both " +
                "initialized before they are used";
    }

    @Override
    public int getDifficulty() {
        return 1;
    }

    @Override
    protected void run() {
        StaticInit.printStrings();
    }
}
