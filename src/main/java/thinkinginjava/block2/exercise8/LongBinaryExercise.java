package thinkinginjava.block2.exercise8;

import thinkinginjava.Exercise;

import static net.mindview.util.Print.print;

public class LongBinaryExercise extends Exercise {
    @Override
    public String getId() {
        return "8";
    }

    @Override
    public String getName() {
        return "Long binary notation";
    }

    @Override
    public String getDescription() {
        return "Show that hex and octal notations work with long values. " +
                "Use Long.toBinaryString( ) to display the results.";
    }

    @Override
    public int getDifficulty() {
        return 2;
    }

    @Override
    protected void run() {
        print("Hex long to binary " + Long.toBinaryString(0x00ffffff));
        print("Octal long to binary " + Long.toBinaryString(0154));
    }
}
