package thinkinginjava.block4;

import java.util.ArrayList;
import java.util.List;

import thinkinginjava.Chapter;
import thinkinginjava.Exercise;
import thinkinginjava.block4.exercise1.UninitializedStringObjectExercise;
import thinkinginjava.block4.exercise10and11.AlwaysFinializeExercise;
import thinkinginjava.block4.exercise10and11.FinalizeExercise;
import thinkinginjava.block4.exercise12.FinalizeLoggingExercise;
import thinkinginjava.block4.exercise13.StaticInitExercise;
import thinkinginjava.block4.exercise14.StaticStringExercise;
import thinkinginjava.block4.exercise15.InstanceInitBlockExercise;
import thinkinginjava.block4.exercise16.StringArrayExercise;
import thinkinginjava.block4.exercise17and18.ObjectArrayExercise;
import thinkinginjava.block4.exercise19.BasicVarargsExercise;
import thinkinginjava.block4.exercise2.InitializedStringObjectExercise;
import thinkinginjava.block4.exercise20.AlternateMainExercise;
import thinkinginjava.block4.exercise21and22.BasicEnumExercise;
import thinkinginjava.block4.exercise21and22.EnumSwitchExercise;
import thinkinginjava.block4.exercise3.NoArgConstructorExercise;
import thinkinginjava.block4.exercise4.OverloadedConstructorExercise;
import thinkinginjava.block4.exercise5.OverloadedBarksExercise;
import thinkinginjava.block4.exercise6.OverloadWithArgumentsOrderingExercise;
import thinkinginjava.block4.exercise7.NoConstructorExercise;
import thinkinginjava.block4.exercise8.ThisKeywordExercise;
import thinkinginjava.block4.exercise9.ConstructorsCallingConstructorsExercise;

public class InitializationAndCleanupChapter implements Chapter {

    public String[] mainArgs;

    public InitializationAndCleanupChapter(String[] mainArgs) {
        this.mainArgs = mainArgs;
    }

    @Override
    public String getId() {
        return "4";
    }

    @Override
    public String getName() {
        return "Initialization & Cleanup";
    }

    @Override
    public List<Exercise> getExerciseList() {
        List<Exercise> exerciseList = new ArrayList<>();

        exerciseList.add(new UninitializedStringObjectExercise());
        exerciseList.add(new InitializedStringObjectExercise());
        exerciseList.add(new NoArgConstructorExercise());
        exerciseList.add(new OverloadedConstructorExercise());
        exerciseList.add(new OverloadedBarksExercise());
        exerciseList.add(new OverloadWithArgumentsOrderingExercise());
        exerciseList.add(new NoConstructorExercise());
        exerciseList.add(new ThisKeywordExercise());
        exerciseList.add(new ConstructorsCallingConstructorsExercise());
        exerciseList.add(new FinalizeExercise());
        exerciseList.add(new AlwaysFinializeExercise());
        exerciseList.add(new FinalizeLoggingExercise());
        exerciseList.add(new StaticInitExercise());
        exerciseList.add(new StaticStringExercise());
        exerciseList.add(new InstanceInitBlockExercise());
        exerciseList.add(new StringArrayExercise());
        exerciseList.add(new ObjectArrayExercise());
        exerciseList.add(new BasicVarargsExercise());
        exerciseList.add(new AlternateMainExercise(mainArgs));
        exerciseList.add(new BasicEnumExercise());
        exerciseList.add(new EnumSwitchExercise());

        return exerciseList;
    }
}
