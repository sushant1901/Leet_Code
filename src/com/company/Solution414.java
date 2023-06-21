class Solution {
    public long minCost(int[] nums, int[] cost) {
        int n = nums.length;
        int[][] numsAndCost = new int[n][2];
        for (int i = 0; i < n; ++i) {
            numsAndCost[i][0] = nums[i];
            numsAndCost[i][1] = cost[i];
        }
        Arrays.sort(numsAndCost, (a, b) -> a[0] - b[0]);
        long[] prefixCost = new long[n];
        prefixCost[0] = numsAndCost[0][1];
        for (int i = 1; i < n; ++i)
            prefixCost[i] = numsAndCost[i][1] + prefixCost[i - 1];
        long totalCost = 0l;
        for (int i = 1; i < n; ++i)
            totalCost += 1l * numsAndCost[i][1] * (numsAndCost[i][0] - numsAndCost[0][0]);
        long answer = totalCost;
        for (int i = 1; i < n; ++i) {
            int gap = numsAndCost[i][0] - numsAndCost[i - 1][0];
            totalCost += 1l * prefixCost[i - 1] * gap;
            totalCost -= 1l * (prefixCost[n - 1] - prefixCost[i - 1]) * gap;
            answer = Math.min(answer, totalCost);
        }
        
        return answer;
    }
}
