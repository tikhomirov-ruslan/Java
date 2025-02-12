package system;

public class User {
    private String login;
    private String name;
    private String surname;
    private String password;

    public User(String login, String name, String surname, String password) {
        this.login = login;
        this.name = name;
        this.surname = surname;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
