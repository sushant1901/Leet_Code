package com.company;
import java.util.*;
class Solution12 {
    public int maxProfit(int[] prices) {
        return bestBuy(prices,0, 1, new HashMap<String,Integer>());
    }
    public int bestBuy(int[] prices, int currentDay, int canBuy, HashMap<String,Integer> memo){

        if(currentDay >= prices.length )
            return 0;

        String currentKey = Integer.toString(currentDay) + "" + Integer.toString(canBuy) ;

        if(memo.containsKey(currentKey))
            return memo.get(currentKey);

        if(canBuy==1){
            int idle = bestBuy(prices, currentDay + 1, canBuy, memo);
            int buy = bestBuy(prices, currentDay + 1, 0, memo) - prices[currentDay];

            memo.put(currentKey,Math.max(idle,buy));
            return memo.get(currentKey);
        }
        else
        {
            int idle = bestBuy(prices, currentDay + 1, canBuy, memo);
            int sell = bestBuy(prices, currentDay + 1, 1, memo) + prices[currentDay];

            memo.put(currentKey,Math.max(idle,sell));
            return memo.get(currentKey);
        }

    }
}