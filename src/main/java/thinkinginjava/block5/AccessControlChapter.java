package thinkinginjava.block5;

import java.util.ArrayList;
import java.util.List;

import thinkinginjava.Chapter;
import thinkinginjava.Exercise;
import thinkinginjava.block5.exercise1.SimplePackageExercise;
import thinkinginjava.block5.exercise2.PackageCollisionsExercise;
import thinkinginjava.block5.exercise3.StaticImportExercise;
import thinkinginjava.block5.exercise4.ProtectedAccessExercise;
import thinkinginjava.block5.exercise5.AccessorsExercise;
import thinkinginjava.block5.exercise6.ProtectedForInnerClassesExercise;
import thinkinginjava.block5.exercise7.CreatingLibraryExercise;
import thinkinginjava.block5.exercise8.ObjectPoolExercise;

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
        exerciseList.add(new PackageCollisionsExercise());
        exerciseList.add(new StaticImportExercise());
        exerciseList.add(new ProtectedAccessExercise());
        exerciseList.add(new AccessorsExercise());
        exerciseList.add(new ProtectedForInnerClassesExercise());
        exerciseList.add(new CreatingLibraryExercise());
        exerciseList.add(new ObjectPoolExercise());

        return exerciseList;
    }
}
