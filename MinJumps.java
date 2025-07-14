public class MinJumps {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 1, 4};
        int jumps = 0, farthest = 0, end = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            farthest = Math.max(farthest, i + arr[i]);
            if (i == end) {
                jumps++;
                end = farthest;
            }
        }

        System.out.println("Minimum jumps to reach end: " + jumps);
    }
}
