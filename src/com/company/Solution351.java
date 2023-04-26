class Solution {
    public int[] getConcatenation(int[] nums) {
        int n= nums.length;
        int[] ans= new int[2*n];
        for(int i=0;i<n*2;i++){
            if(i<n) ans[i]=nums[i];
            else ans[i]=ans[i-n];
        }

        return ans;
    }
}
