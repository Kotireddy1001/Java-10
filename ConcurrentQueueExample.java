import java.util.concurrent.*;

public class ConcurrentQueueExample {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();

        Runnable producer = () -> {
            for (int i = 1; i <= 5; i++) {
                queue.offer("Task " + i);
                System.out.println("Produced: Task " + i);
            }
        };

        Runnable consumer = () -> {
            while (!queue.isEmpty()) {
                System.out.println("Consumed: " + queue.poll());
            }
        };

        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
