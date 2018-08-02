package thinkinginjava.block6.exercise1;

import thinkinginjava.Exercise;

public class SimpleCompositionExercise extends Exercise {
    @Override
    public String getId() {
        return "1";
    }

    @Override
    public String getName() {
        return "Example of simple inheritance";
    }

    @Override
    public String getDescription() {
        return "Create a simple class. Inside a second class, define a reference to an object " +
                "of the first class. Use lazy initialization to instantiate this object.";
    }

    @Override
    public int getDifficulty() {
        return 2;
    }

    @Override
    protected void run() {
        CompositeClass compositeClass = new CompositeClass();
        compositeClass.getSimpleClass();
    }
}
