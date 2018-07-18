package thinkinginjava.block4.exercise4;

import static net.mindview.util.Print.print;

/**
 * I could inherit this class from
 * @see thinkinginjava.block4.exercise3.DefaultConstructorTest
 * but we're not supposed to learn inheritance yet
 *
 */
public class OverloadedConstructorTest {

    OverloadedConstructorTest() {
        print("This is a default constructor");
    }

    OverloadedConstructorTest(String message) {
        print(message);
    }

}
