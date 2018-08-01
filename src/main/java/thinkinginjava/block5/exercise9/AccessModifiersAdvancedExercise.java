package thinkinginjava.block5.exercise9;

import thinkinginjava.Exercise;

import static net.mindview.util.Print.print;

public class AccessModifiersAdvancedExercise extends Exercise {
    @Override
    public String getId() {
        return "9";
    }

    @Override
    public String getName() {
        return "Advances access modifiers";
    }

    @Override
    public String getDescription() {
        return "Create the following file in the " +
                "access/local directory (presumably in your CLASSPATH)." +
                " Explain why the compiler generates an error. Would " +
                "making the Foreign class part of the access.local package change anything?";
    }

    @Override
    public int getDifficulty() {
        return 2;
    }

    @Override
    protected void run() {
        print("We can't create class that is inside another package");
        //PackagedClass pc = new PackagedClass();
    }
}
