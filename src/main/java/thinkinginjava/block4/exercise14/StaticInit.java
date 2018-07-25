package thinkinginjava.block4.exercise14;

import static net.mindview.util.Print.print;

public class StaticInit {

    private static String strinInitializedAtDefinition = "This string is initialized at definition";
    private static String stringInitAtBlock;

    static {
        stringInitAtBlock = "This string is initialized in static block";
    }

    public static void printStrings() {
        print(strinInitializedAtDefinition);
        print(stringInitAtBlock);
    }

}
