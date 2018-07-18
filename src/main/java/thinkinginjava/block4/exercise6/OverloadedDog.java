package thinkinginjava.block4.exercise6;

import static net.mindview.util.Print.print;

public class OverloadedDog {

    void bark(String irrelevant1, int irrelevant2) {
        print("Bark1!");
    }

    void bark(int irrelevant1, String irrelevant2) {
        print("Bark2!");
    }

}
