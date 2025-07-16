public class ScopeExample2 {
    public static void main(String[] args) {
        int x = 10;
        {
            int y = 20;
            System.out.println("x: " + x);
            System.out.println("y: " + y);
        }
        // System.out.println(y); // Error: y is out of scope
    }
}
