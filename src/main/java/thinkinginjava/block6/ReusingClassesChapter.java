package thinkinginjava.block6;

import java.util.ArrayList;
import java.util.List;

import thinkinginjava.Chapter;
import thinkinginjava.Exercise;
import thinkinginjava.block6.exercise1.SimpleCompositionExercise;
import thinkinginjava.block6.exercise2.SimpleInheritanceExercise;
import thinkinginjava.block6.exercise3.BaseClassConstructorGeneration;
import thinkinginjava.block6.exercise4.BaseClassConstructorBehaviourExercise;

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
        exerciseList.add(new SimpleInheritanceExercise());
        exerciseList.add(new BaseClassConstructorGeneration());
        exerciseList.add(new BaseClassConstructorBehaviourExercise());

        return exerciseList;
    }
}
