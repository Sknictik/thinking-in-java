package thinkinginjava.block6.exercise2;

import static net.mindview.util.Print.print;

public class DetergentChild extends Detergent {

    @Override
    public void scrub() {
        super.scrub();

        print("Inside detergent child scrub() method");
    }

    public void sterilize() {
        print("sterilizing...");
    }

}
