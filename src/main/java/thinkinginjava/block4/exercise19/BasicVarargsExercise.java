package thinkinginjava.block4.exercise19;

import thinkinginjava.Exercise;

import static net.mindview.util.Print.print;

public class BasicVarargsExercise extends Exercise {
    @Override
    public String getId() {
        return "19";
    }

    @Override
    public String getName() {
        return "Basic varargs";
    }

    @Override
    public String getDescription() {
        return "Write a method that takes a vararg String array. Verify that you can pass " +
                "either a comma-separated list of Strings or a String[] into this method.";
    }

    @Override
    public int getDifficulty() {
        return 2;
    }

    @Override
    protected void run() {
        print("Calling varargs string... method with array and list of strings arguments");
        f("a", "b", "c", "d");
        f(new String[] {"a", "b", "c", "d"});
    }

    private void f(String... strings) {}

}
