class Solution {
    public int numIslands(char[][] grid) {
        int m = grid[0].length;
        int n = grid.length;
        boolean[][] visited = new boolean[n][m];

        int cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && grid[i][j] == '1') {
                    dfs(m, n, i, j, visited, grid);
                    cnt ++;
                }
            }
        }
        return cnt;
    }

    public void dfs(int m, int n, int i, int j, boolean[][] visited, char[][] grid) {
        if (i < 0 || j < 0 || i >= n || j >= m) {
            return ;
        }

        // 이미 방문했거나 물이면 패스
        if (visited[i][j] || grid[i][j] == '0') {
            return;
        }

        visited[i][j] = true;

        dfs(m, n, i + 1, j, visited, grid);
        dfs(m, n, i - 1, j, visited, grid);
        dfs(m, n, i, j + 1, visited, grid);
        dfs(m, n, i, j - 1, visited, grid);
    }
}