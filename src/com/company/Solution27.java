class Solution {
    public int coinChange(int[] coins, int amount) {
        int ans = minCoins(coins, 0, amount, new HashMap<String,Integer>());
        
        if(ans == 100000){
            return -1;
        }
        
        return ans;
    }
    public int minCoins(int[] coins, int currentIndex, int amount, HashMap<String,Integer> memo){
        if(amount==0)
            return 0;
        if(currentIndex >= coins.length)
            return 100000; //Maximum Value of Amount in constraints
        
        String currentKey = Integer.toString(currentIndex) + "_" + Integer.toString(amount);
        
        if(memo.containsKey(currentKey)){
            return memo.get(currentKey);
        }
        
        int consider = 100000; // 
        if(coins[currentIndex] <= amount){
            consider = 1 + minCoins(coins, currentIndex, amount - coins[currentIndex], memo);
        }
        
        int notConsider = minCoins(coins, currentIndex + 1, amount, memo);
        
        memo.put(currentKey, Math.min(consider, notConsider));
        
        return memo.get(currentKey); 
    }
}
