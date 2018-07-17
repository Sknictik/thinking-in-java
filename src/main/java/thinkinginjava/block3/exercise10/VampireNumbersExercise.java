package thinkinginjava.block3.exercise10;

import thinkinginjava.Exercise;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

public class VampireNumbersExercise extends Exercise {
    @Override
    public String getId() {
        return "10";
    }

    @Override
    public String getName() {
        return "Vampire numbers";
    }

    @Override
    public String getDescription() {
        return "A vampire number has an even number of digits and is formed by " +
                "multiplying a pair of numbers containing half the number of digits" +
                "of the result. The digits are taken from the original number in any order." +
                "Pairs of trailing zeroes are not allowed.Examples include:\n" +
                "1260 = 21 * 60  \n" +
                "1827 = 21 * 87  \n" +
                "2187 = 27 * 81  \n" +
                "Write a program that finds all the 4-digit vampire numbers. (Suggested by Dan Forhan.)";
    }

    @Override
    public int getDifficulty() {
        return 5;
    }

    @Override
    protected void run() {
        //Can't use arrays since we're not supposed to learn them yet
        int digit1;
        int digit2;
        int digit3;
        int digit4;

        int number1;
        int number2;
        int number3;
        int number4;
        int number5;
        int number6;
        int number7;
        int number8;
        int number9;
        int number10;
        int number11;
        int number12;

        print("Found vampire numbers: ");

        for (int candidate = 1000; candidate < 10000; candidate++) {
            digit1 = candidate / 1000;
            digit2 = candidate % 1000 / 100;
            digit3 = candidate % 100 / 10;
            digit4 = candidate % 10;

            number1 = Integer.parseInt(String.valueOf(digit1) + String.valueOf(digit2));
            number2 = Integer.parseInt(String.valueOf(digit1) + String.valueOf(digit3));
            number3 = Integer.parseInt(String.valueOf(digit1) + String.valueOf(digit4));
            number4 = Integer.parseInt(String.valueOf(digit2) + String.valueOf(digit1));
            number5 = Integer.parseInt(String.valueOf(digit3) + String.valueOf(digit1));
            number6 = Integer.parseInt(String.valueOf(digit4) + String.valueOf(digit1));

            number7 = Integer.parseInt(String.valueOf(digit3) + String.valueOf(digit4));
            number8 = Integer.parseInt(String.valueOf(digit2) + String.valueOf(digit4));
            number9 = Integer.parseInt(String.valueOf(digit2) + String.valueOf(digit3));
            number10 = Integer.parseInt(String.valueOf(digit4) + String.valueOf(digit3));
            number11 = Integer.parseInt(String.valueOf(digit4) + String.valueOf(digit2));
            number12 = Integer.parseInt(String.valueOf(digit3) + String.valueOf(digit2));

            if (number1 * number7 == candidate || number1 * number10 == candidate
                    || number2 * number8 == candidate || number2 * number11 == candidate
                    || number3 * number9 == candidate || number3 * number12 == candidate
                    || number4 * number7 == candidate || number4 * number10 == candidate
                    || number5 * number8 == candidate || number5 * number11 == candidate
                    || number6 * number9 == candidate || number6 * number12 == candidate) {
                printnb(candidate + " ");
            }

        }

    }
}
