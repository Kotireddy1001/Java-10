import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        String text = "Java is Java and Java is powerful";
        String[] words = text.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Frequencies: " + map);
    }
}
