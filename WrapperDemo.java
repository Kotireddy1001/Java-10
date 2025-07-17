public class WrapperDemo {
    public static void main(String[] args) {
        Integer num = 50;  // Auto-boxing
        int result = num + 100; // Unboxing + operation
        System.out.println("Auto-boxed Integer: " + num);
        System.out.println("Sum with unboxed int: " + result);
    }
}
