//Palindrome Partitioning — Minimum cuts (DP)

import java.util.Arrays;

public class PalindromePartitioning {
    public static int minCut(String s) {
        int n = s.length();
        boolean[][] isPal = new boolean[n][n];
        for (int center = 0; center < n; center++) {
            // odd length palindromes
            for (int l = 0; center - l >= 0 && center + l < n && s.charAt(center-l) == s.charAt(center+l); l++) {
                isPal[center-l][center+l] = true;
            }
            // even length palindromes
            for (int l = 0; center - l >= 0 && center + l + 1 < n && s.charAt(center-l) == s.charAt(center+l+1); l++) {
                isPal[center-l][center+l+1] = true;
            }
        }
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        for (int i = 0; i < n; i++) {
            if (isPal[0][i]) dp[i] = 0;
            else {
                for (int j = 0; j < i; j++) {
                    if (isPal[j+1][i] && dp[j] + 1 < dp[i]) dp[i] = dp[j] + 1;
                }
            }
        }
        return n == 0 ? 0 : dp[n-1];
    }

    public static void main(String[] args) {
        System.out.println(minCut("aab")); // 1 ("aa" | "b")
        System.out.println(minCut("a"));   // 0
        System.out.println(minCut("ab"));  // 1
    }
}
