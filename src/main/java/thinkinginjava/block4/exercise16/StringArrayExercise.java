package thinkinginjava.block4.exercise16;

import thinkinginjava.Exercise;

import static net.mindview.util.Print.print;

public class StringArrayExercise extends Exercise {
    @Override
    public String getId() {
        return "16";
    }

    @Override
    public String getName() {
        return "String array";
    }

    @Override
    public String getDescription() {
        return "Create an array of String objects and assign a String " +
                "to each element. Print the array by using a for loop.";
    }

    @Override
    public int getDifficulty() {
        return 1;
    }

    @Override
    protected void run() {
        String[] strings = new String[5];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = String.valueOf(i);
        }

        for (int i = 0; i < strings.length; i++) {
            print(strings[i]);
        }
    }
}
