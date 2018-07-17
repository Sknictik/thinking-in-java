package thinkinginjava.block3.exercise9;

import thinkinginjava.Exercise;
import thinkinginjava.ScannerUtils;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

public class FibonacciExercise extends Exercise {
    @Override
    public String getId() {
        return "9";
    }

    @Override
    public String getName() {
        return "Fibonacci";
    }

    @Override
    public String getDescription() {
        return "A Fibonacci sequence is the sequence of numbers 1, 1, 2, 3, 5, 8, 13, 21, 34, " +
                "and so on, where each number (from the third on) is the sum of the previous two. " +
                "Create a method that takes an integer as an argument and displays that many " +
                "Fibonacci numbers starting from the beginning, e.g., If you run java Fibonacci 5 " +
                "(where Fibonacci is the name of the class) the output will be: 1, 1, 2, 3, 5.";
    }

    @Override
    public int getDifficulty() {
        return 4;
    }

    @Override
    protected void run() {
        print("Enter how many fibonacci numbers to print:");
        int count = ScannerUtils.getNumberFromUser();
        printFibonacci(count);
    }

    //This method overflows to negative integer starting from a certain fibonacci number
    private void printFibonacci(int count) {
        int prevNumber = 0;
        int number = 1;
        int nextNumber;
        for (int i = 0; i < count; i++) {
            nextNumber = number + prevNumber;
            printnb(number);
            if (i != count -1) {
                printnb(", ");
            }
            prevNumber = number;
            number = nextNumber;
        }
    }

}
