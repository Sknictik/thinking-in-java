package thinkinginjava.block4.exercise15;

import thinkinginjava.Exercise;

import static net.mindview.util.Print.print;

public class InstanceInitBlockExercise extends Exercise {
    @Override
    public String getId() {
        return "15";
    }

    @Override
    public String getName() {
        return "Instance initialization blocks";
    }

    @Override
    public String getDescription() {
        return "Create a class with a String that is initialized using instance initialization";
    }

    @Override
    public int getDifficulty() {
        return 1;
    }

    @Override
    protected void run() {
        InstanceBlockInit test = new InstanceBlockInit();
        print(test.getStringInitAtInstanceBlock());
    }
}
