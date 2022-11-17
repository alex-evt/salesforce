package elements;

public class DropDownAccount extends DropDown {

    private static final String DROP_DOWN_XPATH_FOR_ACCOUNT = "//*[text()='Industry']//ancestor::div[contains(@class,'uiInput ')]//a";
    private static final String SELECT_OPTION_XPATH_FOR_ACCOUNT = "//*[text()='Chemicals']//ancestor::div[@class='select-options']//a[contains(text(), '%s')]";


    public DropDownAccount(String label) {
        super(label);
    }

    public void selectOption(String option) {
        selectOption(DROP_DOWN_XPATH_FOR_ACCOUNT, SELECT_OPTION_XPATH_FOR_ACCOUNT, option);
    }
}
