class Solution {
    public int maxProfit(int[] prices, int fee) {
      return bestBuy(prices,0, 1, fee, new HashMap<String,Integer>());
    }
    public int bestBuy(int[] prices, int currentDay, int canBuy, int fee, HashMap<String,Integer> memo){
        
        if(currentDay >= prices.length )
            return 0;
    
         String currentKey = Integer.toString(currentDay) + "_" + Integer.toString(canBuy);
        
        if(memo.containsKey(currentKey))
                return memo.get(currentKey);
        
        if(canBuy==1){
            int idle = bestBuy(prices, currentDay + 1, canBuy, fee, memo);
            int buy = bestBuy(prices, currentDay + 1, 0, fee, memo) - prices[currentDay];
            
            memo.put(currentKey,Math.max(idle,buy));
            return memo.get(currentKey);
        }
        else
        {
            int idle = bestBuy(prices, currentDay + 1, canBuy, fee, memo);
            int sell = bestBuy(prices, currentDay + 1, 1, fee, memo) + prices[currentDay] - fee;
            
            memo.put(currentKey,Math.max(idle,sell));
            return memo.get(currentKey);
        }
            
    }
}
