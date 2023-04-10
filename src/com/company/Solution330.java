class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        int i=1;
        while(i<=nums.length)
        {
            if(set.contains(i))
            {
                i++;
            }
            else
            {
                return i;
            }
        }
        return nums.length+1;
    }
}
