package thinkinginjava.block4.exercise9;

public class Test {

    private String a;
    private Integer b;

    public Test(String a) {
        this(a, 2);
    }

    public Test(String a, Integer b) {
        this.a = a;
        this.b = b;
    }

    public String getA() {
        return a;
    }

    public Integer getB() {
        return b;
    }
}
