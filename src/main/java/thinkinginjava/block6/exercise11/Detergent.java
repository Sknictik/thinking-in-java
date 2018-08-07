package thinkinginjava.block6.exercise11;

import static net.mindview.util.Print.*;

class Cleanser {
    private String s = "Cleanser";

    void append(String a) {
        s += a;
    }

    void dilute() {
        append(" dilute()");
    }

    void apply() {
        append(" apply()");
    }

    void scrub() {
        append(" scrub()");
    }

    @Override
    public String toString() {
        return s;
    }

    protected void execute() {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        print(x);
    }
}

class Detergent {
    private Cleanser cleanser;

    Detergent() {
        this.cleanser = new Cleanser();
    }

    private void scrub() {
        cleanser.append(" Detergent.scrub()");
        cleanser.scrub();
    }

    private void foam() {
        cleanser.append(" foam()");
    }

    public void execute() {
        cleanser.dilute();
        cleanser.apply();
        scrub();
        foam();
        print(this);
        print("Testing base class:");
        cleanser.execute();
    }

    @Override
    public String toString() {
        return cleanser.toString();
    }
}

