package thinkinginjava.block4;

import java.util.ArrayList;
import java.util.List;

import thinkinginjava.Chapter;
import thinkinginjava.Exercise;
import thinkinginjava.block4.exercise1.UninitializedStringObjectExercise;
import thinkinginjava.block4.exercise2.InitializedStringObjectExercise;

public class InitializationAndCleanupChapter implements Chapter {
    @Override
    public String getId() {
        return "4";
    }

    @Override
    public String getName() {
        return "Initialization & Cleanup";
    }

    @Override
    public List<Exercise> getExerciseList() {
        List<Exercise> exerciseList = new ArrayList<>();

        exerciseList.add(new UninitializedStringObjectExercise());
        exerciseList.add(new InitializedStringObjectExercise());

        return exerciseList;
    }
}
