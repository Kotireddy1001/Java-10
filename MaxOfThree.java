public class MaxOfThree {
    public static void main(String[] args) {
        int a = 45, b = 67, c = 32;
        int max;

        if (a >= b && a >= c)
            max = a;
        else if (b >= a && b >= c)
            max = b;
        else
            max = c;

        System.out.println("Maximum number is: " + max);
    }
}
