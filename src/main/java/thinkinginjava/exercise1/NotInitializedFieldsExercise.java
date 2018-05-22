package thinkinginjava.exercise1;

import thinkinginjava.Exercise;

public class NotInitializedFieldsExercise extends Exercise {

    @Override
    public String getId() {
        return "1.1";
    }

    @Override
    public String getName() {
        return "NotInitializedFieldsExercise";
    }

    @Override
    public String getDescription() {
        return "Create a class containing an int and a char that are not initialized, " +
        "and print their values to verify that Java performs default initialization.";
    }

    @Override
    public int getDifficulty() {
        return 2;
    }

    @Override
    protected void run() {
        ClassWithNotInitFields classWithNotInitFields = new ClassWithNotInitFields();
        System.out.println("Default char: " + classWithNotInitFields.notInitializedChar + " in unicode: " + Integer.toHexString(classWithNotInitFields.notInitializedChar));
        System.out.println("Default int: " + classWithNotInitFields.notInitializedInt);
    }
}
