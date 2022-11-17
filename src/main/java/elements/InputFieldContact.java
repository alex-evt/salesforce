package elements;

public class InputFieldContact extends InputField {

    private static final String INPUT_XPATH_CONTACT = "//*[@placeholder='%s']";


    public InputFieldContact(String label) {
        super(label);
    }

    public void writeText(String text) {
        writeText(INPUT_XPATH_CONTACT, text);
    }
}
