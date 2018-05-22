package thinkinginjava.exercise11;

import thinkinginjava.Exercise;

public class AllTheColorsOfTheRainbowExercise extends Exercise {
    @Override
    public String getId() {
        return "1.11";
    }

    @Override
    public String getName() {
        return "All the colors of the rainbow exercise";
    }

    @Override
    public String getDescription() {
        return "Turn the AllTheColorsOfTheRainbow example into a program that compiles and runs.";
    }

    @Override
    public int getDifficulty() {
        return 1;
    }

    @Override
    protected void run() {
        AllTheColorsOfTheRainbow allTheColorsOfTheRainbow = new AllTheColorsOfTheRainbow();

        System.out.println("Starting color: " + allTheColorsOfTheRainbow.anIntegerRepresentingColors);
        allTheColorsOfTheRainbow.changeTheHueOfTheColor(100);
        System.out.println("Color after change " + allTheColorsOfTheRainbow.anIntegerRepresentingColors);
    }
}
