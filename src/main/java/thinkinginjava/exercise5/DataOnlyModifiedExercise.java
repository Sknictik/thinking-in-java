package thinkinginjava.exercise5;

import thinkinginjava.Exercise;
import thinkinginjava.exercise4.DataOnly;

public class DataOnlyModifiedExercise extends Exercise {
    @Override
    public String getId() {
        return "1.5";
    }

    @Override
    public String getName() {
        return "DataOnly modified exercise";
    }

    @Override
    public String getDescription() {
        return "Modify the previous exercise so that the values of the data in DataOnly " +
                "are assigned to and printed in main( ).";
    }

    @Override
    public int getDifficulty() {
        return 1;
    }

    @Override
    protected void run() {
        DataOnly data = new DataOnly();
        data.i = 47;
        data.d = 1.1;
        data.b = false;

        System.out.println("Value of i is: " + data.i);
        System.out.println("Value of d is: " + data.d);
        System.out.println("Value of b is: " + data.b);
    }
}
