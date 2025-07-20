//String Concatenation with Variables

import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        String fullMessage = "Welcome " + firstName + " " + lastName + "! Year: " + year;
        System.out.println(fullMessage);

        scanner.close();
    }
}

