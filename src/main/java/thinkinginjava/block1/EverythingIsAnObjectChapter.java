package thinkinginjava.block1;

import java.util.ArrayList;
import java.util.List;

import thinkinginjava.Chapter;
import thinkinginjava.Exercise;
import thinkinginjava.block1.exercise1.NotInitializedFieldsExercise;
import thinkinginjava.block1.exercise10.CommandLineArgumentsExercise;
import thinkinginjava.block1.exercise11.AllTheColorsOfTheRainbowExercise;
import thinkinginjava.block1.exercise12.JavaDocExercise;
import thinkinginjava.block1.exercise13.JavaDocContinuedExercise;
import thinkinginjava.block1.exercise14.JavaDocContinuedHtmlListExercise;
import thinkinginjava.block1.exercise15.Exercise2JavaDocExercise;
import thinkinginjava.block1.exercise16.OverloadingJavaDocExercise;
import thinkinginjava.block1.exercise2.HelloWorldExercise;
import thinkinginjava.block1.exercise3.ATypeNameExercise;
import thinkinginjava.block1.exercise4.DataOnlyExercise;
import thinkinginjava.block1.exercise5.DataOnlyModifiedExercise;
import thinkinginjava.block1.exercise6.StorageMethodExercise;
import thinkinginjava.block1.exercise7.IncrementableExercise;
import thinkinginjava.block1.exercise8.SingleStaticFieldExercise;
import thinkinginjava.block1.exercise9.AutoboxingExercise;

public class EverythingIsAnObjectChapter implements Chapter {

    private String[] args;

    public EverythingIsAnObjectChapter(String[] args) {
        this.args = args;
    }

    @Override
    public String getId() {
        return "1";
    }

    @Override
    public String getName() {
        return "Everything is an object";
    }

    @Override
    public List<Exercise> getExerciseList() {
        List<Exercise> exerciseList = new ArrayList<>();
        exerciseList.add(new NotInitializedFieldsExercise());
        exerciseList.add(new HelloWorldExercise());
        exerciseList.add(new ATypeNameExercise());
        exerciseList.add(new DataOnlyExercise());
        exerciseList.add(new DataOnlyModifiedExercise());
        exerciseList.add(new StorageMethodExercise());
        exerciseList.add(new IncrementableExercise());
        exerciseList.add(new SingleStaticFieldExercise());
        exerciseList.add(new AutoboxingExercise());
        exerciseList.add(new CommandLineArgumentsExercise(args));
        exerciseList.add(new AllTheColorsOfTheRainbowExercise());
        exerciseList.add(new JavaDocExercise());
        exerciseList.add(new JavaDocContinuedExercise());
        exerciseList.add(new JavaDocContinuedHtmlListExercise());
        exerciseList.add(new Exercise2JavaDocExercise());
        exerciseList.add(new OverloadingJavaDocExercise());
        return exerciseList;
    }
}
