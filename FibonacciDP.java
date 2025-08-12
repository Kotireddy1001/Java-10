 // iterative DP with O(1) space

public class FibonacciDP {
   
    public static long fib(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be >= 0");
        if (n <= 1) return n;
        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println("Fib(0)=" + fib(0));
        System.out.println("Fib(1)=" + fib(1));
        System.out.println("Fib(10)=" + fib(10)); // 55
        System.out.println("Fib(50)=" + fib(50));
    }
}
