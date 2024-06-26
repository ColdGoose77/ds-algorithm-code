public class LeetCode309 {

    public int maxProfit(int[] prices) {
        int n = prices.length;

        int[][] dp = new int[n][3];

        dp[0][0] = -prices[0];// 买入状态

        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] - prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][2]);
            dp[i][2] = Math.max(dp[i - 1][0] + prices[i], dp[i - 1][1]);
        }

        return Math.max(dp[n - 1][0], Math.max(dp[n - 1][1], dp[n - 1][2]));
    }
}
