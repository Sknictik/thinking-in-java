package thinkinginjava.block4.exercise12;

import static net.mindview.util.Print.print;

public class Tank {

    private boolean isFilled;

    public void fill() {
        isFilled = true;
    }

    public void empty() {
        isFilled = false;
    }

    @Override
    protected void finalize() throws Throwable {
        if (isFilled) {
            print("Finalizing filled tank! Fix this!");
        }

        super.finalize();
    }
}
