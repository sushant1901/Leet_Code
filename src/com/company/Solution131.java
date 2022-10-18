class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
		 for(int i : nums)
			 if(!set.add(i)) // if there is same
				 return true; 
		 return false;
    }
}
