class AgeException extends Exception {
    public AgeException(String msg) {
        super(msg);
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        int age = 15;
        try {
            if (age < 18)
                throw new AgeException("Not eligible to vote");
            System.out.println("Eligible to vote");
        } catch (AgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
