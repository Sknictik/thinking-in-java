package thinkinginjava.block5.exercise2;

import thinkinginjava.Exercise;
import thinkinginjava.block5.exercise2.list.*;
import java.util.*;

import static net.mindview.util.Print.print;

public class PackageCollisionsExercise extends Exercise {
    @Override
    public String getId() {
        return "2";
    }

    @Override
    public String getName() {
        return "Package collisions";
    }

    @Override
    public String getDescription() {
        return "Take the code fragments in this section and turn them into a program," +
                " and verify that collisions do in fact occur.";
    }

    @Override
    public int getDifficulty() {
        return 1;
    }

    @Override
    protected void run() {
        print("Attempting to create a standard ArrayList instance. Imported custom ArrayList as well.");
        java.util.ArrayList list = new java.util.ArrayList();
    }
}
