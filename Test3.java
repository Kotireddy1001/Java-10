//Employee Salary Update

class Employee {
    private double salary;

    public void setSalary(double s) {
        if (s >= 0) salary = s;
    }

    public double getSalary() {
        return salary;
    }
}

public class Test3 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setSalary(50000);
        System.out.println("Salary: " + emp.getSalary());
    }
}
