package thinkinginjava.block1.exercise10;

import thinkinginjava.Exercise;

public class CommandLineArgumentsExercise extends Exercise {

    private String[] args;

    public CommandLineArgumentsExercise(String[] args) {
        this.args = args;
    }

    @Override
    public String getId() {
        return "10";
    }

    @Override
    public String getName() {
        return "Command line arguments exercise";
    }

    @Override
    public String getDescription() {
        return "Write a program that prints three arguments taken from the command line." +
                " To do this, you’ll need to index into the command-line array of Strings.";
    }

    @Override
    public int getDifficulty() {
        return 2;
    }

    @Override
    protected void run() {
        System.out.println("Provided arguments: ");

        if (args != null) {
            for (int i = 0; i < args.length; i++) {
                System.out.println("Arg" + (i + 1) + ": " + args[i]);
            }
        } else {
            System.out.println("No arguments provided");
        }
    }
}
