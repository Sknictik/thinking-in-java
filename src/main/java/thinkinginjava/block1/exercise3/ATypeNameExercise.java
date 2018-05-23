package thinkinginjava.block1.exercise3;

import thinkinginjava.Exercise;

public class ATypeNameExercise extends Exercise {

    @Override
    public String getId() {
        return "3";
    }

    @Override
    public String getName() {
        return "ATypeName exercise";
    }

    @Override
    public String getDescription() {
        return "Find the code fragments involving ATypeName and turn them into a program that compiles and runs.";
    }

    @Override
    public int getDifficulty() {
        return 1;
    }

    @Override
    protected void run() {
        ATypeName a = new ATypeName();
        System.out.println("Created an object of a ATypeName class");
    }
}
