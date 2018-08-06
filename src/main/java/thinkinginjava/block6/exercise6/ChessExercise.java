package thinkinginjava.block6.exercise6;

import reusing.Chess;
import thinkinginjava.Exercise;

public class ChessExercise extends Exercise {
    @Override
    public String getId() {
        return "6";
    }

    @Override
    public String getName() {
        return "Base class constructors";
    }

    @Override
    public String getDescription() {
        return "Using Chess.java, prove the statements: \n" +
                "If you don’t call the base-class constructor in BoardGame( ), " +
                "the compiler will complain that it can’t find a constructor of the form Game( )." +
                " In addition, the call to the base-class " +
                "constructor must be the first thing you do in the derived-class constructor." +
                " (The compiler will remind you if you get it wrong.)";
    }

    @Override
    public int getDifficulty() {
        return 1;
    }

    @Override
    protected void run() {
        new Chess();
    }
}
