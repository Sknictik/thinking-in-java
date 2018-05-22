package thinkinginjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import thinkinginjava.exercise1.NotInitializedFieldsExercise;
import thinkinginjava.exercise2.HelloWorldExercise;
import thinkinginjava.exercise3.ATypeNameExercise;

public class Main {

    private static List<Exercise> exerciseList;

    static {
        exerciseList = new ArrayList<>();
        exerciseList.add(new NotInitializedFieldsExercise());
        exerciseList.add(new HelloWorldExercise());
        exerciseList.add(new ATypeNameExercise());
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
        System.out.println("Please select a routine from the list to run: \n");

        for (Exercise exercise : exerciseList) {
            System.out.println("Id: " + exercise.getId());
            System.out.println("Name: " + exercise.getName());
            System.out.println("Difficulty: " + exercise.getDifficulty());
            System.out.println("Description: " + exercise.getDescription());
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
        }
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
