class Solution {
    public int countLargestGroup(int n) {
        int[] cnt = new int[40];

        int max = 0;
        int count = 0;
        for (int i = 1; i < n + 1 ; i++) {
            int sum = calculate(i);
            int value = cnt[sum] + 1;
            cnt[sum] += 1;

            if (value > max) {
                max = value;
                count = 1;
            } else if (value == max) {
                count++;
            }
        }
        return count;
    }

    private int calculate(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}