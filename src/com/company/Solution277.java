class Solution {
    public int searchInsert(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int correctIndex=-1;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]<target) start=mid+1;
            else {
                correctIndex=mid;
                end=mid-1;
                }
        }
        if(correctIndex==-1) return nums.length;
        return correctIndex;
    }
}
