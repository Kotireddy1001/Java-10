//user credential check

import java.util.*;

class Credentials {
    private String correctUser = "admin";
    private String correctPass = "1234";

    public boolean login(String user, String pass) {
        return user.equals(correctUser) && pass.equals(correctPass);
    }
}

public class Test18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Credentials c = new Credentials();

        System.out.print("Enter username: ");
        String u = sc.nextLine();

        System.out.print("Enter password: ");
        String p = sc.nextLine();

        System.out.println("Login Success: " + c.login(u, p));
    }
}
