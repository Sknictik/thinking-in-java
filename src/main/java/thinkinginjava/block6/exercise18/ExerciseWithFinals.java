package thinkinginjava.block6.exercise18;

import thinkinginjava.Exercise;

import static net.mindview.util.Print.print;

public class ExerciseWithFinals extends Exercise {
    @Override
    public String getId() {
        return "18";
    }

    @Override
    public String getName() {
        return "Exercise with finals";
    }

    @Override
    public String getDescription() {
        return "Create a class with a static final field and a final field and demonstrate the difference between the two";
    }

    @Override
    public int getDifficulty() {
        return 2;
    }

    @Override
    protected void run() {
        Test test = new Test();
        print("First object");
        print("Static integer: " + test.A_STATIC);
        print("Non-statuc integer: " + test.A);
        Test test2 = new Test();
        print("Second object");
        print("Static integer: " + test2.A_STATIC);
        print("Non-static integer: " + test2.A);
    }
}
