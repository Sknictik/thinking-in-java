package thinkinginjava.block5.exercise6;

import thinkinginjava.Exercise;

import static net.mindview.util.Print.print;

public class ProtectedForInnerClassesExercise extends Exercise {

    protected String protectedString;

    @Override
    public String getId() {
        return "6";
    }

    @Override
    public String getName() {
        return "Protected access modified and inner classes";
    }

    @Override
    public String getDescription() {
        return "Create a class with protected data. Create a second " +
                "class in the same file with a method" +
                " that manipulates the protected data in the first class.";
    }

    @Override
    public int getDifficulty() {
        return 1;
    }

    @Override
    protected void run() {
        print("Starting value of protected field: " + protectedString);
        new InnerClass().manipulateProtectedField();
        print("Protected field value after manipulation: " + protectedString);
    }

    class InnerClass {
        void manipulateProtectedField() {
            protectedString = "123";
            print("Changed protected field value");
        }
    }

}
