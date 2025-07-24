//Student Info

import java.util.*;

class Student {
    private String name;
    private int age;

    public void setName(String n) { name = n; }
    public void setAge(int a) { age = a; }

    public String getName() { return name; }
    public int getAge() { return age; }
}

public class Test12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.print("Enter name: ");
        s.setName(sc.nextLine());

        System.out.print("Enter age: ");
        s.setAge(sc.nextInt());

        System.out.println("Name: " + s.getName() + ", Age: " + s.getAge());
    }
}
