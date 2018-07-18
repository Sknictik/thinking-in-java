package thinkinginjava.block4.exercise5;

import thinkinginjava.Exercise;

public class OverloadedBarksExercise extends Exercise {
    @Override
    public String getId() {
        return "5";
    }

    @Override
    public String getName() {
        return "Overloaded barks";
    }

    @Override
    public String getDescription() {
        return "Create a class called Dog with an overloaded bark( ) method. This method should be overloaded based on various " +
                "primitive data types, and print different types of barking, howling, etc., depending on which " +
                "overloaded version is called. Write a main( ) that calls all the different versions.";
    }

    @Override
    public int getDifficulty() {
        return 2;
    }

    @Override
    protected void run() {
        OverloadedDog dog = new OverloadedDog();
        dog.bark('a');
        dog.bark(1);
        dog.bark((short) 1);
        dog.bark(1L);
        dog.bark(1d);
        dog.bark(1f);
    }
}
