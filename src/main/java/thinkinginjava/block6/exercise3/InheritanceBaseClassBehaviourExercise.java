package thinkinginjava.block6.exercise3;

import thinkinginjava.Exercise;

import static net.mindview.util.Print.print;

public class InheritanceBaseClassBehaviourExercise extends Exercise {
    @Override
    public String getId() {
        return "3";
    }

    @Override
    public String getName() {
        return "Inheritance Base Class Behaviour";
    }

    @Override
    public String getDescription() {
        return "Prove the sentence: Even if you don’t create a " +
                "constructor for child class, the compiler " +
                "will synthesize a default constructor for you that " +
                "calls the base class constructor";
    }

    @Override
    public int getDifficulty() {
        return 2;
    }

    @Override
    protected void run() {
        print("Test if base class constructor will be called even when we have not defined constructors in child class");
        new Child();
    }
}
