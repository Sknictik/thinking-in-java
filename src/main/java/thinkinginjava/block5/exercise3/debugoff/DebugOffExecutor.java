package thinkinginjava.block5.exercise3.debugoff;

import thinkinginjava.block5.exercise3.DebugExecutor;

import static thinkinginjava.block5.exercise3.debugoff.Debugger.debug;

public class DebugOffExecutor implements DebugExecutor {
    @Override
    public void run(String string) {
        debug(string);
    }
}
