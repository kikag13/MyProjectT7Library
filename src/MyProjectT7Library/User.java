package MyProjectT7Library;

public class User {
    private String user;
    private String password;
    private boolean isAdmin;

    public User(String user, String password, boolean isAdmin) {
        this.user = user;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
