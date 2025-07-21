import java.util.Scanner;

public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String word = scanner.nextLine();

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Is string palindrome? " + isPalindrome(word));
        System.out.println("Is number palindrome? " + isPalindrome(String.valueOf(number)));

        scanner.close();
    }
}
