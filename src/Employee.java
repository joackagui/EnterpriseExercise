public class Employee implements Authenticable, Authorizable {
    protected String username;
    protected String password;

    public Employee(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public void login(String username, String password) {
        if (username.equals(this.username) && password.equals(this.password)) {
            System.out.println("Logged in successfully\nHello employee" + username);
        } else {
            System.out.println("Incorrect username or password");
        }
    }

    @Override
    public void logout() {
        System.out.println("Logged out successfully\nCome back tomorrow!");
    }

    @Override
    public boolean askForPermission(String action) {
        return (action.equalsIgnoreCase("check files") ||
                action.equalsIgnoreCase("check clients") ||
                action.equalsIgnoreCase("mop the floor"));
    }
}
