package thinkinginjava.block5.exercise4;

import thinkinginjava.Exercise;

import static net.mindview.util.Print.print;

public class ProtectedAccessExercise extends Exercise {
    @Override
    public String getId() {
        return "4";
    }

    @Override
    public String getName() {
        return "Protected access";
    }

    @Override
    public String getDescription() {
        return "Show that protected methods have package access but are not public.";
    }

    @Override
    public int getDifficulty() {
        return 2;
    }

    @Override
    protected void run() {
        print("Calling protected method on an object of class in current package");
        new ProtectedMethodClass().doStuff();
        print("Calling protected method on an object outside of current package will not work.");
        //Won't compile
        //new thinkinginjava.block5.exercise4.other.ProtectedMethodClass().doStuff();
    }
}
