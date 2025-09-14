class Solution {
    public int numDecodings(String s) {
        int l = s.length();
        if (l == 0) return 0;
        if (s.charAt(0) == '0') return 0;

        int[] dp = new int[l];
        dp[0] = 1;

        int before, now;
        for (int i = 1; i < l; i++) {
            before = s.charAt(i - 1) - '0';
            now = s.charAt(i) - '0';

            if (now != 0) {
                dp[i] += dp[i - 1];
            }

            int concat = before * 10 + now;
            if (concat >= 10 && concat <= 26) {
                dp[i] += (i >= 2) ? dp[i - 2] : 1;
            }
        }

        return dp[l-1];
    }
}