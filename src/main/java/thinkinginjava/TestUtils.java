package thinkinginjava;

public class TestUtils {

    public static void assertTrue(boolean condition) {
        if (!condition) {
            throw new AssertionError("condition is not true!");
        }
    }

}
