package thinkinginjava.block5.exercise1;

import thinkinginjava.Exercise;
import thinkinginjava.block5.exercise1.simple.PackageClass;

import static net.mindview.util.Print.print;

public class SimplePackageExercise extends Exercise {
    @Override
    public String getId() {
        return "1";
    }

    @Override
    public String getName() {
        return "Simple package";
    }

    @Override
    public String getDescription() {
        return "Create a class in a package. Create an instance of your class outside of that package.";
    }

    @Override
    public int getDifficulty() {
        return 1;
    }

    @Override
    protected void run() {
        PackageClass packageClass = new PackageClass();
        print("Created a class outside of that package");
    }
}
