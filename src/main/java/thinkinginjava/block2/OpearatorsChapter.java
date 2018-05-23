package thinkinginjava.block2;

import java.util.ArrayList;
import java.util.List;

import thinkinginjava.Chapter;
import thinkinginjava.Exercise;
import thinkinginjava.block2.exercise1.ImportedPrintExercise;

public class OpearatorsChapter implements Chapter {
    @Override
    public String getId() {
        return "2";
    }

    @Override
    public String getName() {
        return "Operators";
    }

    @Override
    public List<Exercise> getExerciseList() {
        List<Exercise> exerciseList = new ArrayList<>();
        exerciseList.add(new ImportedPrintExercise());
        
        return exerciseList;
    }
}
