public class EmployeeFactory extends UserFactory{
    @Override
    public Authenticable createUser(String username, String password) {
        return new Employee(username, password);
    }
}
