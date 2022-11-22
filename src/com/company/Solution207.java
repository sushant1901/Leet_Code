public class Solution {
    public static final int numSquares(
        final int n
    ) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            int j = 1;
            int min = Integer.MAX_VALUE;

            while (i - j * j >= 0) {
                min = Math.min(min, dp[i - j * j] + 1);
                ++j;
            }

            dp[i] = min;
        }

        return dp[n];
    }
}

