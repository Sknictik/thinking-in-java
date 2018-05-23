package thinkinginjava.block2.exercise2;

import thinkinginjava.Exercise;

import static net.mindview.util.Print.print;

public class AliasingExercise extends Exercise {
    @Override
    public String getId() {
        return "2";
    }

    @Override
    public String getName() {
        return "Aliasing exercise";
    }

    @Override
    public String getDescription() {
        return "Create a class containing a float and use it to demonstrate aliasing";
    }

    @Override
    public int getDifficulty() {
        return 1;
    }

    @Override
    protected void run() {
        TestObject object1 = new TestObject(1);
        TestObject object2 = new TestObject(200);
        print("At start object1 value is: " + object1.getValue() + " and object2 value is: " + object2.getValue());
        object1 = object2;
        print("After assigning object2 to object1 values are: for object1 - " + object1.getValue() + " and for object2 - " + object2.getValue());
        object1.increment();
        print("After incrementing our common object value field value for object1 changed to: " + object1.getValue()
                + " and for object2: " + object2.getValue());
    }
}
