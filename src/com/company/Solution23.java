class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return totalWays(nums, target, 0,new HashMap<String,Integer>());
    }
    public int totalWays(int[] nums, int target, int currentIndex, HashMap<String,Integer> memo){
        if(currentIndex >= nums.length){
            if(target!=0)
                return 0;
            else
                return 1;
        }
        
        String currentKey = Integer.toString(currentIndex) + "_" + Integer.toString(target);
        
        if(memo.containsKey(currentKey))
            return memo.get(currentKey);
        
        int posSign = totalWays(nums, target - nums[currentIndex], currentIndex + 1, memo);
        
        int negSign = totalWays(nums, target + nums[currentIndex], currentIndex + 1, memo);
        
        memo.put(currentKey,posSign + negSign);
        
        return memo.get(currentKey);
    }
}
