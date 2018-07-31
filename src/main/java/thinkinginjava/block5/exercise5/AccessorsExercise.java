package thinkinginjava.block5.exercise5;

import thinkinginjava.Exercise;

import static net.mindview.util.Print.print;

public class AccessorsExercise extends Exercise {
    @Override
    public String getId() {
        return "5";
    }

    @Override
    public String getName() {
        return "Experimenting with accessors";
    }

    @Override
    public String getDescription() {
        return "Create a class with public, private, protected, " +
                "and package-access fields and method members. " +
                "Create an object of this class and see what kind of compiler" +
                " messages you get when you try to access all the class members." +
                " Be aware that classes in the same directory are part of the “default” package.";
    }

    @Override
    public int getDifficulty() {
        return 2;
    }

    @Override
    protected void run() {
        AllAccessorsClass allAccessorsObject = new AllAccessorsClass();
        print("Attempt to call private method");
        //print(allAccessorsObject.getPrivateField());
        print("getPrivateField()' has private access in 'thinkinginjava.block5.exercise5.AllAccessorsClass");
        print("Attempt to access private field");
        //print(allAccessorsObject.privateField);
        print("privateField' has private access in 'thinkinginjava.block5.exercise5.AllAccessorsClass");

        print("Attempt to call package method");
        print(allAccessorsObject.getPackageField());
        print("Attempt to access package field");
        print(allAccessorsObject.packageField);

        print("Attempt to call protected method");
        print(allAccessorsObject.getProtectedField());
        print("Attempt to access protected field");
        print(allAccessorsObject.protectedField);

        print("Attempt to call public method");
        print(allAccessorsObject.getPublicField());
        print("Attempt to access public field");
        print(allAccessorsObject.publicField);
    }
}
