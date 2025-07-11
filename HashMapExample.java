import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> studentMarks = new HashMap<>();
        studentMarks.put("Alice", 85);
        studentMarks.put("Bob", 92);
        studentMarks.put("Charlie", 78);

        System.out.println("Bob's Marks: " + studentMarks.get("Bob"));

        System.out.println("\nAll Students:");
        for (String name : studentMarks.keySet()) {
            int marks = studentMarks.get(name);
            System.out.println(name + " scored " + marks);
        }
    }
}
