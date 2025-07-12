public class StaticExample {
    int nonStaticVar = 5;
    static int staticVar = 10;

    public void show() {
        System.out.println("Non-static: " + nonStaticVar);
        System.out.println("Static: " + staticVar);
    }

    public static void main(String[] args) {
        StaticExample obj = new StaticExample();
        obj.show();
        System.out.println("Accessing static directly: " + StaticExample.staticVar);
    }
}
