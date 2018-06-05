package thinkinginjava.block2.exercise7;

import java.util.Random;

import thinkinginjava.Exercise;

import static net.mindview.util.Print.print;

public class CoinFlipExercise extends Exercise {
    @Override
    public String getId() {
        return "7";
    }

    @Override
    public String getName() {
        return "Coin flip";
    }

    @Override
    public String getDescription() {
        return "Write a program that simulates coin-flipping.";
    }

    @Override
    public int getDifficulty() {
        return 3;
    }

    @Override
    protected void run() {
        Random random = new Random();
        print("Coin tossed!");
        String result = random.nextBoolean() ? "heads!" : "tails!";
        print("It's " + result);
    }
}
