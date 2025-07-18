import java.util.*;

public class PangramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase().replaceAll(" ", "");
        boolean[] seen = new boolean[26];

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                seen[c - 'a'] = true;
            }
        }

        boolean isPangram = true;
        for (boolean b : seen) {
            if (!b) {
                isPangram = false;
                break;
            }
        }

        System.out.println(isPangram ? "Pangram" : "Not Pangram");
    }
}
