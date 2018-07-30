package thinkinginjava.block5;

import java.util.ArrayList;
import java.util.List;

import thinkinginjava.Chapter;
import thinkinginjava.Exercise;
import thinkinginjava.block5.exercise1.SimplePackageExercise;

public class AccessControlChapter implements Chapter {
    @Override
    public String getId() {
        return "5";
    }

    @Override
    public String getName() {
        return "Access Control";
    }

    @Override
    public List<Exercise> getExerciseList() {
        List<Exercise> exerciseList = new ArrayList<>();

        exerciseList.add(new SimplePackageExercise());

        return exerciseList;
    }
}
