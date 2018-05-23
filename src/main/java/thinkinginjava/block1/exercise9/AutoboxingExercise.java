package thinkinginjava.block1.exercise9;

import thinkinginjava.Exercise;

public class AutoboxingExercise extends Exercise {
    @Override
    public String getId() {
        return "9";
    }

    @Override
    public String getName() {
        return "Autoboxing exercies";
    }

    @Override
    public String getDescription() {
        return "Write a program that demonstrates that autoboxing works for all the primitive types and their wrappers.";
    }

    @Override
    public int getDifficulty() {
        return 2;
    }

    @Override
    protected void run() {
        System.out.println("Attempting to unbox objects to primitives and vice versa");
        boolean primitiveBoolean = new Boolean(true);
        System.out.println("Primitive boolean: " + primitiveBoolean);
        char primitiveChar = new Character('a');
        System.out.println("Primitive char: " + primitiveChar);
        byte primitiveByte = new Byte((byte) 1);
        System.out.println("Primitive byte: " + primitiveByte);
        short primitiveShort = new Short((short) 1);
        System.out.println("Primitive short: " + primitiveShort);
        int primitiveInt = new Integer(1);
        System.out.println("Primitive int: " + primitiveInt);
        long primitiveLong = new Long(1);
        System.out.println("Primitive long: " + primitiveLong);
        float primitiveFloat = new Float(1);
        System.out.println("Primitive float: " + primitiveFloat);
        double primitiveDouble = new Double(1);
        System.out.println("Primitive double: " + primitiveDouble);

        Boolean boxedBoolean = true;
        System.out.println("Boxed boolean: " + boxedBoolean);
        Character boxedChar = 'a';
        System.out.println("Boxed char: " + boxedChar);
        Byte boxedByte = 1;
        System.out.println("Boxed byte: " + boxedByte);
        Short boxedShort = 1;
        System.out.println("Boxed short: " + boxedShort);
        Integer boxedInt = 1;
        System.out.println("Boxed int: " + boxedInt);
        Long boxedLong = 1L;
        System.out.println("Boxed long: " + boxedLong);
        Float boxedFloat = 1.0f;
        System.out.println("Boxed float: " + boxedFloat);
        Double boxedDouble = 1.0d;
        System.out.println("Boxed double: " + boxedDouble);
    }
}
