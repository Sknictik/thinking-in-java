package thinkinginjava.block4;

import java.util.ArrayList;
import java.util.List;

import thinkinginjava.Chapter;
import thinkinginjava.Exercise;
import thinkinginjava.block4.exercise1.UninitializedStringObjectExercise;
import thinkinginjava.block4.exercise2.InitializedStringObjectExercise;
import thinkinginjava.block4.exercise3.NoArgConstructorExercise;
import thinkinginjava.block4.exercise4.OverloadedConstructorExercise;
import thinkinginjava.block4.exercise5.OverloadedBarksExercise;
import thinkinginjava.block4.exercise6.OverloadWithArgumentsOrderingExercise;
import thinkinginjava.block4.exercise7.NoConstructorExercise;
import thinkinginjava.block4.exercise8.ThisKeywordExercise;

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
        exerciseList.add(new NoArgConstructorExercise());
        exerciseList.add(new OverloadedConstructorExercise());
        exerciseList.add(new OverloadedBarksExercise());
        exerciseList.add(new OverloadWithArgumentsOrderingExercise());
        exerciseList.add(new NoConstructorExercise());
        exerciseList.add(new ThisKeywordExercise());

        return exerciseList;
    }
}
