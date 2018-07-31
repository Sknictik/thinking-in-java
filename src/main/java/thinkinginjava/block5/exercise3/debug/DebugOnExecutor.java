package thinkinginjava.block5.exercise3.debug;

import thinkinginjava.block5.exercise3.DebugExecutor;

import static thinkinginjava.block5.exercise3.debug.Debugger.debug;

public class DebugOnExecutor implements DebugExecutor {

    @Override
    public void run(String string) {
        debug(string);
    }

}
