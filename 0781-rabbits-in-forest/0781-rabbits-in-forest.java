class Solution {
    public int numRabbits(int[] answers) {
        TreeMap<Integer, Integer> dict = new TreeMap<>();
        for (int ans : answers) {
            dict.put(ans, dict.getOrDefault(ans, 0) + 1);
        }

        int result = 0;
        for (int key : dict.keySet()) {
            int count = dict.get(key);
            // 한 그룹 당 key + 1마리가 필요함 -> 2마리라고 말했으면 2마리라고 말한 토끼가 총 3마리가 필요함
            if (count > key + 1) {
                int group = count / (key + 1);
                int rest = count - group * (key + 1);
                // 그룹 수만큼 key + 1 마리가 있을 것임
                result += group * (key + 1);
                // 그룹이 안 만들어진 애들은 key + 1만큼 더필요
                if (rest > 0) {
                    result += key + 1;
                }
            } else {    // 그룹이 안만들어진다면
                // 그룹을 만들이 위해서는 무조건 key + 1 마리가 필요함
                result += key + 1;
            }
        }

        return result;
    }
}