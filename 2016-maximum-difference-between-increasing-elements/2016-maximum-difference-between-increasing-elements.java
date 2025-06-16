class Solution {
    public int maximumDifference(int[] nums) {
        int result = -1;
        int minValue = Math.min(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            minValue = Math.min(minValue, nums[i-1]);
            int diff = nums[i] - minValue;
            if (diff > result) {
                result = diff;
            }
        }
        return result;
    }
}