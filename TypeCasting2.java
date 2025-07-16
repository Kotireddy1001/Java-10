public class TypeCasting {
    public static void main(String[] args) {
        int i = 100;
        double d = i;  // Implicit casting
        double d2 = 123.456;
        int i2 = (int) d2; // Explicit casting

        System.out.println("Implicit int to double: " + d);
        System.out.println("Explicit double to int: " + i2);
    }
}
