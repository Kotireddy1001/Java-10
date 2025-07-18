import java.util.*;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();

        int[] freq = new int[10];
        for (char ch : number.toCharArray()) {
            if (Character.isDigit(ch)) {
                freq[ch - '0']++;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + ": " + freq[i] + " times");
            }
        }
    }
}
