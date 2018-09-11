package thinkinginjava.block6.exercise14;

import thinkinginjava.Exercise;

public class CompositionVsInheritanceExercise extends Exercise {
    @Override
    public String getId() {
        return "14";
    }

    @Override
    public String getName() {
        return "Composition vs inheritance exercise";
    }

    @Override
    public String getDescription() {
        return "In Car.java add a service( ) method to Engine and call this method in main( ).";
    }

    @Override
    public int getDifficulty() {
        return 1;
    }

    @Override
    protected void run() {
        Car car = new Car();
        car.engine.engine();
    }
}
