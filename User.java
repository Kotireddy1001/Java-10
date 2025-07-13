import java.io.*;

class User implements Serializable {
    String username;
    transient String password;  // won't be serialized

    User(String u, String p) {
        username = u;
        password = p;
    }

    public static void main(String[] args) throws Exception {
        User u1 = new User("kotireddy", "secret123");

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("user.ser"));
        out.writeObject(u1);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("user.ser"));
        User u2 = (User) in.readObject();
        in.close();

        System.out.println("Username: " + u2.username);  // Printed
        System.out.println("Password: " + u2.password);  // null due to transient
    }
}
