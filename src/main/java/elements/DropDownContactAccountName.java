package elements;

public class DropDownContactAccountName extends DropDown {

    private static final String DROP_DOWN_XPATH_FOR_CONTACT_ACCOUNT_NAME = "//*[text()='Account Name']//ancestor::span[contains(@class, 'slds-size_1-of-1')]//input";
    private static final String SELECT_OPTION_XPATH_FOR_CONTACT_ACCOUNT_NAME = "//*[text()='Recent Accounts']//ancestor::ul//span[@title='%s']";

    public DropDownContactAccountName(String label) {
        super(label);
    }

    public void selectOption(String option) {
        selectOption(DROP_DOWN_XPATH_FOR_CONTACT_ACCOUNT_NAME, SELECT_OPTION_XPATH_FOR_CONTACT_ACCOUNT_NAME, option);
    }
}
