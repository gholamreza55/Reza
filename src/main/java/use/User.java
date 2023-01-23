package use;

public class User {
    private int id;
    private String password;
    private String useName;
    private String email;

    public User(int id, String password, String useName, String email) {
        this.id = id;
        this.password = password;
        this.useName = useName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public String getUseName() {
        return useName;
    }

    public String getEmail() {
        return email;
    }
}
