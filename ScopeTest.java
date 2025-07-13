class ScopeTest {
    public static void main(String[] args) {
        int x = 10;
        {
            int y = 20;
            System.out.println("x: " + x); // Accessible
            System.out.println("y: " + y);
        }
        // System.out.println(y); // Error: y is out of scope
        System.out.println("x still accessible: " + x);
    }
}
