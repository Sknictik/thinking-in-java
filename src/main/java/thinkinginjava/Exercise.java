package thinkinginjava;

public abstract class Exercise {

    public abstract String getId();

    public abstract String getName();

    public abstract String getDescription();

    //Can be from 1 to 10
    public abstract int getDifficulty();

    public final void executeCommand() {
        System.out.println("Starting running command...\n");
        run();
        System.out.println("\nCommand finished executing");
    }

    /**
     * Never call this method from outside. Call executeCommand instead.
     */
    protected abstract void run();
}
