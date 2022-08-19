class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer= new ArrayList<>();
        generateSubset(nums,0,new ArrayList<>(),answer);
        return answer;
    }
    private void generateSubset(int[] nums,int currentIndex,ArrayList<Integer>currentSubset,List<List<Integer>> answer){
        if(currentIndex>=nums.length){
            answer.add( new ArrayList<>(currentSubset));
            return;
        }
        currentSubset.add(nums[currentIndex]);
        generateSubset(nums,currentIndex+1,currentSubset,answer);
        currentSubset.remove(currentSubset.size()-1);
        generateSubset(nums,currentIndex+1,currentSubset,answer);
        return;
    }
}
