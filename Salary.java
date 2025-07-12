public class Salary {
    public static void main(String[] args) {
        double basicSalary = 20000;
        double hra = 0.2 * basicSalary; // 20%
        double da = 0.1 * basicSalary;  // 10%

        double grossSalary = basicSalary + hra + da;

        System.out.println("Gross Salary = " + grossSalary);
    }
}
