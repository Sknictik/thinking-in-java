package thinkinginjava.block6;

import java.util.ArrayList;
import java.util.List;

import thinkinginjava.Chapter;
import thinkinginjava.Exercise;
import thinkinginjava.block6.exercise1.SimpleCompositionExercise;
import thinkinginjava.block6.exercise2.SimpleInheritanceExercise;
import thinkinginjava.block6.exercise3.BaseClassConstructorGeneration;
import thinkinginjava.block6.exercise4.BaseClassConstructorBehaviourExercise;
import thinkinginjava.block6.exercise5.ExperimentsWithInheritanceAndCompositionExercise;
import thinkinginjava.block6.exercise6.ChessExercise;
import thinkinginjava.block6.exercise7.BaseClassConstructorsExercise;
import thinkinginjava.block6.exercise8.InheritanceAndConstructorsExercise;

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
        exerciseList.add(new ExperimentsWithInheritanceAndCompositionExercise());
        exerciseList.add(new ChessExercise());
        exerciseList.add(new BaseClassConstructorsExercise());
        exerciseList.add(new InheritanceAndConstructorsExercise());

        return exerciseList;
    }
}
