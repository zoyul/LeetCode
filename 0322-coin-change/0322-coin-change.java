class Solution {
    public int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[max];
        // dp 초기화
        dp[0] = 0;
        for (int i = 1; i < amount + 1; i++) {
            dp[i] = max;
        }

        for (int i = 1; i < amount + 1; i++) {
            for (int coin : coins) {
                if (i >= coin) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[amount] >= max ? -1 : dp[amount];
    }
}