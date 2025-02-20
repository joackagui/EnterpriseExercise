public class Main {
    public static void main(String[] args) {
        UserFactory adminFactory = new AdminFactory();
        UserFactory clientFactory = new ClientFactory();
        UserFactory employeeFactory = new EmployeeFactory();

        SecuritySystem securitySystem = new SecuritySystem();

        Authenticable admin = adminFactory.createUser("Juan", "123");
        Authenticable client = clientFactory.createUser("Pablo", "456");
        Authenticable employee = employeeFactory.createUser("Jose", "789");

        securitySystem.loginVerification(admin, "Juan", "123");
        securitySystem.permissionVerification(admin, "hit customers");
    }
}