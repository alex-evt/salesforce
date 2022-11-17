package model;

public class Account {

    private final String accountName;
    private final String webSite;
    private final String industry;

    public Account(String accountName, String webSite, String industry) {
        this.accountName = accountName;
        this.webSite = webSite;
        this.industry = industry;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getWebSite() {
        return webSite;
    }

    public String getIndustry() {
        return industry;
    }
}
