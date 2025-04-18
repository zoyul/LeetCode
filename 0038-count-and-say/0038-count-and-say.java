class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";

        String prev = countAndSay(n-1);
        String result = "";

        int cnt = 1;
        int l = prev.length();
        for (int i = 1; i < l; i++) {
            if (prev.charAt(i - 1) == prev.charAt(i)) {
                cnt ++;
            } else {
                result += cnt;
                result += prev.charAt(i - 1);
                cnt = 1;
            }
        }

        result += cnt;
        result += prev.charAt(l - 1);

        return result;
    }
}