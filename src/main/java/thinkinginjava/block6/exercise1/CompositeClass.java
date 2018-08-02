package thinkinginjava.block6.exercise1;

public class CompositeClass {

    private SimpleClass simpleClass;

    public SimpleClass getSimpleClass() {
        if (simpleClass == null) {
            simpleClass = new SimpleClass();
        }
        return simpleClass;
    }

}
