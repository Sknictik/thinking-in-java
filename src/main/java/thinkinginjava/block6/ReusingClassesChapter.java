package thinkinginjava.block6;

import java.util.ArrayList;
import java.util.List;

import thinkinginjava.Chapter;
import thinkinginjava.Exercise;
import thinkinginjava.block6.exercise1.SimpleCompositionExercise;
import thinkinginjava.block6.exercise10.InheritanceWithNonDefaultConstructorsExercise;
import thinkinginjava.block6.exercise11.DelegationExercise;
import thinkinginjava.block6.exercise12.CleaningUpExercise;
import thinkinginjava.block6.exercise13.OverloadingExercise;
import thinkinginjava.block6.exercise14.CompositionVsInheritanceExercise;
import thinkinginjava.block6.exercise15.ProtectedExercise;
import thinkinginjava.block6.exercise16and17.BasicInheritanceExercise;
import thinkinginjava.block6.exercise16and17.InheritanceAndOverridingExercise;
import thinkinginjava.block6.exercise2.SimpleInheritanceExercise;
import thinkinginjava.block6.exercise3.BaseClassConstructorGeneration;
import thinkinginjava.block6.exercise4.BaseClassConstructorBehaviourExercise;
import thinkinginjava.block6.exercise5.ExperimentsWithInheritanceAndCompositionExercise;
import thinkinginjava.block6.exercise6.ChessExercise;
import thinkinginjava.block6.exercise7.BaseClassConstructorsExercise;
import thinkinginjava.block6.exercise8.InheritanceAndConstructorsExercise;
import thinkinginjava.block6.exercise9.InheritanceExercise;

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
        exerciseList.add(new InheritanceExercise());
        exerciseList.add(new InheritanceWithNonDefaultConstructorsExercise());
        exerciseList.add(new DelegationExercise());
        exerciseList.add(new CleaningUpExercise());
        exerciseList.add(new OverloadingExercise());
        exerciseList.add(new CompositionVsInheritanceExercise());
        exerciseList.add(new ProtectedExercise());
        exerciseList.add(new BasicInheritanceExercise());
        exerciseList.add(new InheritanceAndOverridingExercise());

        return exerciseList;
    }
}
