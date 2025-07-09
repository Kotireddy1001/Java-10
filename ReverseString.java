import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        while(a != "exit"){
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        a = str;
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println("Reversed String: " + rev);
        }
    }
}
