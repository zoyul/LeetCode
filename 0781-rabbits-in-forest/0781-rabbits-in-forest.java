class Solution {
    public int numRabbits(int[] answers) {
        TreeMap<Integer, Integer> dict = new TreeMap<>();
        for (int i = 0; i < answers.length ; i++) {
            if (dict.containsKey(answers[i])){
                dict.put(answers[i], dict.get(answers[i]) + 1);
            } else {
                dict.put(answers[i], 1);
            }
        }

        int result = 0;
        for (Map.Entry<Integer, Integer> entry : dict.entrySet()) {
            int key = entry.getKey();       // 답변
            int count = entry.getValue();   // 해당 답변을 한 토끼 수

            if (key == 0) {
                result += count; // 각각 혼자만 있는 토끼
            } else if (key == 1) {
                result += (count / 2) * 2;
                if (count % 2 != 0) {
                    result += 2; // 짝이 안 맞으면 새 그룹 필요
                }
            } else {
                int groupSize = key + 1;
                int groupCount = (count + groupSize - 1) / groupSize; // 올림 나눗셈
                result += groupCount * groupSize;
            }
        }

        return result;
    }
}