package thinkinginjava.block4.exercise2;

import thinkinginjava.Exercise;

import static net.mindview.util.Print.print;

public class InitializedStringObjectExercise extends Exercise {
    @Override
    public String getId() {
        return "2";
    }

    @Override
    public String getName() {
        return "Object with initialized String";
    }

    @Override
    public String getDescription() {
        return "Create a class with a String field that is initialized at the point of " +
                "definition, and another one that is initialized by the constructor. " +
                "What is the difference between the two approaches?";
    }

    @Override
    public int getDifficulty() {
        return 2;
    }

    @Override
    protected void run() {
        print("String initialized as class field: " + new TestInitializedAtDefinition().string);
        print("String initialized in constructor: " + new TestInitializedAtConstructor("String initialized at constructor").string);
    }
}
