class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int left = -1;
        int right = -1;
        int leftBound = -1; // // minK, maxK 둘 다 포함할 수 없는 구간의 시작
        
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int now = nums[i];

            if (now < minK || now > maxK) {
                leftBound = i;
                left = -1;
                right = -1;
            }

            if (now == minK) {
                left = i;
            }
            if (now == maxK) {
                right = i;
            }

            if (left != -1 && right != -1) {
                result += Math.max(0, (Math.min(left, right) - leftBound));
            }
        }
        return result;
    }
}