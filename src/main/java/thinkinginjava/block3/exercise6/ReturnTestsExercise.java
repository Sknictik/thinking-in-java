package thinkinginjava.block3.exercise6;

import java.util.Scanner;

import thinkinginjava.Exercise;

import static net.mindview.util.Print.print;

public class ReturnTestsExercise extends Exercise {
    @Override
    public String getId() {
        return "6";
    }

    @Override
    public String getName() {
        return "Return tests";
    }

    @Override
    public String getDescription() {
        return "Modify the two test() methods in the previous two programs so that " +
                "they take two extra arguments, begin and end, and so that testval " +
                "is tested to see if it is within the range between (and including) begin and end.";
    }

    @Override
    public int getDifficulty() {
        return 2;
    }

    @Override
    protected void run() {
        print("Provide a testval integer var:");
        int testval = getNumberFromUser();
        print("Provide a target integer var:");
        int target = getNumberFromUser();
        print("Provide a begin integer var:");
        int begin = getNumberFromUser();
        print("Provide an end integer var:");
        int end = getNumberFromUser();
        test1(testval, target, begin, end);
        int result = test2(testval, target, begin, end);
        if (result >= 1) {
            print("testval is bigger than target");
        } else if (result <= -1) {
            print("testval is less than target");
        } else {
            print("testval and target are equal");
        }
    }

    //I think this will fail with stack overflow if there will be too much attempts
    private int getNumberFromUser() {
        String input = askForInput();
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            print("Invalid number provided");
            return getNumberFromUser();
        }
    }

    private String askForInput() {
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }

    private void test1(int testval, int target, int begin, int end) {
        int result;
        if (testval <= end && testval >= begin) {
            print(testval + " is in range of " + begin + " and " + end);
        } else {
            print(testval + " is outside of range " + begin + " and " + end);
        }
        if (testval > target) {
            print("testval is bigger than target");
            result = +1;
        } else if (testval < target) {
            print("testval is less than target");
            result = -1;
        } else {
            print("testval and target are equal");
            result = 0; // Match
        }
    }

    private int test2(int testval, int target, int begin, int end) {
        if (testval <= end && testval >= begin) {
            print(testval + " is in range of " + begin + " and " + end);
        } else {
            print(testval + " is outside of range " + begin + " and " + end);
        }

        if (testval > target)
            return +1;
        else if (testval < target)
            return -1;
        else
            return 0; // Match
    }

}
