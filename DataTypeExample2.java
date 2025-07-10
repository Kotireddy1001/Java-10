public class DataTypeExample2 {
    public static void main(String[] args) {
        int number = 100;
        double converted = number;  // Implicit casting
        System.out.println("Implicit Casting (int to double): " + converted);

        double pi = 3.14159;
        int roundedPi = (int) pi;   // Explicit casting
        System.out.println("Explicit Casting (double to int): " + roundedPi);
    }
}
