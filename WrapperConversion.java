public class WrapperConversion {
    public static void main(String[] args) {
        String str = "2025";

        int num = Integer.parseInt(str);  // String → int
        double d = Double.valueOf("3.14"); // String → double

        System.out.println("Integer: " + num);
        System.out.println("Double: " + d);
    }
}
