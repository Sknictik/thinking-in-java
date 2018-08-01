package thinkinginjava.block5.exercise7;

import thinkinginjava.Exercise;
import thinkinginjava.block5.exercise7.access.Widget;

import static net.mindview.util.Print.print;

public class CreatingLibraryExercise extends Exercise {
    @Override
    public String getId() {
        return "7";
    }

    @Override
    public String getName() {
        return "Creating libraries";
    }

    @Override
    public String getDescription() {
        return "Create the library according to the code fragments describing access and Widget." +
                " Create a Widget in a class that is not part of the access package.";
    }

    @Override
    public int getDifficulty() {
        return 1;
    }

    @Override
    protected void run() {
        print("Creating object of class Widget outside of Widget class package");
        new Widget();
    }
}
