public class XORSubarrays {
    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 6};
        int n = arr.length;

        int xorSum = 0;
        for (int i = 0; i < n - 1; i++) {
            int subXor = arr[i] ^ arr[i + 1];
            xorSum += subXor;
            System.out.println("XOR of [" + arr[i] + ", " + arr[i + 1] + "] = " + subXor);
        }

        System.out.println("Total XOR Sum = " + xorSum);
    }
}
