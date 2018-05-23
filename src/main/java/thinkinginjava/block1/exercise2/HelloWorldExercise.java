package thinkinginjava.block1.exercise2;

import thinkinginjava.Exercise;

/**
 * This is a second exercise for chapter 1 in Thinking in Java book.
 */
public class HelloWorldExercise extends Exercise {

    /**
     * Get id of this exercise
     * @return exercise id. This id can be used to identify this exercise.
     */
    @Override
    public String getId() {
        return "2";
    }

    /**
     * Get short description of exercise.
     * @return exercise name
     */
    @Override
    public String getName() {
        return "Hello World!";
    }

    /**
     * Get full exercise description from the book.
     * @return exercise description
     */
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

    /**
     * Get exercise difficulty. Can be in range from 1 to 10.
     * @return exercise difficulty
     */
    @Override
    public int getDifficulty() {
        return 1;
    }

    /**
     * Execute this exercise code.
     */
    @Override
    protected void run() {
        System.out.println("Hello world!");
    }
}
