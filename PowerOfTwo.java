public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 64;

        boolean isPowerOfTwo = (n > 0) && ((n & (n - 1)) == 0);

        System.out.println(n + " is power of two? " + isPowerOfTwo);
    }
}
