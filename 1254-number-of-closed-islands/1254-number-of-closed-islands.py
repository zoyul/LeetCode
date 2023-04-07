from pprint import pprint

class Solution(object):
    def closedIsland(self, grid):

        n = len(grid)
        m = len(grid[0])

        di = [0, 0, -1, 1]
        dj = [1, -1, 0, 0]

        def bfs(now_i, now_j):

            q = []
            q.append((now_i, now_j))
            grid[now_i][now_j] = 1

            while q:

                now_i, now_j = q.pop(0)

                for k in range(4):
                    next_i = now_i + di[k]
                    next_j = now_j + dj[k]

                    if next_i < 0 or next_i >= n or next_j < 0 or next_j >= m:
                        continue
                    if grid[next_i][next_j] != 0:
                        continue

                    grid[next_i][next_j] = 1
                    q.append((next_i, next_j))

        for i in range(n):
            for j in range(m):
                if grid[i][j] == 0 and (i == 0 or i == n-1 or j == 0 or j == m-1):
                    bfs(i, j)

        res = 0
        for i in range(n):
            for j in range(m):
                if grid[i][j] == 0:
                    bfs(i, j)
                    res += 1

        return res