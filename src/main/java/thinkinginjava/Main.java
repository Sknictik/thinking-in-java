package thinkinginjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import thinkinginjava.exercise1.NotInitializedFieldsExercise;
import thinkinginjava.exercise10.CommandLineArgumentsExercise;
import thinkinginjava.exercise11.AllTheColorsOfTheRainbowExercise;
import thinkinginjava.exercise12.JavaDocExercise;
import thinkinginjava.exercise13.JavaDocContinuedExercise;
import thinkinginjava.exercise14.JavaDocContinuedHtmlListExercise;
import thinkinginjava.exercise15.Exercise2JavaDocExercise;
import thinkinginjava.exercise16.OverloadingJavaDocExercise;
import thinkinginjava.exercise2.HelloWorldExercise;
import thinkinginjava.exercise3.ATypeNameExercise;
import thinkinginjava.exercise4.DataOnlyExercise;
import thinkinginjava.exercise5.DataOnlyModifiedExercise;
import thinkinginjava.exercise6.StorageMethodExercise;
import thinkinginjava.exercise7.IncrementableExercise;
import thinkinginjava.exercise8.SingleStaticFieldExercise;
import thinkinginjava.exercise9.AutoboxingExercise;

public class Main {

    private static List<Exercise> exerciseList;

    public static void main(String[] args) {
        initExercises(args);

        printExercisesDescriptions();

        System.out.print("\nPlease enter an id of exercise to run: ");

        Scanner scan = new Scanner(System.in);
        String exerciseCode = scan.next();
        System.out.print("\n\n\n\n\n\n\n");

        runExercise(exerciseCode);
    }

    private static void initExercises(String[] args) {
        exerciseList = new ArrayList<>();
        exerciseList.add(new NotInitializedFieldsExercise());
        exerciseList.add(new HelloWorldExercise());
        exerciseList.add(new ATypeNameExercise());
        exerciseList.add(new DataOnlyExercise());
        exerciseList.add(new DataOnlyModifiedExercise());
        exerciseList.add(new StorageMethodExercise());
        exerciseList.add(new IncrementableExercise());
        exerciseList.add(new SingleStaticFieldExercise());
        exerciseList.add(new AutoboxingExercise());
        exerciseList.add(new CommandLineArgumentsExercise(args));
        exerciseList.add(new AllTheColorsOfTheRainbowExercise());
        exerciseList.add(new JavaDocExercise());
        exerciseList.add(new JavaDocContinuedExercise());
        exerciseList.add(new JavaDocContinuedHtmlListExercise());
        exerciseList.add(new Exercise2JavaDocExercise());
        exerciseList.add(new OverloadingJavaDocExercise());
    }

    private static void printExercisesDescriptions() {
        for (Exercise exercise : exerciseList) {
            System.out.println("Id: " + exercise.getId());
            System.out.println("Name: " + exercise.getName());
            System.out.println("Difficulty: " + getExerciseDifficulty(exercise));
            System.out.println("Description: " + exercise.getDescription());
            System.out.println("--------------------------------------------------------------------" +
                    "-------------------------------------------------------------------------------" +
                    "----------");
        }
    }

    private static int getExerciseDifficulty(Exercise exercise) {
        int difficulty = exercise.getDifficulty();
        if (difficulty >= 0 && difficulty <= 10) {
            return difficulty;
        }

        throw new RuntimeException("Invalid difficulty value " + difficulty + " . Must be from 1 to 10");
    }

    private static void runExercise(String exerciseId) {
        for (Exercise exercise : exerciseList) {
            if (exercise.getId().equals(exerciseId)) {
                exercise.executeCommand();
                return;
            }
        }

        System.out.println("No exercise found with provided id");
    }

}
