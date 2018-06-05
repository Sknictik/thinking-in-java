package thinkinginjava.block2.exercise9;

import thinkinginjava.Exercise;

import static net.mindview.util.Print.print;

public class ExponentialNotationExercise extends Exercise {
    @Override
    public String getId() {
        return "9";
    }

    @Override
    public String getName() {
        return "Exponential notation";
    }

    @Override
    public String getDescription() {
        return "Display the largest and smallest numbers " +
                "for both float and double exponential notation.";
    }

    @Override
    public int getDifficulty() {
        return 1;
    }

    @Override
    protected void run() {
        print("Float max: " + 3.4028235e38f);
        print("Float min: " + 1.4e-45f);

        print("Double max: " + 1.7976931348623157e308);
        print("Double min: " + 4.9e-324);
    }
}
