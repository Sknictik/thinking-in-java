package thinkinginjava.block4.exercise20;

import thinkinginjava.Exercise;

import static net.mindview.util.Print.print;

public class AlternateMainExercise extends Exercise {

    private String[] mainArgs;

    public AlternateMainExercise(String[] mainArgs) {
        this.mainArgs = mainArgs;
    }

    @Override
    public String getId() {
        return "20";
    }

    @Override
    public String getName() {
        return "Alternate main";
    }

    @Override
    public String getDescription() {
        return "Create a main( ) that uses varargs instead of the ordinary main( ) syntax." +
                " Print all the elements in the resulting args array." +
                " Test it with various numbers of command-line arguments.";
    }

    @Override
    public int getDifficulty() {
        return 1;
    }

    @Override
    protected void run() {
        print("Exercise will print arguments provided to app from command line");
        alternateMain(mainArgs);
    }

    private void alternateMain(String... args) {
        for (String arg : args) {
            print(arg);
        }
    }

}
