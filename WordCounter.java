import java.util.*;

public class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().trim();

        if (line.isEmpty()) {
            System.out.println("Word count: 0");
        } else {
            String[] words = line.split("\\s+");
            System.out.println("Word count: " + words.length);
        }
    }
}
