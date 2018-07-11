package thinkinginjava.block2.exercise10;

import thinkinginjava.Exercise;

import static net.mindview.util.Print.print;

public class BitwiseOperatorsExercise extends Exercise {
    @Override
    public String getId() {
        return "10";
    }

    @Override
    public String getName() {
        return "Bitwise operators";
    }

    @Override
    public String getDescription() {
        return "Write a program with two constant values, one with alternating binary ones and zeroes, " +
                "with a zero in the least-significant digit, and the second, also alternating, " +
                "with a one in the least-significant digit (hint: It’s easiest to use hexadecimal constants for this). " +
                "Take these two values and combine them in all possible ways using the bitwise " +
                "operators, and display the results using Integer.toBinaryString( ).";
    }

    @Override
    public int getDifficulty() {
        return 3;
    }

    @Override
    protected void run() {
        int firstNumber = 0xAA;
        int secondNumber = 0x55;
        print("First number is:  " + Integer.toBinaryString(firstNumber));
        print("Second number is: " + Integer.toBinaryString(secondNumber));

        print("& operation: " + Integer.toBinaryString(firstNumber & secondNumber));
        print("| operation: " + Integer.toBinaryString(firstNumber | secondNumber));
        print("^ operation: " + Integer.toBinaryString(firstNumber ^ secondNumber));
    }
}
