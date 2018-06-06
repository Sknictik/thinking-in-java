package thinkinginjava.block2.exercise12;

import thinkinginjava.Exercise;

import static net.mindview.util.Print.print;

public class UnsignedRightShiftExercise extends Exercise {
    @Override
    public String getId() {
        return "12";
    }

    @Override
    public String getName() {
        return "Unsigned right shift";
    }

    @Override
    public String getDescription() {
        return "Start with a number that is all binary ones. Left shift it, " +
                "then use the unsigned right-shift operator to right shift through all " +
                "of its binary positions, each time displaying the result using Integer.toBinaryString( ).";
    }

    @Override
    public int getDifficulty() {
        return 3;
    }

    @Override
    protected void run() {
        int number = 0xFF; //255
        print("Starting number: \n" + Integer.toBinaryString(number));
        number <<= 1;
        print("After left shift: \n" + Integer.toBinaryString(number));
        for (int i = 0; i < 9; i++) {
            number >>>= 1;
            print("After unsigned right shift: \n" + Integer.toBinaryString(number));
        }
    }
}
