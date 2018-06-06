package thinkinginjava.block2.exercise11;

import thinkinginjava.Exercise;

import static net.mindview.util.Print.print;

public class RightShiftExercise extends Exercise {
    @Override
    public String getId() {
        return "11";
    }

    @Override
    public String getName() {
        return "Right shift";
    }

    @Override
    public String getDescription() {
        return "Start with a number that has a binary one in the most significant position " +
                "(hint: Use a hexadecimal constant). Using the signed right-shift operator, right shift " +
                "it all the way through all of its binary positions, each time displaying " +
                "the result using Integer.toBinaryString( ).";
    }

    @Override
    public int getDifficulty() {
        return 3;
    }

    @Override
    protected void run() {
        int number = 0xAA;
        print("Starting number: \n" + Integer.toBinaryString(number));
        for (int i = 0; i < 8; i++) {
            number >>= 1;
            print("Shifted one right: \n" + Integer.toBinaryString(number));
        }
    }
}
