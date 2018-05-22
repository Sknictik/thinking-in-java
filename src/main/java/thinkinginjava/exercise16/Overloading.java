package thinkinginjava.exercise16;

//: initialization/Overloading.java
// Demonstration of both constructor
// and ordinary method overloading.

import static jdk.nashorn.internal.objects.Global.print;

/**
 * Some tree structure object
 */
class Tree {
    /**
     * Tree height field.
     */
    int height;

    /**
     * Constructor with default height 0 (Planting a seed)
     */
    Tree() {
        print("Planting a seedling");
        height = 0;
    }

    /**
     * Constructor with provided starting height
     * @param initialHeight
     */
    Tree(int initialHeight) {
        height = initialHeight;
        print("Creating new Tree that is " + height + " feet tall");
    }

    /**
     * Print info about current tree height
     */
    void info() {
        print("Tree is " + height + " feet tall");
    }

    /**
     * Print info about current tree height with provided speaker
     * @param s
     */
    void info(String s) {
        print(s + ": Tree is " + height + " feet tall");
    }
}

/**
 * Class with main method
 */
public class Overloading {
    /**
     * Start executing this programm from here
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");
        }
        // Overloaded constructor:
        new Tree();
    }
} /* Output:
Creating new Tree that is 0 feet tall
Tree is 0 feet tall
overloaded method: Tree is 0 feet tall
Creating new Tree that is 1 feet tall
Tree is 1 feet tall
overloaded method: Tree is 1 feet tall
Creating new Tree that is 2 feet tall
Tree is 2 feet tall
overloaded method: Tree is 2 feet tall
Creating new Tree that is 3 feet tall
Tree is 3 feet tall
overloaded method: Tree is 3 feet tall
Creating new Tree that is 4 feet tall
Tree is 4 feet tall
overloaded method: Tree is 4 feet tall
Planting a seedling
*///:~
