class Solution {
    public static List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= 9; i++) {
            dfs(n, i, result);
        }

        return result;
    }

    private static void dfs(int n, int num, List<Integer> result) {
        if (num > n) return ;
        result.add(num);

        for (int i = 0; i <= 9; i++) {
            int next = num * 10 + i;
            if (next > n) return ;
            dfs(n, next, result);
        }
    }
}