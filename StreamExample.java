import java.util.*;
import java.util.stream.*;

public class StreamExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();

        System.out.print("Enter how many numbers: ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            nums.add(scanner.nextInt());
        }

        List<Integer> filtered = nums.stream()
                .filter(num -> num > 20)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Filtered & Sorted (greater than 20): " + filtered);

        scanner.close();
    }
}
