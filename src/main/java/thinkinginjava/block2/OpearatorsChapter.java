package thinkinginjava.block2;

import java.util.ArrayList;
import java.util.List;

import thinkinginjava.Chapter;
import thinkinginjava.Exercise;
import thinkinginjava.block2.exercise1.ImportedPrintExercise;
import thinkinginjava.block2.exercise2.AliasingExercise;
import thinkinginjava.block2.exercise3.AliasingInMethodsExercise;
import thinkinginjava.block2.exercise4.VelocityCalculationExercise;
import thinkinginjava.block2.exercise5and6.DogsCompareExercise;
import thinkinginjava.block2.exercise5and6.DogsExercise;

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
        exerciseList.add(new AliasingExercise());
        exerciseList.add(new AliasingInMethodsExercise());
        exerciseList.add(new VelocityCalculationExercise());
        exerciseList.add(new DogsExercise());
        exerciseList.add(new DogsCompareExercise());

        return exerciseList;
    }
}
