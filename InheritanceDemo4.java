//Runtime Polymorphism – Employee Salary

class Employee {
    double getSalary() {
        return 10000;
    }
}

class Manager extends Employee {
    double getSalary() {
        return 20000;
    }
}

class Developer extends Employee {
    double getSalary() {
        return 15000;
    }
}

public class InheritanceDemo4 {
    public static void main(String[] args) {
        Employee e;
        e = new Manager();
        System.out.println("Manager Salary: " + e.getSalary());

        e = new Developer();
        System.out.println("Developer Salary: " + e.getSalary());
    }
}
