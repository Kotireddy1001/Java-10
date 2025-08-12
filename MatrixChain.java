// Matrix Chain Multiplication (minimize cost) — O(n^3)

public class MatrixChain {
    // dims length = n+1 for n matrices where matrix i is dims[i-1] x dims[i]
    public static long matrixChainOrder(int[] dims) {
        int n = dims.length - 1;
        long[][] dp = new long[n+1][n+1];
        for (int len = 2; len <= n; len++) {
            for (int i = 1; i <= n - len + 1; i++) {
                int j = i + len - 1;
                dp[i][j] = Long.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    long cost = dp[i][k] + dp[k+1][j] + 1L * dims[i-1] * dims[k] * dims[j];
                    if (cost < dp[i][j]) dp[i][j] = cost;
                }
            }
        }
        return dp[1][n];
    }

    public static void main(String[] args) {
        int[] dims = {40, 20, 30, 10, 30}; // 4 matrices
        System.out.println("Min multiplication cost = " + matrixChainOrder(dims)); // 26000
    }
}
