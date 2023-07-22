public class Solution {
    public double knightProbability(int n, int k, int row, int column) {
        int[][] directions = {{1, 2}, {1, -2}, {-1, 2}, {-1, -2},
                              {2, 1}, {2, -1}, {-2, 1}, {-2, -1}};
        double[][][] dp = new double[k + 1][n][n];
        dp[0][row][column] = 1.0;
        for (int moves = 1; moves <= k; moves++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    for (int[] direction : directions) {
                        int prevI = i - direction[0];
                        int prevJ = j - direction[1];
                        if (prevI >= 0 && prevI < n && prevJ >= 0 && prevJ < n) {
                            dp[moves][i][j] += dp[moves - 1][prevI][prevJ] / 8.0;
                        }
                    }
                }
            }
        }
        double totalProbability = 0.0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                totalProbability += dp[k][i][j];
            }
        }
        return totalProbability;
    }
}
