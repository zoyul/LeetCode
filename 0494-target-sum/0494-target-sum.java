class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return caculate(nums, target, 0, 0);
    }

    private int caculate(int[] arr, int target, int idx, int sum) {
        if (idx == arr.length) {
            return sum == target ? 1 : 0;
        }

        int sub = caculate(arr, target, idx + 1, sum - arr[idx]);
        int add = caculate(arr, target, idx + 1, sum + arr[idx]);
        return sub + add;
    }
}