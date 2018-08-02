package thinkinginjava.block6;

import java.util.ArrayList;
import java.util.List;

import thinkinginjava.Chapter;
import thinkinginjava.Exercise;
import thinkinginjava.block6.exercise1.SimpleCompositionExercise;

public class ReusingClassesChapter implements Chapter {
    @Override
    public String getId() {
        return "6";
    }

    @Override
    public String getName() {
        return "Reusing Classes";
    }

    @Override
    public List<Exercise> getExerciseList() {
        List<Exercise> exerciseList = new ArrayList<>();
        exerciseList.add(new SimpleCompositionExercise());

        return exerciseList;
    }
}
