package thinkinginjava.block2.exercise5and6;

import thinkinginjava.Exercise;

import static net.mindview.util.Print.print;

public class DogsExercise extends Exercise {
    @Override
    public String getId() {
        return "5";
    }

    @Override
    public String getName() {
        return "Dogs";
    }

    @Override
    public String getDescription() {
        return "Create a class called Dog containing two Strings: name and says. In main( ), " +
                "create two dog objects with names “spot” (who says, “Ruff!”) " +
                "and “scruffy” (who says, “Wurf!”). Then display their names and what they say.";
    }

    @Override
    public int getDifficulty() {
        return 2;
    }

    @Override
    protected void run() {
        Dog dog1 = new Dog("spot", "Ruff!");
        Dog dog2 = new Dog("scruffy", "Wurf!");
        print("Here's a " + dog1.getName() + " who says " + dog1.getSays() + " and here's a " + dog2.getName() + " who says " + dog2.getSays());
    }
}
