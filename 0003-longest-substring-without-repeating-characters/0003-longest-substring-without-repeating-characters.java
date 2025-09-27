class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lastIndex = new int[128];
        Arrays.fill(lastIndex, -1);
        int start = 0;
        int maxLen = 0;
        
        for (int end = 0; end < s.length(); end ++) {
            char c = s.charAt(end);
            // 지금 위도우 안에 있다면
            if (lastIndex[c] >= start) {
                start = lastIndex[c] + 1;
            }
            lastIndex[c] = end;
            maxLen = Math.max(maxLen, end - start + 1);
        }

        return maxLen;
    }
}