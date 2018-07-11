package thinkinginjava.block3.exercise5;

import thinkinginjava.Exercise;

import static net.mindview.util.Print.print;

public class BitwiseOperatorTernaryDisplayExercise extends Exercise {
    @Override
    public String getId() {
        return "5";
    }

    @Override
    public String getName() {
        return "Bitwise operator and displaying results using bitwise ternary operators";
    }

    @Override
    public String getDescription() {
        return "Repeat Exercise 10 from the previous chapter, using the ternary operator " +
                "and a bitwise test to display the ones and zeroes, instead of Integer.toBinaryString().";
    }

    @Override
    public int getDifficulty() {
        return 4;
    }

    @Override
    protected void run() {
        int firstNumber = 0xAA;
        int secondNumber = 0x55;
        print("First number is:  " + Integer.toBinaryString(firstNumber));
        print("Second number is: " + Integer.toBinaryString(secondNumber));
        System.out.print("& operation: ");
        for (int position = 7; position >= 0; position--) {
            int bitFirstNumber = getBit(firstNumber, position);
            int bitSecondNumber = getBit(secondNumber, position);

            System.out.print(bitFirstNumber & bitSecondNumber);
        }
        print();
        System.out.print("| operation: ");
        for (int position = 7; position >= 0; position--) {
            int bitFirstNumber = getBit(firstNumber, position);
            int bitSecondNumber = getBit(secondNumber, position);

            System.out.print(bitFirstNumber | bitSecondNumber);
        }
        print();
        System.out.print("^ operation: ");
        for (int position = 7; position >= 0; position--) {
            int bitFirstNumber = getBit(firstNumber, position);
            int bitSecondNumber = getBit(secondNumber, position);

            System.out.print(bitFirstNumber ^ bitSecondNumber);
        }
    }

    private int getBit(int base, int position) {
        return base >> position & 1;
    }

}
