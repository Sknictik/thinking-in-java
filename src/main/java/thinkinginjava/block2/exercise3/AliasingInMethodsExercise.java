package thinkinginjava.block2.exercise3;

import thinkinginjava.Exercise;
import thinkinginjava.block2.TestObject;

import static net.mindview.util.Print.print;

public class AliasingInMethodsExercise extends Exercise {
    @Override
    public String getId() {
        return "3";
    }

    @Override
    public String getName() {
        return "Aliasing in methods";
    }

    @Override
    public String getDescription() {
        return "Create a class containing a float and use it to demonstrate aliasing during method calls.";
    }

    @Override
    public int getDifficulty() {
        return 1;
    }

    @Override
    protected void run() {
        TestObject testObject = new TestObject(1);
        print("Value before modification: " + testObject.getValue());
        modifyObjectValue(testObject);
        print("Value after modification: " + testObject.getValue());
    }

    private void modifyObjectValue(TestObject testObject) {
        testObject.increment();
    }

}
