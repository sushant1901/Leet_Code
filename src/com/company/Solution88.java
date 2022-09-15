class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int len=nums.length;
        int count=0;
        int left=0;
        int prod=1;
        for(int i=0;i<len;i++){
            prod*=nums[i];
            // if(prod < k) count++;
            while(prod>=k){
                prod/=nums[left++];
            }
            count+=i-left+1;
        }
        return count;
    }
}
