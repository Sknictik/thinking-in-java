package thinkinginjava.block4.exercise13;

import static net.mindview.util.Print.print;

public class ExplicitStaticObject {

    public static void run() {
        print("Inside main()");
        //Cups.cup1.f(99);  // (1)
    }
    static Cups cups1 = new Cups();  // (2)
    static Cups cups2 = new Cups();  // (2)
}
