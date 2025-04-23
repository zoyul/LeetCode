class Solution {
    public int countLargestGroup(int n) {
        Map<Integer, Integer> dict = new HashMap<>();

        int max = 0;
        int count = 0;
        for (int i = 1; i < n + 1 ; i++) {
            int sum = calculate(i);
            int value = dict.getOrDefault(sum, 0) + 1;
            dict.put(sum, value);

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
        String s = String.valueOf(num);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - '0';
        }
        return sum;
    }
}