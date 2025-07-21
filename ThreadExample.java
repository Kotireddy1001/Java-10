import java.util.Scanner;

class MyRunnable implements Runnable {
    private String message;

    public MyRunnable(String message) {
        this.message = message;
    }

    public void run() {
        System.out.println("Message from thread: " + message);
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a message to print in thread: ");
        String msg = scanner.nextLine();

        Thread t1 = new Thread(new MyRunnable(msg));
        t1.start();

        scanner.close();
    }
}
