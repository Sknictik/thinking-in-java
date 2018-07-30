package thinkinginjava;

import java.util.Scanner;

import static net.mindview.util.Print.print;

public class ScannerUtils {

    public static int getNumberFromUser() {
        while (true) {
            String input = askForInput();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                print("Invalid number provided");
            }
        }
    }

    //No validation. Any String will do.
    public static String getStringFromUser() {
        return askForInput();
    }

    private static String askForInput() {
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }

}
