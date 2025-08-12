// values[] and weights[], capacity W

import java.util.Arrays;

public class Knapsack01 {
    
    public static int knapsack(int[] values, int[] weights, int W) {
        int n = values.length;
        int[] dp = new int[W + 1]; // 1D optimized
        for (int i = 0; i < n; i++) {
            for (int w = W; w >= weights[i]; w--) {
                dp[w] = Math.max(dp[w], dp[w - weights[i]] + values[i]);
            }
        }
        return dp[W];
    }

    public static void main(String[] args) {
        int[] val = {60, 100, 120};
        int[] wt = {10, 20, 30};
        int W = 50;
        System.out.println("Max value = " + knapsack(val, wt, W)); // 220
    }
}
