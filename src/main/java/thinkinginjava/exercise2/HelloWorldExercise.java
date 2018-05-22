package thinkinginjava.exercise2;

import thinkinginjava.Exercise;

public class HelloWorldExercise extends Exercise {

    @Override
    public String getId() {
        return "1.2";
    }

    @Override
    public String getName() {
        return "Hello World!";
    }

    @Override
    public String getDescription() {
        return "Following the HelloDate.java example in this chapter, create a “hello, world” program that simply displays " +
                "that statement. \nYou need only a single method in your" +
                "class (the “main” one that gets executed when" +
                " the program starts). \nRemember to make it " +
                "static and to include the argument list, even though " +
                "you don’t use the argument list. \nCompile " +
                "the program with javac and run it using java. \nIf you are using a different development " +
                "environment than the JDK, learn how to compile and run programs in that environment.";
    }

    @Override
    public int getDifficulty() {
        return 1;
    }

    @Override
    protected void run() {
        System.out.println("Hello world!");
    }
}
