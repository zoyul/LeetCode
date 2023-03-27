class Solution(object):
    def minPathSum(self, grid):

        n = len(grid)
        m = len(grid[0])

        sum_grid = [[0] * m for _ in range(n)]

        for i in range(m):
            sum_grid[0][i] = sum_grid[0][i-1] + grid[0][i]
        for i in range(1, n):
            sum_grid[i][0] = sum_grid[i-1][0] + grid[i][0]

        for i in range(1, n):
            for j in range(1, m):
                sum_grid[i][j] = min(sum_grid[i][j-1], sum_grid[i-1][j]) + grid[i][j]

        return sum_grid[-1][-1]