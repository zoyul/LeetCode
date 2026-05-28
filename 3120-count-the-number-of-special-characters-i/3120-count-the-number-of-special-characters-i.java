class Solution {
    public int numberOfSpecialChars(String word) {
        
        int ans = 0;

        for (char c = 'a'; c <= 'z'; c++) {
            
            int lower = word.lastIndexOf(c);
            int upper = word.lastIndexOf(Character.toUpperCase(c));

            if (lower != -1 && upper != -1) {
                ans++;
            }
        }

        return ans;
    }
}