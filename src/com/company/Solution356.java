class Solution {
    public int maximumWealth(int[][] accounts) {
        int m= accounts.length;
        int n= accounts[0].length;

         int maxWealth = Integer.MIN_VALUE;
        for(int i = 0; i < m; i++){ 
            int wealthSum = 0;
            for(int j = 0; j < n; j++){
                wealthSum += accounts[i][j]; 
            }
            
            maxWealth = Math.max(wealthSum, maxWealth);
        }
        return maxWealth;
    }
}
