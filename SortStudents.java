import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public int compareTo(Student s) {
        return s.marks - this.marks; // Descending
    }

    public String toString() {
        return name + ": " + marks;
    }
}

public class SortStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> list = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter marks: ");
            int marks = scanner.nextInt();
            scanner.nextLine();
            list.add(new Student(name, marks));
        }

        Collections.sort(list);
        System.out.println("\nSorted Students (by marks):");
        for (Student s : list)
            System.out.println(s);

        scanner.close();
    }
}
