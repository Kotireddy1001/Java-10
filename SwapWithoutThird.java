public class SwapWithoutThird {
    public static void main(String[] args) {
        int a = 15, b = 27;

        System.out.println("Before Swap: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
}
