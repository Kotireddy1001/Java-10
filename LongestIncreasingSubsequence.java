//Longest Increasing Subsequence — DP O(n^2) and patience O(n log n) version

import java.util.*;

public class LongestIncreasingSubsequence {
    
    public static int lisDP(int[] a) {
        int n = a.length;
        if (n == 0) return 0;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int best = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (a[j] < a[i]) dp[i] = Math.max(dp[i], dp[j] + 1);
            }
            best = Math.max(best, dp[i]);
        }
        return best;
    }

    // O(n log n) patience sorting approach
    public static int lisNlogN(int[] a) {
        List<Integer> tails = new ArrayList<>();
        for (int x : a) {
            int idx = Collections.binarySearch(tails, x);
            if (idx < 0) idx = -idx - 1;
            if (idx == tails.size()) tails.add(x); else tails.set(idx, x);
        }
        return tails.size();
    }

    public static void main(String[] args) {
        int[] arr = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println("LIS (DP) = " + lisDP(arr));         // 4
        System.out.println("LIS (nlogn) = " + lisNlogN(arr));   // 4
    }
}
