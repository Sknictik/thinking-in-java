package thinkinginjava;

import java.util.List;
import java.util.Scanner;

public class ExercisesCommandHandler {

    private List<Exercise> exerciseList;

    ExercisesCommandHandler(List<Exercise> exerciseList) {
        this.exerciseList = exerciseList;
    }

    public void printExercisesDescriptions() {
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

    public Exercise askUserForExercise(Scanner scan) {
        ExerciseCommandResponse exerciseCommandResponse;
        String exerciseId = null;

        while (true) {
            System.out.print("\nPlease enter an id of exercise to run, type \"chapters\" to return to chapters menu " +
                    "or type \"again\" to print exercise list again: ");

            String userInput = scan.next();

            exerciseCommandResponse = handleExerciseResponse(userInput);
            switch (exerciseCommandResponse) {
                case ERROR: {
                    System.out.println("Please provide a valid command or exercise id!");
                    break;
                }
                case AGAIN: {
                    printExercisesDescriptions();
                    break;
                }
                case CHAPTERS: {
                    return null;
                }
                case SUCCESS: {
                    exerciseId = userInput;
                    break;
                }
                default: {
                    //Do nothing
                }
            }

            if (exerciseCommandResponse.canProceed) {
                break;
            }
        }

        return getExercise(exerciseId);
    }

    private Exercise getExercise(String exerciseId) {
        for (Exercise exercise : exerciseList) {
            if (exercise.getId().equals(exerciseId)) {
                return exercise;
            }
        }

        return null;
    }

    private ExerciseCommandResponse handleExerciseResponse(String exerciseCommand) {
        if (!TextUtils.isEmpty(exerciseCommand)) {
            if (ExerciseCommandResponse.CHAPTERS_COMMAND.equals(exerciseCommand)) {
                return ExerciseCommandResponse.CHAPTERS;
            } else if (ExerciseCommandResponse.AGAIN_COMMAND.equals(exerciseCommand)) {
                return ExerciseCommandResponse.AGAIN;
            }

            if (getExercise(exerciseCommand) != null) {
                return ExerciseCommandResponse.SUCCESS;
            } else {
                return ExerciseCommandResponse.ERROR;
            }
        }

        return ExerciseCommandResponse.ERROR;
    }

    private static int getExerciseDifficulty(Exercise exercise) {
        int difficulty = exercise.getDifficulty();
        if (difficulty >= 0 && difficulty <= 10) {
            return difficulty;
        }

        throw new RuntimeException("Invalid difficulty value " + difficulty + " . Must be from 1 to 10");
    }

    public enum ExerciseCommandResponse {
        SUCCESS(true), CHAPTERS(true), AGAIN(false), ERROR(false);

        private static final String CHAPTERS_COMMAND = "chapters";
        private static final String AGAIN_COMMAND = "again";

        private boolean canProceed;

        ExerciseCommandResponse(boolean canProceed) {
            this.canProceed = canProceed;
        }
    }

}
