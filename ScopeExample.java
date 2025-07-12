public class ScopeExample {
    int instanceVar = 100; // Instance variable
    static int staticVar = 200; // Static variable

    public void showVariables() {
        int localVar = 300; // Local variable
        System.out.println("Instance: " + instanceVar);
        System.out.println("Static: " + staticVar);
        System.out.println("Local: " + localVar);
    }

    public static void main(String[] args) {
        ScopeExample obj = new ScopeExample();
        obj.showVariables();
    }
}
