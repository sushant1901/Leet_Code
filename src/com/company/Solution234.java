class Solution {
    public int numTilings(int N) {
        if(N == 1) return 1;
        if(N == 2) return 2;
        long[][] dp = new long[N + 1][3];
        dp[1][0] = 1; dp[2][0] = 2;
        dp[2][1] = 1;
        dp[2][2] = 1;
        int kmod = (int)1e9 + 7;
        for(int i = 3; i <= N; i++){
            dp[i][0] = (dp[i - 1][0] + dp[i - 2][0] + dp[i - 1][1] + dp[i - 1][2]) % kmod;
            dp[i][1] = (dp[i - 2][0] + dp[i - 1][2]) % kmod;
            dp[i][2] = (dp[i - 2][0] + dp[i - 1][1]) % kmod;
        }
        return (int)dp[N][0];
    }
}
