package foo;

import java.util.Scanner;

import foo.Exercise1.ClassWithNotInitFields;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please select a routine from the list to run:");
        System.out.println("1.1 \n (2) Create a class containing an int and a char that are not initialized, " +
                "and print their values to verify that Java performs default initialization.");
        String exerciseCode = scan.next();

        runExersise(exerciseCode);
    }

    private static void runExersise(String exerciseId) {
        switch (exerciseId) {
            case "1.1": {
                runExercise1_1();
                break;
            }
            default: {
                System.out.println("No exercise found with such id");
            }
        }
    }

    private static void runExercise1_1() {
        ClassWithNotInitFields classWithNotInitFields = new ClassWithNotInitFields();
        System.out.println("Char: " + classWithNotInitFields.notInitializedChar);
        System.out.println("Int: " + classWithNotInitFields.notInitializedInt);
    }

}
