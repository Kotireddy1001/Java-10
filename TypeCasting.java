public class TypeCasting {
    public static void main(String[] args) {
        int intVal = 150;
        double doubleVal = intVal; // Implicit casting

        double d = 99.99;
        int i = (int) d; // Explicit casting

        System.out.println("Int to Double: " + doubleVal);
        System.out.println("Double to Int: " + i);
    }
}
