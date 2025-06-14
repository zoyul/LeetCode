class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 1) return 1;
        // 초기화
        int dp[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
        }

        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
                if (dp[i] > result) {
                    result = dp[i];
                }
            }
        }

        return result;
    }
}