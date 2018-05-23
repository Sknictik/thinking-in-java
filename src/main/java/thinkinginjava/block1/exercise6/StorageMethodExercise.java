package thinkinginjava.block1.exercise6;

import java.util.Scanner;

import thinkinginjava.Exercise;

public class StorageMethodExercise extends Exercise {
    @Override
    public String getId() {
        return "6";
    }

    @Override
    public String getName() {
        return "Storage method exercise";
    }

    @Override
    public String getDescription() {
        return "Write a program that includes and calls the storage( ) method defined as a code fragment in this chapter.";
    }

    @Override
    public int getDifficulty() {
        return 2;
    }

    @Override
    protected void run() {
        StorageMethod methodClass = new StorageMethod();
        System.out.print("Enter a string to calculate storage for: ");
        Scanner scan = new Scanner(System.in);
        String stringToStore = scan.next();
        System.out.println("String \"" + stringToStore + "\" requires storage of size " + methodClass.storage(stringToStore));
    }
}
