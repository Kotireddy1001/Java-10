//Word Break (dictionary segmentation) — DP O(n * maxWordLen)

import java.util.*;

public class WordBreak {
    public static boolean wordBreak(String s, Set<String> dict) {
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        int maxLen = dict.stream().mapToInt(String::length).max().orElse(0);
        for (int i = 1; i <= n; i++) {
            for (int l = 1; l <= maxLen && l <= i; l++) {
                if (!dp[i - l]) continue;
                if (dict.contains(s.substring(i - l, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        String s = "leetcode";
        Set<String> dict = new HashSet<>(Arrays.asList("leet", "code"));
        System.out.println(wordBreak(s, dict)); // true

        String t = "applepenapple";
        Set<String> d2 = new HashSet<>(Arrays.asList("apple", "pen"));
        System.out.println(wordBreak(t, d2)); // true
    }
}
