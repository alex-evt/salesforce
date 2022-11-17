package elements;

public class InputFieldAccount extends InputField {

    private static final String INPUT_XPATH_ACCOUNT = "//*[text()='%s']//ancestor::div[contains(@class,'uiInput ')]//input";

    public InputFieldAccount(String label) {
        super(label);
    }

    public void writeText(String text) {
        writeText(INPUT_XPATH_ACCOUNT, text);
    }
}
