package thinkinginjava.exercise6;

import thinkinginjava.Exercise;

public class StorageMethodExercise extends Exercise {
    @Override
    public String getId() {
        return "1.6";
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
        String stringToStore = "1123";
        System.out.println(stringToStore + " requires storage of size " + methodClass.storage(stringToStore));
    }
}
