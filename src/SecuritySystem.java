public class SecuritySystem {
    public void loginVerification(Authenticable user, String username, String password) {
        user.login(username, password);
    }
    public void permissionVerification(Authorizable user, String action) {
        if(user.askForPermission(action)) {
            System.out.println("You are allowed to perform this action");
        } else {
            System.out.println("You are not allowed to perform this action");
        }
    }
}
