public class ClientFactory extends UserFactory {
    @Override
    public Authenticable createUser(String username, String password) {
        return new Client(username, password);
    }
}
