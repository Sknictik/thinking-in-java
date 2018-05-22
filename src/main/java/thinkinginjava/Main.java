package thinkinginjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import thinkinginjava.exercise1.NotInitializedFieldsExercise;
import thinkinginjava.exercise2.HelloWorldExercise;
import thinkinginjava.exercise3.ATypeNameExercise;
import thinkinginjava.exercise4.DataOnlyExercise;
import thinkinginjava.exercise5.DataOnlyModifiedExercise;
import thinkinginjava.exercise6.StorageMethodExercise;

public class Main {

    private static List<Exercise> exerciseList;

    static {
        exerciseList = new ArrayList<>();
        exerciseList.add(new NotInitializedFieldsExercise());
        exerciseList.add(new HelloWorldExercise());
        exerciseList.add(new ATypeNameExercise());
        exerciseList.add(new DataOnlyExercise());
        exerciseList.add(new DataOnlyModifiedExercise());
        exerciseList.add(new StorageMethodExercise());
    }

    public static void main(String[] args) {
        printExercisesDescriptions();

        System.out.print("\nPlease enter an id of exercise to run: ");

        Scanner scan = new Scanner(System.in);
        String exerciseCode = scan.next();
        System.out.print("\n\n\n\n\n\n\n");

        runExercise(exerciseCode);
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
