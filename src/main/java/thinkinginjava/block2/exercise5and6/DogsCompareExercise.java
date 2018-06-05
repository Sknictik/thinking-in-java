package thinkinginjava.block2.exercise5and6;

import thinkinginjava.Exercise;

import static net.mindview.util.Print.print;

public class DogsCompareExercise extends Exercise {
    @Override
    public String getId() {
        return "6";
    }

    @Override
    public String getName() {
        return "Compare dogs";
    }

    @Override
    public String getDescription() {
        return "Following Exercise 5, create a new Dog reference and assign it " +
                "to spot’s object. Test for comparison using == and equals( ) " +
                "for all references.";
    }

    @Override
    public int getDifficulty() {
        return 3;
    }

    @Override
    protected void run() {
        Dog dog1 = new Dog("spot", "Ruff!");
        Dog dog2 = new Dog("scruffy", "Wurf!");
        dog1 = new Dog("new dog", "Woof!");
        print("dog1 == dog2: " + (dog1 == dog2));
        print("dog1.equals(dog2): " + (dog1.equals(dog2)));
    }
}
