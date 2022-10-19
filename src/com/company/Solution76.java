class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result= new int[2];
        HashMap<Integer,Integer> memo= new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(memo.containsKey(target-nums[i])){
                result[1]=i;
                result[0]=memo.get(target-nums[i]);
            }
            memo.put(nums[i],i);
        }
        return result;
    }
}
