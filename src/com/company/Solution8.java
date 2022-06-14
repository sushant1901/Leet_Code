class Solution {
    public int jump(int[] nums) {
        return minJumps(nums, 0, new HashMap<Integer,Integer>());
    }
    public int minJumps(int[] nums, int currentIndex, HashMap<Integer, Integer> memo){
        if(currentIndex >= nums.length - 1){
            return 0;
        }
        
        int currentKey = currentIndex;
        
        if(memo.containsKey(currentKey))
            return memo.get(currentKey);
        
        int currentJump = nums[currentIndex];
        
        int ans = 10001;
        
        for(int i=1; i <= currentJump; i++){
            int tempAns = 1 + minJumps(nums, currentIndex + i, memo);
            ans = Math.min(tempAns, ans);
        }
        memo.put(currentKey,ans);
        return ans;
    }
}
