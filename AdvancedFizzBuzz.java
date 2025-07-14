public class AdvancedFizzBuzz {
    public static void main(String[] args) {
        int limit = 30;
        for (int i = 1; i <= limit; i++) {
            String output = "";

            if (i % 3 == 0) output += "Fizz";
            if (i % 5 == 0) output += "Buzz";
            if (i % 7 == 0) output += "Pop";
            if (output.isEmpty()) output += i;

            System.out.println(output);
        }
    }
}
