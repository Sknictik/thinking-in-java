package thinkinginjava.block3.exercise3;

import java.util.Random;

import thinkinginjava.Exercise;

import static net.mindview.util.Print.print;

public class RandomNumbersInfiniteLoopExercise extends Exercise {
    @Override
    public String getId() {
        return "3";
    }

    @Override
    public String getName() {
        return "Random numbers infinite loop";
    }

    @Override
    public String getDescription() {
        return "Modify Exercise 2 so that your code is surrounded by an “infinite” while loop. " +
                "It will then run until you interrupt it from the keyboard (typically by pressing Control-C).";
    }

    @Override
    public int getDifficulty() {
        return 2;
    }

    @Override
    protected void run() {
        Random rand = new Random();
        Integer firstNumber = null;
        Integer secondNumber;
        print("Generating numbers...");
        while (true) {
            secondNumber = rand.nextInt();
            if (firstNumber != null) {
                compareNumbers(firstNumber, secondNumber);
            }
            firstNumber = secondNumber;
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
