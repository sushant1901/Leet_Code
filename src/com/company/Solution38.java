class Solution {
    public int numRollsToTarget(int d, int f, int target) {
        return totalWays(d, f, target,new HashMap<String, Integer>());
    }
    public int totalWays(int dice, int faces, int target,HashMap<String, Integer> memo){
        if(dice==0 && target!=0){
            return 0;
        }
        if(dice==0 && target==0){
            return 1;
        }
        
        String currentKey = dice + "_" + target;
        if(memo.containsKey(currentKey))
            return memo.get(currentKey);
        
        int ans = 0;
        
        for(int f=1; f<=faces; f++){
            int tempAns = totalWays(dice - 1, faces, target - f, memo);
            ans = ( ans % 1000000007 + tempAns % 1000000007 ) % 1000000007;
        }
        
        memo.put(currentKey, ans);
        return memo.get(currentKey);
    }
}
