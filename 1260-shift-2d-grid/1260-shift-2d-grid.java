class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int total = m * n;
        int[][] result = new int[m][n];

        for (int i = 0; i < m; i ++) {
            for (int j = 0; j < n; j++) {
                    int currentIndex = i * n + j;
                    int shiftedIndex = (currentIndex + k) % total;
                    
                    int newRow = shiftedIndex / n;
                    int newColum = shiftedIndex % n;

                    result[newRow][newColum] = grid[i][j];
            }
        }

        List<List<Integer>> answer = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                row.add(result[i][j]);
            }

            answer.add(row);
        }

        return answer;
    }
}