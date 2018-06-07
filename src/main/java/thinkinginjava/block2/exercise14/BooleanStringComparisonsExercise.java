package thinkinginjava.block2.exercise14;

import thinkinginjava.Exercise;

import static net.mindview.util.Print.print;

public class BooleanStringComparisonsExercise extends Exercise {
    @Override
    public String getId() {
        return "14";
    }

    @Override
    public String getName() {
        return "Boolean string comparisons";
    }

    @Override
    public String getDescription() {
        return "Write a method that takes two String arguments and uses all the boolean comparisons to compare the two " +
                "Strings and print the results. For the == and !=, also perform the equals( ) test." +
                "In main( ), call your method with some different String objects.";
    }

    @Override
    public int getDifficulty() {
        return 3;
    }

    @Override
    protected void run() {
        print("Comparing strings...");

        print("Comparing abc and cba");
        compareStringsAndPrintResult("abc", "cba");
        print("Comparing abc and abc");
        compareStringsAndPrintResult("abc", "abc");
        String string1 = "abc";
        String string2 = string1;
        print("Comparing string referencing one memory index");
        compareStringsAndPrintResult(string1, string2);
        print("Comparing two equal but very long strings");
        compareStringsAndPrintResult("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus posuere porta molestie. Pellentesque in porta enim, non consequat ante. Nulla vitae ipsum et sapien pharetra volutpat vestibulum at tellus. Cras vulputate dignissim posuere. Vestibulum quis imperdiet metus, eu ultrices purus. Maecenas congue leo eu porta semper. In dapibus enim vel ultricies eleifend. Nullam id risus magna. Aenean nec vestibulum elit, a vehicula risus. Fusce ac placerat velit. Curabitur quis lacus libero. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Phasellus eget efficitur mi. Proin laoreet purus non risus lobortis porta. Nullam tincidunt, quam id vestibulum sollicitudin, ipsum ipsum pellentesque nisi, nec pulvinar dolor elit ac ipsum. Integer mauris neque, venenatis a orci sed, tempus pellentesque orci. "
                , "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus posuere porta molestie. Pellentesque in porta enim, non consequat ante. Nulla vitae ipsum et sapien pharetra volutpat vestibulum at tellus. Cras vulputate dignissim posuere. Vestibulum quis imperdiet metus, eu ultrices purus. Maecenas congue leo eu porta semper. In dapibus enim vel ultricies eleifend. Nullam id risus magna. Aenean nec vestibulum elit, a vehicula risus. Fusce ac placerat velit. Curabitur quis lacus libero. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Phasellus eget efficitur mi. Proin laoreet purus non risus lobortis porta. Nullam tincidunt, quam id vestibulum sollicitudin, ipsum ipsum pellentesque nisi, nec pulvinar dolor elit ac ipsum. Integer mauris neque, venenatis a orci sed, tempus pellentesque orci. ");
        print("Compare two equal string objects");
        compareStringsAndPrintResult(new String("abc"), new String("abc"));
    }

    private void compareStringsAndPrintResult(String a, String b) {
        //!print("a > b: " + (a > b));
        //!print("a >= b: " + (a >= b));
        //!print("a < b: " + (a < b));
        //!print("a <= b: " + (a <= b));
        print("a == b: " + (a == b));
        print("a != b: " + (a != b));
        print("a.equals(b): " + a.equals(b));
    }
}
