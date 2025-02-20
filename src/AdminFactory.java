public class AdminFactory extends UserFactory {
    @Override
    public Authenticable createUser(String username, String password) {
        return new Administrator(username, password);
    }
}
