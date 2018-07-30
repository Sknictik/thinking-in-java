package thinkinginjava.block4.exercise21and22;

import thinkinginjava.Exercise;

import static net.mindview.util.Print.print;

public class BasicEnumExercise extends Exercise {
    @Override
    public String getId() {
        return "21";
    }

    @Override
    public String getName() {
        return "Basic enums";
    }

    @Override
    public String getDescription() {
        return "Create an enum of the least-valuable six types of" +
                " paper currency. Loop through the values( ) and print each value and its ordinal( ).";
    }

    @Override
    public int getDifficulty() {
        return 1;
    }

    @Override
    protected void run() {
        for (PaperCurrency paperCurrency : PaperCurrency.values()) {
            print(paperCurrency + " " + paperCurrency.ordinal());
        }
    }
}
