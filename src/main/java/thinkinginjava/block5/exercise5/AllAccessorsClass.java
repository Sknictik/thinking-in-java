package thinkinginjava.block5.exercise5;

public class AllAccessorsClass {

    private String privateField = "Private field";
    String packageField = "Package field";
    protected String protectedField = "Protected field";
    public String publicField = "Public field";

    private String getPrivateField() {
        return privateField;
    }

    String getPackageField() {
        return packageField;
    }

    protected String getProtectedField() {
        return protectedField;
    }

    public String getPublicField() {
        return publicField;
    }

}
