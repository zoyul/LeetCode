class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);

        int cnt = 0;
        int mCost = 0;

        for (int i = cost.length - 1; i >= 0; i--) {
            cnt ++;
            if (cnt % 3 == 0) {
                continue;
            }
            mCost += cost[i];
        }

        return mCost;
    }
}