class Solution {
    int[] dp;
    int mod = 1_000_000_007;
    private int dfs(int end, int zero, int one) {
        if (dp[end] != -1)
            return dp[end];
        int count = 0;
        if (end >= one) {
            count += dfs(end - one, zero, one);
        }
        if (end >= zero) {
            count += dfs(end - zero, zero, one);
        }
        dp[end] = count % mod;
        return dp[end];
    }
    
    public int countGoodStrings(int low, int high, int zero, int one) {
        dp = new int[high + 1];
        Arrays.fill(dp, -1);
        dp[0] = 1;
        int answer = 0;
        for (int end = low; end <= high; ++end) {
            answer += dfs(end, zero, one);
            answer %= mod;
        }
        return answer;
    }
}
