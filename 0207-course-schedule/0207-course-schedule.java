class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        
        // 각 과목의 선행 과목 수
        int[] indegree = new int[numCourses];

        for (int[] pre : prerequisites) {
            int a = pre[0], b = pre[1];
            graph.get(b).add(a);
            indegree[a]++;
        }

        // 선행이 필요 없는 과목 
        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        int taken = 0;

        while (!q.isEmpty()) {
            int cur = q.poll();
            taken ++;       // 과목 하나 수강

            for (int next : graph.get(cur)) {
                indegree[next]--;
                if (indegree[next] == 0) {
                    q.add(next);
                }
            }
        }

        return taken == numCourses;
    }
}