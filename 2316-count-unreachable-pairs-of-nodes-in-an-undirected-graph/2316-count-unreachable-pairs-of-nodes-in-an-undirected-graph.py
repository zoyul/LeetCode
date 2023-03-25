class Solution(object):
    def countPairs(self, n, edges):
        adj = [[] for _ in range(n)]
        for a, b in edges:
            adj[a].append(b)
            adj[b].append(a)

        visited = [0] * n

        def dfs(now):
            if visited[now]:
                return 0
            visited[now] = 1
            cnt = 1
            for next in adj[now]:
                cnt += dfs(next)
            return cnt

        group = []
        for i in range(n):
            if visited[i]:
                continue
            group.append(dfs(i))

        res = 0
        for i in range(len(group)):
            res += group[i] * (n - group[i])

        return res // 2