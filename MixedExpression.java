public class MixedExpression {
    public static void main(String[] args) {
        int i = 5;
        double d = 3.5;
        char c = 'A';
        boolean flag = true;

        double result = i * d + c; // 'A' = 65
        System.out.println("Expression result: " + result);

        int asciiDiff = c - 'K'; // 65 - 75 = -10
        System.out.println("ASCII Difference: " + asciiDiff);

        System.out.println("Boolean Expression: " + (flag && (i < 10)));
    }
}
