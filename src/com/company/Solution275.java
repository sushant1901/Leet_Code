class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> answer= new ArrayList<>();
        
        Arrays.sort(nums);
        
        int firstPosition=findFirst(nums,target);
        if(firstPosition==-1) return answer;
        
        int lastPosition=findLast(nums,target);
        
        for(int i=firstPosition;i<=lastPosition;i++){
            answer.add(i);
        }
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
