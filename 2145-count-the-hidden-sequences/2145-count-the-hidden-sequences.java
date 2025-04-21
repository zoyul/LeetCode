class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long prefixSum = 0;
        long min = 0;
        long max = 0;

        for (int diff : differences) {
            prefixSum += diff;
            min = Math.min(min, prefixSum);
            max = Math.max(max, prefixSum);
        }

        long minX = lower - min;
        long maxX = upper - max;

        return (int) Math.max(0, maxX - minX + 1);
    }
}