class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> answer=new ArrayList<>();
        generateCombs(candidates,0,target,new ArrayList<Integer>(),answer);
        return answer;
        
    }
    private void generateCombs(int[] nums,int currentIndex,int target,ArrayList<Integer> current,List<List<Integer>> answer){
        if(target ==0){
            answer.add( new ArrayList<> (current));
            return;
        }
        if(currentIndex >= nums.length) return;
        
        if(nums[currentIndex]<=target){
            current.add(nums[currentIndex]);
            generateCombs(nums,currentIndex,target-nums[currentIndex],current,answer);
            current.remove(current.size()-1);
            
        }
        
        generateCombs(nums,currentIndex+1,target,current,answer);
        return;
    }
}
