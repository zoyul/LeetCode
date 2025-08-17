class Solution {
    public int rob(int[] nums) {
        int l = nums.length;
        if (l == 1) {
            return nums[0];
        }
        // 1번째 집을 터는 경우
        int[] dp = new int[l];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < l - 1; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i-1]);
        }

        // 1번째 집을 털지 않는 경우
        int[] dp2 = new int[l];

        dp2[1] = nums[1];
        for (int i = 2; i < l; i++) {
            dp2[i] = Math.max(dp2[i - 2] + nums[i], dp2[i-1]);
        }

        return Math.max(dp[l - 2], dp2[l - 1]);
    }
}