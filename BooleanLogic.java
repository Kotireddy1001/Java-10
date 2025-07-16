public class BooleanLogic {
    public static void main(String[] args) {
        boolean isJavaFun = true;
        boolean isHard = false;

        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is Java hard? " + isHard);

        boolean result = isJavaFun && !isHard;
        System.out.println("Final result: " + result);
    }
}
