package thinkinginjava.block3.exercise4;

import thinkinginjava.Exercise;

import static net.mindview.util.Print.print;

public class NestedForLoops extends Exercise {
    @Override
    public String getId() {
        return "4";
    }

    @Override
    public String getName() {
        return "Nested for loops";
    }

    @Override
    public String getDescription() {
        return "Write a program that uses two nested for loops and the modulus operator (%) " +
                "to detect and print prime numbers (integral numbers that are not evenly " +
                "divisible by any other numbers except for themselves and 1)";
    }

    @Override
    public int getDifficulty() {
        return 3;
    }

    @Override
    protected void run() {
        print("Looking for prime numbers from 1 to 1000");
        //I could use arrays and lists here but since we are not supposed to know them yet i will do brute force method
        for (int testedNumber = 1; testedNumber <= 1000; testedNumber++) {
            boolean isPrime = true;
            for (int divider = 2; divider < testedNumber; divider++) {
                if (testedNumber % divider == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                print("Found prime number: " + testedNumber);
            }
        }
    }
}
