class Solution {
    public int minCostClimbingStairs(int[] cost) {
        HashMap<Integer,Integer>memo=new HashMap<Integer,Integer>();
        return Math.min(minCost(cost,0,memo),memo.get(1));
        
    }
    private int minCost(int[] cost,int cI,HashMap<Integer,Integer>memo){
        if(cI>=cost.length) return 0;
        
        if(memo.containsKey(cI))
            return memo.get(cI);
        
        int currentKey=cI;
        
        int oneJump=cost[cI]+minCost(cost,cI+1,memo);
        int twoJump=cost[cI]+minCost(cost,cI+2,memo);
        
        memo.put(currentKey,Math.min(oneJump,twoJump));
        return Math.min(oneJump,twoJump);
    }
}
