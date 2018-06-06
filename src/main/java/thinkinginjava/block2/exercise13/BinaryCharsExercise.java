package thinkinginjava.block2.exercise13;

import java.util.InputMismatchException;
import java.util.Scanner;

import thinkinginjava.Exercise;

import static net.mindview.util.Print.print;

public class BinaryCharsExercise extends Exercise {

    @Override
    public String getId() {
        return "13";
    }

    @Override
    public String getName() {
        return "Binary char";
    }

    @Override
    public String getDescription() {
        return "Write a method that displays char values in binary form." +
                "Demonstrate it using several different characters.";
    }

    @Override
    public int getDifficulty() {
        return 1;
    }

    @Override
    protected void run() {
        System.out.print("Please enter a character...");

        Character c;

        while (true) {
            c = readChar();
            if (c != null) {
                break;
            }
        }

        print("Binary representation of character is: " + Integer.toBinaryString(c));
    }

    private Character readChar() {
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.next(".").charAt(0);
        } catch (InputMismatchException e) {
            print("Please input a single character");
            return null;
        }
    }
}
