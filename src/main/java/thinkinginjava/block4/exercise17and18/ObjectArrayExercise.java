package thinkinginjava.block4.exercise17and18;

import thinkinginjava.Exercise;
import thinkinginjava.ScannerUtils;

import static net.mindview.util.Print.print;

public class ObjectArrayExercise extends Exercise {
    @Override
    public String getId() {
        return "17";
    }

    @Override
    public String getName() {
        return "Object array";
    }

    @Override
    public String getDescription() {
        return "Exercise 17: Create a class with a constructor that takes a String argument. " +
                "During construction, print the argument. Create an array of object " +
                "references to this class, but don’t actually create objects to assign into the array." +
                "When you run the program, notice whether the initialization messages from the constructor" +
                " calls are printed.\n" +
                "Exercise 18: Complete the previous exercise by creating objects to attach to the array of references";
    }

    @Override
    public int getDifficulty() {
        return 2;
    }

    @Override
    protected void run() {
        print("\nPlease select how you want to run this exercise: \n" +
                "17: Define array of objects without creating instances of this objects.\n" +
                "18: Define array of objects and fill array with object instances");
        int option = ScannerUtils.getNumberFromUser();
        print("Defining array of objects...");
        StringObject[] objects = new StringObject[5];
        switch (option) {
            case 17: {
                print("No constructors are called when just defining objects...");
                break;
            }
            case 18: {
                for (int i = 0; i < objects.length; i++) {
                    objects[i] = new StringObject("Created object " + i);
                }
                break;
            }
            default: {
                print("Unknown option");
            }
        }

    }
}
