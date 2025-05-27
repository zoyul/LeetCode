class Solution {
    public int findMin(int[] nums) {
        int left = 0; int right = nums.length - 1;

        int now = 0;
        while (left <= right) {
            now = (left + right) / 2;
            
            if (nums[now] < nums[right]) {
                right = now;
            } else {
                left = now + 1;
            }
        }

        return nums[now];
    }
}