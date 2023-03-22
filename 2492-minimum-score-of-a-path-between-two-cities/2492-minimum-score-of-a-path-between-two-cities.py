class Solution(object):

    def minScore(self, n, roads):
        adj = [[] for _ in range(n+1)]
        for a, b, distance in roads:
            adj[a].append((b, distance))
            adj[b].append((a, distance))

        res = [1e6]

        visited = [0] * (n+1)

        def dfs(now):

            visited[now] = 1

            for next, cost in adj[now]:
                res[0] = min(res[0], cost)

                if visited[next]:
                    continue

                dfs(next)

        dfs(1)

        return res[0]
