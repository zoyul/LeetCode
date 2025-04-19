class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long result = 0;
        int l = nums.length;
        for (int i = 0; i < l; i++) {
            long left = getLeftIndex(nums, lower - nums[i], i + 1 , l - 1);
            long right = getRightIndex(nums, upper - nums[i], i + 1 , l - 1);
            if (left <= right) {
                result += (right - left + 1);
            }
        }
        return result;
    }

    private long getLeftIndex(int[] nums, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    private long getRightIndex(int[] nums, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }
}