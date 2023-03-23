class Solution(object):
    def makeConnected(self, n, connections):
        if len(connections) < n-1:
            return -1

        adj = [[] for _ in range(n)]
        for a, b in connections:
            adj[a].append(b)
            adj[b].append(a)

        visited = [0] * n


        def dfs(now):
            if visited[now]:
                return 0
            visited[now] = 1
            for neighbor in adj[now]:
                dfs(neighbor)
            return 1

        ans = 0
        for i in range(n):
            ans += dfs(i)

        return ans - 1