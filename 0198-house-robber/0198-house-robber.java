class Solution {
    public int rob(int[] nums) {
        int l = nums.length;
        int[] dp = new int[l];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        // 바로 옆집의 돈과, 맞닿지 않은 그 옆집의 돈 + 지금 집의 돈 비교
        for (int i = 2; i < l ; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i]);
        }

        return dp[l - 1];
    }
}