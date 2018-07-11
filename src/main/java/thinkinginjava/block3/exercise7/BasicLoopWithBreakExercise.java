package thinkinginjava.block3.exercise7;

import thinkinginjava.Exercise;

import static net.mindview.util.Print.print;

public class BasicLoopWithBreakExercise extends Exercise {
    @Override
    public String getId() {
        return "7";
    }

    @Override
    public String getName() {
        return "Basic loop with break";
    }

    @Override
    public String getDescription() {
        return "Modify Exercise 1 so that the program exits by using the break keyword " +
                "at value 99. Try using return instead";
    }

    @Override
    public int getDifficulty() {
        return 1;
    }

    @Override
    protected void run() {
        for (int i = 1; i <=100; i++) {
            if (i == 99) {
                break;
            }
            print(i);
        }
    }
}
