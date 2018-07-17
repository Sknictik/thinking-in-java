package thinkinginjava;

import java.util.Scanner;

import static net.mindview.util.Print.print;

public class ScannerUtils {
    //This will fail with stack overflow if there will be too much attempts
    public static int getNumberFromUser() {
        String input = askForInput();
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            print("Invalid number provided");
            return getNumberFromUser();
        }
    }

    private static String askForInput() {
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }

}
