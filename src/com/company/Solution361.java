public int[] smallerNumbersThanCurrent(int[] nums) {
    int[] ans = nums.clone();
    int count = 0;
    HashMap<Integer, Integer> hm = new HashMap<>();
    Arrays.sort(nums);
    
    for(int i=0;i<nums.length;){
        if(i==nums.length-1 || nums[i]!=nums[i+1]){
            hm.put(nums[i],count);
            count = (i+1); 
        }
        i++; 
    } 
    
    for(int i=0;i<nums.length;i++)
        ans[i] = hm.get(ans[i]);
    
    return ans;
}
