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
        ArrayList<Integer> keys = new ArrayList<>(dict.keySet());
        for (int key : keys) {
            // 같은 색의 토끼가 하나 밖에 없다면
            if (key == 1) {
                result += dict.get(key);
            } else {    // 같은 색의 토끼가 여러 마리라면
                result += (key + 1);
            }
        }

        return result;
    }
}