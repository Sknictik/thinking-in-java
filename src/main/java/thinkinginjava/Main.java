package thinkinginjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import thinkinginjava.block1.EverythingIsAnObjectChapter;
import thinkinginjava.block2.OperatorsChapter;
import thinkinginjava.block3.ControllingExecutionChapter;
import thinkinginjava.block4.InitializationAndCleanupChapter;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello! This is a compilation of all exercises from \"Thinking in Java 4-th edition\".");

        List<Chapter> chapterList = initChapterList(args);
        ChaptersCommandHandler chaptersCommandHandler = new ChaptersCommandHandler(chapterList);

        Scanner scan = new Scanner(System.in);

        runProgram(chaptersCommandHandler, scan);
    }

    private static void runProgram(ChaptersCommandHandler chaptersCommandHandler, Scanner scan) {
        chaptersCommandHandler.printChapterList();

        Chapter chapter = chaptersCommandHandler.askUserForChapter(scan);

        ExercisesCommandHandler exercisesCommandHandler = new ExercisesCommandHandler(chapter.getExerciseList());
        exercisesCommandHandler.printExercisesDescriptions();

        Exercise exercise = exercisesCommandHandler.askUserForExercise(scan);

        System.out.print("\n\n\n\n\n\n\n");

        if (exercise != null) {
            runExercise(exercise);
        } else {
            runProgram(chaptersCommandHandler, scan);
        }
    }

    private static List<Chapter> initChapterList(String[] args) {
        List<Chapter> chapterList = new ArrayList<>();
        chapterList.add(new EverythingIsAnObjectChapter(args));
        chapterList.add(new OperatorsChapter());
        chapterList.add(new ControllingExecutionChapter());
        chapterList.add(new InitializationAndCleanupChapter());

        return chapterList;
    }

    private static void runExercise(Exercise exercise) {
        exercise.executeCommand();
    }

}
