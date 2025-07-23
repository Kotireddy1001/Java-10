//Login credential check

class Login {
    private String username = "admin";
    private String password = "1234";

    public boolean validate(String u, String p) {
        return username.equals(u) && password.equals(p);
    }
}

public class Test6 {
    public static void main(String[] args) {
        Login login = new Login();
        boolean status = login.validate("admin", "1234");
        System.out.println("Login success: " + status);
    }
}
