package thinkinginjava.block5.exercise3;

import thinkinginjava.Exercise;
import thinkinginjava.ScannerUtils;
import thinkinginjava.block5.exercise3.debug.DebugOnExecutor;
import thinkinginjava.block5.exercise3.debugoff.DebugOffExecutor;

import static net.mindview.util.Print.print;

public class StaticImportExercise extends Exercise {
    @Override
    public String getId() {
        return "3";
    }

    @Override
    public String getName() {
        return "Static import";
    }

    @Override
    public String getDescription() {
        return "Create two packages: debug and debugoff, containing an identical " +
                "class with a debug( ) method. The first version displays its " +
                "String argument to the console, the second does nothing." +
                " Use a static import line to import the class into a test program," +
                " and demonstrate the conditional compilation effect.";
    }

    @Override
    public int getDifficulty() {
        return 2;
    }

    @Override
    protected void run() {
        print("Please select mode to run exercise in: \n1)Run in debug mode\n2)Run in debugoff mode");

        int mode;
        do {
            mode = ScannerUtils.getNumberFromUser();
        } while(!validateMode(mode));

        DebugExecutor debugExecutor = null;
        switch (mode) {
            case 1: {
                debugExecutor = new DebugOnExecutor();
                break;
            }
            case 2: {
                debugExecutor = new DebugOffExecutor();
                break;
            }
        }
        //Debug executor should never be null
        debugExecutor.run("Running debug method");
    }

    private boolean validateMode(int mode) {
        boolean isValidated = mode == 1 || mode == 2;
        if (!isValidated) {
            print("Unknown mode selected. Please select one of the modes above!");
        }
        return isValidated;
    }

}
