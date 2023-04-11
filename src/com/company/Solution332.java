class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int start =0;
        int end=0;
        int max=0;

        while(end<nums.length){
            if(nums[end]==0){
                start = end+1;
            }
            max= Math.max(max,end-start+1);
            end++;
        }
        return max;
    }
}
