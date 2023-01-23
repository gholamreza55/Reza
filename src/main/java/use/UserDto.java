package use;

public class UserDto {
    private int id;
    private String useName;
    private String email;

    public UserDto(int id, String useName, String email) {
        super();
        this.id = id;
        this.useName = useName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUseName() {
        return useName;
    }

    public void setUseName(String useName) {
        this.useName = useName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", useName='" + useName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
