package OOO.SOLID.HT.UserModel;

public class Persister {
    public void save(User user) {
        System.out.println("Save user: " + user.getName());
    }
}