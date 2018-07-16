package thinkinginjava.block3.exercise8;

import thinkinginjava.Exercise;

import static net.mindview.util.Print.print;

public class SwitchExercise extends Exercise {
    @Override
    public String getId() {
        return "8";
    }

    @Override
    public String getName() {
        return "Switches";
    }

    @Override
    public String getDescription() {
        return "Create a switch statement that prints a message for each case, and put " +
                "the switch inside a for loop that tries each case. Put a break " +
                "after each case and test it, then remove the breaks and see what happens.";
    }

    @Override
    public int getDifficulty() {
        return 2;
    }

    @Override
    protected void run() {
        print("Using switch with breaks...");
        for (int i = 0; i < 3; i++) {
            switchMethod(i, true);
        }

        print("Using switch without breaks...");
        for(int i = 0; i < 3; i++) {
            switchMethod(i, false);
        }
    }

    private void switchMethod(int condition, boolean useBreaks) {
        switch (condition) {
            case 0: {
                print("Case 1");
                if (useBreaks) {
                    break;
                }
            }
            case 1: {
                print("Case 2");
                if (useBreaks) {
                    break;
                }
            }
            case 2: {
                print("Case 3");
                if (useBreaks) {
                    break;
                }
            }
        }
    }
}
