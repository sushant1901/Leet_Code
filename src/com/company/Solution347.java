class Solution {
    int mod = 1_000_000_007;
    private int dfs(int[] dp, int start, String s, int k) {
        if (dp[start] != 0)
            return dp[start];
        if (start == s.length())
            return 1;
        if (s.charAt(start) == '0')
            return 0;
        int count = 0;
        for (int end = start; end < s.length(); ++end) {
            String currNumber = s.substring(start, end + 1);
            if (Long.parseLong(currNumber) > k)
                break;
            count = (count + dfs(dp, end + 1, s, k)) % mod;
        }
        dp[start] = count;
        return count;
    }
    
    public int numberOfArrays(String s, int k) {
        int m = s.length();
        int[] dp = new int[m + 1];
        return dfs(dp, 0, s, k);
    }
}
