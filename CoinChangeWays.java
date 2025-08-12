//Coin Change — Count ways to make amount (unbounded knapsack)


import java.util.Arrays;

public class CoinChangeWays {
    public static long countWays(int[] coins, int amount) {
        long[] dp = new long[amount + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int a = coin; a <= amount; a++) {
                dp[a] += dp[a - coin];
            }
        }
        return dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 5;
        System.out.println("Ways = " + countWays(coins, amount)); // 4
    }
}
