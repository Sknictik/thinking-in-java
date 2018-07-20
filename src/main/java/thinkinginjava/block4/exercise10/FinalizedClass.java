package thinkinginjava.block4.exercise10;

import static net.mindview.util.Print.print;

public class FinalizedClass {

    @Override
    protected void finalize() throws Throwable {
        super.finalize();

        print("Finalize is called on object");
    }
}
