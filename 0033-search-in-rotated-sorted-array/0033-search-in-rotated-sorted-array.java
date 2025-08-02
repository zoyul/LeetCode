class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) return mid;

            // 왼쪽 구간이 정렬된 경우
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    return binarySearch(nums, left, mid - 1, target);
                } else {
                    left = mid + 1;
                }
            }
            // 오른쪽 구간이 정렬된 경우
            else {
                if (nums[mid] < target && target <= nums[right]) {
                    return binarySearch(nums, mid + 1, right, target);
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    private int binarySearch(int[] nums, int left, int right, int target) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] < target) left = mid + 1;
            if (nums[mid] > target) right = mid - 1;
        }
        return -1;
    }
}
