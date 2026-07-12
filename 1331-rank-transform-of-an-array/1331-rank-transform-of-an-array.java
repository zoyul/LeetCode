class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int sorted[] = arr.clone();
        Arrays.sort(sorted);

        Map<Integer, Integer> rank = new HashMap<>();
        int r = 1;

        for (int num : sorted) {
            if (!rank.containsKey(num)) {
                rank.put(num, r++);
            }
        }

        int answer[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = rank.get(arr[i]);
        }
        return answer;
    }
}