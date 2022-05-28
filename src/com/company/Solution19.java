class Solution {
    public int rob(int[] nums) {
        return maxMoney(nums,0,new HashMap<Integer,Integer>());
        
    }
    private int maxMoney(int[] nums,int cH,HashMap<Integer,Integer>memo){
        if(cH>=nums.length) return 0;
         int currentKey=cH;
        
        if(memo.containsKey(cH))
            return memo.get(cH);
        
       
        int rob=nums[cH]+maxMoney(nums,cH+2,memo);
        int norob=maxMoney(nums,cH+1,memo);
        
        memo.put(currentKey,Math.max(rob,norob));
        return Math.max(rob,norob);
    }
}
