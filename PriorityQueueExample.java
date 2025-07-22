import java.util.*;

class Job {
    String name;
    int priority;

    Job(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String toString() {
        return name + " (Priority " + priority + ")";
    }
}

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Job> queue = new PriorityQueue<>(Comparator.comparingInt(j -> j.priority));

        queue.add(new Job("Backup", 2));
        queue.add(new Job("Antivirus Scan", 3));
        queue.add(new Job("User Report", 1));

        while (!queue.isEmpty()) {
            System.out.println("Processing: " + queue.poll());
        }
    }
}
