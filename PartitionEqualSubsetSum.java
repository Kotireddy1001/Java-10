//Partition Equal Subset Sum (subset sum DP)

public class PartitionEqualSubsetSum {
    public static boolean canPartition(int[] nums) {
        int sum = 0;
        for (int x : nums) sum += x;
        if ((sum & 1) == 1) return false;
        int target = sum / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        for (int num : nums) {
            for (int t = target; t >= num; t--) dp[t] = dp[t] || dp[t - num];
        }
        return dp[target];
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 11, 5};
        System.out.println(canPartition(arr)); // true
    }
}
