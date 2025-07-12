public class PassByValue {
    public static void modify(int x) {
        x = x + 100;
        System.out.println("Inside Method: " + x);
    }

    public static void main(String[] args) {
        int num = 50;
        System.out.println("Before Method: " + num);
        modify(num);
        System.out.println("After Method: " + num);
    }
}
