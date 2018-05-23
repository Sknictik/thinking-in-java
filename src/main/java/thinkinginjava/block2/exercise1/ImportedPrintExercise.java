package thinkinginjava.block2.exercise1;

import thinkinginjava.Exercise;

import static net.mindview.util.Print.print;

public class ImportedPrintExercise extends Exercise {
    @Override
    public String getId() {
        return "1";
    }

    @Override
    public String getName() {
        return "Imported print statements exercise";
    }

    @Override
    public String getDescription() {
        return "Write a program that uses the “short” and normal form of print statement.";
    }

    @Override
    public int getDifficulty() {
        return 1;
    }

    @Override
    protected void run() {
        System.out.println("Print sentence with default println method");
        print("Print sentence with imported print method");
    }
}
