//Employee Data

import java.util.*;

class Employee {
    private String name;
    private double salary;

    public void setName(String n) { name = n; }
    public void setSalary(double s) { salary = s; }

    public String getName() { return name; }
    public double getSalary() { return salary; }
}

public class Test14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();

        System.out.print("Enter name: ");
        e.setName(sc.nextLine());

        System.out.print("Enter salary: ");
        e.setSalary(sc.nextDouble());

        System.out.println("Employee: " + e.getName() + ", Salary: " + e.getSalary());
    }
}
