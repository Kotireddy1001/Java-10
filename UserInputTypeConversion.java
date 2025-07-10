import java.util.Scanner;

public class UserInputTypeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age (int): ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter your height in meters (float): ");
        float height = Float.parseFloat(scanner.nextLine());

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("\n--- Your Details ---");
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + "m");
        System.out.println("Student: " + isStudent);

        scanner.close();
    }
}
