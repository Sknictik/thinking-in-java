package thinkinginjava.block3.exercise2;

import java.util.Random;

import thinkinginjava.Exercise;

import static net.mindview.util.Print.print;

public class RandomNumbersLoop extends Exercise {
    @Override
    public String getId() {
        return "2";
    }

    @Override
    public String getName() {
        return "Random numbers loop";
    }

    @Override
    public String getDescription() {
        return "Write a program that generates 25 random int values. For each value, use an if-else " +
                "statement to classify it as greater than, less than, or equal to a second randomly generated value.";
    }

    @Override
    public int getDifficulty() {
        return 2;
    }

    @Override
    protected void run() {
        Random rand = new Random();
        int firstNumber = 0;
        int secondNumber = 0;
        print("Generating numbers...");
        for (int i = 0; i < 25; i++) {
            if (i > 0) {
                firstNumber = secondNumber;
            }
            secondNumber = rand.nextInt();
            if (i > 0) {
                compareNumbers(firstNumber, secondNumber);
            }
        }
    }

    private void compareNumbers(int firstNumber, int secondNumber) {
        if (secondNumber > firstNumber) {
            print("Generated number " + secondNumber + " is greater than previous number " + firstNumber);
        } else if (secondNumber == firstNumber) {
            print("Generated number " + secondNumber + " is the same as previous number " + firstNumber);
        } else if (secondNumber < firstNumber) {
            print("Generated number " + secondNumber + " is lesser than previous number " + firstNumber);
        }
    }
}
