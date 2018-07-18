package thinkinginjava.block4.exercise5;

import static net.mindview.util.Print.print;

public class OverloadedDog {

    void bark(char irrelevant) {
        print("bark!");
    }

    void bark(short irrelevant) {
        print("Arf!");
    }

    void bark(byte irrelevant) {
        print("*Howl*");
    }

    void bark(int irrelevant) {
        print("woof!");
    }

    void bark(long irrelevant) {
        print("*scowl*");
    }

    void bark(double irrelevant) {
        print("*growl*");
    }

    void bark(float irrelevant) {
        print("*snarl*");
    }

}
