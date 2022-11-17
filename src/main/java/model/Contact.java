package model;

public class Contact {

    private final String salutation;
    private final String firstName;
    private final String lastName;

    private final String accountName;


    public Contact(String salutation, String firstName, String lastName, String accountName) {
        this.salutation = salutation;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountName = accountName;
    }

    public String getSalutation() {
        return salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAccountName() {
        return accountName;
    }
}
