package OOO.SOLID.HT.UserModel;
public class UserModel {
    private User user;
    private final Persister persister;

    public UserModel() {
        this.persister = new Persister();
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void saveUser() {
        persister.save(user);
    }
}