import java.util.*;

public class WordFrequency2 {
    public static void main(String[] args) {
        String text = "java is fast and java is robust";
        String[] words = text.split(" ");
        Map<String, Integer> frequency = new HashMap<>();

        for (String word : words) {
            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }

        frequency.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
