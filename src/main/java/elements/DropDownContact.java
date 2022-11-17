package elements;

public class DropDownContact extends DropDown {

    private static final String DROP_DOWN_XPATH_FOR_CONTACT = "//*[text()='Salutation']//ancestor::div[contains(@class,'slds-form-element__row')]//button";
    private static final String SELECT_OPTION_XPATH_FOR_CONTACT = "//*[text()='Mr.']//ancestor::div[contains(@class, 'slds-listbox')]//span[contains(text(), '%s')]";

    public DropDownContact(String label) {
        super(label);
    }

    public void selectOption(String option) {
        selectOption(DROP_DOWN_XPATH_FOR_CONTACT, SELECT_OPTION_XPATH_FOR_CONTACT, option);
    }
}
