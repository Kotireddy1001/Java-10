public class TypePromotionExample {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;

        int result = a + b;

        System.out.println("Result of byte + byte (promoted to int): " + result);
    }
}
