package thinkinginjava.block4.exercise10and11;

import static net.mindview.util.Print.print;

public class FinalizedClass {

    @Override
    protected void finalize() throws Throwable {
        print("Finalize is called on object");

        super.finalize();
    }
}
