package thinkinginjava.block4.exercise15;

public class InstanceBlockInit {

    private String stringInitAtInstanceBlock;

    {
        stringInitAtInstanceBlock = "This string is initializaed at instance block";
    }

    public String getStringInitAtInstanceBlock() {
        return stringInitAtInstanceBlock;
    }
}
