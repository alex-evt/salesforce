package model;

public class User {

    private String url = "https://tms9.lightning.force.com/";
    private String username = "xmx8k-23uy@force.com";
    private String password = "TMSAQA17onl";

    public User(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public User() {
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
