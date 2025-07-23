//User Profile

class User {
    private String email;
    private String phone;

    public void setEmail(String e) {
        email = e;
    }

    public void setPhone(String p) {
        phone = p;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}

public class Test9 {
    public static void main(String[] args) {
        User u = new User();
        u.setEmail("user@example.com");
        u.setPhone("9876543210");
        System.out.println("Email: " + u.getEmail());
        System.out.println("Phone: " + u.getPhone());
    }
}
