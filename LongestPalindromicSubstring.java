//Longest Palindromic Substring (Dynamic Programming)

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String str = "babad";
        int n = str.length(), start = 0, maxLen = 1;

        boolean[][] dp = new boolean[n][n];

        for (int i = 0; i < n; i++) dp[i][i] = true;

        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                if (str.charAt(i) == str.charAt(j)) {
                    if (len == 2 || dp[i+1][j-1]) {
                        dp[i][j] = true;
                        if (len > maxLen) {
                            start = i;
                            maxLen = len;
                        }
                    }
                }
            }
        }

        System.out.println("Longest Palindromic Substring: " + str.substring(start, start + maxLen));
    }
}
