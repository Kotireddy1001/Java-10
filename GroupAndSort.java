import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    String grade;

    Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public String toString() {
        return name + " - " + grade;
    }
}

public class GroupAndSort {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", "B"),
            new Student("Bob", "A"),
            new Student("Charlie", "A"),
            new Student("David", "C"),
            new Student("Eve", "B")
        );

        Map<String, List<Student>> grouped = students.stream()
            .collect(Collectors.groupingBy(s -> s.grade));

        grouped.forEach((grade, group) -> {
            group.sort(Comparator.comparing(s -> s.name));
            System.out.println("Grade " + grade + ": " + group);
        });
    }
}
