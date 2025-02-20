public class Client implements Authenticable{
    protected String username;
    protected String password;

    public Client(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public void login(String username, String password) {
        if(username.equals(this.username) && password.equals(this.password)) {
            System.out.println("Logged in successfully\nHello " + this.username + "!");
        } else {
            System.out.println("Incorrect username or password");
        }
    }

    @Override
    public void logout() {
        System.out.println("Logged out successfully\nBye " + username + "!");
    }
}
