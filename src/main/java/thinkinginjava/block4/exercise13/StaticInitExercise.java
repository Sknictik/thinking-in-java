package thinkinginjava.block4.exercise13;

import thinkinginjava.Exercise;
import thinkinginjava.ScannerUtils;

import static net.mindview.util.Print.print;

public class StaticInitExercise extends Exercise {
    @Override
    public String getId() {
        return "13";
    }

    @Override
    public String getName() {
        return "Static initializations";
    }

    @Override
    public String getDescription() {
        return "Verify static initialization ordering";
    }

    @Override
    public int getDifficulty() {
        return 1;
    }

    @Override
    protected void run() {
        print("Please select an option to run exercise:\n" +
        "1. Call static method\n" +
        "2. Initialize static objects\n" +
        "3. Don't do anything");
        int option = ScannerUtils.getNumberFromUser();
        switch (option) {
            case 1: {
                ExplicitStaticMethod.run();
                break;
            }
            case 2: {
                ExplicitStaticObject.run();
                break;
            }
            case 3: {
                NoExplicitStatic.run();
                break;
            }
            default: {
                print("Unknown option");
            }
        }
    }
}
