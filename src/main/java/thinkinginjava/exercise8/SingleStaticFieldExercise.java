package thinkinginjava.exercise8;

import thinkinginjava.Exercise;

public class SingleStaticFieldExercise extends Exercise {

    @Override
    public String getId() {
        return "1.8";
    }

    @Override
    public String getName() {
        return "Static field exercise";
    }

    @Override
    public String getDescription() {
        return "Write a program that demonstrates that, no matter how many objects you create of a particular class," +
                " there is only one instance of a particular static field in that class.";
    }

    @Override
    public int getDifficulty() {
        return 3;
    }

    @Override
    protected void run() {
        System.out.println("Starting value of static field is: " + StaticFieldObject.get());
        for (int i = 0; i < 10; i++) {
            StaticFieldObject staticFieldObject = new StaticFieldObject();
            staticFieldObject.increment();
        }

        System.out.println("After executing exercise static field value changed to " + StaticFieldObject.get());
    }
}
