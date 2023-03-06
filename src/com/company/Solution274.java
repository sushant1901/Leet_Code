class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length<1) return new int[]{-1,-1};
        
        int[] answer={-1,-1};
        answer[0]=findFirst(nums,target);
        answer[1]=findLast(nums,target);
        
        return answer;
    }
    
    private int findFirst(int[] nums,int target){
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        
        while(start<=end){
            int mid= start+(end-start)/2;
            
            if(nums[mid]== target){
                ans=mid;
                end=mid-1;
            }else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
    private int findLast(int[] nums,int target){
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        
        while(start<=end){
            int mid= start+(end-start)/2;
            
            if(nums[mid]== target){
                ans=mid;
                start=mid+1;
            }else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
}
