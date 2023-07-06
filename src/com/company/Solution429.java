class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0, total=0, result=Integer.MAX_VALUE;
        for(int right=0;right<nums.length;right++){
            total+=nums[right];
           while(total >= target){
               result= Math.min(right-left+1,result);
               total -=nums[left++];
           }
        }
        return result== Integer.MAX_VALUE? 0:result;
        

    }
}
