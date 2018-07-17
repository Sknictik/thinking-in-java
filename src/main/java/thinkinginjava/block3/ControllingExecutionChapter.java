package thinkinginjava.block3;

import java.util.ArrayList;
import java.util.List;

import thinkinginjava.Chapter;
import thinkinginjava.Exercise;
import thinkinginjava.block3.exercise1.BasicLoopExercise;
import thinkinginjava.block3.exercise10.VampireNumbersExercise;
import thinkinginjava.block3.exercise2.RandomNumbersLoopExercise;
import thinkinginjava.block3.exercise3.RandomNumbersInfiniteLoopExercise;
import thinkinginjava.block3.exercise4.NestedForLoopsExercise;
import thinkinginjava.block3.exercise5.BitwiseOperatorTernaryDisplayExercise;
import thinkinginjava.block3.exercise6.ReturnTestsExercise;
import thinkinginjava.block3.exercise7.BasicLoopWithBreakExercise;
import thinkinginjava.block3.exercise8.SwitchExercise;
import thinkinginjava.block3.exercise9.FibonacciExercise;

public class ControllingExecutionChapter implements Chapter {
    @Override
    public String getId() {
        return "3";
    }

    @Override
    public String getName() {
        return "Controlling execution";
    }

    @Override
    public List<Exercise> getExerciseList() {
        List<Exercise> exerciseList = new ArrayList<>();
        exerciseList.add(new BasicLoopExercise());
        exerciseList.add(new RandomNumbersLoopExercise());
        exerciseList.add(new RandomNumbersInfiniteLoopExercise());
        exerciseList.add(new NestedForLoopsExercise());
        exerciseList.add(new BitwiseOperatorTernaryDisplayExercise());
        exerciseList.add(new ReturnTestsExercise());
        exerciseList.add(new BasicLoopWithBreakExercise());
        exerciseList.add(new SwitchExercise());
        exerciseList.add(new FibonacciExercise());
        exerciseList.add(new VampireNumbersExercise());

        return exerciseList;
    }
}
