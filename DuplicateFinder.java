import java.util.*;

public class DuplicateFinder {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "John", "Bob", "Alice");
        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (String name : names) {
            if (!seen.add(name)) {
                duplicates.add(name);
            }
        }

        System.out.println("Duplicates: " + duplicates);
    }
}
