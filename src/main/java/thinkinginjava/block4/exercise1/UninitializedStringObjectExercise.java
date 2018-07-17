package thinkinginjava.block4.exercise1;

import thinkinginjava.Exercise;

import static net.mindview.util.Print.print;

public class UninitializedStringObjectExercise extends Exercise {
    @Override
    public String getId() {
        return "1";
    }

    @Override
    public String getName() {
        return "Object with uninitialized string";
    }

    @Override
    public String getDescription() {
        return "Create a class containing an uninitialized String reference." +
                " Demonstrate that this reference is initialized by Java to null.";
    }

    @Override
    public int getDifficulty() {
        return 1;
    }

    @Override
    protected void run() {
        Test test = new Test();
        print("Not initialized String has value: " + test.notInitializedString);
    }
}
