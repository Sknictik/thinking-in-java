package thinkinginjava.block3;

import java.util.ArrayList;
import java.util.List;

import thinkinginjava.Chapter;
import thinkinginjava.Exercise;
import thinkinginjava.block3.exercise1.BasicLoopExercise;
import thinkinginjava.block3.exercise2.RandomNumbersLoop;
import thinkinginjava.block3.exercise3.RandomNumbersInfiniteLoop;
import thinkinginjava.block3.exercise4.NestedForLoops;
import thinkinginjava.block3.exercise5.BitwiseOperatorTernaryDisplay;
import thinkinginjava.block3.exercise6.ReturnTests;

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
        exerciseList.add(new RandomNumbersLoop());
        exerciseList.add(new RandomNumbersInfiniteLoop());
        exerciseList.add(new NestedForLoops());
        exerciseList.add(new BitwiseOperatorTernaryDisplay());
        exerciseList.add(new ReturnTests());

        return exerciseList;
    }
}
