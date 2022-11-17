package elements;

public class InputFieldLogin extends InputField {

    public InputFieldLogin(String label) {
        super(label);
    }

    private static final String INPUT_XPATH_LOGIN = "//input[@id='%s']";


    public void writeText(String text) {
        writeText(INPUT_XPATH_LOGIN, text);
    }
}
