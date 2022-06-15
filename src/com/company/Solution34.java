class Solution {
    public int jump(int[] nums) {
        int res=0;
        int l=0;
        int r=0;
        while(r< nums.length -1){
            int far=0;
            for(int i=l;i<r+1;i++){
                far=Math.max(far,i+nums[i]);
            }
            l=r+1;
            r=far;
            res+=1;
            
        }
        return res;
        
        
    }
}
